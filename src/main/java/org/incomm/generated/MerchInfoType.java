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
 * <p>Java class for MerchInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MerchInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MerchContactAddress" type="{http://www.visa.com/ROLSI}AddressType" minOccurs="0"/&gt;
 *         &lt;element name="MerchContactCity" type="{http://www.visa.com/ROLSI}CityType" minOccurs="0"/&gt;
 *         &lt;element name="MerchContactCountrySubEntityCode" type="{http://www.visa.com/ROLSI}StateType" minOccurs="0"/&gt;
 *         &lt;element name="MerchContactPostalCode" type="{http://www.visa.com/ROLSI}PostalCodeType" minOccurs="0"/&gt;
 *         &lt;element name="MerchContactCountryCode" type="{http://www.visa.com/ROLSI}LongCountryCodeType" minOccurs="0"/&gt;
 *         &lt;element name="MerchContactName" type="{http://www.visa.com/ROLSI}NameType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}MerchContactPhone" minOccurs="0"/&gt;
 *         &lt;element name="MerchContactFaxNum" type="{http://www.visa.com/ROLSI}ShortPhoneNumType" minOccurs="0"/&gt;
 *         &lt;element name="MerchContactEmail" type="{http://www.visa.com/ROLSI}EmailType" minOccurs="0"/&gt;
 *         &lt;element name="MerchURL" type="{http://www.visa.com/ROLSI}URLType" minOccurs="0"/&gt;
 *         &lt;element name="MerchBestTimeCall" type="{http://www.visa.com/ROLSI}BestTimeCallType" minOccurs="0"/&gt;
 *         &lt;element name="MerchOptInInd" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MerchInfoType", propOrder = {
    "merchContactAddress",
    "merchContactCity",
    "merchContactCountrySubEntityCode",
    "merchContactPostalCode",
    "merchContactCountryCode",
    "merchContactName",
    "merchContactPhone",
    "merchContactFaxNum",
    "merchContactEmail",
    "merchURL",
    "merchBestTimeCall",
    "merchOptInInd"
})
public class MerchInfoType {

    @XmlElement(name = "MerchContactAddress")
    protected String merchContactAddress;
    @XmlElement(name = "MerchContactCity")
    protected String merchContactCity;
    @XmlElement(name = "MerchContactCountrySubEntityCode")
    protected String merchContactCountrySubEntityCode;
    @XmlElement(name = "MerchContactPostalCode")
    protected String merchContactPostalCode;
    @XmlElement(name = "MerchContactCountryCode")
    protected String merchContactCountryCode;
    @XmlElement(name = "MerchContactName")
    protected String merchContactName;
    @XmlElement(name = "MerchContactPhone")
    protected String merchContactPhone;
    @XmlElement(name = "MerchContactFaxNum")
    protected String merchContactFaxNum;
    @XmlElement(name = "MerchContactEmail")
    protected String merchContactEmail;
    @XmlElement(name = "MerchURL")
    protected String merchURL;
    @XmlElement(name = "MerchBestTimeCall")
    protected String merchBestTimeCall;
    @XmlElement(name = "MerchOptInInd")
    protected Boolean merchOptInInd;

    /**
     * Gets the value of the merchContactAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchContactAddress() {
        return merchContactAddress;
    }

    /**
     * Sets the value of the merchContactAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchContactAddress(String value) {
        this.merchContactAddress = value;
    }

    /**
     * Gets the value of the merchContactCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchContactCity() {
        return merchContactCity;
    }

    /**
     * Sets the value of the merchContactCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchContactCity(String value) {
        this.merchContactCity = value;
    }

    /**
     * Gets the value of the merchContactCountrySubEntityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchContactCountrySubEntityCode() {
        return merchContactCountrySubEntityCode;
    }

    /**
     * Sets the value of the merchContactCountrySubEntityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchContactCountrySubEntityCode(String value) {
        this.merchContactCountrySubEntityCode = value;
    }

    /**
     * Gets the value of the merchContactPostalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchContactPostalCode() {
        return merchContactPostalCode;
    }

    /**
     * Sets the value of the merchContactPostalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchContactPostalCode(String value) {
        this.merchContactPostalCode = value;
    }

    /**
     * Gets the value of the merchContactCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchContactCountryCode() {
        return merchContactCountryCode;
    }

    /**
     * Sets the value of the merchContactCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchContactCountryCode(String value) {
        this.merchContactCountryCode = value;
    }

    /**
     * Gets the value of the merchContactName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchContactName() {
        return merchContactName;
    }

    /**
     * Sets the value of the merchContactName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchContactName(String value) {
        this.merchContactName = value;
    }

    /**
     * Gets the value of the merchContactPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchContactPhone() {
        return merchContactPhone;
    }

    /**
     * Sets the value of the merchContactPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchContactPhone(String value) {
        this.merchContactPhone = value;
    }

    /**
     * Gets the value of the merchContactFaxNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchContactFaxNum() {
        return merchContactFaxNum;
    }

    /**
     * Sets the value of the merchContactFaxNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchContactFaxNum(String value) {
        this.merchContactFaxNum = value;
    }

    /**
     * Gets the value of the merchContactEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchContactEmail() {
        return merchContactEmail;
    }

    /**
     * Sets the value of the merchContactEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchContactEmail(String value) {
        this.merchContactEmail = value;
    }

    /**
     * Gets the value of the merchURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchURL() {
        return merchURL;
    }

    /**
     * Sets the value of the merchURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchURL(String value) {
        this.merchURL = value;
    }

    /**
     * Gets the value of the merchBestTimeCall property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchBestTimeCall() {
        return merchBestTimeCall;
    }

    /**
     * Sets the value of the merchBestTimeCall property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchBestTimeCall(String value) {
        this.merchBestTimeCall = value;
    }

    /**
     * Gets the value of the merchOptInInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMerchOptInInd() {
        return merchOptInInd;
    }

    /**
     * Sets the value of the merchOptInInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMerchOptInInd(Boolean value) {
        this.merchOptInInd = value;
    }

}
