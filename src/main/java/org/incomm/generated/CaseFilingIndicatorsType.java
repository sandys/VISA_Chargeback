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
 * <p>Java class for CaseFilingIndicatorsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CaseFilingIndicatorsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CaseFilingItemID" type="{http://www.visa.com/ROLSI}CaseFilingItemIDType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}CaseFilingIndicatorItemType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CaseFilingIndicatorsType", propOrder = {
    "caseFilingItemID",
    "caseFilingIndicatorItemType"
})
public class CaseFilingIndicatorsType {

    @XmlElement(name = "CaseFilingItemID")
    protected CaseFilingItemIDType caseFilingItemID;
    @XmlElement(name = "CaseFilingIndicatorItemType")
    protected String caseFilingIndicatorItemType;

    /**
     * Gets the value of the caseFilingItemID property.
     * 
     * @return
     *     possible object is
     *     {@link CaseFilingItemIDType }
     *     
     */
    public CaseFilingItemIDType getCaseFilingItemID() {
        return caseFilingItemID;
    }

    /**
     * Sets the value of the caseFilingItemID property.
     * 
     * @param value
     *     allowed object is
     *     {@link CaseFilingItemIDType }
     *     
     */
    public void setCaseFilingItemID(CaseFilingItemIDType value) {
        this.caseFilingItemID = value;
    }

    /**
     * Gets the value of the caseFilingIndicatorItemType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaseFilingIndicatorItemType() {
        return caseFilingIndicatorItemType;
    }

    /**
     * Sets the value of the caseFilingIndicatorItemType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaseFilingIndicatorItemType(String value) {
        this.caseFilingIndicatorItemType = value;
    }

}
