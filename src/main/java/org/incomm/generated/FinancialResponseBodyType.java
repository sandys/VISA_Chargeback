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
 * <p>Java class for FinancialResponseBodyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FinancialResponseBodyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.visa.com/ROLSI}ResponseBodyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element name="FinancialReversalResponse" type="{http://www.visa.com/ROLSI}RTSIFinancialResponseType"/&gt;
 *           &lt;group ref="{http://www.visa.com/ROLSI}GetFinancialDetailResponseGroup"/&gt;
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
@XmlType(name = "FinancialResponseBodyType", propOrder = {
    "financialReversalResponse",
    "financialDetailResponse",
    "financialSwitchStatusResponse",
    "fnRejectReturnResponse"
})
public class FinancialResponseBodyType
    extends ResponseBodyType
{

    @XmlElement(name = "FinancialReversalResponse")
    protected RTSIFinancialResponseType financialReversalResponse;
    @XmlElement(name = "FinancialDetailResponse")
    protected RTSIFinancialResponseType financialDetailResponse;
    @XmlElement(name = "FinancialSwitchStatusResponse")
    protected RTSIFinancialSwitchStatusResponseType financialSwitchStatusResponse;
    @XmlElement(name = "FnRejectReturnResponse")
    protected RTSIFnRejectReturnType fnRejectReturnResponse;

    /**
     * Gets the value of the financialReversalResponse property.
     * 
     * @return
     *     possible object is
     *     {@link RTSIFinancialResponseType }
     *     
     */
    public RTSIFinancialResponseType getFinancialReversalResponse() {
        return financialReversalResponse;
    }

    /**
     * Sets the value of the financialReversalResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link RTSIFinancialResponseType }
     *     
     */
    public void setFinancialReversalResponse(RTSIFinancialResponseType value) {
        this.financialReversalResponse = value;
    }

    /**
     * Gets the value of the financialDetailResponse property.
     * 
     * @return
     *     possible object is
     *     {@link RTSIFinancialResponseType }
     *     
     */
    public RTSIFinancialResponseType getFinancialDetailResponse() {
        return financialDetailResponse;
    }

    /**
     * Sets the value of the financialDetailResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link RTSIFinancialResponseType }
     *     
     */
    public void setFinancialDetailResponse(RTSIFinancialResponseType value) {
        this.financialDetailResponse = value;
    }

    /**
     * Gets the value of the financialSwitchStatusResponse property.
     * 
     * @return
     *     possible object is
     *     {@link RTSIFinancialSwitchStatusResponseType }
     *     
     */
    public RTSIFinancialSwitchStatusResponseType getFinancialSwitchStatusResponse() {
        return financialSwitchStatusResponse;
    }

    /**
     * Sets the value of the financialSwitchStatusResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link RTSIFinancialSwitchStatusResponseType }
     *     
     */
    public void setFinancialSwitchStatusResponse(RTSIFinancialSwitchStatusResponseType value) {
        this.financialSwitchStatusResponse = value;
    }

    /**
     * Gets the value of the fnRejectReturnResponse property.
     * 
     * @return
     *     possible object is
     *     {@link RTSIFnRejectReturnType }
     *     
     */
    public RTSIFnRejectReturnType getFnRejectReturnResponse() {
        return fnRejectReturnResponse;
    }

    /**
     * Sets the value of the fnRejectReturnResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link RTSIFnRejectReturnType }
     *     
     */
    public void setFnRejectReturnResponse(RTSIFnRejectReturnType value) {
        this.fnRejectReturnResponse = value;
    }

}