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
 * <p>Java class for DisputeFinIdentifierType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DisputeFinIdentifierType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DisputeFinId" type="{http://www.visa.com/ROLSI}DisputeFinIdType" minOccurs="0"/&gt;
 *         &lt;element name="DisputeStatus" type="{http://www.visa.com/ROLSI}DisputeStatusAdviceType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DisputeFinIdentifierType", propOrder = {
    "disputeFinId",
    "disputeStatus"
})
public class DisputeFinIdentifierType {

    @XmlElement(name = "DisputeFinId")
    protected DisputeFinIdType disputeFinId;
    @XmlElement(name = "DisputeStatus")
    @XmlSchemaType(name = "string")
    protected DisputeStatusAdviceType disputeStatus;

    /**
     * Gets the value of the disputeFinId property.
     * 
     * @return
     *     possible object is
     *     {@link DisputeFinIdType }
     *     
     */
    public DisputeFinIdType getDisputeFinId() {
        return disputeFinId;
    }

    /**
     * Sets the value of the disputeFinId property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisputeFinIdType }
     *     
     */
    public void setDisputeFinId(DisputeFinIdType value) {
        this.disputeFinId = value;
    }

    /**
     * Gets the value of the disputeStatus property.
     * 
     * @return
     *     possible object is
     *     {@link DisputeStatusAdviceType }
     *     
     */
    public DisputeStatusAdviceType getDisputeStatus() {
        return disputeStatus;
    }

    /**
     * Sets the value of the disputeStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisputeStatusAdviceType }
     *     
     */
    public void setDisputeStatus(DisputeStatusAdviceType value) {
        this.disputeStatus = value;
    }

}