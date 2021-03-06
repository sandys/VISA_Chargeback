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
 * <p>Java class for RP_300_83 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RP_300_83"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.visa.com/ROLSI}RepreType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.visa.com/ROLSI}BaseDisputeGroup"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}AcqrCaseNum" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}AgentUniqueId" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}ChargebackConditionNotMetInd" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}ChargebackRemedyInd" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}CreditCode" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}CreditDate" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}CreditAmt" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}CreditRefNum" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}FileIndCode" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}ChargebackRefNum" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}MemberMsgEditText" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}RepresentmentMerchInfo" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}CardholderPhone" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}CardholderAddress" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}ScheduledCheckDate" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}ConfirmationCode" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}MoreInfoComment" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}TransactionReceiptInd" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}SignaturePINCVMEvidenceInd" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}EvidenceAccountNumberNotListedInd" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}ParticipationRequestAndConsentFormInd" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}ProofTranAuthEmergencyPaymentInd" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}NoShowOrAdvPaymentSvcTranCd" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}ProvidingEvidenceTranCardholderAVVAndAuthIdInd" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}AdditionalFnInfo" minOccurs="0"/&gt;
 *         &lt;element name="IssuerAuthorizedCVV2NoMatchInd" type="{http://www.visa.com/ROLSI}YNType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}IssuerAuthorizedCVV2CheckedNonMatchInd" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}VMeTransactionInd" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}ProvidingCompellingEvidenceInd" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}CompellingEvidenceCategory" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}IPAddressInd" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}GeographicalLocationInd" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}DeviceIDOrDeviceNameInd" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}PurchaserNameAndEmailInd" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}WebsiteAccessedAfterTransactionDateInd" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}DeviceAndCardInUndisputedTransactionInd" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}VisaCardVerifiedByMerchantInd" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}CardholderNameMatchFlightManifestToItineraryInd" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}DigitalGoodsQualifiesForRepresentmentInd" minOccurs="0"/&gt;
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
@XmlType(name = "RP_300_83")
public class RP30083
    extends RepreType
{


}
