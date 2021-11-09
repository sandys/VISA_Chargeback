package com.incomm.esb.fraudreporting;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.ProcessingException;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.ResponseProcessingException;
import javax.ws.rs.client.WebTarget;
import javax.xml.datatype.DatatypeConfigurationException;

import org.apache.log4j.Logger;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;
import org.incomm.generated.SICreateCaseFromTransactionRequestType;
import org.incomm.generated.SICreateCaseFromTransactionResponseType;
import org.incomm.generated.SISubmitFraudReportRequestType;
import org.incomm.generated.SISubmitFraudReportResponseType;
import org.incomm.generated.SISubmitTranInquiryRequestType;
import org.incomm.generated.SISubmitTranInquiryResponseType;
import org.incomm.generated.TransactionSummaryType;

import com.incomm.esb.RESTClient;
import com.incomm.esb.util.Authenticator;
import com.incomm.esb.util.Constants;
import com.incomm.esb.util.ErrorResponseStatus;
import com.incomm.esb.util.MyNameStrategy;
import com.incomm.esb.util.SSLUtil;
import com.incomm.esb.util.Util;

public class ProcessFraudReporting {
	
	private final static Logger logger = Logger.getLogger(ProcessFraudReporting.class);
	
		
	/**
	 * 
	 * Method to Call VISA APIs for processing FraudReport one line from input
	 *         Feed file.
	 * 
	 * @param FraudReportingInputData
	 * @return List<FraudReportingOutputData>
	 * @throws DatatypeConfigurationException
	 */
	public List<FraudReportingOutputData> processFraudReporting(FraudReportingInputData fraudInputData)
			throws DatatypeConfigurationException {
		
		logger.debug("processFraudReporting >> FraudReportingInputData:: "+fraudInputData.toString());
		List<FraudReportingOutputData> fraudOutputList=new ArrayList<FraudReportingOutputData>();
		
		StringBuffer durationTime=new StringBuffer();
		Client client =null;
		try {
			client = createClient();
			Long visaCaseNumber = new Long(0);

			// SubmitTranInquiry, CreateCaseFromTransaction uses TI URL
			WebTarget tiBase = client.target(Constants.VISA_TI_BASE_URL);

			//SubmitFraudReport uses SI URL
			WebTarget siBase = client.target(Constants.VISA_SI_BASE_URL);
			
			//SubmitTranInquiry API call
			long startSTIMilis=System.currentTimeMillis();
			SISubmitTranInquiryResponseType tiResponse = callSubmitTranInquiry(tiBase, fraudInputData);
			long endSTIMilis=System.currentTimeMillis();
			durationTime.append("SubmitTranInquiryDuration="+(endSTIMilis - startSTIMilis));

			if (tiResponse != null && tiResponse.getResponseData() != null
					&& tiResponse.getResponseData().getTransactionSummary() != null
					&& tiResponse.getResponseData().getTransactionSummary().size() > 0) {

				// Loop through all transaction Summaries
				for (TransactionSummaryType txnSummary : tiResponse.getResponseData().getTransactionSummary()) {
					FraudReportingOutputData fraudOutput = new FraudReportingOutputData();
					
					// Call CreateCase and SubmitFraud when last 3 chars of
					// TransactionId in
					// TransactionSummaryType is NOT -01.
					logger.debug("processFraudReporting >> transactionID = " +txnSummary.getTransactionID() );	
					if (txnSummary.getTransactionID() != null && !txnSummary.getTransactionID().isEmpty()
							&& !Constants.FRAUD_INVALID_TRANS_ID.equalsIgnoreCase(
									txnSummary.getTransactionID().substring(txnSummary.getTransactionID().length() - 3))) {

						Long rolTransactionId = txnSummary.getRolTransactionId();
						logger.debug("RolTransactionId >> " + rolTransactionId);

						// Call CreateCaseFromTransaction if RoltrnsactionId is
						// not null
						if (rolTransactionId != null) {
							
							//CreateCaseFromTransaction API call.
							long startCCTMilis=System.currentTimeMillis();
							visaCaseNumber = callCreateCaseFromTransaction(tiBase, rolTransactionId,
									fraudInputData.getJIRA());
							long endCCTMilis=System.currentTimeMillis();
							durationTime.append(",CreateCaseFromTransactionDuration="+(endCCTMilis - startCCTMilis));
							
							logger.debug("processFraudReporting >> VisaCaseNumber = " + visaCaseNumber);

							// null check to avoid NPE, need to make sure this does
							// not impact functionality
							if (txnSummary.getTransactionAmount() != null
									&& txnSummary.getTransactionAmount().getValue() != null) {
								
								BigDecimal amount=txnSummary.getTransactionAmount().getValue();
								
								//SubmitFraudReport API call.
								long startFRMilis=System.currentTimeMillis();
								SISubmitFraudReportResponseType submitFraudResponse = callSubmitFraud(siBase,
										visaCaseNumber, amount);
								long endFRMilis=System.currentTimeMillis();
								durationTime.append(",SubmitFraudReportDuration="+(endFRMilis - startFRMilis));
								
								
								// populating output POJO
								fraudOutput.setMaskedAcctNumber(Util.maskAccountNumber(fraudInputData.getAcctnumber()));
								fraudOutput.setVisacaseNumber(
										String.valueOf(submitFraudResponse.getResponseData().getVisaCaseNumber()));
								fraudOutput.setFraudReportID(
										String.valueOf(submitFraudResponse.getResponseData().getFraudReportID()));
								fraudOutput.setTranID(txnSummary.getTransactionID());
								fraudOutput.setAmount(amount.toString());
								fraudOutput.setJIRA(fraudInputData.getJIRA());
								fraudOutput.setAppResponseCode(submitFraudResponse.getStatus().get(0).getCode());
								fraudOutput.setAppResponseMessage(submitFraudResponse.getStatus().get(0).getMessage());
								

								if(Constants.VISA_FRAUD_DUPLICATE_STATUS_CODE.equalsIgnoreCase(submitFraudResponse.getStatus().get(0).getCode().trim())){
									fraudOutput.setResponseCode(Constants.INCOMM_STATUS_CODE_DUPLICATE);
									fraudOutput.setResponseMessage(Constants.INCOMM_STATUS_MSG_DUPLICATE);
								}else{
									fraudOutput.setResponseCode(Constants.INCOMM_STATUS_CODE_SUCCESS);
									fraudOutput.setResponseMessage(Constants.INCOMM_STATUS_MSG_SUCCESS);
								}
								
								fraudOutput.setDurationTime(durationTime.toString());
								logger.debug("API Duration in msec >>  "+durationTime.toString());
								durationTime.setLength(0);
								fraudOutputList.add(fraudOutput);
								
							}

						}
					}
					//if TransactionID last 3 digit is -01 then populate fraudoutput  with Error.
					else{
						fraudOutput.setMaskedAcctNumber(Util.maskAccountNumber(fraudInputData.getAcctnumber()));
						fraudOutput.setVisacaseNumber("N/A");
						fraudOutput.setFraudReportID("N/A");
						fraudOutput.setTranID("N/A");
						fraudOutput.setAmount("N/A");
						fraudOutput.setJIRA(fraudInputData.getJIRA());
						fraudOutput.setResponseCode(Constants.FRAUD_TRANS_ID_EXCEPTION_CODE);
						fraudOutput.setResponseMessage(Constants.FRAUD_TRANS_ID_EXCEPTION_MSG);
						fraudOutputList.add(fraudOutput);
					}
				}
			}
		//Error handling.	
		} catch (WebApplicationException wbe) {
			logger.error("WebApplicationException >> "+wbe.getMessage());
			
			String jsonStatus=null;
			ErrorResponseStatus errorStatus=null;
						
			ObjectMapper mapper = new ObjectMapper();
			mapper.setPropertyNamingStrategy(new MyNameStrategy());
			
			String statusCode=""+wbe.getResponse().getStatusInfo().getStatusCode();
			String reasonPhrase=wbe.getResponse().getStatusInfo().getReasonPhrase();
			
			logger.error("WebApplicationException statusCode="+statusCode+",reasonPhrase="+ reasonPhrase);
			try{
				jsonStatus=wbe.getResponse().readEntity(String.class);
				logger.debug("WebApplicationException Error Status in JSON format = " +jsonStatus);
				errorStatus=mapper.readValue(jsonStatus,new TypeReference<ErrorResponseStatus>() { }  );
				statusCode=errorStatus.getStatus()[0].getCode();
				reasonPhrase=errorStatus.getStatus()[0].getMessage();	
				logger.error("WebApplicationException statuscode="+statusCode+",statusMessage="+reasonPhrase);
			}catch(ProcessingException pex){
				logger.error("WebApplicationException>>ProcessingException Error processing the response in to Status "+pex.getMessage());
				reasonPhrase=wbe.getResponse().readEntity(String.class);
				logger.error("WebApplicationException>>ProcessingException Read Entity from exception "+reasonPhrase);
			} catch (Exception e) {
				reasonPhrase=wbe.getResponse().readEntity(String.class);
				logger.error("WebApplicationException>>Exception processing errorResponse"+e.getMessage());
			} 
			
			errorProcessingFraud(fraudInputData, fraudOutputList,statusCode.trim(),reasonPhrase.trim());
		}catch(ResponseProcessingException rpe){
			String statuscode=""+rpe.getResponse().getStatusInfo().getStatusCode();
			String reasonPhrase=rpe.getResponse().getStatusInfo().getReasonPhrase();
			
			logger.error("ResponseProcessingException, statusCode="+statuscode+",reasonPhrase="+reasonPhrase);
			logger.error("ResponseProcessingException processingChargeback >> ",rpe);
			errorProcessingFraud(fraudInputData, fraudOutputList,statuscode,reasonPhrase);
		}catch (Exception e) {
			logger.error("Exception "+e.getStackTrace());
			errorProcessingFraud(fraudInputData, fraudOutputList,Constants.INCOMM_STATUS_CODE_SYSTEM_ERROR,e.getMessage());
		}
		
		logger.debug("<< processFraudReporting fraudOutputList="+fraudOutputList);
		return fraudOutputList;

	}


	/**
	 * Helper method for handling Error conditions
	 * 
	 * @param fraudInputData
	 * @param List<FraudReportingOutputData>
	 * @param appResponseCode
	 * @param appResponseMsg
	 * 
	 * @return void
	 * 
	 */
	private void errorProcessingFraud(FraudReportingInputData fraudInputData,
			List<FraudReportingOutputData> fraudOutputList, String appResponseCode,String appResponseMsg) {
		FraudReportingOutputData fraudOutput = new FraudReportingOutputData();
		fraudOutput.setMaskedAcctNumber(Util.maskAccountNumber(fraudInputData.getAcctnumber()));
		fraudOutput.setVisacaseNumber("N/A");
		fraudOutput.setFraudReportID("N/A");
		fraudOutput.setTranID("N/A");
		fraudOutput.setAmount("N/A");
		fraudOutput.setJIRA(fraudInputData.getJIRA());
		fraudOutput.setAppResponseCode(appResponseCode);
		fraudOutput.setAppResponseMessage(appResponseMsg);
		fraudOutput.setResponseCode(Constants.INCOMM_STATUS_CODE_SYSTEM_ERROR);
		fraudOutput.setResponseMessage(Constants.INCOMM_STATUS_MSG_SYSTEM_ERROR);
		fraudOutputList.add(fraudOutput);
	}
	
	
	/**
	 * Method to create client with SSLContext(setting keystore and TLSv1.2) and UserId and Password for Basic Authentication.
	 *  
	 * @return client
	 * @throws Exception
	 */
	private Client createClient() throws Exception {
		Client client;
		client =ClientBuilder.newBuilder().sslContext(SSLUtil.createSSLContext()).register(new Authenticator(Constants.VISA_REQUEST_HEADER_USER_ID, Constants.VISA_USER_PASSWORD)).build();
		return client;
	}
	
	/**
	 * SubmitTranInquiry API call
	 * 
	 * @param tiBase
	 * @param FraudReportingInputData
	 * @return SISubmitTranInquiryResponseType
	 * @throws DatatypeConfigurationException
	 */
	private SISubmitTranInquiryResponseType callSubmitTranInquiry(WebTarget tiBase,
			FraudReportingInputData fraudInputData) throws DatatypeConfigurationException {
		
		logger.debug("callSubmitTranInquiry >> ");
		
		SISubmitTranInquiryRequestType tiRequest = VisaFraudReportingAPIUtil.createSubmitTIRequest(fraudInputData);
		WebTarget submitTranInqTarget = tiBase.path(Constants.VISA_RESOURCE_PATH_SUBMIT_TRANS_INQUIRY);
		SISubmitTranInquiryResponseType tiResponse = (SISubmitTranInquiryResponseType) RESTClient
				.postByObjectToJasonTransformation(submitTranInqTarget, tiRequest,
						SISubmitTranInquiryResponseType.class);
		
		logger.debug("callSubmitTranInquiry RespCode = " + (tiResponse != null ? tiResponse.getStatus().get(0).getCode()
				: null));
		
		logger.debug("<< callSubmitTranInquiry");
		
		return tiResponse;
	}

	/**
	 * CreateCaseFromTransaction API call
	 * 
	 * @param tiBase
	 * @param rolTransactionId
	 * @param JIRA
	 * 
	 * @return visaCaseNumber
	 */
	private Long callCreateCaseFromTransaction(WebTarget tiBase, Long rolTransactionId, String JIRA) {
		Long visaCaseNumber=null;
		logger.debug("callCreateCaseFromTransaction >> rolTransactionId = "+rolTransactionId+",JIRA = "+JIRA);
		
		SICreateCaseFromTransactionRequestType createCaseRequest = VisaFraudReportingAPIUtil
				.createCaseFromTransaction(rolTransactionId, JIRA);
		WebTarget createCaseTarget = tiBase.path(Constants.VISA_RESOURCE_PATH_CREATE_CASE);
		SICreateCaseFromTransactionResponseType createCaseResponse = (SICreateCaseFromTransactionResponseType) RESTClient
				.postByObjectToJasonTransformation(createCaseTarget, createCaseRequest,
						SICreateCaseFromTransactionResponseType.class);
		visaCaseNumber = createCaseResponse.getResponseData().getVisaCaseNumber();
		
		logger.debug("callCreateCaseFromTransaction RespCode = " + (createCaseResponse != null
				? createCaseResponse.getStatus().get(0).getCode() : null));
		
		logger.debug("callCreateCaseFromTransaction >> visaCaseNumber = "+visaCaseNumber);
		
		return visaCaseNumber;
	}

	

	/**
	 * SubmitFraudReport API call
	 * 
	 * @param siBase
	 * @param visaCaseNumber
	 * @param txnAmount
	 *
	 * @return SISubmitFraudReportResponseType
	 */
	private SISubmitFraudReportResponseType callSubmitFraud(WebTarget siBase, Long visaCaseNumber,
			BigDecimal txnAmount) {
		
		logger.debug("callSubmitFraud >> visaCaseNumber = "+visaCaseNumber+",txnAmount = "+txnAmount);
		
		SISubmitFraudReportRequestType submitFraudRequest = VisaFraudReportingAPIUtil.createSubmitFraud(visaCaseNumber,
				txnAmount);
		WebTarget submitFraudTarget = siBase.path(Constants.VISA_RESOURCE_PATH_SUBMIT_FRAUD);
		SISubmitFraudReportResponseType submitFraudResponse = (SISubmitFraudReportResponseType) RESTClient
				.postByObjectToJasonTransformation(submitFraudTarget, submitFraudRequest,
						SISubmitFraudReportResponseType.class);
		
		logger.debug("callSubmitFraud RespCode = " + (submitFraudResponse != null
				? submitFraudResponse.getStatus().get(0).getCode() : null));
		
		logger.debug("<< callSubmitFraud");
		
		return submitFraudResponse;
	}
	
}
