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
 * <p>Java class for MMIDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MMIDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MerchantAlternateName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MerchantStreetAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MerchantCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MerchantStateProvince" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MerchantZipPostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MerchantPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MMIDetailsType", propOrder = {
    "merchantAlternateName",
    "merchantStreetAddress",
    "merchantCity",
    "merchantStateProvince",
    "merchantZipPostalCode",
    "merchantPhone"
})
public class MMIDetailsType {

    @XmlElement(name = "MerchantAlternateName")
    protected String merchantAlternateName;
    @XmlElement(name = "MerchantStreetAddress")
    protected String merchantStreetAddress;
    @XmlElement(name = "MerchantCity")
    protected String merchantCity;
    @XmlElement(name = "MerchantStateProvince")
    protected String merchantStateProvince;
    @XmlElement(name = "MerchantZipPostalCode")
    protected String merchantZipPostalCode;
    @XmlElement(name = "MerchantPhone")
    protected String merchantPhone;

    /**
     * Gets the value of the merchantAlternateName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantAlternateName() {
        return merchantAlternateName;
    }

    /**
     * Sets the value of the merchantAlternateName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantAlternateName(String value) {
        this.merchantAlternateName = value;
    }

    /**
     * Gets the value of the merchantStreetAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantStreetAddress() {
        return merchantStreetAddress;
    }

    /**
     * Sets the value of the merchantStreetAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantStreetAddress(String value) {
        this.merchantStreetAddress = value;
    }

    /**
     * Gets the value of the merchantCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantCity() {
        return merchantCity;
    }

    /**
     * Sets the value of the merchantCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantCity(String value) {
        this.merchantCity = value;
    }

    /**
     * Gets the value of the merchantStateProvince property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantStateProvince() {
        return merchantStateProvince;
    }

    /**
     * Sets the value of the merchantStateProvince property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantStateProvince(String value) {
        this.merchantStateProvince = value;
    }

    /**
     * Gets the value of the merchantZipPostalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantZipPostalCode() {
        return merchantZipPostalCode;
    }

    /**
     * Sets the value of the merchantZipPostalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantZipPostalCode(String value) {
        this.merchantZipPostalCode = value;
    }

    /**
     * Gets the value of the merchantPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantPhone() {
        return merchantPhone;
    }

    /**
     * Sets the value of the merchantPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantPhone(String value) {
        this.merchantPhone = value;
    }

}
