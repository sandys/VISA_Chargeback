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
 * <p>Java class for CB_500_76 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CB_500_76"&gt;
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
 *         &lt;element ref="{http://www.visa.com/ROLSI}IncorrectTranPostCode" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}SaleAmt" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}CreditAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}MoreInfoComment" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}TranReceiptCurrency" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}CardStatementCurrency" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}TranOccurredCountryName" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}TranDepositedCountryName" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}ReturnToQueue" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}TransCurrencyDiffersFromVisaNetInd" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}TransProcIncorrectCountryCodeInd" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}AdditionalFnInfo" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}DCCOccurredWithNoCHAgreementInd" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}CHNotAdvisedOfDCCOrMerchantCurrencyChoiceInd" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}ExplanationCreditProcessedInError" minOccurs="0"/&gt;
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
@XmlType(name = "CB_500_76")
public class CB50076
    extends CBType
{


}
