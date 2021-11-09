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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for HyperSearchType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HyperSearchType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}CaseMatchingInfo" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}Token" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}PageNum" minOccurs="0"/&gt;
 *         &lt;element name="RegERegZExpirationStartDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="RegERegZExpirationEndDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HyperSearchType", propOrder = {
    "caseMatchingInfo",
    "token",
    "pageNum",
    "regERegZExpirationStartDate",
    "regERegZExpirationEndDate"
})
public class HyperSearchType {

    @XmlElement(name = "CaseMatchingInfo")
    protected CaseMatchingInfoType caseMatchingInfo;
    @XmlElement(name = "Token")
    protected String token;
    @XmlElement(name = "PageNum")
    protected Integer pageNum;
    @XmlElement(name = "RegERegZExpirationStartDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar regERegZExpirationStartDate;
    @XmlElement(name = "RegERegZExpirationEndDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar regERegZExpirationEndDate;

    /**
     * Gets the value of the caseMatchingInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CaseMatchingInfoType }
     *     
     */
    public CaseMatchingInfoType getCaseMatchingInfo() {
        return caseMatchingInfo;
    }

    /**
     * Sets the value of the caseMatchingInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CaseMatchingInfoType }
     *     
     */
    public void setCaseMatchingInfo(CaseMatchingInfoType value) {
        this.caseMatchingInfo = value;
    }

    /**
     * Gets the value of the token property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToken() {
        return token;
    }

    /**
     * Sets the value of the token property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToken(String value) {
        this.token = value;
    }

    /**
     * Gets the value of the pageNum property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPageNum() {
        return pageNum;
    }

    /**
     * Sets the value of the pageNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPageNum(Integer value) {
        this.pageNum = value;
    }

    /**
     * Gets the value of the regERegZExpirationStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRegERegZExpirationStartDate() {
        return regERegZExpirationStartDate;
    }

    /**
     * Sets the value of the regERegZExpirationStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRegERegZExpirationStartDate(XMLGregorianCalendar value) {
        this.regERegZExpirationStartDate = value;
    }

    /**
     * Gets the value of the regERegZExpirationEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRegERegZExpirationEndDate() {
        return regERegZExpirationEndDate;
    }

    /**
     * Sets the value of the regERegZExpirationEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRegERegZExpirationEndDate(XMLGregorianCalendar value) {
        this.regERegZExpirationEndDate = value;
    }

}