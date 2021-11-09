package com.incomm.esb.chargeback;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ws.rs.ProcessingException;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ResponseProcessingException;
import javax.ws.rs.client.WebTarget;
import javax.xml.datatype.DatatypeConfigurationException;

import org.apache.log4j.Logger;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;
import org.incomm.generated.ATRSelectionReqdIndType;
import org.incomm.generated.AssociatedTransactionType;
import org.incomm.generated.SIAssociatedTranSelectionResponseType;
import org.incomm.generated.SIGetAssociatedTransactionListRequestType;
import org.incomm.generated.SIGetAssociatedTransactionListResponseType;
import org.incomm.generated.SIInitiateDisputeFromTransactionOrCaseRequestType;
import org.incomm.generated.SIInitiateDisputeFromTransactionOrCaseResponseType;
import org.incomm.generated.SISubmitDisputeQuestionnaireRequestType;
import org.incomm.generated.SISubmitDisputeQuestionnaireResponseType;
import org.incomm.generated.SISubmitTranInquiryRequestType;
import org.incomm.generated.SISubmitTranInquiryResponseType;
import org.jboss.resteasy.client.jaxrs.ResteasyClientBuilder;

import com.incomm.esb.RESTClient;
import com.incomm.esb.util.Authenticator;
import com.incomm.esb.util.Constants;
import com.incomm.esb.util.ErrorResponseStatus;
import com.incomm.esb.util.MyNameStrategy;
import com.incomm.esb.util.SSLUtil;
import com.incomm.esb.util.Util;

public class ProcessChargeback {

	private final static Logger logger = Logger.getLogger(ProcessChargeback.class);
	private Client client = null;
	private WebTarget tiBase = null;
	private WebTarget siBase = null;

	public ProcessChargeback() {
		try {
			client = createClient();

			// SubmitTranInquiry, CreateCaseFromTransaction uses TI URL
			tiBase = client.target(Constants.VISA_TI_BASE_URL);
			// DisputeQuestionnaire, SubmitException uses SI URL
			siBase = client.target(Constants.VISA_SI_BASE_URL);

		} catch (Exception e) {
			logger.error("Error creating the client" + e);
		}
	}

	/**
	 * @author hahuja
	 * 
	 *         Method to Call VISA APIs for processing Chargeback one row at a time
	 *         from input Feed file.
	 * 
	 * @param ChargeBackInputData
	 * @return ChargebackOutputData
	 * @throws DatatypeConfigurationException
	 */
	public ChargebackOutputData processChargeback(ChargebackInputData chargeBackInputData)
			throws DatatypeConfigurationException {

		logger.debug("processChargeback >> ChargebackInputData:: " + chargeBackInputData.toString());
		ChargebackOutputData chbOutput = new ChargebackOutputData();
		StringBuffer durationTime = new StringBuffer();

		try {

			Long visaCaseNumber = new Long(0);
			Long disputeId = new Long(0);
			ATRSelectionReqdIndType atrselectionReqdInd = null;
			Long associatedTransGroupId = new Long(0);
			boolean associatedCreditTxnNotSelected=false;
			boolean associatedAuthTxnNotSelected=false;

			// SubmitTranInquiry API call.
			long startSTIMilis = System.currentTimeMillis();
			SISubmitTranInquiryResponseType tiResponse = callSubmitTranInquiry(tiBase, chargeBackInputData);
			long endSTIMilis = System.currentTimeMillis();

			durationTime.append("SubmitTranInquiryDuration=" + (endSTIMilis - startSTIMilis));

			// In TIBCO implementation we were getting rolTransactionId from first
			// TransactionSummary returned by SubmitTranInquiry.
			Long rolTransactionId = tiResponse != null && tiResponse.getResponseData() != null
					&& tiResponse.getResponseData().getTransactionSummary() != null
							? tiResponse.getResponseData().getTransactionSummary().get(0).getRolTransactionId()
							: null;

			logger.debug("RolTransactionId >> " + rolTransactionId);

			// Call other API's
			// (CreateCaseFromTransaction,DisputeQuestionnaire,SubmitException) if
			// RoltrnsactionId is not null.
			if (rolTransactionId != null) {
				BigDecimal originalSaleAmount =tiResponse.getResponseData().getTransactionSummary().get(0).getTransactionAmount().getValue();
				String originalAuthCode =tiResponse.getResponseData().getTransactionSummary().get(0).getAuthorizationCode();
				logger.debug("ExceptionInd = " + chargeBackInputData.getExceptionInd().trim());
				// CreateCaseFromTransaction API call
				long startIDFTMilis = System.currentTimeMillis();
				SIInitiateDisputeFromTransactionOrCaseResponseType initDisputeResp = callInitiateDispute(siBase,
						rolTransactionId, chargeBackInputData);
				long endIDFTMilis = System.currentTimeMillis();
				durationTime.append(",InitiateDisputeFromTransactionOrCaseDuration=" + (endIDFTMilis - startIDFTMilis));

				logger.debug(
						"visaCaseNumber >> " + (initDisputeResp != null && initDisputeResp.getResponseData() != null
								? initDisputeResp.getResponseData().getVisaCaseNumber()
								: null));
				logger.debug("ATRselectionReqdInd >> "
						+ (initDisputeResp != null && initDisputeResp.getResponseData() != null
								? initDisputeResp.getResponseData().getATRSelectionReqdInd()
								: null));

				// Get values from InitiateDisputeFromTransactionOrCaseResponse
				if (initDisputeResp != null && initDisputeResp.getResponseData() != null) {
					visaCaseNumber = initDisputeResp.getResponseData().getVisaCaseNumber();
					disputeId = initDisputeResp.getResponseData().getDisputeId();
					atrselectionReqdInd = initDisputeResp.getResponseData().getATRSelectionReqdInd();
					associatedTransGroupId = initDisputeResp.getResponseData().getAssociatedTransGroupId();
				}

				// if ATRSelectionReqdIndType.REQUIRED in InitiateDispute response
				// call SIGetAssociatedTransactionListRequest and AssociatedTransSelection API's
				// to associate the transactions.
				if (atrselectionReqdInd.equals(ATRSelectionReqdIndType.REQUIRED)) {
					
					// call GetAssociatedTransactionList
					long startGATLMilis = System.currentTimeMillis();
					SIGetAssociatedTransactionListResponseType getAssociatedTxnResp = callGetAssociatedTxnList(tiBase,
							associatedTransGroupId);
					long endGATLMilis = System.currentTimeMillis();
					durationTime.append(",AssociatedTransactionListDuration=" + (endGATLMilis - startGATLMilis));

					// call AssociatedTransSelection
					if (getAssociatedTxnResp != null && getAssociatedTxnResp.getResponseData() != null) {
						
						List<AssociatedTransactionType> associatedTranList = getAssociatedTxnResp.getResponseData()
								.getAssociatedTransactionList();
						
						if(associatedTranList.size() > 0){
						//call transaction selection if list has 1 Auth transaction
						//if(notMatchingAuthTxn) {
							logger.debug("AssociatedTransactionList="+associatedTranList);
							long startATSMilis = System.currentTimeMillis();
							Map<String,Object> associatedTxnSelectionRespMap = callAssociatedTranSelection(
									siBase, visaCaseNumber, associatedTransGroupId, associatedTranList,chargeBackInputData,originalSaleAmount,originalAuthCode);
							
							long endATSMilis = System.currentTimeMillis();
							
							SIAssociatedTranSelectionResponseType associatedTxnSelectionResp=(SIAssociatedTranSelectionResponseType)associatedTxnSelectionRespMap.get("response");
							associatedCreditTxnNotSelected=(Boolean)associatedTxnSelectionRespMap.get("associatedCreditTxnNotSelected");
							associatedAuthTxnNotSelected=(Boolean)associatedTxnSelectionRespMap.get("associatedAuthTxnNotSelected");
							
							logger.debug("Status of AssociatedTxnSelection API=" + associatedTxnSelectionResp != null
									&& associatedTxnSelectionResp.getStatus() != null
											? associatedTxnSelectionResp.getStatus().get(0).getCode()
											: null);
							logger.debug("associatedCreditTxnNotSelected="+associatedCreditTxnNotSelected);
							logger.debug("associatedAuthTxnNotSelected="+associatedAuthTxnNotSelected);
							durationTime.append(",AssociatedTranSelectionDuration=" + (endATSMilis - startATSMilis));
						}
					}
				}

				// SubmitDisputeQuestionnaire API call
				if (visaCaseNumber != null) { 
					
					long startSDQMilis = System.currentTimeMillis();
					SISubmitDisputeQuestionnaireResponseType submitDisputeResponse = callSubmitDisputeQuestionnaire(
							siBase, chargeBackInputData, visaCaseNumber, disputeId,associatedCreditTxnNotSelected,associatedAuthTxnNotSelected);
					long endSDQMilis = System.currentTimeMillis();
					durationTime.append(",SubmitDisputeQuestionnaireDuration=" + (endSDQMilis - startSDQMilis));

					if(submitDisputeResponse != null) {
						// populate ChargebackOutput with data received from disputeResponse.
						populateChbckOutput(chargeBackInputData, chbOutput, submitDisputeResponse);
						
						if (Constants.VISA_CHARGEBACK_DUPLICATE_STATUS_CODE
								.equalsIgnoreCase(submitDisputeResponse.getStatus() != null ?submitDisputeResponse.getStatus().get(0).getCode().trim():Constants.VISA_CHARGEBACK_DUPLICATE_STATUS_CODE)) {
							chbOutput.setResponseCode(Constants.INCOMM_STATUS_CODE_DUPLICATE);
							chbOutput.setResponseMessage(Constants.INCOMM_STATUS_MSG_DUPLICATE);
						} else {
							chbOutput.setResponseCode(Constants.INCOMM_STATUS_CODE_SUCCESS);
							chbOutput.setResponseMessage(Constants.INCOMM_STATUS_MSG_SUCCESS);
						}
					} //end - submitDisputeResponse != null
				}
			} 
			
			else {
				// rolTransactionId is null, return Vendor System Error.
				logger.error("processChargeback >> rolTransactionId is null");
				chbOutput.setAppResponseCode("27");
				chbOutput.setAppResponseMessage("vendor error - rolTransactionId is null");
				errorProcessingChargeback(chargeBackInputData, chbOutput);
			}
			logger.debug("API Duration in msec >>  " + durationTime.toString());
			chbOutput.setDurationTime(durationTime.toString());

			// Error handling.
		} catch (WebApplicationException wbe) {
			logger.error("WebApplicationException >> " + wbe.getMessage());

			String jsonStatus = null;
			ErrorResponseStatus errorStatus = null;

			ObjectMapper mapper = new ObjectMapper();
			mapper.setPropertyNamingStrategy(new MyNameStrategy());

			String statusCode = "" + wbe.getResponse().getStatusInfo().getStatusCode();
			String reasonPhrase = wbe.getResponse().getStatusInfo().getReasonPhrase();

			logger.error("WebApplicationException statusCode=" + statusCode + ",reasonPhrase=" + reasonPhrase);
			try {
				jsonStatus = wbe.getResponse().readEntity(String.class);
				logger.debug("WebApplicationException Error Status in JSON format = " + jsonStatus);
				errorStatus = mapper.readValue(jsonStatus, new TypeReference<ErrorResponseStatus>() {
				});
				statusCode = errorStatus.getStatus()[0].getCode();
				reasonPhrase = errorStatus.getStatus()[0].getMessage();
				logger.error("WebApplicationException statuscode=" + statusCode + ",statusMessage=" + reasonPhrase);
			} catch (ProcessingException pex) {
				logger.error("WebApplicationException>>ProcessingException Error processing the response in to Status "
						+ pex.getMessage());
				reasonPhrase = wbe.getResponse().readEntity(String.class);
				logger.error("WebApplicationException>>ProcessingException Read Entity from exception=" + reasonPhrase);
			} catch (Exception e) {
				reasonPhrase = wbe.getResponse().readEntity(String.class);
				logger.error("WebApplicationException>>Exception processing errorResponse=" + e.getMessage());
			}
			chbOutput.setAppResponseCode(statusCode);
			chbOutput.setAppResponseMessage(reasonPhrase);
			errorProcessingChargeback(chargeBackInputData, chbOutput);
		} catch (ResponseProcessingException rpe) {
			String statuscode = "" + rpe.getResponse().getStatusInfo().getStatusCode();
			String reasonPhrase = rpe.getResponse().getStatusInfo().getReasonPhrase();

			logger.error("ResponseProcessingException, statusCode=" + statuscode + ",reasonPhrase=" + reasonPhrase);
			logger.error("ResponseProcessingException processingChargeback >> ", rpe);
			chbOutput.setAppResponseCode(statuscode);
			chbOutput.setAppResponseMessage(reasonPhrase);
			errorProcessingChargeback(chargeBackInputData, chbOutput);
		} catch (Exception ex) {
			logger.error("processChargeback >> Exception during processingChargeback >> ", ex);
			chbOutput.setAppResponseCode(Constants.INCOMM_STATUS_CODE_SYSTEM_ERROR);
			chbOutput.setAppResponseMessage(ex.getMessage());
			errorProcessingChargeback(chargeBackInputData, chbOutput);
		}
		logger.debug("processChargeback >> ChargebackOutputData=" + chbOutput.toString());
		return chbOutput;
	}

	private void populateChbckOutput(ChargebackInputData chargeBackInputData, ChargebackOutputData chbOutput,
			SISubmitDisputeQuestionnaireResponseType submitDisputeResponse) {
		// Following is format of output file
		// AcctNumber,Case
		// Number,TranID,QnID,FinID,Amount,appResponseCode,appResponseMessage
		chbOutput.setMaskedAcctNumber(Util.maskAccountNumber(chargeBackInputData.getAcctNumber()));
		chbOutput.setVisaCaseNumber(String.valueOf(submitDisputeResponse.getResponseData() != null ?submitDisputeResponse.getResponseData().getVisaCaseNumber():null));
		chbOutput.setTranID(chargeBackInputData.getTranID());
		

		chbOutput.setDisputeID(null != submitDisputeResponse.getResponseData()?submitDisputeResponse.getResponseData().getDisputeId().toString():"null");
		chbOutput.setVROLFinancialID(submitDisputeResponse.getResponseData() != null
				&& submitDisputeResponse.getResponseData().getDisputeFinancialInfo() != null
						? submitDisputeResponse.getResponseData().getDisputeFinancialInfo().getVROLFinancialID()
						: null);
		chbOutput.setAmount(chargeBackInputData.getAmount());
		chbOutput.setAppResponseCode(submitDisputeResponse.getStatus() != null ?submitDisputeResponse.getStatus().get(0).getCode():"29");
		chbOutput.setAppResponseMessage(submitDisputeResponse.getStatus() != null ?submitDisputeResponse.getStatus().get(0).getMessage():"System Error");
	}

	/**
	 * Method to create client with SSLContext(setting keystore and TLSv1.2) and
	 * UserId and Password for Basic Authentication.
	 * 
	 * @return client
	 * @throws Exception
	 */
	private Client createClient() throws Exception {

		// Using RestEasyClientBuilder to use connection pools.
		ResteasyClientBuilder builder = new ResteasyClientBuilder();
		return builder.connectionPoolSize(200).sslContext(SSLUtil.createSSLContext())
				.register(new Authenticator(Constants.VISA_REQUEST_HEADER_USER_ID, Constants.VISA_USER_PASSWORD))
				.build();

		/*
		 * return ClientBuilder.newBuilder() .sslContext(SSLUtil.createSSLContext())
		 * .register(new Authenticator(Constants.VISA_REQUEST_HEADER_USER_ID,
		 * Constants.VISA_USER_PASSWORD)) .build();
		 */
	}


	/**
	 * SubmitDisputeQuestionnaire API call
	 * 
	 * @param siBase
	 * @param chargeBackInputData
	 * @param visaCaseNumber
	 * @param disputeId
	 *
	 * @return SISubmitDisputeQuestionnaireResponseType
	 */
	private SISubmitDisputeQuestionnaireResponseType callSubmitDisputeQuestionnaire(WebTarget siBase,
			ChargebackInputData chargeBackInputData, Long visaCaseNumber, Long disputeId, boolean associatedCreditTxnNotSelected, boolean associatedAuthTxnNotSelected) {

		logger.debug("callSubmitDisputeQuestionnaire chargeBackInputData=" + chargeBackInputData.toString()
				+ ",VisaCaseNumber=" + visaCaseNumber + ", DisputeID=" + disputeId);

		SISubmitDisputeQuestionnaireRequestType submitDisputeRequest = VisaChargebackAPIUtil
				.createSubmitDisputeQuestionnaire(visaCaseNumber, disputeId, chargeBackInputData,associatedCreditTxnNotSelected,associatedAuthTxnNotSelected);

		WebTarget submitDisputeQuestionnaireTarget = siBase.path(Constants.VISA_RESOURCE_PATH_SUBMIT_DISPUTE_QUESTIONNAIRE);

		SISubmitDisputeQuestionnaireResponseType submitDisputeResponse = (SISubmitDisputeQuestionnaireResponseType) RESTClient
				.postWithMultipartAttachement(submitDisputeQuestionnaireTarget, submitDisputeRequest,
						SISubmitDisputeQuestionnaireResponseType.class);

		logger.debug("callSubmitDisputeQuestionnaire RespCode = "
				+ (submitDisputeResponse != null && submitDisputeResponse.getStatus() != null
						? submitDisputeResponse.getStatus().get(0).getCode()
						: null));

		return submitDisputeResponse;
	}

	/**
	 * InitiateDisputeFromTransactionOrCase API call
	 * 
	 * @param siBase
	 * @param rolTransactionId
	 * @param chargeBackInputData
	 *
	 * @return SIInitiateDisputeFromTransactionOrCaseResponseType
	 * @throws DatatypeConfigurationException
	 */
	private SIInitiateDisputeFromTransactionOrCaseResponseType callInitiateDispute(WebTarget siBase,
			Long rolTransactionId, ChargebackInputData chargeBackInputData) throws DatatypeConfigurationException {

		logger.debug("callInitiateDispute chargeBackInputData=" + chargeBackInputData.toString() + ",rolTransactionId="
				+ rolTransactionId);

		SIInitiateDisputeFromTransactionOrCaseRequestType initDisputeRequest = VisaChargebackAPIUtil
				.createInitiateDisputeFromTransactionOrCaseRequest(rolTransactionId, chargeBackInputData);

		WebTarget initDisputeTarget = siBase.path(Constants.VISA_RESOURCE_PATH_INITIATE_DISPUTE);

		SIInitiateDisputeFromTransactionOrCaseResponseType initDisputeResponse = (SIInitiateDisputeFromTransactionOrCaseResponseType) RESTClient
				.postByObjectToJasonTransformation(initDisputeTarget, initDisputeRequest,
						SIInitiateDisputeFromTransactionOrCaseResponseType.class);

		logger.debug("callInitiateDispute RespCode = "
				+ (initDisputeResponse != null && initDisputeResponse.getStatus() != null
						? initDisputeResponse.getStatus().get(0).getCode()
						: null));

		return initDisputeResponse;
	}

	/**
	 * GetAssociatedTransactionList API call
	 * 
	 * @param tiBase
	 * @param associatedTransGroupId
	 *
	 * @return SIGetAssociatedTransactionListResponseType
	 * @throws DatatypeConfigurationException
	 */
	private SIGetAssociatedTransactionListResponseType callGetAssociatedTxnList(WebTarget tiBase,
			Long associatedTransGroupId) throws DatatypeConfigurationException {

		logger.debug("callGetAssociatedTxnList associatedTransGroupId=" + associatedTransGroupId);

		SIGetAssociatedTransactionListRequestType getAssociatedTxnListRequest = VisaChargebackAPIUtil
				.createGetAssociatedTransactionListRequest(associatedTransGroupId);

		WebTarget getAssociatedTxnListTarget = tiBase.path(Constants.VISA_RESOURCE_PATH_GET_ASSOCIATED_TXN_LIST);

		SIGetAssociatedTransactionListResponseType getAssociatedTxnListResponse = (SIGetAssociatedTransactionListResponseType) RESTClient
				.postByObjectToJasonTransformation(getAssociatedTxnListTarget, getAssociatedTxnListRequest,
						SIGetAssociatedTransactionListResponseType.class);

		logger.debug("callGetAssociatedTxnList RespCode = "
				+ (getAssociatedTxnListResponse != null && getAssociatedTxnListResponse.getStatus() != null
						? getAssociatedTxnListResponse.getStatus().get(0).getCode()
						: null));

		return getAssociatedTxnListResponse;
	}

	/**
	 * GetAssociatedTransactionList API call
	 * 
	 * @param siBase
	 * @param associatedTransGroupId
	 *
	 * @return SIGetAssociatedTransactionListResponseType
	 * @throws DatatypeConfigurationException
	 */
	private Map<String,Object> callAssociatedTranSelection(WebTarget siBase, Long visacaseNumber,
			Long associatedTransGroupId, List<AssociatedTransactionType> associatedTranList, ChargebackInputData chbInputData, BigDecimal originalSaleAmount, String originalAuthCode)
			throws DatatypeConfigurationException {
		
		Map<String,Object> respMap=new HashMap<String, Object>();
		
		logger.debug("callAssociatedTranSelection associatedTranList=" + associatedTranList + ",visacaseNumber="
				+ visacaseNumber + ",associatedTransGroupId=" + associatedTransGroupId);

		Map<String,Object> associatedTranSelectionRequest = VisaChargebackAPIUtil
				.createAssociatedTransactionSelectionRequest(visacaseNumber, associatedTransGroupId,
						associatedTranList,chbInputData, originalSaleAmount,originalAuthCode);

		WebTarget associatedTranSelectionTarget = siBase.path(Constants.VISA_RESOURCE_PATH_ASSOCIATED_TXN_SELECTION);

		SIAssociatedTranSelectionResponseType associatedTranSelectionResponse = (SIAssociatedTranSelectionResponseType) RESTClient
				.postByObjectToJasonTransformation(associatedTranSelectionTarget, associatedTranSelectionRequest.get("request"),
						SIAssociatedTranSelectionResponseType.class);

		respMap.put("response", associatedTranSelectionResponse);
		respMap.put("associatedCreditTxnNotSelected", associatedTranSelectionRequest.get("associatedCreditTxnNotSelected"));
		respMap.put("associatedAuthTxnNotSelected", associatedTranSelectionRequest.get("associatedAuthTxnNotSelected"));
		logger.debug("callAssociatedTranSelection RespCode = "
				+ (associatedTranSelectionResponse != null && associatedTranSelectionResponse.getStatus() != null
						? associatedTranSelectionResponse.getStatus().get(0).getCode()
						: null));

		return respMap;
	}

	
	/**
	 * SubmitTranInquiry API call
	 * 
	 * @param tiBase
	 * @param chargeBackInputData
	 * @return SISubmitTranInquiryResponseType
	 * @throws DatatypeConfigurationException
	 */
	private SISubmitTranInquiryResponseType callSubmitTranInquiry(WebTarget tiBase,
			ChargebackInputData chargeBackInputData) throws DatatypeConfigurationException {

		logger.debug("callSubmitTranInquiry chargeBackInputData=" + chargeBackInputData.toString());

		SISubmitTranInquiryRequestType tiRequest = VisaChargebackAPIUtil.createSubmitTIRequest(chargeBackInputData);

		WebTarget submitTranInqTarget = tiBase.path(Constants.VISA_RESOURCE_PATH_SUBMIT_TRANS_INQUIRY);

		SISubmitTranInquiryResponseType tiResponse = (SISubmitTranInquiryResponseType) RESTClient
				.postByObjectToJasonTransformation(submitTranInqTarget, tiRequest,
						SISubmitTranInquiryResponseType.class);

		logger.debug("callSubmitTranInquiry RespCode = "
				+ (tiResponse != null && tiResponse.getStatus() != null ? tiResponse.getStatus().get(0).getCode()
						: null));
		return tiResponse;
	}

	/**
	 * Helper method for handling Error conditions
	 * 
	 * @param chargeBackInputData
	 * @param ChargebackOutputData
	 * 
	 * @return ChargebackOutputData
	 * 
	 */
	private ChargebackOutputData errorProcessingChargeback(ChargebackInputData chargeBackInputData,
			ChargebackOutputData chbOutput) {
		chbOutput.setMaskedAcctNumber(Util.maskAccountNumber(chargeBackInputData.getAcctNumber()));
		chbOutput.setVisaCaseNumber("N/A");
		chbOutput.setTranID(chargeBackInputData.getTranID());
		chbOutput.setDisputeID("N/A");
		chbOutput.setVROLFinancialID("N/A");
		chbOutput.setAmount(chargeBackInputData.getAmount());
		chbOutput.setResponseCode(Constants.INCOMM_STATUS_CODE_SYSTEM_ERROR);
		chbOutput.setResponseMessage(Constants.INCOMM_STATUS_MSG_SYSTEM_ERROR);

		return chbOutput;

	}
}
