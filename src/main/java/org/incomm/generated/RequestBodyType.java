//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.02.13 at 11:38:26 AM EST 
//


package org.incomm.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RequestBodyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RequestBodyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestBodyType")
@XmlSeeAlso({
    AccountingEntryRequestBodyType.class,
    AdjustmentRequestBodyType.class,
    AttachmentRequestBodyType.class,
    BatchQueueRequestType.class,
    ChangePasswordRequestBodyType.class,
    ContinueDisputeRequestBodyType.class,
    ExceptionRequestBodyType.class,
    FinancialRequestBodyType.class,
    FraudReportRequestBodyType.class,
    GetGMFPDetailsRequestType.class,
    HyperSearchRequestBodyType.class,
    IgnoreRejectRequestBodyType.class,
    InitiateDisputeRequestBodyType.class,
    LinkUnlinkCaseRequestBodyType.class,
    LogoutRequestBodyType.class,
    ManualCaseCreationRequestBodyType.class,
    MessageRequestBodyType.class,
    MiscFeeRequestBodyType.class,
    MyQueueRequestType.class,
    PPCSRequestBodyType.class,
    QuestionnaireRequestBodyType.class,
    QuickFormRequestBodyType.class,
    RFCRequestBodyType.class,
    SIAcceptDisputeRequestType.class,
    SIAddUnmatchedItemToCaseRequestType.class,
    SIAssociatedTranSelectionRequestType.class,
    SIChangeDisputeStatusRequestType.class,
    SIChangeQueueStatusRequestType.class,
    SICloseMessageRequestType.class,
    SICloseMiscFeeRequestType.class,
    SICloseRFCRequestType.class,
    SICloseTransactionRequestType.class,
    SICreateCaseFromTransactionRequestType.class,
    SICreateContactCardholderAdviceRequestType.class,
    SICreateDisputePreArbRequestType.class,
    SICreateDisputePreArbResponseRequestType.class,
    SICreateDisputePreCompRequestType.class,
    SICreateDisputePreCompResponseRequestType.class,
    SICreateDisputeResponseRequestType.class,
    SICreateMessageRequestType.class,
    SIDisputeQuestionnaireRequestType.class,
    SIGetAcceptanceNotificationDetailsRequestType.class,
    SIGetAccountingEntryDetailsRequestType.class,
    SIGetActiveScheduleRequestType.class,
    SIGetAdjustmentDetailsRequestType.class,
    SIGetAllTransDetailsRequestType.class,
    SIGetAssociatedTranSelectionRequestType.class,
    SIGetAssociatedTransactionListRequestType.class,
    SIGetBatchQueueRequestType.class,
    SIGetCaseDetailsRequestType.class,
    SIGetCollaborationDetailsRequestType.class,
    SIGetContactMessageRequestType.class,
    SIGetContactMessageResponseRequestType.class,
    SIGetDisputeDetailsRequestType.class,
    SIGetDisputeFilingDetailsRequestType.class,
    SIGetDisputeFinancialAdviceDetailsRequestType.class,
    SIGetDisputeFinancialDetailsRequestType.class,
    SIGetDisputePreArbDetailsRequestType.class,
    SIGetDisputePreArbResponseDetailsRequestType.class,
    SIGetDisputePreCompDetailsRequestType.class,
    SIGetDisputePreCompResponseDetailsRequestType.class,
    SIGetDisputeResponseDetailsRequestType.class,
    SIGetExceptionDetailsRequestType.class,
    SIGetFBDisputeQuestionnaireStatusRequestType.class,
    SIGetFinancialDetailsRequestType.class,
    SIGetFraudReportDetailsRequestType.class,
    SIGetGMFPDetailsRequestType.class,
    SIGetImageRequestType.class,
    SIGetMMIRequestType.class,
    SIGetMerchantNotificationDetailsRequestType.class,
    SIGetMessageImageRequestType.class,
    SIGetMessageRequestType.class,
    SIGetMiscFeeDetailsRequestType.class,
    SIGetPotentialMatchesRequestType.class,
    SIGetPurchaseInquiryRequestType.class,
    SIGetQuestionnaireDataRequestType.class,
    SIGetQueueRequestType.class,
    SIGetRFCAdviceRequestType.class,
    SIGetRFCDetailsRequestType.class,
    SIGetRFCFulfillmentRequestType.class,
    SIGetRFCNonFulfillmentRequestType.class,
    SIGetStopPaymentDetailsRequestType.class,
    SIGetTransDetailsRequestType.class,
    SIGetTransInquiryResultsRequestType.class,
    SIGetTransactionsFromCaseRequestType.class,
    SIGetVDASDetailsRequestType.class,
    SIHyperSearchRequestType.class,
    SIIgnoreGMFPRequestType.class,
    SIIgnoreRejectRequestType.class,
    SIIgnoreReverseVDASRequestType.class,
    SIIgnoreUnmatchedItemRequestType.class,
    SIIgnoreVDASRequestType.class,
    SIInitiateDisputeFromTransactionOrCaseRequestType.class,
    SIInquiryExceptionRequestType.class,
    SILinkAsSameDisputeRequestType.class,
    SILinkUnlinkCasesRequestType.class,
    SIMarkBatchQueueItemAsReadRequestType.class,
    SIMerchantDataRequestType.class,
    SIRetrieveReportOutputRequestType.class,
    SISetTransactionForCaseRequestType.class,
    SISubmitAccountingEntryRequestType.class,
    SISubmitAdjustmentRequestType.class,
    SISubmitCollaborationRequestType.class,
    SISubmitContactMessageResponseRequestType.class,
    SISubmitDisputeFilingRequestType.class,
    SISubmitDisputeQuestionnaireRequestType.class,
    SISubmitExceptionRequestType.class,
    SISubmitFinancialReversalRequestType.class,
    SISubmitFraudBundleDisputeQuestionnaireRequestType.class,
    SISubmitFraudReportRequestType.class,
    SISubmitManualCaseCreationRequestType.class,
    SISubmitMiscFeeRequestType.class,
    SISubmitMultiTranInquiryRequestType.class,
    SISubmitPurchaseInquiryRequestType.class,
    SISubmitQFDisputeQuestionnaireRequestType.class,
    SISubmitRFCFulfillmentRequestType.class,
    SISubmitRFCNonFulfillmentRequestType.class,
    SISubmitRFCRequestType.class,
    SISubmitStopPaymentInquiryRequestType.class,
    SISubmitStopPaymentOrderRequestType.class,
    SISubmitTranInquiryRequestType.class,
    SIUpdateCaseResolutionStatusRequestType.class,
    SIUploadImageRequestType.class,
    SIUploadMessageImageRequestType.class,
    SIViewPotentialQnMatchesRequestType.class,
    SIViewPotentialVDASMatchesRequestType.class,
    TransactionInquiryRequestBodyType.class,
    UnmatchedItemRequestBodyType.class,
    UpdateGMFPDetailsRequestType.class,
    VDASRequestBodyType.class
})
public abstract class RequestBodyType {


}
