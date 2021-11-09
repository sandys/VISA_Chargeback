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
 * @direction: Response
 * 
 * <p>Java class for RFCDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RFCDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}RFC"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}RFCAdvice"/&gt;
 *         &lt;element name="RFCFulfillment" type="{http://www.visa.com/ROLSI}RFCFulfillmentResponseType"/&gt;
 *         &lt;element name="RFCNonFulfillment" type="{http://www.visa.com/ROLSI}RFCNonFulfillmentResponseType"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}RFCRejectReturn"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RFCDataType", propOrder = {
    "rfc",
    "rfcAdvice",
    "rfcFulfillment",
    "rfcNonFulfillment",
    "rfcRejectReturn"
})
public class RFCDataType {

    @XmlElement(name = "RFC")
    protected RFCOutboundType rfc;
    @XmlElement(name = "RFCAdvice")
    protected RFCAdviceType rfcAdvice;
    @XmlElement(name = "RFCFulfillment")
    protected RFCFulfillmentResponseType rfcFulfillment;
    @XmlElement(name = "RFCNonFulfillment")
    protected RFCNonFulfillmentResponseType rfcNonFulfillment;
    @XmlElement(name = "RFCRejectReturn")
    protected RFCRejectReturnType rfcRejectReturn;

    /**
     * Gets the value of the rfc property.
     * 
     * @return
     *     possible object is
     *     {@link RFCOutboundType }
     *     
     */
    public RFCOutboundType getRFC() {
        return rfc;
    }

    /**
     * Sets the value of the rfc property.
     * 
     * @param value
     *     allowed object is
     *     {@link RFCOutboundType }
     *     
     */
    public void setRFC(RFCOutboundType value) {
        this.rfc = value;
    }

    /**
     * Gets the value of the rfcAdvice property.
     * 
     * @return
     *     possible object is
     *     {@link RFCAdviceType }
     *     
     */
    public RFCAdviceType getRFCAdvice() {
        return rfcAdvice;
    }

    /**
     * Sets the value of the rfcAdvice property.
     * 
     * @param value
     *     allowed object is
     *     {@link RFCAdviceType }
     *     
     */
    public void setRFCAdvice(RFCAdviceType value) {
        this.rfcAdvice = value;
    }

    /**
     * Gets the value of the rfcFulfillment property.
     * 
     * @return
     *     possible object is
     *     {@link RFCFulfillmentResponseType }
     *     
     */
    public RFCFulfillmentResponseType getRFCFulfillment() {
        return rfcFulfillment;
    }

    /**
     * Sets the value of the rfcFulfillment property.
     * 
     * @param value
     *     allowed object is
     *     {@link RFCFulfillmentResponseType }
     *     
     */
    public void setRFCFulfillment(RFCFulfillmentResponseType value) {
        this.rfcFulfillment = value;
    }

    /**
     * Gets the value of the rfcNonFulfillment property.
     * 
     * @return
     *     possible object is
     *     {@link RFCNonFulfillmentResponseType }
     *     
     */
    public RFCNonFulfillmentResponseType getRFCNonFulfillment() {
        return rfcNonFulfillment;
    }

    /**
     * Sets the value of the rfcNonFulfillment property.
     * 
     * @param value
     *     allowed object is
     *     {@link RFCNonFulfillmentResponseType }
     *     
     */
    public void setRFCNonFulfillment(RFCNonFulfillmentResponseType value) {
        this.rfcNonFulfillment = value;
    }

    /**
     * Gets the value of the rfcRejectReturn property.
     * 
     * @return
     *     possible object is
     *     {@link RFCRejectReturnType }
     *     
     */
    public RFCRejectReturnType getRFCRejectReturn() {
        return rfcRejectReturn;
    }

    /**
     * Sets the value of the rfcRejectReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link RFCRejectReturnType }
     *     
     */
    public void setRFCRejectReturn(RFCRejectReturnType value) {
        this.rfcRejectReturn = value;
    }

}
