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
 * <p>Java class for FraudReportRequestBodyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FraudReportRequestBodyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.visa.com/ROLSI}RequestBodyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element name="SubmitFraudReportRequest" type="{http://www.visa.com/ROLSI}RTSISubmitFraudReportType"/&gt;
 *           &lt;element name="FraudReportDetailsRequest" type="{http://www.visa.com/ROLSI}RTSIFraudReportDetailsRequestType"/&gt;
 *           &lt;element name="SubmitIgnore" type="{http://www.visa.com/ROLSI}RTSISubmitIgnoreType"/&gt;
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
@XmlType(name = "FraudReportRequestBodyType", propOrder = {
    "submitFraudReportRequest",
    "fraudReportDetailsRequest",
    "submitIgnore"
})
public class FraudReportRequestBodyType
    extends RequestBodyType
{

    @XmlElement(name = "SubmitFraudReportRequest")
    protected RTSISubmitFraudReportType submitFraudReportRequest;
    @XmlElement(name = "FraudReportDetailsRequest")
    protected RTSIFraudReportDetailsRequestType fraudReportDetailsRequest;
    @XmlElement(name = "SubmitIgnore")
    protected RTSISubmitIgnoreType submitIgnore;

    /**
     * Gets the value of the submitFraudReportRequest property.
     * 
     * @return
     *     possible object is
     *     {@link RTSISubmitFraudReportType }
     *     
     */
    public RTSISubmitFraudReportType getSubmitFraudReportRequest() {
        return submitFraudReportRequest;
    }

    /**
     * Sets the value of the submitFraudReportRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link RTSISubmitFraudReportType }
     *     
     */
    public void setSubmitFraudReportRequest(RTSISubmitFraudReportType value) {
        this.submitFraudReportRequest = value;
    }

    /**
     * Gets the value of the fraudReportDetailsRequest property.
     * 
     * @return
     *     possible object is
     *     {@link RTSIFraudReportDetailsRequestType }
     *     
     */
    public RTSIFraudReportDetailsRequestType getFraudReportDetailsRequest() {
        return fraudReportDetailsRequest;
    }

    /**
     * Sets the value of the fraudReportDetailsRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link RTSIFraudReportDetailsRequestType }
     *     
     */
    public void setFraudReportDetailsRequest(RTSIFraudReportDetailsRequestType value) {
        this.fraudReportDetailsRequest = value;
    }

    /**
     * Gets the value of the submitIgnore property.
     * 
     * @return
     *     possible object is
     *     {@link RTSISubmitIgnoreType }
     *     
     */
    public RTSISubmitIgnoreType getSubmitIgnore() {
        return submitIgnore;
    }

    /**
     * Sets the value of the submitIgnore property.
     * 
     * @param value
     *     allowed object is
     *     {@link RTSISubmitIgnoreType }
     *     
     */
    public void setSubmitIgnore(RTSISubmitIgnoreType value) {
        this.submitIgnore = value;
    }

}
