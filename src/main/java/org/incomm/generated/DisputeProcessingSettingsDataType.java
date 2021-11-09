//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.02.13 at 11:38:26 AM EST 
//


package org.incomm.generated;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DisputeProcessingSettingsDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DisputeProcessingSettingsDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}ReimbursementAttribute" minOccurs="0"/&gt;
 *         &lt;element name="NetworkIdentificationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ContactInfo" type="{http://www.visa.com/ROLSI}ContactInfoDisputeType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}AdjustmentProcessingInd" minOccurs="0"/&gt;
 *         &lt;element name="NationalReimbursementFee" type="{http://www.visa.com/ROLSI}AmountTypeWithCurrencyDefault" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}NationalTax" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}InterchangeReimbursementFeeMultiplier" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}SettlementType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}AuthCharCd" minOccurs="0"/&gt;
 *         &lt;element name="MerchantVolumeInd" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}FeeProgramInd" minOccurs="0"/&gt;
 *         &lt;element name="ChargebackRightsInd" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}SettlementFlag" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}InternationalFeeInd" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}IssuerInterchangeReimbursementFee" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}IssuerCashbackInterchangeReimbursementFee" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}IssuerInterchangeReimbursementFeeSSBC" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}IssuerInterchangeReimbursementFeeSSBCDebitCreditInd" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}IssuerCashbackInterchangeReimbursementFeeSSBC" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}IssuerCashbackInterchangeReimbursementFeeSSBCDebitCreditInd" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}AcquirerInterchangeReimbursementFee" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}AcquirerCashbackInterchangeReimbursementFee" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}AcquirerInterchangeReimbursementFeeSSBC" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}AcquirerInterchangeReimbursementFeeSSBCDebitCreditInd" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}AcquirerCashbackInterchangeReimbursementFeeSSBC" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}AcquirerCashbackInterchangeReimbursementFeeSSBCDebitCreditInd" minOccurs="0"/&gt;
 *         &lt;element name="InterchangeFeeAmount" type="{http://www.visa.com/ROLSI}MonetaryAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}AgentUniqueId" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DisputeProcessingSettingsDataType", propOrder = {
    "reimbursementAttribute",
    "networkIdentificationCode",
    "contactInfo",
    "adjustmentProcessingInd",
    "nationalReimbursementFee",
    "nationalTax",
    "interchangeReimbursementFeeMultiplier",
    "settlementType",
    "authCharCd",
    "merchantVolumeInd",
    "feeProgramInd",
    "chargebackRightsInd",
    "settlementFlag",
    "internationalFeeInd",
    "issuerInterchangeReimbursementFee",
    "issuerCashbackInterchangeReimbursementFee",
    "issuerInterchangeReimbursementFeeSSBC",
    "issuerInterchangeReimbursementFeeSSBCDebitCreditInd",
    "issuerCashbackInterchangeReimbursementFeeSSBC",
    "issuerCashbackInterchangeReimbursementFeeSSBCDebitCreditInd",
    "acquirerInterchangeReimbursementFee",
    "acquirerCashbackInterchangeReimbursementFee",
    "acquirerInterchangeReimbursementFeeSSBC",
    "acquirerInterchangeReimbursementFeeSSBCDebitCreditInd",
    "acquirerCashbackInterchangeReimbursementFeeSSBC",
    "acquirerCashbackInterchangeReimbursementFeeSSBCDebitCreditInd",
    "interchangeFeeAmount",
    "agentUniqueId"
})
public class DisputeProcessingSettingsDataType {

    @XmlElement(name = "ReimbursementAttribute")
    protected String reimbursementAttribute;
    @XmlElement(name = "NetworkIdentificationCode")
    protected String networkIdentificationCode;
    @XmlElement(name = "ContactInfo")
    protected String contactInfo;
    @XmlElement(name = "AdjustmentProcessingInd")
    protected String adjustmentProcessingInd;
    @XmlElement(name = "NationalReimbursementFee")
    protected AmountTypeWithCurrencyDefault nationalReimbursementFee;
    @XmlElement(name = "NationalTax")
    protected BigDecimal nationalTax;
    @XmlElement(name = "InterchangeReimbursementFeeMultiplier")
    protected String interchangeReimbursementFeeMultiplier;
    @XmlElement(name = "SettlementType")
    protected BigInteger settlementType;
    @XmlElement(name = "AuthCharCd")
    protected String authCharCd;
    @XmlElement(name = "MerchantVolumeInd")
    protected String merchantVolumeInd;
    @XmlElement(name = "FeeProgramInd")
    protected String feeProgramInd;
    @XmlElement(name = "ChargebackRightsInd")
    protected String chargebackRightsInd;
    @XmlElement(name = "SettlementFlag")
    protected String settlementFlag;
    @XmlElement(name = "InternationalFeeInd")
    protected String internationalFeeInd;
    @XmlElement(name = "IssuerInterchangeReimbursementFee")
    protected IssuerInterchangeReimbursementFee issuerInterchangeReimbursementFee;
    @XmlElement(name = "IssuerCashbackInterchangeReimbursementFee")
    protected IssuerCashbackInterchangeReimbursementFee issuerCashbackInterchangeReimbursementFee;
    @XmlElement(name = "IssuerInterchangeReimbursementFeeSSBC")
    protected AmountType issuerInterchangeReimbursementFeeSSBC;
    @XmlElement(name = "IssuerInterchangeReimbursementFeeSSBCDebitCreditInd")
    @XmlSchemaType(name = "string")
    protected DebitCreditType issuerInterchangeReimbursementFeeSSBCDebitCreditInd;
    @XmlElement(name = "IssuerCashbackInterchangeReimbursementFeeSSBC")
    protected AmountType issuerCashbackInterchangeReimbursementFeeSSBC;
    @XmlElement(name = "IssuerCashbackInterchangeReimbursementFeeSSBCDebitCreditInd")
    @XmlSchemaType(name = "string")
    protected DebitCreditType issuerCashbackInterchangeReimbursementFeeSSBCDebitCreditInd;
    @XmlElement(name = "AcquirerInterchangeReimbursementFee")
    protected AcquirerInterchangeReimbursementFee acquirerInterchangeReimbursementFee;
    @XmlElement(name = "AcquirerCashbackInterchangeReimbursementFee")
    protected AcquirerCashbackInterchangeReimbursementFee acquirerCashbackInterchangeReimbursementFee;
    @XmlElement(name = "AcquirerInterchangeReimbursementFeeSSBC")
    protected AmountType acquirerInterchangeReimbursementFeeSSBC;
    @XmlElement(name = "AcquirerInterchangeReimbursementFeeSSBCDebitCreditInd")
    @XmlSchemaType(name = "string")
    protected DebitCreditType acquirerInterchangeReimbursementFeeSSBCDebitCreditInd;
    @XmlElement(name = "AcquirerCashbackInterchangeReimbursementFeeSSBC")
    protected AmountType acquirerCashbackInterchangeReimbursementFeeSSBC;
    @XmlElement(name = "AcquirerCashbackInterchangeReimbursementFeeSSBCDebitCreditInd")
    @XmlSchemaType(name = "string")
    protected DebitCreditType acquirerCashbackInterchangeReimbursementFeeSSBCDebitCreditInd;
    @XmlElement(name = "InterchangeFeeAmount")
    protected BigDecimal interchangeFeeAmount;
    @XmlElement(name = "AgentUniqueId")
    protected String agentUniqueId;

    /**
     * Gets the value of the reimbursementAttribute property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReimbursementAttribute() {
        return reimbursementAttribute;
    }

    /**
     * Sets the value of the reimbursementAttribute property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReimbursementAttribute(String value) {
        this.reimbursementAttribute = value;
    }

    /**
     * Gets the value of the networkIdentificationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetworkIdentificationCode() {
        return networkIdentificationCode;
    }

    /**
     * Sets the value of the networkIdentificationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetworkIdentificationCode(String value) {
        this.networkIdentificationCode = value;
    }

    /**
     * Gets the value of the contactInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactInfo() {
        return contactInfo;
    }

    /**
     * Sets the value of the contactInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactInfo(String value) {
        this.contactInfo = value;
    }

    /**
     * Gets the value of the adjustmentProcessingInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdjustmentProcessingInd() {
        return adjustmentProcessingInd;
    }

    /**
     * Sets the value of the adjustmentProcessingInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdjustmentProcessingInd(String value) {
        this.adjustmentProcessingInd = value;
    }

    /**
     * Gets the value of the nationalReimbursementFee property.
     * 
     * @return
     *     possible object is
     *     {@link AmountTypeWithCurrencyDefault }
     *     
     */
    public AmountTypeWithCurrencyDefault getNationalReimbursementFee() {
        return nationalReimbursementFee;
    }

    /**
     * Sets the value of the nationalReimbursementFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountTypeWithCurrencyDefault }
     *     
     */
    public void setNationalReimbursementFee(AmountTypeWithCurrencyDefault value) {
        this.nationalReimbursementFee = value;
    }

    /**
     * For Swedish Domestic transactions only
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNationalTax() {
        return nationalTax;
    }

    /**
     * Sets the value of the nationalTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNationalTax(BigDecimal value) {
        this.nationalTax = value;
    }

    /**
     * For South Korean Domestic transactions only
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterchangeReimbursementFeeMultiplier() {
        return interchangeReimbursementFeeMultiplier;
    }

    /**
     * Sets the value of the interchangeReimbursementFeeMultiplier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterchangeReimbursementFeeMultiplier(String value) {
        this.interchangeReimbursementFeeMultiplier = value;
    }

    /**
     * For Brazil Domestic transactions only
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSettlementType() {
        return settlementType;
    }

    /**
     * Sets the value of the settlementType property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSettlementType(BigInteger value) {
        this.settlementType = value;
    }

    /**
     * Gets the value of the authCharCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthCharCd() {
        return authCharCd;
    }

    /**
     * Sets the value of the authCharCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthCharCd(String value) {
        this.authCharCd = value;
    }

    /**
     * Gets the value of the merchantVolumeInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantVolumeInd() {
        return merchantVolumeInd;
    }

    /**
     * Sets the value of the merchantVolumeInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantVolumeInd(String value) {
        this.merchantVolumeInd = value;
    }

    /**
     * Gets the value of the feeProgramInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeeProgramInd() {
        return feeProgramInd;
    }

    /**
     * Sets the value of the feeProgramInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeeProgramInd(String value) {
        this.feeProgramInd = value;
    }

    /**
     * Gets the value of the chargebackRightsInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChargebackRightsInd() {
        return chargebackRightsInd;
    }

    /**
     * Sets the value of the chargebackRightsInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChargebackRightsInd(String value) {
        this.chargebackRightsInd = value;
    }

    /**
     * Gets the value of the settlementFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSettlementFlag() {
        return settlementFlag;
    }

    /**
     * Sets the value of the settlementFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSettlementFlag(String value) {
        this.settlementFlag = value;
    }

    /**
     * Gets the value of the internationalFeeInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternationalFeeInd() {
        return internationalFeeInd;
    }

    /**
     * Sets the value of the internationalFeeInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternationalFeeInd(String value) {
        this.internationalFeeInd = value;
    }

    /**
     * Gets the value of the issuerInterchangeReimbursementFee property.
     * 
     * @return
     *     possible object is
     *     {@link IssuerInterchangeReimbursementFee }
     *     
     */
    public IssuerInterchangeReimbursementFee getIssuerInterchangeReimbursementFee() {
        return issuerInterchangeReimbursementFee;
    }

    /**
     * Sets the value of the issuerInterchangeReimbursementFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link IssuerInterchangeReimbursementFee }
     *     
     */
    public void setIssuerInterchangeReimbursementFee(IssuerInterchangeReimbursementFee value) {
        this.issuerInterchangeReimbursementFee = value;
    }

    /**
     * Gets the value of the issuerCashbackInterchangeReimbursementFee property.
     * 
     * @return
     *     possible object is
     *     {@link IssuerCashbackInterchangeReimbursementFee }
     *     
     */
    public IssuerCashbackInterchangeReimbursementFee getIssuerCashbackInterchangeReimbursementFee() {
        return issuerCashbackInterchangeReimbursementFee;
    }

    /**
     * Sets the value of the issuerCashbackInterchangeReimbursementFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link IssuerCashbackInterchangeReimbursementFee }
     *     
     */
    public void setIssuerCashbackInterchangeReimbursementFee(IssuerCashbackInterchangeReimbursementFee value) {
        this.issuerCashbackInterchangeReimbursementFee = value;
    }

    /**
     * Gets the value of the issuerInterchangeReimbursementFeeSSBC property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getIssuerInterchangeReimbursementFeeSSBC() {
        return issuerInterchangeReimbursementFeeSSBC;
    }

    /**
     * Sets the value of the issuerInterchangeReimbursementFeeSSBC property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setIssuerInterchangeReimbursementFeeSSBC(AmountType value) {
        this.issuerInterchangeReimbursementFeeSSBC = value;
    }

    /**
     * Gets the value of the issuerInterchangeReimbursementFeeSSBCDebitCreditInd property.
     * 
     * @return
     *     possible object is
     *     {@link DebitCreditType }
     *     
     */
    public DebitCreditType getIssuerInterchangeReimbursementFeeSSBCDebitCreditInd() {
        return issuerInterchangeReimbursementFeeSSBCDebitCreditInd;
    }

    /**
     * Sets the value of the issuerInterchangeReimbursementFeeSSBCDebitCreditInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link DebitCreditType }
     *     
     */
    public void setIssuerInterchangeReimbursementFeeSSBCDebitCreditInd(DebitCreditType value) {
        this.issuerInterchangeReimbursementFeeSSBCDebitCreditInd = value;
    }

    /**
     * Gets the value of the issuerCashbackInterchangeReimbursementFeeSSBC property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getIssuerCashbackInterchangeReimbursementFeeSSBC() {
        return issuerCashbackInterchangeReimbursementFeeSSBC;
    }

    /**
     * Sets the value of the issuerCashbackInterchangeReimbursementFeeSSBC property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setIssuerCashbackInterchangeReimbursementFeeSSBC(AmountType value) {
        this.issuerCashbackInterchangeReimbursementFeeSSBC = value;
    }

    /**
     * Gets the value of the issuerCashbackInterchangeReimbursementFeeSSBCDebitCreditInd property.
     * 
     * @return
     *     possible object is
     *     {@link DebitCreditType }
     *     
     */
    public DebitCreditType getIssuerCashbackInterchangeReimbursementFeeSSBCDebitCreditInd() {
        return issuerCashbackInterchangeReimbursementFeeSSBCDebitCreditInd;
    }

    /**
     * Sets the value of the issuerCashbackInterchangeReimbursementFeeSSBCDebitCreditInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link DebitCreditType }
     *     
     */
    public void setIssuerCashbackInterchangeReimbursementFeeSSBCDebitCreditInd(DebitCreditType value) {
        this.issuerCashbackInterchangeReimbursementFeeSSBCDebitCreditInd = value;
    }

    /**
     * Gets the value of the acquirerInterchangeReimbursementFee property.
     * 
     * @return
     *     possible object is
     *     {@link AcquirerInterchangeReimbursementFee }
     *     
     */
    public AcquirerInterchangeReimbursementFee getAcquirerInterchangeReimbursementFee() {
        return acquirerInterchangeReimbursementFee;
    }

    /**
     * Sets the value of the acquirerInterchangeReimbursementFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcquirerInterchangeReimbursementFee }
     *     
     */
    public void setAcquirerInterchangeReimbursementFee(AcquirerInterchangeReimbursementFee value) {
        this.acquirerInterchangeReimbursementFee = value;
    }

    /**
     * Gets the value of the acquirerCashbackInterchangeReimbursementFee property.
     * 
     * @return
     *     possible object is
     *     {@link AcquirerCashbackInterchangeReimbursementFee }
     *     
     */
    public AcquirerCashbackInterchangeReimbursementFee getAcquirerCashbackInterchangeReimbursementFee() {
        return acquirerCashbackInterchangeReimbursementFee;
    }

    /**
     * Sets the value of the acquirerCashbackInterchangeReimbursementFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcquirerCashbackInterchangeReimbursementFee }
     *     
     */
    public void setAcquirerCashbackInterchangeReimbursementFee(AcquirerCashbackInterchangeReimbursementFee value) {
        this.acquirerCashbackInterchangeReimbursementFee = value;
    }

    /**
     * Gets the value of the acquirerInterchangeReimbursementFeeSSBC property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getAcquirerInterchangeReimbursementFeeSSBC() {
        return acquirerInterchangeReimbursementFeeSSBC;
    }

    /**
     * Sets the value of the acquirerInterchangeReimbursementFeeSSBC property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setAcquirerInterchangeReimbursementFeeSSBC(AmountType value) {
        this.acquirerInterchangeReimbursementFeeSSBC = value;
    }

    /**
     * Gets the value of the acquirerInterchangeReimbursementFeeSSBCDebitCreditInd property.
     * 
     * @return
     *     possible object is
     *     {@link DebitCreditType }
     *     
     */
    public DebitCreditType getAcquirerInterchangeReimbursementFeeSSBCDebitCreditInd() {
        return acquirerInterchangeReimbursementFeeSSBCDebitCreditInd;
    }

    /**
     * Sets the value of the acquirerInterchangeReimbursementFeeSSBCDebitCreditInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link DebitCreditType }
     *     
     */
    public void setAcquirerInterchangeReimbursementFeeSSBCDebitCreditInd(DebitCreditType value) {
        this.acquirerInterchangeReimbursementFeeSSBCDebitCreditInd = value;
    }

    /**
     * Gets the value of the acquirerCashbackInterchangeReimbursementFeeSSBC property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getAcquirerCashbackInterchangeReimbursementFeeSSBC() {
        return acquirerCashbackInterchangeReimbursementFeeSSBC;
    }

    /**
     * Sets the value of the acquirerCashbackInterchangeReimbursementFeeSSBC property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setAcquirerCashbackInterchangeReimbursementFeeSSBC(AmountType value) {
        this.acquirerCashbackInterchangeReimbursementFeeSSBC = value;
    }

    /**
     * Gets the value of the acquirerCashbackInterchangeReimbursementFeeSSBCDebitCreditInd property.
     * 
     * @return
     *     possible object is
     *     {@link DebitCreditType }
     *     
     */
    public DebitCreditType getAcquirerCashbackInterchangeReimbursementFeeSSBCDebitCreditInd() {
        return acquirerCashbackInterchangeReimbursementFeeSSBCDebitCreditInd;
    }

    /**
     * Sets the value of the acquirerCashbackInterchangeReimbursementFeeSSBCDebitCreditInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link DebitCreditType }
     *     
     */
    public void setAcquirerCashbackInterchangeReimbursementFeeSSBCDebitCreditInd(DebitCreditType value) {
        this.acquirerCashbackInterchangeReimbursementFeeSSBCDebitCreditInd = value;
    }

    /**
     * Gets the value of the interchangeFeeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInterchangeFeeAmount() {
        return interchangeFeeAmount;
    }

    /**
     * Sets the value of the interchangeFeeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInterchangeFeeAmount(BigDecimal value) {
        this.interchangeFeeAmount = value;
    }

    /**
     * Gets the value of the agentUniqueId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgentUniqueId() {
        return agentUniqueId;
    }

    /**
     * Sets the value of the agentUniqueId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgentUniqueId(String value) {
        this.agentUniqueId = value;
    }

}