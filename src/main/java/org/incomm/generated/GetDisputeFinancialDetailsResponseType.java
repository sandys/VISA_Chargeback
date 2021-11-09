//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.02.13 at 11:38:26 AM EST 
//


package org.incomm.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetDisputeFinancialDetailsResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetDisputeFinancialDetailsResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IssuerCaseNumber" type="{http://www.visa.com/ROLSI}MemberCaseNumberType" minOccurs="0"/&gt;
 *         &lt;element name="AcquirerCaseNumber" type="{http://www.visa.com/ROLSI}MemberCaseNumberType" minOccurs="0"/&gt;
 *         &lt;group ref="{http://www.visa.com/ROLSI}GetDisputeFinancialDetailsResponse" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetDisputeFinancialDetailsResponseType", propOrder = {
    "issuerCaseNumber",
    "acquirerCaseNumber",
    "transactionInfo",
    "visaCaseNumber",
    "disputeFinId",
    "vrolFinancialID",
    "disputeFinancialData",
    "disputeMerchantData",
    "disputePOSInfoData",
    "disputeAuthInfoData",
    "disputeProcessingSettingsData",
    "disputeTransactionDetailsData",
    "disputeNNSDetailsData"
})
public class GetDisputeFinancialDetailsResponseType {

    @XmlElement(name = "IssuerCaseNumber")
    protected String issuerCaseNumber;
    @XmlElement(name = "AcquirerCaseNumber")
    protected String acquirerCaseNumber;
    @XmlElement(name = "TransactionInfo")
    protected TranHeaderInfoType transactionInfo;
    @XmlElement(name = "VisaCaseNumber")
    protected Long visaCaseNumber;
    @XmlElement(name = "DisputeFinId")
    protected Long disputeFinId;
    @XmlElement(name = "VROLFinancialID")
    protected String vrolFinancialID;
    @XmlElement(name = "DisputeFinancialData")
    protected DisputeFinancialDataType disputeFinancialData;
    @XmlElement(name = "DisputeMerchantData")
    protected DisputeMerchantDataType disputeMerchantData;
    @XmlElement(name = "DisputePOSInfoData")
    protected DisputePOSInfoDataType disputePOSInfoData;
    @XmlElement(name = "DisputeAuthInfoData")
    protected DisputeAuthInfoDataType disputeAuthInfoData;
    @XmlElement(name = "DisputeProcessingSettingsData")
    protected DisputeProcessingSettingsDataType disputeProcessingSettingsData;
    @XmlElement(name = "DisputeTransactionDetailsData")
    protected DisputeTransactionDetailsDataType disputeTransactionDetailsData;
    @XmlElement(name = "DisputeNNSDetailsData")
    protected DisputeNNSDetailsDataType disputeNNSDetailsData;

    /**
     * Gets the value of the issuerCaseNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssuerCaseNumber() {
        return issuerCaseNumber;
    }

    /**
     * Sets the value of the issuerCaseNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssuerCaseNumber(String value) {
        this.issuerCaseNumber = value;
    }

    /**
     * Gets the value of the acquirerCaseNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcquirerCaseNumber() {
        return acquirerCaseNumber;
    }

    /**
     * Sets the value of the acquirerCaseNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcquirerCaseNumber(String value) {
        this.acquirerCaseNumber = value;
    }

    /**
     * Gets the value of the transactionInfo property.
     * 
     * @return
     *     possible object is
     *     {@link TranHeaderInfoType }
     *     
     */
    public TranHeaderInfoType getTransactionInfo() {
        return transactionInfo;
    }

    /**
     * Sets the value of the transactionInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TranHeaderInfoType }
     *     
     */
    public void setTransactionInfo(TranHeaderInfoType value) {
        this.transactionInfo = value;
    }

    /**
     * Gets the value of the visaCaseNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getVisaCaseNumber() {
        return visaCaseNumber;
    }

    /**
     * Sets the value of the visaCaseNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setVisaCaseNumber(Long value) {
        this.visaCaseNumber = value;
    }

    /**
     * Gets the value of the disputeFinId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDisputeFinId() {
        return disputeFinId;
    }

    /**
     * Sets the value of the disputeFinId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDisputeFinId(Long value) {
        this.disputeFinId = value;
    }

    /**
     * Gets the value of the vrolFinancialID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVROLFinancialID() {
        return vrolFinancialID;
    }

    /**
     * Sets the value of the vrolFinancialID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVROLFinancialID(String value) {
        this.vrolFinancialID = value;
    }

    /**
     * Gets the value of the disputeFinancialData property.
     * 
     * @return
     *     possible object is
     *     {@link DisputeFinancialDataType }
     *     
     */
    public DisputeFinancialDataType getDisputeFinancialData() {
        return disputeFinancialData;
    }

    /**
     * Sets the value of the disputeFinancialData property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisputeFinancialDataType }
     *     
     */
    public void setDisputeFinancialData(DisputeFinancialDataType value) {
        this.disputeFinancialData = value;
    }

    /**
     * Gets the value of the disputeMerchantData property.
     * 
     * @return
     *     possible object is
     *     {@link DisputeMerchantDataType }
     *     
     */
    public DisputeMerchantDataType getDisputeMerchantData() {
        return disputeMerchantData;
    }

    /**
     * Sets the value of the disputeMerchantData property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisputeMerchantDataType }
     *     
     */
    public void setDisputeMerchantData(DisputeMerchantDataType value) {
        this.disputeMerchantData = value;
    }

    /**
     * Gets the value of the disputePOSInfoData property.
     * 
     * @return
     *     possible object is
     *     {@link DisputePOSInfoDataType }
     *     
     */
    public DisputePOSInfoDataType getDisputePOSInfoData() {
        return disputePOSInfoData;
    }

    /**
     * Sets the value of the disputePOSInfoData property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisputePOSInfoDataType }
     *     
     */
    public void setDisputePOSInfoData(DisputePOSInfoDataType value) {
        this.disputePOSInfoData = value;
    }

    /**
     * Gets the value of the disputeAuthInfoData property.
     * 
     * @return
     *     possible object is
     *     {@link DisputeAuthInfoDataType }
     *     
     */
    public DisputeAuthInfoDataType getDisputeAuthInfoData() {
        return disputeAuthInfoData;
    }

    /**
     * Sets the value of the disputeAuthInfoData property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisputeAuthInfoDataType }
     *     
     */
    public void setDisputeAuthInfoData(DisputeAuthInfoDataType value) {
        this.disputeAuthInfoData = value;
    }

    /**
     * Gets the value of the disputeProcessingSettingsData property.
     * 
     * @return
     *     possible object is
     *     {@link DisputeProcessingSettingsDataType }
     *     
     */
    public DisputeProcessingSettingsDataType getDisputeProcessingSettingsData() {
        return disputeProcessingSettingsData;
    }

    /**
     * Sets the value of the disputeProcessingSettingsData property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisputeProcessingSettingsDataType }
     *     
     */
    public void setDisputeProcessingSettingsData(DisputeProcessingSettingsDataType value) {
        this.disputeProcessingSettingsData = value;
    }

    /**
     * Gets the value of the disputeTransactionDetailsData property.
     * 
     * @return
     *     possible object is
     *     {@link DisputeTransactionDetailsDataType }
     *     
     */
    public DisputeTransactionDetailsDataType getDisputeTransactionDetailsData() {
        return disputeTransactionDetailsData;
    }

    /**
     * Sets the value of the disputeTransactionDetailsData property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisputeTransactionDetailsDataType }
     *     
     */
    public void setDisputeTransactionDetailsData(DisputeTransactionDetailsDataType value) {
        this.disputeTransactionDetailsData = value;
    }

    /**
     * Gets the value of the disputeNNSDetailsData property.
     * 
     * @return
     *     possible object is
     *     {@link DisputeNNSDetailsDataType }
     *     
     */
    public DisputeNNSDetailsDataType getDisputeNNSDetailsData() {
        return disputeNNSDetailsData;
    }

    /**
     * Sets the value of the disputeNNSDetailsData property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisputeNNSDetailsDataType }
     *     
     */
    public void setDisputeNNSDetailsData(DisputeNNSDetailsDataType value) {
        this.disputeNNSDetailsData = value;
    }

}
