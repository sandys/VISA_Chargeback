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
 * <p>Java class for RTSIRFCFulfillmentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RTSIRFCFulfillmentType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.visa.com/ROLSI}RFCFulfillmentType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.visa.com/ROLSI}RTSIRFCIdentifierGroup"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}AttachmentDescriptor"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RTSIRFCFulfillmentType", propOrder = {
    "rfcid",
    "visaCaseNumber",
    "attachmentDescriptor"
})
public class RTSIRFCFulfillmentType
    extends RFCFulfillmentType
{

    @XmlElement(name = "RFCID")
    protected long rfcid;
    @XmlElement(name = "VisaCaseNumber")
    protected long visaCaseNumber;
    @XmlElement(name = "AttachmentDescriptor", required = true)
    protected RTSIAttachDescriptorType attachmentDescriptor;

    /**
     * Gets the value of the rfcid property.
     * 
     */
    public long getRFCID() {
        return rfcid;
    }

    /**
     * Sets the value of the rfcid property.
     * 
     */
    public void setRFCID(long value) {
        this.rfcid = value;
    }

    /**
     * Gets the value of the visaCaseNumber property.
     * 
     */
    public long getVisaCaseNumber() {
        return visaCaseNumber;
    }

    /**
     * Sets the value of the visaCaseNumber property.
     * 
     */
    public void setVisaCaseNumber(long value) {
        this.visaCaseNumber = value;
    }

    /**
     * Gets the value of the attachmentDescriptor property.
     * 
     * @return
     *     possible object is
     *     {@link RTSIAttachDescriptorType }
     *     
     */
    public RTSIAttachDescriptorType getAttachmentDescriptor() {
        return attachmentDescriptor;
    }

    /**
     * Sets the value of the attachmentDescriptor property.
     * 
     * @param value
     *     allowed object is
     *     {@link RTSIAttachDescriptorType }
     *     
     */
    public void setAttachmentDescriptor(RTSIAttachDescriptorType value) {
        this.attachmentDescriptor = value;
    }

}
