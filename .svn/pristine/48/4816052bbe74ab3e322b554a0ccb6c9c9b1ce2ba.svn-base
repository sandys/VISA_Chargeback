package com.incomm.esb.fraudreporting;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.xml.datatype.DatatypeConfigurationException;

import org.incomm.generated.AmountType;
import org.incomm.generated.CreateCaseFromTransactionRequestType;
import org.incomm.generated.FraudTypeCategoryType;
import org.incomm.generated.MemberRoleType;
import org.incomm.generated.RTSIExtendedCreateCaseInfoType;
import org.incomm.generated.RTSISubmitFraudReportType;
import org.incomm.generated.RequestHeaderType;
import org.incomm.generated.SICreateCaseFromTransactionRequestType;
import org.incomm.generated.SISubmitFraudReportRequestType;
import org.incomm.generated.SISubmitTranInquiryRequestType;
import org.incomm.generated.SubmitTranInquiryRequestType;
import org.incomm.generated.TransactionType;
import org.incomm.generated.UserType;

import com.incomm.esb.util.Constants;
import com.incomm.esb.util.Util;

/**
 * This class has methods to create API request objects using generated JAXB objects from ROLSIRT schema. 
 *  
 *  Following APIs request have been formed in this class.
 *  
 *  SISubmitTranInquiryRequestType
 *  SICreateCaseFromTransactionRequestType
 *  SISubmitFraud
 *  
 * @author hahuja
 *
 */

 class VisaFraudReportingAPIUtil {

	//private static final Logger logger = LogManager.getLogger(VisaFraudReportingAPIUtil.class);
	/**
	 * Method to create SubmitTranInquiryRequest
	 * Data will be supplied from feedfile
	 * 
	 * @param FraudReportingInputData
	 * 
	 * @return SISubmitTranInquiryRequestType
	 * 
	 * @throws DatatypeConfigurationException 
	 */
	 static SISubmitTranInquiryRequestType createSubmitTIRequest(FraudReportingInputData inputData) throws DatatypeConfigurationException{
		SISubmitTranInquiryRequestType submitTranInquiryRequestType = new SISubmitTranInquiryRequestType();
		
		//RequestHeader
		RequestHeaderType reqHeader = createRequestHeader();
		submitTranInquiryRequestType.setRequestHeader(reqHeader);
		//RequestHeader
		
		
		//RequestData
		SubmitTranInquiryRequestType submitTIData=new SubmitTranInquiryRequestType();
		
		//AcctNumber from feed file
		submitTIData.setCardNumber(inputData.getAcctnumber());
		
		String FORMATER = "yyyy-MM-dd";

	    DateFormat formatter = new SimpleDateFormat(FORMATER);	
		Date currentDate = new Date();
		
		String startDate = formatter.format(Util.subtractDays(currentDate,Constants.FRAUD_DAYS_TO_TRACK-1));
		String endDate = formatter.format(currentDate);
		
		submitTIData.setStartDate(startDate);
		submitTIData.setEndDate(endDate);
		
		
		submitTIData.setTransactionType(Constants.SUBMIT_TRAN_INQUIRY_TRANSACTION_TYPE);
		submitTranInquiryRequestType.setRequestData(submitTIData);
		//RequestData
		return submitTranInquiryRequestType;
	}
	
	
	/**
	 * Method for CreateCaseFromTransaction
	 *  
	 * @param rolTransactionId - transactionID from TranInquiry API call
	 * @param JIRA - from input feed file
	 *  
	 * @return SICreateCaseFromTransactionRequestType
	 * 
	 */
	 static SICreateCaseFromTransactionRequestType createCaseFromTransaction(Long rolTransactionId,String JIRA){
		SICreateCaseFromTransactionRequestType createCase = new SICreateCaseFromTransactionRequestType();
		
		RequestHeaderType reqHeader = createRequestHeader();
		createCase.setRequestHeader(reqHeader);
		
		CreateCaseFromTransactionRequestType createCaseData=new CreateCaseFromTransactionRequestType();
		createCaseData.setRolTransactionId(rolTransactionId);
		
		//caseInfo element
		RTSIExtendedCreateCaseInfoType caseInfo=new RTSIExtendedCreateCaseInfoType();
		caseInfo.setCaseType(Constants.FRAUD_CASE_TYPE);
		caseInfo.setFraudClassification(Constants.FRAUD_CLASSIFICATION);
		caseInfo.setInitiatorAndSource(Constants.FRAUD_INITIATOR_AND_SOURCE);
		caseInfo.setMemberCaseNumber(JIRA);
		createCaseData.setCaseInfo(caseInfo);
		
		createCase.setRequestData(createCaseData);
		
		return createCase;
	}
	
	
	
	/**
	 * Method to create SISubmitFraudReportRequestType
	 * Data will be supplied from SubmitTransactionAPICall and JIRA from input
	 * 
	 * @param visaCasenumber
	 * @param transactionAmount
	 * 	 
	 * @return SISubmitFraudReportRequestType
	 * 
	 */
	 static SISubmitFraudReportRequestType createSubmitFraud(Long visaCasenumber,BigDecimal transactionAmount){
		SISubmitFraudReportRequestType submitFraud = new SISubmitFraudReportRequestType();
		
		RequestHeaderType reqHeader = createRequestHeader();
		submitFraud.setRequestHeader(reqHeader);
		
		
		RTSISubmitFraudReportType submitFraudData=new RTSISubmitFraudReportType();
		submitFraudData.setVisaCaseNumber(visaCasenumber);
		submitFraudData.setFraudType(Constants.FRAUD_TYPE);
		submitFraudData.setFraudTypeCategory(FraudTypeCategoryType.CARDTXN);
		
		//transaction
		TransactionType transaction = new TransactionType();
		AmountType amtType=new AmountType();
		amtType.setValue(transactionAmount);
		amtType.setCurrency(Constants.CURRENCY_CODE);
		transaction.setAmount(amtType);
		submitFraudData.setTransaction(transaction);
		
		submitFraudData.setCardholderIdMethod(Constants.FRAUD_CARD_HOLDER_ID_METHOD);
		submitFraudData.setNotificationCd(Constants.FRAUD_NOTIFICATION_CD);
		submitFraudData.setIssuerGenAuth(Constants.FRAUD_ISSUER_GEN_AUTH);
		submitFraudData.setAutoAssignAccountSequenceNumInd(Constants.FRAUD_AUTO_ASSIGN_ACCOUNT_SEQ_NUM_IND);
		submitFraudData.setCloseFraudCaseInd(Constants.FRAUD_CLOSE_FRAUD_CASE_IND);
		submitFraudData.setFraudInvestigativeStatus(Constants.FRAUD_INVESTIGATIVE_STATUS);
		
		
		submitFraud.setRequestData(submitFraudData);
		
		return submitFraud;
	}
	
	
	/**
	 * Method to create RequestHeader- This can be used in multiple API calls.
	 * consider to move constants in property file.
	 * 
	 * @return RequestHeaderType
	 */
	private static RequestHeaderType createRequestHeader() {
		
		RequestHeaderType reqHeader=new RequestHeaderType();
		
		UserType userType=new UserType();
		userType.setId(Constants.VISA_REQUEST_HEADER_USER_ID);
		userType.setType(Constants.VISA_REQUEST_HEADER_USER_TYPE);
		
		
		reqHeader.setMemberRole(MemberRoleType.I);
		reqHeader.setUser(userType);
		return reqHeader;
	}
}
