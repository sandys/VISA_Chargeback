package com.incomm.esb.util;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

import org.apache.commons.collections.ExtendedProperties;
import org.apache.log4j.Logger;

import com.ussouth.encryption.util.Base64Coder;
import com.ussouth.encryption.util.PasswordEncryptDecrypt;

/**
 * This class statically loads all constants configured in ACF or visa-vrol-restclient.properties.
 * 
 * The constants are used in REST API Call.
 * 
 * @author hahuja
 *
 */

public class Constants {

	private final static Logger logger = Logger.getLogger(Constants.class);
	// VISA REST API BASE URL
	// These should be changed to prod
	// PRD TI - https://mutualservicesgateway.visa.com/rsrv_rolti/api
	// PRD SI - https://mutualservicesgateway.visa.com//rsrv_rolsi/api

	public static String VISA_TI_BASE_URL = "";
	public static String VISA_SI_BASE_URL = "";

	public static String KEYSTORE_PATH = "";
	public static String KEYSTORE_PASSWORD = "";

	// These path are different in DEV and PROD
	public static String VISA_RESOURCE_PATH_SUBMIT_TRANS_INQUIRY = "";
	public static String VISA_RESOURCE_PATH_CREATE_CASE = "";
	public static String VISA_RESOURCE_PATH_DISPUTE_QUESTIONNAIRE = "";
	public static String VISA_RESOURCE_PATH_SUBMIT_DISPUTE_QUESTIONNAIRE = "";
	public static String VISA_RESOURCE_PATH_INITIATE_DISPUTE = "";
	public static String VISA_RESOURCE_PATH_GET_ASSOCIATED_TXN_LIST = "";
	public static String VISA_RESOURCE_PATH_ASSOCIATED_TXN_SELECTION = "";
	public static String VISA_RESOURCE_PATH_SUBMIT_EXCEPTION = "";
	public static String VISA_RESOURCE_PATH_SUBMIT_FRAUD = "";

	// Constants used in Request Header of API calls
	public static String VISA_REQUEST_HEADER_USER_ID = "";
	public static String VISA_REQUEST_HEADER_USER_TYPE = "";
	public static String VISA_USER_PASSWORD = "";

	// Constants specific to SubmitTranInquiry API
	public static String SUBMIT_TRAN_INQUIRY_TRANSACTION_TYPE = "";
	public static String SUBMIT_TRAN_INQUIRY_DAY_RANGE = "";

	// Constants specific to DISPUTE QUESTIONNAIRE API
	public static String DISPUTE_QUESTIONNAIRE_MEMBER_MSG_EDIT_TEXT = "";
	public static String DISPUTE_QUESTIONNAIRE_PARTIAL_CHB_MEMBER_MSG_EDIT_TEXT = "";
	public static String DISPUTE_QUESTIONNAIRE_EXPLAINATION_OF_CREDIT_PRESENTED="";
	public static String CURRENCY_CODE = "";
	public static String DISPUTE_QUESTIONNAIRE_DISPUTE_GROUP_CODE = "";
	public static String DISPUTE_QUESTIONNAIRE_DISPUTE_REASON_CODE = "";
	public static boolean DISPUTE_QUESTIONNAIRE_SECOND_CHARGEBACK = false;

	// Constant specific to InitiateDisputeFromTransactionOrCase API
	public static String DISPUTE_CATEGORY_AUTHORIZATION="11";
	public static String DISPUTE_CATEGORY_FRAUD="10";
	
	
	public static String TRANSACTION_TYPE_AUTH="";
	public static String TRANSACTION_TYPE_CREDIT="";
	
	// Constant specific to SubmitException API
	public static String SUBMIT_EXCEPTION_NEGATIVE_FILE_LIST_ACTION_CODE = "";
	public static String SUBMIT_EXCEPTION_NEGATIVE_FILE_LIST_PURGE_DAYS = "";

	// Constants specific to code

	// This is default first 3 digit of current year used in Julian Date
	// calculation from TranID.
	// This is calculated programmatically, the default is used when there is
	// exception in code.
	public static String JULIAN_DATE_YEAR_PREFIX_DEFAULT = "201";

	// Used as key for Map returned by method to calculate startDate and endDate
	// from Julian and DayRange
	public static String MAP_KEY_START_DATE = "startDate";
	public static String MAP_KEY_END_DATE = "endDate";

	// Fraud Reporting

	public static int FRAUD_DAYS_TO_TRACK = 90;
	public static String FRAUD_CASE_TYPE = "";
	public static String FRAUD_CLASSIFICATION = "";
	public static String FRAUD_INITIATOR_AND_SOURCE = "";

	// Constants specific to SubmitFraud API
	public static String FRAUD_TYPE = "5";
	public static String FRAUD_TYPE_CATEGORY = "";
	public static String FRAUD_CARD_HOLDER_ID_METHOD = "";
	public static int FRAUD_NOTIFICATION_CD = 1;
	public static String FRAUD_ISSUER_GEN_AUTH = "";
	public static boolean FRAUD_CLOSE_FRAUD_CASE_IND = false;
	public static String FRAUD_INVESTIGATIVE_STATUS = "";
	public static boolean FRAUD_AUTO_ASSIGN_ACCOUNT_SEQ_NUM_IND = true;

	public static String FRAUD_INVALID_TRANS_ID = "";
	public static String FRAUD_TRANS_ID_EXCEPTION_CODE = "";
	public static String FRAUD_TRANS_ID_EXCEPTION_MSG = "";

	// For Splunk logging
	public static String INCOMM_STATUS_CODE_SUCCESS = "0";
	public static String INCOMM_STATUS_MSG_SUCCESS = "Success";
	public static String INCOMM_STATUS_CODE_DUPLICATE = "85";
	public static String INCOMM_STATUS_MSG_DUPLICATE = "Duplicate Request";
	public static String INCOMM_STATUS_CODE_SYSTEM_ERROR = "29";
	public static String INCOMM_STATUS_MSG_SYSTEM_ERROR = "System Error";
	public static String INCOMM_STATUS_MSG_ASSOCIATION_SELECTION_REQUIRED = "";

	public static String VISA_CHARGEBACK_DUPLICATE_STATUS_CODE = "W-121000001";
	public static String VISA_FRAUD_DUPLICATE_STATUS_CODE = "W-127000003";
	private static ExtendedProperties extendedProperties = new ExtendedProperties();

	static {
		loadRestClientProperties();
	}

	/**
	 * Method to load Rest Client constants.
	 * First try is to load from ACF, if that fails
	 * then load from visa-vrol-restclient.properties.
	 * 
	 */
	private static void loadRestClientProperties() {	
		boolean configLoadedFromACF=false;
		try {
			// Load all configs from visarestclient group in ACF
			//extendedProperties= AppConfig.getExtendedProperties("visavrolrestclient");
			if(extendedProperties.size()>0){
				setAttributesToPropertiesValuesFromACF(extendedProperties);
				configLoadedFromACF=true;
			}
			
		}catch(Exception ex){
			logger.error("Exception during loading config from ACF, will load configs from Property files - "+ex);
			configLoadedFromACF=false;
		}
		
		try{
			if(!configLoadedFromACF)	
				loadConstantsFromPropertyFile();
		} catch (Exception ex) {
			String statusMsg="constants#loadRestClientProperties(): failed to load visa-vrol-restclient.properties - "+  ex;
			logger.error(statusMsg);
			
		}
	}

	/**
	 * Method to load Constants from visa-vrol-restclient.properties.
	 * @throws Exception 
	 */
	private static void loadConstantsFromPropertyFile() throws Exception {
		logger.debug("loading configs from properties file >> ");
		String restSystemprop = System.getProperty("restclient.configuration");
		if (restSystemprop == null) {
			logger.debug("Constants#loadRestClientProperties(): property restclient.configuration is null setting it");
			restSystemprop = "\\incomm\\jboss\\config\\visa-vrol-restclient.properties";
		}

		InputStream restPropFile = new FileInputStream(restSystemprop);

		Properties restProp = new Properties();
		restProp.load(restPropFile);
		logger.info("Constants#loadRestClientProperties visa-vrol-restclient.properties content >> " + restProp);
		setAttributesToPropertiesValues(restProp);
		logger.debug("<< finished loading constansts from properties file");
	}
	
	/**
	 * Method to set Constants from visa-vrol-restclient.properties.
	 * @throws Exception 
	 */
	private static void setAttributesToPropertiesValues(Properties commonProp) throws Exception {
		VISA_TI_BASE_URL = commonProp.getProperty("VISA_TI_BASE_URL");
		VISA_SI_BASE_URL = commonProp.getProperty("VISA_SI_BASE_URL");

		KEYSTORE_PATH = commonProp.getProperty("KEYSTORE_PATH");
		
		KEYSTORE_PASSWORD = new String(PasswordEncryptDecrypt.decryptpw(Base64Coder.decode(commonProp.getProperty("KEYSTORE_PASSWORD"))));

		// These path are same in DEV and PROD
		VISA_RESOURCE_PATH_SUBMIT_TRANS_INQUIRY = commonProp.getProperty("VISA_RESOURCE_PATH_SUBMIT_TRANS_INQUIRY");
		VISA_RESOURCE_PATH_CREATE_CASE = commonProp.getProperty("VISA_RESOURCE_PATH_CREATE_CASE");
		VISA_RESOURCE_PATH_DISPUTE_QUESTIONNAIRE = commonProp.getProperty("VISA_RESOURCE_PATH_DISPUTE_QUESTIONNAIRE");
		VISA_RESOURCE_PATH_SUBMIT_DISPUTE_QUESTIONNAIRE=commonProp.getProperty("VISA_RESOURCE_PATH_SUBMIT_DISPUTE_QUESTIONNAIRE");
		VISA_RESOURCE_PATH_INITIATE_DISPUTE=commonProp.getProperty("VISA_RESOURCE_PATH_INITIATE_DISPUTE");
		VISA_RESOURCE_PATH_GET_ASSOCIATED_TXN_LIST=commonProp.getProperty("VISA_RESOURCE_PATH_GET_ASSOCIATED_TXN_LIST");
		VISA_RESOURCE_PATH_ASSOCIATED_TXN_SELECTION=commonProp.getProperty("VISA_RESOURCE_PATH_ASSOCIATED_TXN_SELECTION");
		VISA_RESOURCE_PATH_SUBMIT_EXCEPTION = commonProp.getProperty("VISA_RESOURCE_PATH_SUBMIT_EXCEPTION");
		VISA_RESOURCE_PATH_SUBMIT_FRAUD = commonProp.getProperty("VISA_RESOURCE_PATH_SUBMIT_FRAUD");

		// Constants used in Request Header of API calls
		VISA_REQUEST_HEADER_USER_ID = commonProp.getProperty("VISA_REQUEST_HEADER_USER_ID");
		VISA_REQUEST_HEADER_USER_TYPE = commonProp.getProperty("VISA_REQUEST_HEADER_USER_TYPE");
		VISA_USER_PASSWORD =new String(PasswordEncryptDecrypt.decryptpw(Base64Coder.decode(commonProp.getProperty("VISA_USER_PASSWORD")))); 
				
		// Constants specific to SubmitTranInquiry API
		SUBMIT_TRAN_INQUIRY_TRANSACTION_TYPE = commonProp.getProperty("SUBMIT_TRAN_INQUIRY_TRANSACTION_TYPE");
		SUBMIT_TRAN_INQUIRY_DAY_RANGE = commonProp.getProperty("SUBMIT_TRAN_INQUIRY_DAY_RANGE");

		// Constants specific to DISPUTE QUESTIONNAIRE API
		DISPUTE_QUESTIONNAIRE_MEMBER_MSG_EDIT_TEXT = commonProp
				.getProperty("DISPUTE_QUESTIONNAIRE_MEMBER_MSG_EDIT_TEXT");
		DISPUTE_QUESTIONNAIRE_PARTIAL_CHB_MEMBER_MSG_EDIT_TEXT = commonProp
				.getProperty("DISPUTE_QUESTIONNAIRE_PARTIAL_CHB_MEMBER_MSG_EDIT_TEXT");
		DISPUTE_QUESTIONNAIRE_EXPLAINATION_OF_CREDIT_PRESENTED = commonProp
				.getProperty("DISPUTE_QUESTIONNAIRE_EXPLAINATION_OF_CREDIT_PRESENTED");
		CURRENCY_CODE = commonProp.getProperty("CURRENCY_CODE");
		DISPUTE_QUESTIONNAIRE_DISPUTE_GROUP_CODE = commonProp.getProperty("DISPUTE_QUESTIONNAIRE_DISPUTE_GROUP_CODE");
		DISPUTE_QUESTIONNAIRE_DISPUTE_REASON_CODE = commonProp.getProperty("DISPUTE_QUESTIONNAIRE_DISPUTE_REASON_CODE");
		DISPUTE_QUESTIONNAIRE_SECOND_CHARGEBACK = Boolean
				.valueOf(commonProp.getProperty("DISPUTE_QUESTIONNAIRE_SECOND_CHARGEBACK"));
		
		// Constants specific to INITIATE DISPUTE API
		DISPUTE_CATEGORY_AUTHORIZATION=commonProp.getProperty("DISPUTE_CATEGORY_AUTHORIZATION");
		DISPUTE_CATEGORY_FRAUD=commonProp.getProperty("DISPUTE_CATEGORY_FRAUD");
		
		TRANSACTION_TYPE_AUTH=commonProp.getProperty("TRANSACTION_TYPE_AUTH");
		TRANSACTION_TYPE_CREDIT=commonProp.getProperty("TRANSACTION_TYPE_CREDIT");
		
		// Constant specific to SubmitException API
		SUBMIT_EXCEPTION_NEGATIVE_FILE_LIST_ACTION_CODE = commonProp
				.getProperty("SUBMIT_EXCEPTION_NEGATIVE_FILE_LIST_ACTION_CODE");
		SUBMIT_EXCEPTION_NEGATIVE_FILE_LIST_PURGE_DAYS = commonProp
				.getProperty("SUBMIT_EXCEPTION_NEGATIVE_FILE_LIST_PURGE_DAYS");

		// Fraud Reporting
		FRAUD_DAYS_TO_TRACK = Integer.valueOf(commonProp.getProperty("FRAUD_DAYS_TO_TRACK"));
		FRAUD_CASE_TYPE = commonProp.getProperty("FRAUD_CASE_TYPE");
		FRAUD_CLASSIFICATION = commonProp.getProperty("FRAUD_CLASSIFICATION");
		FRAUD_INITIATOR_AND_SOURCE = commonProp.getProperty("FRAUD_INITIATOR_AND_SOURCE");

		// Constants specific to SubmitFraud API
		FRAUD_TYPE = commonProp.getProperty("FRAUD_TYPE");
		FRAUD_TYPE_CATEGORY = commonProp.getProperty("FRAUD_TYPE_CATEGORY");
		FRAUD_CARD_HOLDER_ID_METHOD = commonProp.getProperty("FRAUD_CARD_HOLDER_ID_METHOD");
		FRAUD_NOTIFICATION_CD = Integer.valueOf(commonProp.getProperty("FRAUD_NOTIFICATION_CD"));
		FRAUD_ISSUER_GEN_AUTH = commonProp.getProperty("FRAUD_ISSUER_GEN_AUTH");
		FRAUD_CLOSE_FRAUD_CASE_IND = Boolean.valueOf(commonProp.getProperty("FRAUD_CLOSE_FRAUD_CASE_IND"));
		FRAUD_INVESTIGATIVE_STATUS = commonProp.getProperty("FRAUD_INVESTIGATIVE_STATUS");
		FRAUD_AUTO_ASSIGN_ACCOUNT_SEQ_NUM_IND = Boolean
				.valueOf(commonProp.getProperty("FRAUD_AUTO_ASSIGN_ACCOUNT_SEQ_NUM_IND"));

		FRAUD_INVALID_TRANS_ID = commonProp.getProperty("FRAUD_INVALID_TRANS_ID");
		FRAUD_TRANS_ID_EXCEPTION_CODE = commonProp.getProperty("FRAUD_TRANS_ID_EXCEPTION_CODE");
		FRAUD_TRANS_ID_EXCEPTION_MSG = commonProp.getProperty("FRAUD_TRANS_ID_EXCEPTION_MSG");
		
		INCOMM_STATUS_MSG_ASSOCIATION_SELECTION_REQUIRED=commonProp.getProperty("INCOMM_STATUS_MSG_ASSOCIATION_SELECTION_REQUIRED");
		
	}

	/**
	 * Method to set Constant values from ACF
	 * @throws Exception 
	 */
	private static void setAttributesToPropertiesValuesFromACF(ExtendedProperties extendedProperties) throws Exception {
		VISA_TI_BASE_URL = extendedProperties.getString("VISA_TI_BASE_URL");
		VISA_SI_BASE_URL = extendedProperties.getString("VISA_SI_BASE_URL");

		KEYSTORE_PATH = extendedProperties.getString("KEYSTORE_PATH");
		KEYSTORE_PASSWORD =new String(PasswordEncryptDecrypt.decryptpw(Base64Coder.decode(extendedProperties.getString("KEYSTORE_PASSWORD"))));
				

		// These path are same in DEV and PROD
		VISA_RESOURCE_PATH_SUBMIT_TRANS_INQUIRY = extendedProperties
				.getString("VISA_RESOURCE_PATH_SUBMIT_TRANS_INQUIRY");
		VISA_RESOURCE_PATH_CREATE_CASE = extendedProperties.getString("VISA_RESOURCE_PATH_CREATE_CASE");
		VISA_RESOURCE_PATH_DISPUTE_QUESTIONNAIRE = extendedProperties
				.getString("VISA_RESOURCE_PATH_DISPUTE_QUESTIONNAIRE");
		VISA_RESOURCE_PATH_SUBMIT_DISPUTE_QUESTIONNAIRE= extendedProperties
				.getString("VISA_RESOURCE_PATH_SUBMIT_DISPUTE_QUESTIONNAIRE");
		VISA_RESOURCE_PATH_INITIATE_DISPUTE=extendedProperties.getString("VISA_RESOURCE_PATH_INITIATE_DISPUTE");
		VISA_RESOURCE_PATH_GET_ASSOCIATED_TXN_LIST=extendedProperties.getString("VISA_RESOURCE_PATH_GET_ASSOCIATED_TXN_LIST");
		VISA_RESOURCE_PATH_ASSOCIATED_TXN_SELECTION=extendedProperties.getString("VISA_RESOURCE_PATH_ASSOCIATED_TXN_SELECTION");
		VISA_RESOURCE_PATH_SUBMIT_EXCEPTION = extendedProperties.getString("VISA_RESOURCE_PATH_SUBMIT_EXCEPTION");
		VISA_RESOURCE_PATH_SUBMIT_FRAUD = extendedProperties.getString("VISA_RESOURCE_PATH_SUBMIT_FRAUD");

		// Constants used in Request Header of API calls
		VISA_REQUEST_HEADER_USER_ID = extendedProperties.getString("VISA_REQUEST_HEADER_USER_ID");
		VISA_REQUEST_HEADER_USER_TYPE = extendedProperties.getString("VISA_REQUEST_HEADER_USER_TYPE");
		VISA_USER_PASSWORD =new String(PasswordEncryptDecrypt.decryptpw(Base64Coder.decode(extendedProperties.getString("VISA_USER_PASSWORD")))); 

		// Constants specific to SubmitTranInquiry API
		SUBMIT_TRAN_INQUIRY_TRANSACTION_TYPE = extendedProperties.getString("SUBMIT_TRAN_INQUIRY_TRANSACTION_TYPE");
		SUBMIT_TRAN_INQUIRY_DAY_RANGE = extendedProperties.getString("SUBMIT_TRAN_INQUIRY_DAY_RANGE");

		// Constants specific to DISPUTE QUESTIONNAIRE API
		DISPUTE_QUESTIONNAIRE_MEMBER_MSG_EDIT_TEXT = extendedProperties
				.getString("DISPUTE_QUESTIONNAIRE_MEMBER_MSG_EDIT_TEXT");
		DISPUTE_QUESTIONNAIRE_PARTIAL_CHB_MEMBER_MSG_EDIT_TEXT = extendedProperties
				.getString("DISPUTE_QUESTIONNAIRE_PARTIAL_CHB_MEMBER_MSG_EDIT_TEXT");
		DISPUTE_QUESTIONNAIRE_EXPLAINATION_OF_CREDIT_PRESENTED = extendedProperties
				.getString("DISPUTE_QUESTIONNAIRE_EXPLAINATION_OF_CREDIT_PRESENTED");
		CURRENCY_CODE = extendedProperties.getString("CURRENCY_CODE");
		DISPUTE_QUESTIONNAIRE_DISPUTE_GROUP_CODE = extendedProperties
				.getString("DISPUTE_QUESTIONNAIRE_DISPUTE_GROUP_CODE");
		DISPUTE_QUESTIONNAIRE_DISPUTE_REASON_CODE = extendedProperties
				.getString("DISPUTE_QUESTIONNAIRE_DISPUTE_REASON_CODE");
		DISPUTE_QUESTIONNAIRE_SECOND_CHARGEBACK = extendedProperties
				.getBoolean("DISPUTE_QUESTIONNAIRE_SECOND_CHARGEBACK");
		
		// Constants specific to INITIATE DISPUTE API
		DISPUTE_CATEGORY_AUTHORIZATION=extendedProperties.getString("DISPUTE_CATEGORY_AUTHORIZATION");
		DISPUTE_CATEGORY_FRAUD=extendedProperties.getString("DISPUTE_CATEGORY_FRAUD");
		
		TRANSACTION_TYPE_AUTH=extendedProperties.getString("TRANSACTION_TYPE_AUTH");
		TRANSACTION_TYPE_CREDIT=extendedProperties.getString("TRANSACTION_TYPE_CREDIT");
		
		// Constant specific to SubmitException API
		SUBMIT_EXCEPTION_NEGATIVE_FILE_LIST_ACTION_CODE = extendedProperties
				.getString("SUBMIT_EXCEPTION_NEGATIVE_FILE_LIST_ACTION_CODE");
		SUBMIT_EXCEPTION_NEGATIVE_FILE_LIST_PURGE_DAYS = extendedProperties
				.getString("SUBMIT_EXCEPTION_NEGATIVE_FILE_LIST_PURGE_DAYS");

		// Fraud Reporting
		FRAUD_DAYS_TO_TRACK = extendedProperties.getInt("FRAUD_DAYS_TO_TRACK");
		FRAUD_CASE_TYPE = extendedProperties.getString("FRAUD_CASE_TYPE");
		FRAUD_CLASSIFICATION = extendedProperties.getString("FRAUD_CLASSIFICATION");
		FRAUD_INITIATOR_AND_SOURCE = extendedProperties.getString("FRAUD_INITIATOR_AND_SOURCE");

		// Constants specific to SubmitFraud API
		FRAUD_TYPE = extendedProperties.getString("FRAUD_TYPE");
		FRAUD_TYPE_CATEGORY = extendedProperties.getString("FRAUD_TYPE_CATEGORY");
		FRAUD_CARD_HOLDER_ID_METHOD = extendedProperties.getString("FRAUD_CARD_HOLDER_ID_METHOD");
		FRAUD_NOTIFICATION_CD = Integer.valueOf(extendedProperties.getString("FRAUD_NOTIFICATION_CD"));
		FRAUD_ISSUER_GEN_AUTH = extendedProperties.getString("FRAUD_ISSUER_GEN_AUTH");
		FRAUD_CLOSE_FRAUD_CASE_IND = extendedProperties.getBoolean("FRAUD_CLOSE_FRAUD_CASE_IND");
		FRAUD_INVESTIGATIVE_STATUS = extendedProperties.getString("FRAUD_INVESTIGATIVE_STATUS");
		FRAUD_AUTO_ASSIGN_ACCOUNT_SEQ_NUM_IND = extendedProperties.getBoolean("FRAUD_AUTO_ASSIGN_ACCOUNT_SEQ_NUM_IND");

		FRAUD_INVALID_TRANS_ID = extendedProperties.getString("FRAUD_INVALID_TRANS_ID");
		FRAUD_TRANS_ID_EXCEPTION_CODE = extendedProperties.getString("FRAUD_TRANS_ID_EXCEPTION_CODE");
		FRAUD_TRANS_ID_EXCEPTION_MSG = extendedProperties.getString("FRAUD_TRANS_ID_EXCEPTION_MSG");
		
		INCOMM_STATUS_MSG_ASSOCIATION_SELECTION_REQUIRED=extendedProperties.getString("INCOMM_STATUS_MSG_ASSOCIATION_SELECTION_REQUIRED");
	}

}
