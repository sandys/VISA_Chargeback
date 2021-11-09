package com.incomm.esb.chargeback;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.datatype.DatatypeConfigurationException;

import org.incomm.generated.AssociatedTranSelectionRequestType;
import org.incomm.generated.AssociatedTransactionDetailsRequestType;
import org.incomm.generated.AssociatedTransactionType;
import org.incomm.generated.AssociationType;
import org.incomm.generated.CRBRegionType;
import org.incomm.generated.DisputeAuthorizationType;
import org.incomm.generated.DisputeCaseActionType;
import org.incomm.generated.DisputeCategoryType;
import org.incomm.generated.DisputeEFLInfoType;
import org.incomm.generated.EFLActionCodeType;
import org.incomm.generated.InitiateDisputeFromTransactionOrCaseRequestType;
import org.incomm.generated.MemberRoleType;
import org.incomm.generated.PurgeOptionsType;
import org.incomm.generated.RepreType.DisputeAmt;
import org.incomm.generated.RequestHeaderType;
import org.incomm.generated.SIAssociatedTranSelectionRequestType;
import org.incomm.generated.SIGetAssociatedTransactionListRequestType;
import org.incomm.generated.SIInitiateDisputeFromTransactionOrCaseRequestType;
import org.incomm.generated.SISubmitDisputeQuestionnaireRequestType;
import org.incomm.generated.SISubmitTranInquiryRequestType;
import org.incomm.generated.SubmitDisputeQuestionnaireRequestType;
import org.incomm.generated.SubmitTranInquiryRequestType;
import org.incomm.generated.UserType;
import org.incomm.generated.YNType;

import com.incomm.esb.util.Constants;
import com.incomm.esb.util.GetDateRangeFromTranID;

/**
 * This class has methods to create API request objects using generated JAXB
 * objects from ROLSIRT schema.
 * 
 * Following API's request objects have been formed in this class.
 * 
 * SISubmitTranInquiryRequestType SICreateCaseFromTransactionRequestType
 * SIDisputeQuestionnaireRequestType SISubmitExceptionRequestType
 * 
 * @author hahuja
 *
 */

class VisaChargebackAPIUtil {

	/**
	 * Method to create SubmitTranInquiryRequest Data will be supplied from feedfile
	 * 
	 * @param ChargebackInputData
	 * 
	 * @return SISubmitTranInquiryRequestType
	 * 
	 * @throws DatatypeConfigurationException
	 */
	static SISubmitTranInquiryRequestType createSubmitTIRequest(ChargebackInputData inputData)
			throws DatatypeConfigurationException {
		SISubmitTranInquiryRequestType submitTranInquiryRequestType = new SISubmitTranInquiryRequestType();

		// RequestHeader
		RequestHeaderType reqHeader = createRequestHeader();
		submitTranInquiryRequestType.setRequestHeader(reqHeader);
		// RequestHeader

		// RequestData
		SubmitTranInquiryRequestType submitTIData = new SubmitTranInquiryRequestType();

		// AcctNumber from feed file
		submitTIData.setCardNumber(inputData.getAcctNumber());

		// TranID from feed file
		submitTIData.setTransactionID(inputData.getTranID());

		// JulianDate and dayRange constant of 40 to get startDate and endDate
		GetDateRangeFromTranID getDateRangeFromTranID = new GetDateRangeFromTranID();

		Map<String, String> dateMap = getDateRangeFromTranID.getStartAndEndDate(inputData.getTranID(),
				Constants.SUBMIT_TRAN_INQUIRY_DAY_RANGE != "" ? Constants.SUBMIT_TRAN_INQUIRY_DAY_RANGE : "30");

		String startDate = dateMap.get(Constants.MAP_KEY_START_DATE);
		String endDate = dateMap.get(Constants.MAP_KEY_END_DATE);

		submitTIData.setStartDate(startDate);
		submitTIData.setEndDate(endDate);
		// Julian Date

		submitTIData.setTransactionType(Constants.SUBMIT_TRAN_INQUIRY_TRANSACTION_TYPE);
		submitTranInquiryRequestType.setRequestData(submitTIData);
		// RequestData

		return submitTranInquiryRequestType;
	}

	
	/**
	 * Method to create DisputeQuestionnaire Data will be supplied from
	 * CreateCaseFromTransaction and input
	 * 
	 * @param visaCaseNumber
	 *            - case number returned from CreateCaseFromTransaction API.
	 * @param ChargebackInputData
	 * 
	 * @return SICreateCaseFromTransactionRequestType
	 * 
	 */
	static SISubmitDisputeQuestionnaireRequestType createSubmitDisputeQuestionnaire(Long visaCaseNumber, Long disputeId,
			ChargebackInputData inputData, boolean associatedCreditTxnNotSelected, boolean associatedAuthTxnNotSelected) {
		SISubmitDisputeQuestionnaireRequestType submitDisputeRequest = new SISubmitDisputeQuestionnaireRequestType();

		RequestHeaderType reqHeader = createRequestHeader();
		submitDisputeRequest.setRequestHeader(reqHeader);

		SubmitDisputeQuestionnaireRequestType submitDisputeData = new SubmitDisputeQuestionnaireRequestType();
		submitDisputeData.setVisaCaseNumber(visaCaseNumber);

		submitDisputeData.setDisputeId(disputeId);

		DisputeAmt amt = new DisputeAmt();
		amt.setValue(new BigDecimal(inputData.getAmount().trim()));
		amt.setCurrency(Constants.CURRENCY_CODE);
		submitDisputeData.setDisputeAmount(amt);

		DisputeAuthorizationType auth = new DisputeAuthorizationType();
		auth.getRegion().add("D");
		
		//Partial chargeback
		if ("Y".equalsIgnoreCase(inputData.getPartialInd())) {
			
			if(null != inputData.getPartialCHBElaborationText() && !"".equalsIgnoreCase(inputData.getPartialCHBElaborationText().trim())) {
				submitDisputeData.setDisputeAmountChangeReason(inputData.getPartialCHBElaborationText());
			}else {
				submitDisputeData.setDisputeAmountChangeReason(Constants.DISPUTE_QUESTIONNAIRE_PARTIAL_CHB_MEMBER_MSG_EDIT_TEXT);
			}
		} 
		
		//if associateTxn selection was required and we chose N for Auth txns, we need to provide explanation. 
		if(associatedAuthTxnNotSelected){ 
			auth.setExplanationOfAuthorizationsPresented(Constants.DISPUTE_QUESTIONNAIRE_MEMBER_MSG_EDIT_TEXT);
		}

		//if associateTxn selection was required and we chose N for credit txns, we need to provide explanation. 
		if(associatedCreditTxnNotSelected) {
			submitDisputeData.setExplanationOfCreditPresented(Constants.DISPUTE_QUESTIONNAIRE_EXPLAINATION_OF_CREDIT_PRESENTED);
		}
		
		
		submitDisputeData.setAuthorization(auth);

		submitDisputeData.setAction(DisputeCaseActionType.SUBMIT);

		submitDisputeRequest.setRequestData(submitDisputeData);

		return submitDisputeRequest;
	}


	/**
	 * Method to create InitiateDisputeFromTransactionOrCaseRequest Data will be
	 * supplied from feedfile
	 * 
	 * @param ChargebackInputData
	 * 
	 * @return InitiateDisputeFromTransactionOrCaseRequestType
	 * 
	 * @throws DatatypeConfigurationException
	 */
	static SIInitiateDisputeFromTransactionOrCaseRequestType createInitiateDisputeFromTransactionOrCaseRequest(
			Long rolTransactionId, ChargebackInputData inputData) throws DatatypeConfigurationException {

		SIInitiateDisputeFromTransactionOrCaseRequestType initDisputeRequestType = new SIInitiateDisputeFromTransactionOrCaseRequestType();

		// create and set RequestHeader
		RequestHeaderType reqHeader = createRequestHeader();
		initDisputeRequestType.setRequestHeader(reqHeader);

		// create RequestData object
		InitiateDisputeFromTransactionOrCaseRequestType initDisputeData = new InitiateDisputeFromTransactionOrCaseRequestType();

		// set ROLTransactionId
		initDisputeData.setRolTransactionId(rolTransactionId);

		// set Dispute category 11 - Authorization
		DisputeCategoryType disputeCat = new DisputeCategoryType();
		disputeCat.setValue(Constants.DISPUTE_CATEGORY_AUTHORIZATION);
		initDisputeData.setDisputeCategory(disputeCat);

		// set dispute amount
		DisputeAmt amt = new DisputeAmt();
		amt.setValue(new BigDecimal(inputData.getAmount().trim()));
		amt.setCurrency(Constants.CURRENCY_CODE);
		initDisputeData.setDisputeAmount(amt);
		
		//if input contains ExceptionInd as Y then populate EFL info
		if(inputData !=null && inputData.getExceptionInd() !=null && "Y".equalsIgnoreCase(inputData.getExceptionInd().trim())) {
			DisputeEFLInfoType exceptionFile=new DisputeEFLInfoType();
			exceptionFile.setPurgeNoOfDays(new BigInteger(Constants.SUBMIT_EXCEPTION_NEGATIVE_FILE_LIST_PURGE_DAYS.trim() != ""
					? Constants.SUBMIT_EXCEPTION_NEGATIVE_FILE_LIST_PURGE_DAYS.trim()
					: "90"));
			exceptionFile.setEFLActionCode(EFLActionCodeType.EFL_04);
			exceptionFile.setPurgeOptions(PurgeOptionsType.P);
			CRBRegionType regiontype=new CRBRegionType();
			regiontype.getRegion().add("D");
			exceptionFile.setCardRecoveryBulletinRegions(regiontype);
			initDisputeData.setDisputeEFLInfo(exceptionFile);
		}
		
		
		// set RequestData object
		initDisputeRequestType.setRequestData(initDisputeData);

		return initDisputeRequestType;
	}

	/**
	 * Method to create SIGetAssociatedTransactionListRequest
	 * 
	 * 
	 * @param associatedTransGroupId
	 * 
	 * @return SIGetAssociatedTransactionListRequestType
	 * 
	 * @throws DatatypeConfigurationException
	 */
	static SIGetAssociatedTransactionListRequestType createGetAssociatedTransactionListRequest(
			Long associatedTransGroupId) throws DatatypeConfigurationException {

		SIGetAssociatedTransactionListRequestType getAssociatedTransactionListRequestType = new SIGetAssociatedTransactionListRequestType();

		// create and set RequestHeader
		RequestHeaderType reqHeader = createRequestHeader();
		getAssociatedTransactionListRequestType.setRequestHeader(reqHeader);

		// create RequestData object
		AssociatedTransactionDetailsRequestType getAssociatedTranListData = new AssociatedTransactionDetailsRequestType();

		// set associatedTransGroupId
		getAssociatedTranListData.setAssociatedTransGroupId(associatedTransGroupId);

		// set RequestData object
		getAssociatedTransactionListRequestType.setRequestData(getAssociatedTranListData);

		return getAssociatedTransactionListRequestType;
	}
	
	
	/**
	 * Method to create SIGetAssociatedTransactionListRequest
	 * 
	 * 
	 * @param associatedTransGroupId
	 * 
	 * @return SIGetAssociatedTransactionListRequestType
	 * 
	 * @throws DatatypeConfigurationException
	 */
	static Map<String,Object> createAssociatedTransactionSelectionRequest(
			Long visaCaseNumber, Long associatedTransGropuId,List<AssociatedTransactionType> associatedTranList, ChargebackInputData chbInputData, BigDecimal  originalSaleAmount, String originalAuthCode) throws DatatypeConfigurationException {
		
		Map<String,Object> mapAssociatedSelectedReq = new HashMap<String, Object>();
		
		String inputTransId=chbInputData.getTranID().trim();
		
		boolean associatedCreditTxnNotSelected=false;
		boolean associatedAuthTxnNotSelected=false;

		SIAssociatedTranSelectionRequestType associatedTranSelectionRequestType = new SIAssociatedTranSelectionRequestType();

		// create and set RequestHeader
		RequestHeaderType reqHeader = createRequestHeader();
		associatedTranSelectionRequestType.setRequestHeader(reqHeader);

		// create RequestData object
		AssociatedTranSelectionRequestType associatedTranSelectionData = new AssociatedTranSelectionRequestType();

		//set visacaseNumber from previous API
		associatedTranSelectionData.setVisaCaseNumber(visaCaseNumber);
		
		//set associatedTransGropuId from previous API
		associatedTranSelectionData.setAssociatedTransGroupId(associatedTransGropuId);
		
		//loop through AssociatedTransactionType List from GetAssociateTranList API call 
		//and mark associated transactions.
		for(AssociatedTransactionType associatedTranType:associatedTranList) {
			
			AssociationType association=new AssociationType();
			
			//if transactionId and Authcode match, transactions are associated 
			if (inputTransId.equalsIgnoreCase(associatedTranType.getTransactionID().trim())) {
					association.setAssociated(YNType.Y);
					association.setRolTransactionId(associatedTranType.getRolTransactionId());
			}else {
				if(Constants.TRANSACTION_TYPE_CREDIT.equalsIgnoreCase(associatedTranType.getTransactionType())) {
					associatedCreditTxnNotSelected=true;
				}else if(Constants.TRANSACTION_TYPE_AUTH.equalsIgnoreCase(associatedTranType.getTransactionType())) {
					associatedAuthTxnNotSelected=true;
				}
				association.setAssociated(YNType.N);
				association.setRolTransactionId(associatedTranType.getRolTransactionId());
			}
			associatedTranSelectionData.getAssociation().add(association);
		}
		
		// set RequestData object
		associatedTranSelectionRequestType.setRequestData(associatedTranSelectionData);
		
		mapAssociatedSelectedReq.put("request", associatedTranSelectionRequestType);
		
		//These flag is used by SubmitDisputeQuestionnaire API call to set an explanation
		mapAssociatedSelectedReq.put("associatedCreditTxnNotSelected", new Boolean(associatedCreditTxnNotSelected));
		mapAssociatedSelectedReq.put("associatedAuthTxnNotSelected", new Boolean(associatedAuthTxnNotSelected));

		return mapAssociatedSelectedReq;
	}

	/**
	 * Method to create RequestHeader- This can be used in multiple API calls.
	 * 
	 * @return RequestHeaderType
	 */
	private static RequestHeaderType createRequestHeader() {

		RequestHeaderType reqHeader = new RequestHeaderType();

		UserType userType = new UserType();
		userType.setId(Constants.VISA_REQUEST_HEADER_USER_ID);
		userType.setType(Constants.VISA_REQUEST_HEADER_USER_TYPE);

		reqHeader.setMemberRole(MemberRoleType.I);
		reqHeader.setUser(userType);
		return reqHeader;
	}

}
