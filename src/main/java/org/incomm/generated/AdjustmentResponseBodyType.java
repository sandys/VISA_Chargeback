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
 * <p>Java class for AdjustmentResponseBodyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdjustmentResponseBodyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.visa.com/ROLSI}ResponseBodyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element name="SubmitAdjustmentResponse" type="{http://www.visa.com/ROLSI}SubmitAdjustmentResponseType"/&gt;
 *           &lt;element name="AdjustmentDetailsResponse" type="{http://www.visa.com/ROLSI}RTSIAdjustmentDetailsResponseType"/&gt;
 *           &lt;element name="AdjustmentSwitchStatusResponse" type="{http://www.visa.com/ROLSI}RTSIAdjustmentSwitchStatusResponseType"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdjustmentResponseBodyType", propOrder = {
    "submitAdjustmentResponse",
    "adjustmentDetailsResponse",
    "adjustmentSwitchStatusResponse"
})
public class AdjustmentResponseBodyType
    extends ResponseBodyType
{

    @XmlElement(name = "SubmitAdjustmentResponse")
    protected SubmitAdjustmentResponseType submitAdjustmentResponse;
    @XmlElement(name = "AdjustmentDetailsResponse")
    protected RTSIAdjustmentDetailsResponseType adjustmentDetailsResponse;
    @XmlElement(name = "AdjustmentSwitchStatusResponse")
    protected RTSIAdjustmentSwitchStatusResponseType adjustmentSwitchStatusResponse;

    /**
     * Gets the value of the submitAdjustmentResponse property.
     * 
     * @return
     *     possible object is
     *     {@link SubmitAdjustmentResponseType }
     *     
     */
    public SubmitAdjustmentResponseType getSubmitAdjustmentResponse() {
        return submitAdjustmentResponse;
    }

    /**
     * Sets the value of the submitAdjustmentResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubmitAdjustmentResponseType }
     *     
     */
    public void setSubmitAdjustmentResponse(SubmitAdjustmentResponseType value) {
        this.submitAdjustmentResponse = value;
    }

    /**
     * Gets the value of the adjustmentDetailsResponse property.
     * 
     * @return
     *     possible object is
     *     {@link RTSIAdjustmentDetailsResponseType }
     *     
     */
    public RTSIAdjustmentDetailsResponseType getAdjustmentDetailsResponse() {
        return adjustmentDetailsResponse;
    }

    /**
     * Sets the value of the adjustmentDetailsResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link RTSIAdjustmentDetailsResponseType }
     *     
     */
    public void setAdjustmentDetailsResponse(RTSIAdjustmentDetailsResponseType value) {
        this.adjustmentDetailsResponse = value;
    }

    /**
     * Gets the value of the adjustmentSwitchStatusResponse property.
     * 
     * @return
     *     possible object is
     *     {@link RTSIAdjustmentSwitchStatusResponseType }
     *     
     */
    public RTSIAdjustmentSwitchStatusResponseType getAdjustmentSwitchStatusResponse() {
        return adjustmentSwitchStatusResponse;
    }

    /**
     * Sets the value of the adjustmentSwitchStatusResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link RTSIAdjustmentSwitchStatusResponseType }
     *     
     */
    public void setAdjustmentSwitchStatusResponse(RTSIAdjustmentSwitchStatusResponseType value) {
        this.adjustmentSwitchStatusResponse = value;
    }

}