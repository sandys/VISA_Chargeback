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
 * <p>Java class for GetContactMessageResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetContactMessageResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}TransactionInfo" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}VisaCaseNumber" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}ContactMessageId"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}MemberCaseNumber" minOccurs="0"/&gt;
 *         &lt;group ref="{http://www.visa.com/ROLSI}GetDisputeContactMessageDetails" minOccurs="0"/&gt;
 *         &lt;element name="DisputeAsImageResponseDescriptor" type="{http://www.visa.com/ROLSI}DisputeAsImageResponseDescriptorType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetContactMessageResponseType", propOrder = {
    "transactionInfo",
    "visaCaseNumber",
    "contactMessageId",
    "memberCaseNumber",
    "disputeCategory",
    "caseHistorySummary",
    "daysBetweenEvents",
    "responseDate",
    "visaComments",
    "disputeImageAttachment",
    "disputeAsImageResponseDescriptor"
})
public class GetContactMessageResponseType {

    @XmlElement(name = "TransactionInfo")
    protected TranHeaderInfoType transactionInfo;
    @XmlElement(name = "VisaCaseNumber")
    protected Long visaCaseNumber;
    @XmlElement(name = "ContactMessageId")
    protected long contactMessageId;
    @XmlElement(name = "MemberCaseNumber")
    protected String memberCaseNumber;
    @XmlElement(name = "DisputeCategory")
    protected DisputeCategoryType disputeCategory;
    @XmlElement(name = "CaseHistorySummary")
    protected CaseHistorySummaryType caseHistorySummary;
    @XmlElement(name = "DaysBetweenEvents")
    protected List<DaysBetweenEventsType> daysBetweenEvents;
    @XmlElement(name = "ResponseDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar responseDate;
    @XmlElement(name = "VisaComments")
    protected String visaComments;
    @XmlElement(name = "DisputeImageAttachment")
    protected DisputeAttachmentDescriptorType disputeImageAttachment;
    @XmlElement(name = "DisputeAsImageResponseDescriptor")
    protected DisputeAsImageResponseDescriptorType disputeAsImageResponseDescriptor;

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

    /**
     * Gets the value of the contactMessageId property.
     * 
     */
    public long getContactMessageId() {
        return contactMessageId;
    }

    /**
     * Sets the value of the contactMessageId property.
     * 
     */
    public void setContactMessageId(long value) {
        this.contactMessageId = value;
    }

    /**
     * Gets the value of the memberCaseNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemberCaseNumber() {
        return memberCaseNumber;
    }

    /**
     * Sets the value of the memberCaseNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMemberCaseNumber(String value) {
        this.memberCaseNumber = value;
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
     * Gets the value of the disputeImageAttachment property.
     * 
     * @return
     *     possible object is
     *     {@link DisputeAttachmentDescriptorType }
     *     
     */
    public DisputeAttachmentDescriptorType getDisputeImageAttachment() {
        return disputeImageAttachment;
    }

    /**
     * Sets the value of the disputeImageAttachment property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisputeAttachmentDescriptorType }
     *     
     */
    public void setDisputeImageAttachment(DisputeAttachmentDescriptorType value) {
        this.disputeImageAttachment = value;
    }

    /**
     * Gets the value of the disputeAsImageResponseDescriptor property.
     * 
     * @return
     *     possible object is
     *     {@link DisputeAsImageResponseDescriptorType }
     *     
     */
    public DisputeAsImageResponseDescriptorType getDisputeAsImageResponseDescriptor() {
        return disputeAsImageResponseDescriptor;
    }

    /**
     * Sets the value of the disputeAsImageResponseDescriptor property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisputeAsImageResponseDescriptorType }
     *     
     */
    public void setDisputeAsImageResponseDescriptor(DisputeAsImageResponseDescriptorType value) {
        this.disputeAsImageResponseDescriptor = value;
    }

}
