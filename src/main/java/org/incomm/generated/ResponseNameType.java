//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.02.13 at 11:38:26 AM EST 
//


package org.incomm.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonValue;


/**
 * <p>Java class for ResponseNameType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ResponseNameType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="LoginRequestResponse"/&gt;
 *     &lt;enumeration value="LoginSubmitResponse"/&gt;
 *     &lt;enumeration value="ChangePasswordRequestResponse"/&gt;
 *     &lt;enumeration value="ChangePasswordSubmitResponse"/&gt;
 *     &lt;enumeration value="ChangePasswordCancelResponse"/&gt;
 *     &lt;enumeration value="TestAuthenticationResponse"/&gt;
 *     &lt;enumeration value="LogoutResponse"/&gt;
 *     &lt;enumeration value="SubmitQuestionnaireResponse"/&gt;
 *     &lt;enumeration value="PendQuestionnaireResponse"/&gt;
 *     &lt;enumeration value="CancelQuestionnaireResponse"/&gt;
 *     &lt;enumeration value="DeleteQuestionnaireResponse"/&gt;
 *     &lt;enumeration value="SystemErrorResponse"/&gt;
 *     &lt;enumeration value="CloseQuestionnaireResponse"/&gt;
 *     &lt;enumeration value="CancelDisputeWarningResponse"/&gt;
 *     &lt;enumeration value="QuestionnaireAttachmentResponse"/&gt;
 *     &lt;enumeration value="DisputeResponse"/&gt;
 *     &lt;enumeration value="CloseDisputeErrorResponse"/&gt;
 *     &lt;enumeration value="CancelRecallResponse"/&gt;
 *     &lt;enumeration value="CloseMultiAdviceMatchResponse"/&gt;
 *     &lt;enumeration value="SubmitRecallResponse"/&gt;
 *     &lt;enumeration value="CookieBinderPage"/&gt;
 *     &lt;enumeration value="MaintenanceResponse"/&gt;
 *     &lt;enumeration value="IgnoreRejectResponse"/&gt;
 *     &lt;enumeration value="UploadDocumentResp"/&gt;
 *     &lt;enumeration value="DisputeQuestionnaireResp"/&gt;
 *     &lt;enumeration value="GetQuestionnaireDataResp"/&gt;
 *     &lt;enumeration value="GetDocumentResp"/&gt;
 *     &lt;enumeration value="SubmitFraudReportResp"/&gt;
 *     &lt;enumeration value="FraudReportDetailsResp"/&gt;
 *     &lt;enumeration value="SubmitFraudIgnoreResponse"/&gt;
 *     &lt;enumeration value="SubmitExceptionResp"/&gt;
 *     &lt;enumeration value="InquiryExceptionResp"/&gt;
 *     &lt;enumeration value="ExceptionDetailsResp"/&gt;
 *     &lt;enumeration value="SubmitAdjustmentResponse"/&gt;
 *     &lt;enumeration value="AdjustmentDetailsResponse"/&gt;
 *     &lt;enumeration value="ManualCaseCreationResponse"/&gt;
 *     &lt;enumeration value="SubmitTranInquiryResponse"/&gt;
 *     &lt;enumeration value="GetTransInquiryResultsResponse"/&gt;
 *     &lt;enumeration value="GetTransDetailsResponse"/&gt;
 *     &lt;enumeration value="CreateCaseFromTransactionResponse"/&gt;
 *     &lt;enumeration value="SetTransactionForCaseResponse"/&gt;
 *     &lt;enumeration value="LinkUnlinkCaseResponse"/&gt;
 *     &lt;enumeration value="GetMMIResponse"/&gt;
 *     &lt;enumeration value="SubmitQuickFormResponse"/&gt;
 *     &lt;enumeration value="GetVDASDetailsResponse"/&gt;
 *     &lt;enumeration value="IgnoreVDASResponse"/&gt;
 *     &lt;enumeration value="IgnoreReverseVDASResponse"/&gt;
 *     &lt;enumeration value="ViewPotentialQnMatchesResponse"/&gt;
 *     &lt;enumeration value="ViewPotentialVDASMatchesResponse"/&gt;
 *     &lt;enumeration value="CloseMiscFeeResponse"/&gt;
 *     &lt;enumeration value="CloseMessageResponse"/&gt;
 *     &lt;enumeration value="RetrievePotentialMatchesResponse"/&gt;
 *     &lt;enumeration value="IgnoreUnmatchedItemResponse"/&gt;
 *     &lt;enumeration value="AddUnmatchedItemToCaseResponse"/&gt;
 *     &lt;enumeration value="LinkAsSameDisputeResponse"/&gt;
 *     &lt;enumeration value="BatchQueueResponse"/&gt;
 *     &lt;enumeration value="MarkBatchQueueItemAsReadResponse"/&gt;
 *     &lt;enumeration value="GetGMFPDetailsResponse"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ResponseNameType")
@XmlEnum
public enum ResponseNameType {

    @XmlEnumValue("LoginRequestResponse")
    LOGIN_REQUEST_RESPONSE("LoginRequestResponse"),
    @XmlEnumValue("LoginSubmitResponse")
    LOGIN_SUBMIT_RESPONSE("LoginSubmitResponse"),
    @XmlEnumValue("ChangePasswordRequestResponse")
    CHANGE_PASSWORD_REQUEST_RESPONSE("ChangePasswordRequestResponse"),
    @XmlEnumValue("ChangePasswordSubmitResponse")
    CHANGE_PASSWORD_SUBMIT_RESPONSE("ChangePasswordSubmitResponse"),
    @XmlEnumValue("ChangePasswordCancelResponse")
    CHANGE_PASSWORD_CANCEL_RESPONSE("ChangePasswordCancelResponse"),
    @XmlEnumValue("TestAuthenticationResponse")
    TEST_AUTHENTICATION_RESPONSE("TestAuthenticationResponse"),
    @XmlEnumValue("LogoutResponse")
    LOGOUT_RESPONSE("LogoutResponse"),
    @XmlEnumValue("SubmitQuestionnaireResponse")
    SUBMIT_QUESTIONNAIRE_RESPONSE("SubmitQuestionnaireResponse"),
    @XmlEnumValue("PendQuestionnaireResponse")
    PEND_QUESTIONNAIRE_RESPONSE("PendQuestionnaireResponse"),
    @XmlEnumValue("CancelQuestionnaireResponse")
    CANCEL_QUESTIONNAIRE_RESPONSE("CancelQuestionnaireResponse"),
    @XmlEnumValue("DeleteQuestionnaireResponse")
    DELETE_QUESTIONNAIRE_RESPONSE("DeleteQuestionnaireResponse"),
    @XmlEnumValue("SystemErrorResponse")
    SYSTEM_ERROR_RESPONSE("SystemErrorResponse"),
    @XmlEnumValue("CloseQuestionnaireResponse")
    CLOSE_QUESTIONNAIRE_RESPONSE("CloseQuestionnaireResponse"),
    @XmlEnumValue("CancelDisputeWarningResponse")
    CANCEL_DISPUTE_WARNING_RESPONSE("CancelDisputeWarningResponse"),
    @XmlEnumValue("QuestionnaireAttachmentResponse")
    QUESTIONNAIRE_ATTACHMENT_RESPONSE("QuestionnaireAttachmentResponse"),
    @XmlEnumValue("DisputeResponse")
    DISPUTE_RESPONSE("DisputeResponse"),
    @XmlEnumValue("CloseDisputeErrorResponse")
    CLOSE_DISPUTE_ERROR_RESPONSE("CloseDisputeErrorResponse"),
    @XmlEnumValue("CancelRecallResponse")
    CANCEL_RECALL_RESPONSE("CancelRecallResponse"),
    @XmlEnumValue("CloseMultiAdviceMatchResponse")
    CLOSE_MULTI_ADVICE_MATCH_RESPONSE("CloseMultiAdviceMatchResponse"),
    @XmlEnumValue("SubmitRecallResponse")
    SUBMIT_RECALL_RESPONSE("SubmitRecallResponse"),
    @XmlEnumValue("CookieBinderPage")
    COOKIE_BINDER_PAGE("CookieBinderPage"),
    @XmlEnumValue("MaintenanceResponse")
    MAINTENANCE_RESPONSE("MaintenanceResponse"),
    @XmlEnumValue("IgnoreRejectResponse")
    IGNORE_REJECT_RESPONSE("IgnoreRejectResponse"),
    @XmlEnumValue("UploadDocumentResp")
    UPLOAD_DOCUMENT_RESP("UploadDocumentResp"),
    @XmlEnumValue("DisputeQuestionnaireResp")
    DISPUTE_QUESTIONNAIRE_RESP("DisputeQuestionnaireResp"),
    @XmlEnumValue("GetQuestionnaireDataResp")
    GET_QUESTIONNAIRE_DATA_RESP("GetQuestionnaireDataResp"),
    @XmlEnumValue("GetDocumentResp")
    GET_DOCUMENT_RESP("GetDocumentResp"),
    @XmlEnumValue("SubmitFraudReportResp")
    SUBMIT_FRAUD_REPORT_RESP("SubmitFraudReportResp"),
    @XmlEnumValue("FraudReportDetailsResp")
    FRAUD_REPORT_DETAILS_RESP("FraudReportDetailsResp"),
    @XmlEnumValue("SubmitFraudIgnoreResponse")
    SUBMIT_FRAUD_IGNORE_RESPONSE("SubmitFraudIgnoreResponse"),
    @XmlEnumValue("SubmitExceptionResp")
    SUBMIT_EXCEPTION_RESP("SubmitExceptionResp"),
    @XmlEnumValue("InquiryExceptionResp")
    INQUIRY_EXCEPTION_RESP("InquiryExceptionResp"),
    @XmlEnumValue("ExceptionDetailsResp")
    EXCEPTION_DETAILS_RESP("ExceptionDetailsResp"),
    @XmlEnumValue("SubmitAdjustmentResponse")
    SUBMIT_ADJUSTMENT_RESPONSE("SubmitAdjustmentResponse"),
    @XmlEnumValue("AdjustmentDetailsResponse")
    ADJUSTMENT_DETAILS_RESPONSE("AdjustmentDetailsResponse"),
    @XmlEnumValue("ManualCaseCreationResponse")
    MANUAL_CASE_CREATION_RESPONSE("ManualCaseCreationResponse"),
    @XmlEnumValue("SubmitTranInquiryResponse")
    SUBMIT_TRAN_INQUIRY_RESPONSE("SubmitTranInquiryResponse"),
    @XmlEnumValue("GetTransInquiryResultsResponse")
    GET_TRANS_INQUIRY_RESULTS_RESPONSE("GetTransInquiryResultsResponse"),
    @XmlEnumValue("GetTransDetailsResponse")
    GET_TRANS_DETAILS_RESPONSE("GetTransDetailsResponse"),
    @XmlEnumValue("CreateCaseFromTransactionResponse")
    CREATE_CASE_FROM_TRANSACTION_RESPONSE("CreateCaseFromTransactionResponse"),
    @XmlEnumValue("SetTransactionForCaseResponse")
    SET_TRANSACTION_FOR_CASE_RESPONSE("SetTransactionForCaseResponse"),
    @XmlEnumValue("LinkUnlinkCaseResponse")
    LINK_UNLINK_CASE_RESPONSE("LinkUnlinkCaseResponse"),
    @XmlEnumValue("GetMMIResponse")
    GET_MMI_RESPONSE("GetMMIResponse"),
    @XmlEnumValue("SubmitQuickFormResponse")
    SUBMIT_QUICK_FORM_RESPONSE("SubmitQuickFormResponse"),
    @XmlEnumValue("GetVDASDetailsResponse")
    GET_VDAS_DETAILS_RESPONSE("GetVDASDetailsResponse"),
    @XmlEnumValue("IgnoreVDASResponse")
    IGNORE_VDAS_RESPONSE("IgnoreVDASResponse"),
    @XmlEnumValue("IgnoreReverseVDASResponse")
    IGNORE_REVERSE_VDAS_RESPONSE("IgnoreReverseVDASResponse"),
    @XmlEnumValue("ViewPotentialQnMatchesResponse")
    VIEW_POTENTIAL_QN_MATCHES_RESPONSE("ViewPotentialQnMatchesResponse"),
    @XmlEnumValue("ViewPotentialVDASMatchesResponse")
    VIEW_POTENTIAL_VDAS_MATCHES_RESPONSE("ViewPotentialVDASMatchesResponse"),
    @XmlEnumValue("CloseMiscFeeResponse")
    CLOSE_MISC_FEE_RESPONSE("CloseMiscFeeResponse"),
    @XmlEnumValue("CloseMessageResponse")
    CLOSE_MESSAGE_RESPONSE("CloseMessageResponse"),
    @XmlEnumValue("RetrievePotentialMatchesResponse")
    RETRIEVE_POTENTIAL_MATCHES_RESPONSE("RetrievePotentialMatchesResponse"),
    @XmlEnumValue("IgnoreUnmatchedItemResponse")
    IGNORE_UNMATCHED_ITEM_RESPONSE("IgnoreUnmatchedItemResponse"),
    @XmlEnumValue("AddUnmatchedItemToCaseResponse")
    ADD_UNMATCHED_ITEM_TO_CASE_RESPONSE("AddUnmatchedItemToCaseResponse"),
    @XmlEnumValue("LinkAsSameDisputeResponse")
    LINK_AS_SAME_DISPUTE_RESPONSE("LinkAsSameDisputeResponse"),
    @XmlEnumValue("BatchQueueResponse")
    BATCH_QUEUE_RESPONSE("BatchQueueResponse"),
    @XmlEnumValue("MarkBatchQueueItemAsReadResponse")
    MARK_BATCH_QUEUE_ITEM_AS_READ_RESPONSE("MarkBatchQueueItemAsReadResponse"),
    @XmlEnumValue("GetGMFPDetailsResponse")
    GET_GMFP_DETAILS_RESPONSE("GetGMFPDetailsResponse");
    private final String value;

    ResponseNameType(String v) {
        value = v;
    }

    @JsonValue
    public String value() {
        return value;
    }

    @JsonCreator
    public static ResponseNameType fromValue(String v) {
        for (ResponseNameType c: ResponseNameType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
