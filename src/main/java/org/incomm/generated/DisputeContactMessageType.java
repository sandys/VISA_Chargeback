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
 * <p>Java class for DisputeContactMessageType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DisputeContactMessageType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}ContactMessageId" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}ContactMessageResponseId" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DisputeContactMessageType", propOrder = {
    "contactMessageId",
    "contactMessageResponseId"
})
public class DisputeContactMessageType {

    @XmlElement(name = "ContactMessageId")
    protected Long contactMessageId;
    @XmlElement(name = "ContactMessageResponseId")
    protected Long contactMessageResponseId;

    /**
     * Gets the value of the contactMessageId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getContactMessageId() {
        return contactMessageId;
    }

    /**
     * Sets the value of the contactMessageId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setContactMessageId(Long value) {
        this.contactMessageId = value;
    }

    /**
     * Gets the value of the contactMessageResponseId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getContactMessageResponseId() {
        return contactMessageResponseId;
    }

    /**
     * Sets the value of the contactMessageResponseId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setContactMessageResponseId(Long value) {
        this.contactMessageResponseId = value;
    }

}