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
 * <p>Java class for RP_2498 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RP_2498"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.visa.com/ROLSI}RepreType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.visa.com/ROLSI}BaseDisputeGroup"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}AcqrCaseNum" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}AgentUniqueId" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}ChargebackConditionNotMetInd" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}ChargebackRemedyInd" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}CreditNotProcessedAsDebitInd" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}CreditCode" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}CreditDate" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}CreditAmt" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}CreditRefNum" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}ATRInd" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}FileIndCode" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}ChargebackRefNum" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}MemberMsgEditText" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}RepresentmentMerchInfo" minOccurs="0"/&gt;
 *         &lt;element name="TransactionProcessingErrorExpl" type="{http://www.visa.com/ROLSI}TransactionProcessingErrorExplType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}AuthReceivedCode" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}AuthDate" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}AuthCode" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}AuthAmt" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}MoreInfoComment" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}CorrectTranAmountInd" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}RepresentmentProcessedInd" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}ProofMerchantNoPaymentInd" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}ProvidingEvidenceMCCinVIPMatchesClearingRecord" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}AdditionalFnInfo" minOccurs="0"/&gt;
 *         &lt;element name="ProcessedAdjustmentInd" type="{http://www.visa.com/ROLSI}YNType" minOccurs="0"/&gt;
 *         &lt;element name="Explanation" type="{http://www.visa.com/ROLSI}ExplanationType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}ProvidingCompellingEvidenceInd" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}CompellingEvidenceCategory" minOccurs="0"/&gt;
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
@XmlType(name = "RP_2498")
public class RP2498
    extends RepreType
{


}
