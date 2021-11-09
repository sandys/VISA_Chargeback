//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.02.13 at 11:38:26 AM EST 
//


package org.incomm.generated;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for AdjustmentResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdjustmentResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.visa.com/ROLSI}AdjustmentType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}AdjustmentDate" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}AdjustmentReasonDesc" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}AdjustmentProcessingDesc" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}SettlementAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}MerchantLocation" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}IssuerName" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}AcquirerName" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}SettledOnDate" minOccurs="0"/&gt;
 *         &lt;element name="ReceivingInstCountryCode" type="{http://www.visa.com/ROLSI}CountryCodeType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}CatInd" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}TerminalEntryCapability" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdjustmentResponseType", propOrder = {
    "adjustmentDate",
    "adjustmentReasonDesc",
    "adjustmentProcessingDesc",
    "settlementAmount",
    "merchantLocation",
    "issuerName",
    "acquirerName",
    "settledOnDate",
    "receivingInstCountryCode",
    "catInd",
    "terminalEntryCapability"
})
public class AdjustmentResponseType
    extends AdjustmentType
{

    @XmlElement(name = "AdjustmentDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar adjustmentDate;
    @XmlElement(name = "AdjustmentReasonDesc")
    protected String adjustmentReasonDesc;
    @XmlElement(name = "AdjustmentProcessingDesc")
    protected String adjustmentProcessingDesc;
    @XmlElement(name = "SettlementAmount")
    protected BigDecimal settlementAmount;
    @XmlElement(name = "MerchantLocation")
    protected String merchantLocation;
    @XmlElement(name = "IssuerName")
    protected String issuerName;
    @XmlElement(name = "AcquirerName")
    protected String acquirerName;
    @XmlElement(name = "SettledOnDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar settledOnDate;
    @XmlElement(name = "ReceivingInstCountryCode")
    protected String receivingInstCountryCode;
    @XmlElement(name = "CatInd")
    protected String catInd;
    @XmlElement(name = "TerminalEntryCapability")
    protected String terminalEntryCapability;

    /**
     * Gets the value of the adjustmentDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAdjustmentDate() {
        return adjustmentDate;
    }

    /**
     * Sets the value of the adjustmentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAdjustmentDate(XMLGregorianCalendar value) {
        this.adjustmentDate = value;
    }

    /**
     * Gets the value of the adjustmentReasonDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdjustmentReasonDesc() {
        return adjustmentReasonDesc;
    }

    /**
     * Sets the value of the adjustmentReasonDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdjustmentReasonDesc(String value) {
        this.adjustmentReasonDesc = value;
    }

    /**
     * Gets the value of the adjustmentProcessingDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdjustmentProcessingDesc() {
        return adjustmentProcessingDesc;
    }

    /**
     * Sets the value of the adjustmentProcessingDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdjustmentProcessingDesc(String value) {
        this.adjustmentProcessingDesc = value;
    }

    /**
     * Gets the value of the settlementAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSettlementAmount() {
        return settlementAmount;
    }

    /**
     * Sets the value of the settlementAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSettlementAmount(BigDecimal value) {
        this.settlementAmount = value;
    }

    /**
     * Gets the value of the merchantLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantLocation() {
        return merchantLocation;
    }

    /**
     * Sets the value of the merchantLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantLocation(String value) {
        this.merchantLocation = value;
    }

    /**
     * Gets the value of the issuerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssuerName() {
        return issuerName;
    }

    /**
     * Sets the value of the issuerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssuerName(String value) {
        this.issuerName = value;
    }

    /**
     * Gets the value of the acquirerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcquirerName() {
        return acquirerName;
    }

    /**
     * Sets the value of the acquirerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcquirerName(String value) {
        this.acquirerName = value;
    }

    /**
     * Gets the value of the settledOnDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSettledOnDate() {
        return settledOnDate;
    }

    /**
     * Sets the value of the settledOnDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSettledOnDate(XMLGregorianCalendar value) {
        this.settledOnDate = value;
    }

    /**
     * Gets the value of the receivingInstCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceivingInstCountryCode() {
        return receivingInstCountryCode;
    }

    /**
     * Sets the value of the receivingInstCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceivingInstCountryCode(String value) {
        this.receivingInstCountryCode = value;
    }

    /**
     * Gets the value of the catInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCatInd() {
        return catInd;
    }

    /**
     * Sets the value of the catInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCatInd(String value) {
        this.catInd = value;
    }

    /**
     * Gets the value of the terminalEntryCapability property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerminalEntryCapability() {
        return terminalEntryCapability;
    }

    /**
     * Sets the value of the terminalEntryCapability property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerminalEntryCapability(String value) {
        this.terminalEntryCapability = value;
    }

}
