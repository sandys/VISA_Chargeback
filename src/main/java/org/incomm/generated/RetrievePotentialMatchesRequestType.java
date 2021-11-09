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
 * <p>Java class for RetrievePotentialMatchesRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RetrievePotentialMatchesRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;group ref="{http://www.visa.com/ROLSI}FinancialItemGroup" minOccurs="0"/&gt;
 *         &lt;group ref="{http://www.visa.com/ROLSI}DocItemGroup" minOccurs="0"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetrievePotentialMatchesRequestType", propOrder = {
    "unmatchedFinancialItemID",
    "unmatchedFinancialItemType",
    "unmatchedDocItemID",
    "unmatchedDocItemType",
    "visaCaseNumber"
})
public class RetrievePotentialMatchesRequestType {

    @XmlElement(name = "UnmatchedFinancialItemID")
    protected Long unmatchedFinancialItemID;
    @XmlElement(name = "UnmatchedFinancialItemType")
    protected String unmatchedFinancialItemType;
    @XmlElement(name = "UnmatchedDocItemID")
    protected Long unmatchedDocItemID;
    @XmlElement(name = "UnmatchedDocItemType")
    protected String unmatchedDocItemType;
    @XmlElement(name = "VisaCaseNumber")
    protected Long visaCaseNumber;

    /**
     * Gets the value of the unmatchedFinancialItemID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getUnmatchedFinancialItemID() {
        return unmatchedFinancialItemID;
    }

    /**
     * Sets the value of the unmatchedFinancialItemID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setUnmatchedFinancialItemID(Long value) {
        this.unmatchedFinancialItemID = value;
    }

    /**
     * Gets the value of the unmatchedFinancialItemType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnmatchedFinancialItemType() {
        return unmatchedFinancialItemType;
    }

    /**
     * Sets the value of the unmatchedFinancialItemType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnmatchedFinancialItemType(String value) {
        this.unmatchedFinancialItemType = value;
    }

    /**
     * Gets the value of the unmatchedDocItemID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getUnmatchedDocItemID() {
        return unmatchedDocItemID;
    }

    /**
     * Sets the value of the unmatchedDocItemID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setUnmatchedDocItemID(Long value) {
        this.unmatchedDocItemID = value;
    }

    /**
     * Gets the value of the unmatchedDocItemType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnmatchedDocItemType() {
        return unmatchedDocItemType;
    }

    /**
     * Sets the value of the unmatchedDocItemType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnmatchedDocItemType(String value) {
        this.unmatchedDocItemType = value;
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
