//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.02.13 at 11:38:26 AM EST 
//


package org.incomm.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ContactMessageType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContactMessageType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}FilingId" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}ContactMsgId" minOccurs="0"/&gt;
 *         &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SubmitDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="isForwardingResponse" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContactMessageType", propOrder = {
    "filingId",
    "contactMsgId",
    "text",
    "submitDate"
})
public class ContactMessageType {

    @XmlElement(name = "FilingId")
    protected Long filingId;
    @XmlElement(name = "ContactMsgId")
    protected Long contactMsgId;
    @XmlElement(name = "Text", required = true)
    protected String text;
    @XmlElement(name = "SubmitDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar submitDate;
    @XmlAttribute(name = "isForwardingResponse")
    protected Boolean isForwardingResponse;

    /**
     * Used in RTSI and IECF only
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFilingId() {
        return filingId;
    }

    /**
     * Sets the value of the filingId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFilingId(Long value) {
        this.filingId = value;
    }

    /**
     * Used in RTSI and IECF only
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getContactMsgId() {
        return contactMsgId;
    }

    /**
     * Sets the value of the contactMsgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setContactMsgId(Long value) {
        this.contactMsgId = value;
    }

    /**
     * Gets the value of the text property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getText() {
        return text;
    }

    /**
     * Sets the value of the text property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setText(String value) {
        this.text = value;
    }

    /**
     * Gets the value of the submitDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSubmitDate() {
        return submitDate;
    }

    /**
     * Sets the value of the submitDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSubmitDate(XMLGregorianCalendar value) {
        this.submitDate = value;
    }

    /**
     * Gets the value of the isForwardingResponse property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsForwardingResponse() {
        return isForwardingResponse;
    }

    /**
     * Sets the value of the isForwardingResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsForwardingResponse(Boolean value) {
        this.isForwardingResponse = value;
    }

}
