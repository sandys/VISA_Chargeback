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
 * Information about a questionnaire. It contains a TransactionInfo element and a Representment, Chargeback, Pre-Arb, Pre-Arb Response, Pre-Comp or Pre-Comp Response element, depending on the type of the questionnaire.
 * 
 * <p>Java class for MessageDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MessageDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TransactionInfo" type="{http://www.visa.com/ROLSI}TranHeaderInfoType" minOccurs="0"/&gt;
 *         &lt;group ref="{http://www.visa.com/ROLSI}MessageDataGroup"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MessageDataType", propOrder = {
    "transactionInfo",
    "message",
    "messageResponse",
    "rppMessage",
    "rppMessageResponse"
})
public class MessageDataType {

    @XmlElement(name = "TransactionInfo")
    protected TranHeaderInfoType transactionInfo;
    @XmlElement(name = "Message")
    protected NonFinancialMessageType message;
    @XmlElement(name = "MessageResponse")
    protected MessageResponseType messageResponse;
    @XmlElement(name = "RPPMessage")
    protected RPPMessageType rppMessage;
    @XmlElement(name = "RPPMessageResponse")
    protected RPPMessageResponseType rppMessageResponse;

    /**
     * Gets the value of the transactionInfo property.
     * 
     * @return
     *     possible object is
     *     {@link TranHeaderInfoType }
     *     
     */
    public TranHeaderInfoType getTransactionInfo() {
        return transactionInfo;
    }

    /**
     * Sets the value of the transactionInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TranHeaderInfoType }
     *     
     */
    public void setTransactionInfo(TranHeaderInfoType value) {
        this.transactionInfo = value;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link NonFinancialMessageType }
     *     
     */
    public NonFinancialMessageType getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonFinancialMessageType }
     *     
     */
    public void setMessage(NonFinancialMessageType value) {
        this.message = value;
    }

    /**
     * Gets the value of the messageResponse property.
     * 
     * @return
     *     possible object is
     *     {@link MessageResponseType }
     *     
     */
    public MessageResponseType getMessageResponse() {
        return messageResponse;
    }

    /**
     * Sets the value of the messageResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageResponseType }
     *     
     */
    public void setMessageResponse(MessageResponseType value) {
        this.messageResponse = value;
    }

    /**
     * Gets the value of the rppMessage property.
     * 
     * @return
     *     possible object is
     *     {@link RPPMessageType }
     *     
     */
    public RPPMessageType getRPPMessage() {
        return rppMessage;
    }

    /**
     * Sets the value of the rppMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link RPPMessageType }
     *     
     */
    public void setRPPMessage(RPPMessageType value) {
        this.rppMessage = value;
    }

    /**
     * Gets the value of the rppMessageResponse property.
     * 
     * @return
     *     possible object is
     *     {@link RPPMessageResponseType }
     *     
     */
    public RPPMessageResponseType getRPPMessageResponse() {
        return rppMessageResponse;
    }

    /**
     * Sets the value of the rppMessageResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link RPPMessageResponseType }
     *     
     */
    public void setRPPMessageResponse(RPPMessageResponseType value) {
        this.rppMessageResponse = value;
    }

}
