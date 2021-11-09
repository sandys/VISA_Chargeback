//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.20 at 10:32:05 AM EST 
//


package org.incomm.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CB_500_80 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CB_500_80"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.visa.com/ROLSI}CBType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.visa.com/ROLSI}BaseDisputeGroup"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}IssrCaseNum" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}AgentUniqueId" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}ChargebackRefNum" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}FileIndCode" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}MemberMsgEditText" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}FraudClassification" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}ChargeBackCardholderInfo" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}StatementAmt" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}ReceiptAmt" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}SalesDraftAccountNum" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}SalesDraftName" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}MoreInfoComment" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}HowInfoIncorrectCd" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}HowAmountIncorrectCd" minOccurs="0"/&gt;
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
@XmlType(name = "CB_500_80")
public class CB_500_80
    extends CBType
{


}
