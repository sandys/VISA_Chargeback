//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.02.13 at 11:38:26 AM EST 
//


package org.incomm.generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for DisputeContactMessageRespDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DisputeContactMessageRespDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ContactMessage" type="{http://www.visa.com/ROLSI}DisputeContactMessageType" minOccurs="0"/&gt;
 *         &lt;element name="CaseHistorySummary" type="{http://www.visa.com/ROLSI}CaseHistorySummaryType" minOccurs="0"/&gt;
 *         &lt;element name="DisputeCategory" type="{http://www.visa.com/ROLSI}DisputeCategoryType" minOccurs="0"/&gt;
 *         &lt;element name="DaysBetweenEvents" type="{http://www.visa.com/ROLSI}DaysBetweenEventsType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ResponseDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="VisaComments" type="{http://www.visa.com/ROLSI}Desc5000Type" minOccurs="0"/&gt;
 *         &lt;element name="Comments" type="{http://www.visa.com/ROLSI}Desc5000Type" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DisputeContactMessageRespDetailsType", propOrder = {
    "contactMessage",
    "caseHistorySummary",
    "disputeCategory",
    "daysBetweenEvents",
    "responseDate",
    "visaComments",
    "comments"
})
public class DisputeContactMessageRespDetailsType {

    @XmlElement(name = "ContactMessage")
    protected DisputeContactMessageType contactMessage;
    @XmlElement(name = "CaseHistorySummary")
    protected CaseHistorySummaryType caseHistorySummary;
    @XmlElement(name = "DisputeCategory")
    protected DisputeCategoryType disputeCategory;
    @XmlElement(name = "DaysBetweenEvents")
    protected List<DaysBetweenEventsType> daysBetweenEvents;
    @XmlElement(name = "ResponseDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar responseDate;
    @XmlElement(name = "VisaComments")
    protected String visaComments;
    @XmlElement(name = "Comments")
    protected String comments;

    /**
     * Gets the value of the contactMessage property.
     * 
     * @return
     *     possible object is
     *     {@link DisputeContactMessageType }
     *     
     */
    public DisputeContactMessageType getContactMessage() {
        return contactMessage;
    }

    /**
     * Sets the value of the contactMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisputeContactMessageType }
     *     
     */
    public void setContactMessage(DisputeContactMessageType value) {
        this.contactMessage = value;
    }

    /**
     * Gets the value of the caseHistorySummary property.
     * 
     * @return
     *     possible object is
     *     {@link CaseHistorySummaryType }
     *     
     */
    public CaseHistorySummaryType getCaseHistorySummary() {
        return caseHistorySummary;
    }

    /**
     * Sets the value of the caseHistorySummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link CaseHistorySummaryType }
     *     
     */
    public void setCaseHistorySummary(CaseHistorySummaryType value) {
        this.caseHistorySummary = value;
    }

    /**
     * Gets the value of the disputeCategory property.
     * 
     * @return
     *     possible object is
     *     {@link DisputeCategoryType }
     *     
     */
    public DisputeCategoryType getDisputeCategory() {
        return disputeCategory;
    }

    /**
     * Sets the value of the disputeCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisputeCategoryType }
     *     
     */
    public void setDisputeCategory(DisputeCategoryType value) {
        this.disputeCategory = value;
    }

    /**
     * Gets the value of the daysBetweenEvents property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the daysBetweenEvents property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDaysBetweenEvents().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DaysBetweenEventsType }
     * 
     * 
     */
    public List<DaysBetweenEventsType> getDaysBetweenEvents() {
        if (daysBetweenEvents == null) {
            daysBetweenEvents = new ArrayList<DaysBetweenEventsType>();
        }
        return this.daysBetweenEvents;
    }

    /**
     * Gets the value of the responseDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getResponseDate() {
        return responseDate;
    }

    /**
     * Sets the value of the responseDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setResponseDate(XMLGregorianCalendar value) {
        this.responseDate = value;
    }

    /**
     * Gets the value of the visaComments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVisaComments() {
        return visaComments;
    }

    /**
     * Sets the value of the visaComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVisaComments(String value) {
        this.visaComments = value;
    }

    /**
     * Gets the value of the comments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComments() {
        return comments;
    }

    /**
     * Sets the value of the comments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComments(String value) {
        this.comments = value;
    }

}