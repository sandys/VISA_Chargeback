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
 * <p>Java class for IssuerAcquirerContactInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IssuerAcquirerContactInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}ContactName" minOccurs="0"/&gt;
 *         &lt;element name="ContactPhone" type="{http://www.visa.com/ROLSI}PhoneNumType" minOccurs="0"/&gt;
 *         &lt;element name="ContactFax" type="{http://www.visa.com/ROLSI}DisputePhoneNumType" minOccurs="0"/&gt;
 *         &lt;element name="ContactOther" type="{http://www.visa.com/ROLSI}DisputePhoneNumType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}ContactEmail" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IssuerAcquirerContactInfoType", propOrder = {
    "contactName",
    "contactPhone",
    "contactFax",
    "contactOther",
    "contactEmail"
})
public class IssuerAcquirerContactInfoType {

    @XmlElement(name = "ContactName")
    protected String contactName;
    @XmlElement(name = "ContactPhone")
    protected String contactPhone;
    @XmlElement(name = "ContactFax")
    protected String contactFax;
    @XmlElement(name = "ContactOther")
    protected String contactOther;
    @XmlElement(name = "ContactEmail")
    protected String contactEmail;

    /**
     * Gets the value of the contactName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactName() {
        return contactName;
    }

    /**
     * Sets the value of the contactName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactName(String value) {
        this.contactName = value;
    }

    /**
     * Gets the value of the contactPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactPhone() {
        return contactPhone;
    }

    /**
     * Sets the value of the contactPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactPhone(String value) {
        this.contactPhone = value;
    }

    /**
     * Gets the value of the contactFax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactFax() {
        return contactFax;
    }

    /**
     * Sets the value of the contactFax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactFax(String value) {
        this.contactFax = value;
    }

    /**
     * Gets the value of the contactOther property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactOther() {
        return contactOther;
    }

    /**
     * Sets the value of the contactOther property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactOther(String value) {
        this.contactOther = value;
    }

    /**
     * Gets the value of the contactEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactEmail() {
        return contactEmail;
    }

    /**
     * Sets the value of the contactEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactEmail(String value) {
        this.contactEmail = value;
    }

}
