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
 * <p>Java class for AttachmentRequestBodyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AttachmentRequestBodyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.visa.com/ROLSI}RequestBodyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AttachmentRequest" type="{http://www.visa.com/ROLSI}AttachmentRequestType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AttachmentRequestBodyType", propOrder = {
    "attachmentRequest"
})
public class AttachmentRequestBodyType
    extends RequestBodyType
{

    @XmlElement(name = "AttachmentRequest", required = true)
    protected AttachmentRequestType attachmentRequest;

    /**
     * Gets the value of the attachmentRequest property.
     * 
     * @return
     *     possible object is
     *     {@link AttachmentRequestType }
     *     
     */
    public AttachmentRequestType getAttachmentRequest() {
        return attachmentRequest;
    }

    /**
     * Sets the value of the attachmentRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttachmentRequestType }
     *     
     */
    public void setAttachmentRequest(AttachmentRequestType value) {
        this.attachmentRequest = value;
    }

}
