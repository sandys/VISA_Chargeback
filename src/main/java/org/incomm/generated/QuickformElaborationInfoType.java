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
 * <p>Java class for QuickformElaborationInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QuickformElaborationInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}ExplanationOfCreditPresented" minOccurs="0"/&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element name="Authorization" type="{http://www.visa.com/ROLSI}DisputeAuthorizationType" minOccurs="0"/&gt;
 *           &lt;element name="Fraud" type="{http://www.visa.com/ROLSI}DisputeFraudType" minOccurs="0"/&gt;
 *           &lt;element name="ProcessingError" type="{http://www.visa.com/ROLSI}DisputeProcessErrorType" minOccurs="0"/&gt;
 *           &lt;element name="Consumer" type="{http://www.visa.com/ROLSI}ConsumerDisputesType" minOccurs="0"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuickformElaborationInfoType", propOrder = {
    "explanationOfCreditPresented",
    "authorization",
    "fraud",
    "processingError",
    "consumer"
})
public class QuickformElaborationInfoType {

    @XmlElement(name = "ExplanationOfCreditPresented")
    protected String explanationOfCreditPresented;
    @XmlElement(name = "Authorization")
    protected DisputeAuthorizationType authorization;
    @XmlElement(name = "Fraud")
    protected DisputeFraudType fraud;
    @XmlElement(name = "ProcessingError")
    protected DisputeProcessErrorType processingError;
    @XmlElement(name = "Consumer")
    protected ConsumerDisputesType consumer;

    /**
     * Gets the value of the explanationOfCreditPresented property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExplanationOfCreditPresented() {
        return explanationOfCreditPresented;
    }

    /**
     * Sets the value of the explanationOfCreditPresented property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExplanationOfCreditPresented(String value) {
        this.explanationOfCreditPresented = value;
    }

    /**
     * Gets the value of the authorization property.
     * 
     * @return
     *     possible object is
     *     {@link DisputeAuthorizationType }
     *     
     */
    public DisputeAuthorizationType getAuthorization() {
        return authorization;
    }

    /**
     * Sets the value of the authorization property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisputeAuthorizationType }
     *     
     */
    public void setAuthorization(DisputeAuthorizationType value) {
        this.authorization = value;
    }

    /**
     * Gets the value of the fraud property.
     * 
     * @return
     *     possible object is
     *     {@link DisputeFraudType }
     *     
     */
    public DisputeFraudType getFraud() {
        return fraud;
    }

    /**
     * Sets the value of the fraud property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisputeFraudType }
     *     
     */
    public void setFraud(DisputeFraudType value) {
        this.fraud = value;
    }

    /**
     * Gets the value of the processingError property.
     * 
     * @return
     *     possible object is
     *     {@link DisputeProcessErrorType }
     *     
     */
    public DisputeProcessErrorType getProcessingError() {
        return processingError;
    }

    /**
     * Sets the value of the processingError property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisputeProcessErrorType }
     *     
     */
    public void setProcessingError(DisputeProcessErrorType value) {
        this.processingError = value;
    }

    /**
     * Gets the value of the consumer property.
     * 
     * @return
     *     possible object is
     *     {@link ConsumerDisputesType }
     *     
     */
    public ConsumerDisputesType getConsumer() {
        return consumer;
    }

    /**
     * Sets the value of the consumer property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsumerDisputesType }
     *     
     */
    public void setConsumer(ConsumerDisputesType value) {
        this.consumer = value;
    }

}
