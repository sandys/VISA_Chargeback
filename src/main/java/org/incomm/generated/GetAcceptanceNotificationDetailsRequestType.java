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
 * <p>Java class for GetAcceptanceNotificationDetailsRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetAcceptanceNotificationDetailsRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}VisaCaseNumber"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}DisputeId" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}DisputeResponseId" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}DisputePreArbId" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}DisputePreCompId" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}DisputePreArbResponseId" minOccurs="0"/&gt;
 *         &lt;element name="DisputePreCompResponseId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetAcceptanceNotificationDetailsRequestType", propOrder = {
    "visaCaseNumber",
    "disputeId",
    "disputeResponseId",
    "disputePreArbId",
    "disputePreCompId",
    "disputePreArbResponseId",
    "disputePreCompResponseId"
})
public class GetAcceptanceNotificationDetailsRequestType {

    @XmlElement(name = "VisaCaseNumber")
    protected long visaCaseNumber;
    @XmlElement(name = "DisputeId")
    protected Long disputeId;
    @XmlElement(name = "DisputeResponseId")
    protected Long disputeResponseId;
    @XmlElement(name = "DisputePreArbId")
    protected Long disputePreArbId;
    @XmlElement(name = "DisputePreCompId")
    protected Long disputePreCompId;
    @XmlElement(name = "DisputePreArbResponseId")
    protected Long disputePreArbResponseId;
    @XmlElement(name = "DisputePreCompResponseId")
    protected Long disputePreCompResponseId;

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
     * Gets the value of the disputeId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDisputeId() {
        return disputeId;
    }

    /**
     * Sets the value of the disputeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDisputeId(Long value) {
        this.disputeId = value;
    }

    /**
     * Gets the value of the disputeResponseId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDisputeResponseId() {
        return disputeResponseId;
    }

    /**
     * Sets the value of the disputeResponseId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDisputeResponseId(Long value) {
        this.disputeResponseId = value;
    }

    /**
     * Gets the value of the disputePreArbId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDisputePreArbId() {
        return disputePreArbId;
    }

    /**
     * Sets the value of the disputePreArbId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDisputePreArbId(Long value) {
        this.disputePreArbId = value;
    }

    /**
     * Gets the value of the disputePreCompId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDisputePreCompId() {
        return disputePreCompId;
    }

    /**
     * Sets the value of the disputePreCompId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDisputePreCompId(Long value) {
        this.disputePreCompId = value;
    }

    /**
     * Gets the value of the disputePreArbResponseId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDisputePreArbResponseId() {
        return disputePreArbResponseId;
    }

    /**
     * Sets the value of the disputePreArbResponseId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDisputePreArbResponseId(Long value) {
        this.disputePreArbResponseId = value;
    }

    /**
     * Gets the value of the disputePreCompResponseId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDisputePreCompResponseId() {
        return disputePreCompResponseId;
    }

    /**
     * Sets the value of the disputePreCompResponseId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDisputePreCompResponseId(Long value) {
        this.disputePreCompResponseId = value;
    }

}
