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
 * <p>Java class for IgnoreUnmatchedItemRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IgnoreUnmatchedItemRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;group ref="{http://www.visa.com/ROLSI}IgnoreFinancialItemGroup" minOccurs="0"/&gt;
 *           &lt;group ref="{http://www.visa.com/ROLSI}IgnoreDocItemGroup" minOccurs="0"/&gt;
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
@XmlType(name = "IgnoreUnmatchedItemRequestType", propOrder = {
    "unmatchedFinancialID",
    "unmatchedQnID",
    "visaCaseNumber"
})
public class IgnoreUnmatchedItemRequestType {

    @XmlElement(name = "UnmatchedFinancialID")
    protected InternalId unmatchedFinancialID;
    @XmlElement(name = "UnmatchedQnID")
    protected InternalId unmatchedQnID;
    @XmlElement(name = "VisaCaseNumber")
    protected Long visaCaseNumber;

    /**
     * Gets the value of the unmatchedFinancialID property.
     * 
     * @return
     *     possible object is
     *     {@link InternalId }
     *     
     */
    public InternalId getUnmatchedFinancialID() {
        return unmatchedFinancialID;
    }

    /**
     * Sets the value of the unmatchedFinancialID property.
     * 
     * @param value
     *     allowed object is
     *     {@link InternalId }
     *     
     */
    public void setUnmatchedFinancialID(InternalId value) {
        this.unmatchedFinancialID = value;
    }

    /**
     * Gets the value of the unmatchedQnID property.
     * 
     * @return
     *     possible object is
     *     {@link InternalId }
     *     
     */
    public InternalId getUnmatchedQnID() {
        return unmatchedQnID;
    }

    /**
     * Sets the value of the unmatchedQnID property.
     * 
     * @param value
     *     allowed object is
     *     {@link InternalId }
     *     
     */
    public void setUnmatchedQnID(InternalId value) {
        this.unmatchedQnID = value;
    }

    /**
     * Gets the value of the visaCaseNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getVisaCaseNumber() {
        return visaCaseNumber;
    }

    /**
     * Sets the value of the visaCaseNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setVisaCaseNumber(Long value) {
        this.visaCaseNumber = value;
    }

}