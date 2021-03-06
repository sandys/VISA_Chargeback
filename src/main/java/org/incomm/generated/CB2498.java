//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.02.13 at 11:38:26 AM EST 
//


package org.incomm.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CB_2498 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CB_2498"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.visa.com/ROLSI}CBType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.visa.com/ROLSI}BaseDisputeGroup"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}IssrCaseNum" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}AgentUniqueId" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}ATRInd" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}ATRContactDate" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}ATRContactName" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}ATRContactMethod" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}ATRMerchantResponse" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}NotApplicableDueToLocalLawInd" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}NoATRDesc" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}ChargebackRefNum" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}FileIndCode" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}MemberMsgEditText" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}FraudClassification" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}ChargeBackCardholderInfo" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}PaymentMethodDesc" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}OtherPaymentDesc" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}IncorrectTranPostCodeInd" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}IncorrectTranPostCode" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}MoreInfoComment" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}PaidByOtherMeansInd" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}ReturnToQueue" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}AdditionalFnInfo" minOccurs="0"/&gt;
 *         &lt;element name="PostedAdjustmentInvalidInd" type="{http://www.visa.com/ROLSI}YNType" minOccurs="0"/&gt;
 *         &lt;element name="AdjPostedToClosedOrNonSufficientFundsInd" type="{http://www.visa.com/ROLSI}YNType" minOccurs="0"/&gt;
 *         &lt;element name="AdjProcessedMoreThan45DaysInd" type="{http://www.visa.com/ROLSI}YNType" minOccurs="0"/&gt;
 *         &lt;element name="AdjProcessedMoreThanOnceInd" type="{http://www.visa.com/ROLSI}YNType" minOccurs="0"/&gt;
 *         &lt;element name="CardholderDisputeValidityOfAdjustmentInd" type="{http://www.visa.com/ROLSI}YNType" minOccurs="0"/&gt;
 *         &lt;element name="PostedAdjustmentInvalidDataCode" type="{http://www.visa.com/ROLSI}YNType" minOccurs="0"/&gt;
 *         &lt;element name="PostedAdjustmentNonMatchingANInd" type="{http://www.visa.com/ROLSI}YNType" minOccurs="0"/&gt;
 *         &lt;element name="PostedAdjustmentOtherInvalidDataInd" type="{http://www.visa.com/ROLSI}YNType" minOccurs="0"/&gt;
 *         &lt;element name="PostedAdjustmentInvalidReasonDescription" type="{http://www.visa.com/ROLSI}PostedAdjustmentInvalidReasonDescriptionType" minOccurs="0"/&gt;
 *         &lt;element name="AdjustmentPostedAccountClosedInd" type="{http://www.visa.com/ROLSI}YNType" minOccurs="0"/&gt;
 *         &lt;element name="AdjustmentPostedNSFInd" type="{http://www.visa.com/ROLSI}YNType" minOccurs="0"/&gt;
 *         &lt;element name="FirstAdjustmentDated" type="{http://www.visa.com/ROLSI}FirstAdjustmentDatedType" minOccurs="0"/&gt;
 *         &lt;element name="CardHolderDisputeValidityOfAdjustmentDueToErroredAmountInd" type="{http://www.visa.com/ROLSI}YNType" minOccurs="0"/&gt;
 *         &lt;element name="CHDisputeValidityOfAdjustmentDueToCanceledTransactionInd" type="{http://www.visa.com/ROLSI}YNType" minOccurs="0"/&gt;
 *         &lt;element name="CHDisputeValidityOfAdjustmentDueToReversedTransactionInd" type="{http://www.visa.com/ROLSI}YNType" minOccurs="0"/&gt;
 *         &lt;element name="CHDisputeValidityOfAdjustmentDueToOtherReasonInd" type="{http://www.visa.com/ROLSI}YNType" minOccurs="0"/&gt;
 *         &lt;element name="DisputeValidityOfAdjustmentDescription" type="{http://www.visa.com/ROLSI}DisputeValidityOfAdjustmentDescriptionType" minOccurs="0"/&gt;
 *         &lt;element name="AmountPosted" type="{http://www.visa.com/ROLSI}AmountType" minOccurs="0"/&gt;
 *         &lt;element name="CardholderSalesDraft" type="{http://www.visa.com/ROLSI}AmountType" minOccurs="0"/&gt;
 *         &lt;element name="AcquirerProcessedIncorrectTransactionInd" type="{http://www.visa.com/ROLSI}YNType" minOccurs="0"/&gt;
 *         &lt;element name="CHTransactionReceiptContainsErrorInd" type="{http://www.visa.com/ROLSI}YNType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}DCCOccurredWithNoCHAgreementInd" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}CHNotAdvisedOfDCCOrMerchantCurrencyChoiceInd" minOccurs="0"/&gt;
 *         &lt;element name="CHPaidForTransactionByAlternateInd" type="{http://www.visa.com/ROLSI}YNType" minOccurs="0"/&gt;
 *         &lt;element name="DCCConditionInd" type="{http://www.visa.com/ROLSI}YNType" minOccurs="0"/&gt;
 *         &lt;element name="TransactionProcessedMoreThan10DaysFromTranDateInd" type="{http://www.visa.com/ROLSI}YNType" minOccurs="0"/&gt;
 *         &lt;element name="TransactionProcessedWithAuthorizationFromInvalidDataInd" type="{http://www.visa.com/ROLSI}YNType" minOccurs="0"/&gt;
 *         &lt;element name="ExplainWhatWasIncorrect" type="{http://www.visa.com/ROLSI}ExplainWhatWasIncorrectType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="createFinancial" type="{http://www.visa.com/ROLSI}YNType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CB_2498")
public class CB2498
    extends CBType
{


}
