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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AttachDescriptorType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AttachDescriptorType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AttachType" type="{http://www.visa.com/ROLSI}SOAPAttachType" minOccurs="0"/&gt;
 *         &lt;element name="Attachment" type="{http://www.visa.com/ROLSI}RTSIAttachDescriptorType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}DocType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}DocId" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AttachDescriptorType", propOrder = {
    "attachType",
    "attachment",
    "docType",
    "docId"
})
public class AttachDescriptorType {

    @XmlElement(name = "AttachType")
    @XmlSchemaType(name = "string")
    protected SOAPAttachType attachType;
    @XmlElement(name = "Attachment")
    protected RTSIAttachDescriptorType attachment;
    @XmlElement(name = "DocType")
    protected String docType;
    @XmlElement(name = "DocId")
    protected Long docId;

    /**
     * Gets the value of the attachType property.
     * 
     * @return
     *     possible object is
     *     {@link SOAPAttachType }
     *     
     */
    public SOAPAttachType getAttachType() {
        return attachType;
    }

    /**
     * Sets the value of the attachType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SOAPAttachType }
     *     
     */
    public void setAttachType(SOAPAttachType value) {
        this.attachType = value;
    }

    /**
     * Gets the value of the attachment property.
     * 
     * @return
     *     possible object is
     *     {@link RTSIAttachDescriptorType }
     *     
     */
    public RTSIAttachDescriptorType getAttachment() {
        return attachment;
    }

    /**
     * Sets the value of the attachment property.
     * 
     * @param value
     *     allowed object is
     *     {@link RTSIAttachDescriptorType }
     *     
     */
    public void setAttachment(RTSIAttachDescriptorType value) {
        this.attachment = value;
    }

    /**
     * Gets the value of the docType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocType() {
        return docType;
    }

    /**
     * Sets the value of the docType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocType(String value) {
        this.docType = value;
    }

    /**
     * Gets the value of the docId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDocId() {
        return docId;
    }

    /**
     * Sets the value of the docId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDocId(Long value) {
        this.docId = value;
    }

}
