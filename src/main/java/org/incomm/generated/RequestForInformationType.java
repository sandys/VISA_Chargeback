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
 * <p>Java class for RequestForInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RequestForInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}AccountNumber" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}TransactionID" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}TransactionDate" minOccurs="0"/&gt;
 *         &lt;element name="TranDateRange" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="+/-1"/&gt;
 *               &lt;enumeration value="+/-3"/&gt;
 *               &lt;enumeration value="+/-5"/&gt;
 *               &lt;enumeration value="+/-9"/&gt;
 *               &lt;enumeration value="+14"/&gt;
 *               &lt;enumeration value="-14"/&gt;
 *               &lt;enumeration value="+31"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SalesInd" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AuthorizationsInd" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}TranAmount" minOccurs="0"/&gt;
 *         &lt;element name="CreditsInd" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CreditSearchFromDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="CreditSearchToDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="IncludeDescriptionsInd" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="FieldsToInclude" type="{http://www.visa.com/ROLSI}FieldsToIncludeType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestForInformationType", propOrder = {
    "accountNumber",
    "transactionID",
    "transactionDate",
    "tranDateRange",
    "salesInd",
    "authorizationsInd",
    "tranAmount",
    "creditsInd",
    "creditSearchFromDate",
    "creditSearchToDate",
    "includeDescriptionsInd",
    "fieldsToInclude"
})
public class RequestForInformationType {

    @XmlElement(name = "AccountNumber")
    protected String accountNumber;
    @XmlElement(name = "TransactionID")
    protected String transactionID;
    @XmlElement(name = "TransactionDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar transactionDate;
    @XmlElement(name = "TranDateRange")
    protected String tranDateRange;
    @XmlElement(name = "SalesInd")
    protected Boolean salesInd;
    @XmlElement(name = "AuthorizationsInd")
    protected Boolean authorizationsInd;
    @XmlElement(name = "TranAmount")
    protected BigDecimal tranAmount;
    @XmlElement(name = "CreditsInd")
    protected Boolean creditsInd;
    @XmlElement(name = "CreditSearchFromDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar creditSearchFromDate;
    @XmlElement(name = "CreditSearchToDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar creditSearchToDate;
    @XmlElement(name = "IncludeDescriptionsInd")
    protected boolean includeDescriptionsInd;
    @XmlElement(name = "FieldsToInclude", required = true)
    @XmlSchemaType(name = "string")
    protected FieldsToIncludeType fieldsToInclude;

    /**
     * Gets the value of the accountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * Sets the value of the accountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountNumber(String value) {
        this.accountNumber = value;
    }

    /**
     * Transaction Id
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionID() {
        return transactionID;
    }

    /**
     * Sets the value of the transactionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionID(String value) {
        this.transactionID = value;
    }

    /**
     * Transaction Date
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTransactionDate() {
        return transactionDate;
    }

    /**
     * Sets the value of the transactionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTransactionDate(XMLGregorianCalendar value) {
        this.transactionDate = value;
    }

    /**
     * Gets the value of the tranDateRange property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTranDateRange() {
        return tranDateRange;
    }

    /**
     * Sets the value of the tranDateRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTranDateRange(String value) {
        this.tranDateRange = value;
    }

    /**
     * Gets the value of the salesInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSalesInd() {
        return salesInd;
    }

    /**
     * Sets the value of the salesInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSalesInd(Boolean value) {
        this.salesInd = value;
    }

    /**
     * Gets the value of the authorizationsInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAuthorizationsInd() {
        return authorizationsInd;
    }

    /**
     * Sets the value of the authorizationsInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAuthorizationsInd(Boolean value) {
        this.authorizationsInd = value;
    }

    /**
     * TransactionAmount
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTranAmount() {
        return tranAmount;
    }

    /**
     * Sets the value of the tranAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTranAmount(BigDecimal value) {
        this.tranAmount = value;
    }

    /**
     * Gets the value of the creditsInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCreditsInd() {
        return creditsInd;
    }

    /**
     * Sets the value of the creditsInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCreditsInd(Boolean value) {
        this.creditsInd = value;
    }

    /**
     * Gets the value of the creditSearchFromDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreditSearchFromDate() {
        return creditSearchFromDate;
    }

    /**
     * Sets the value of the creditSearchFromDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreditSearchFromDate(XMLGregorianCalendar value) {
        this.creditSearchFromDate = value;
    }

    /**
     * Gets the value of the creditSearchToDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreditSearchToDate() {
        return creditSearchToDate;
    }

    /**
     * Sets the value of the creditSearchToDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreditSearchToDate(XMLGregorianCalendar value) {
        this.creditSearchToDate = value;
    }

    /**
     * Gets the value of the includeDescriptionsInd property.
     * 
     */
    public boolean isIncludeDescriptionsInd() {
        return includeDescriptionsInd;
    }

    /**
     * Sets the value of the includeDescriptionsInd property.
     * 
     */
    public void setIncludeDescriptionsInd(boolean value) {
        this.includeDescriptionsInd = value;
    }

    /**
     * Gets the value of the fieldsToInclude property.
     * 
     * @return
     *     possible object is
     *     {@link FieldsToIncludeType }
     *     
     */
    public FieldsToIncludeType getFieldsToInclude() {
        return fieldsToInclude;
    }

    /**
     * Sets the value of the fieldsToInclude property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldsToIncludeType }
     *     
     */
    public void setFieldsToInclude(FieldsToIncludeType value) {
        this.fieldsToInclude = value;
    }

}
