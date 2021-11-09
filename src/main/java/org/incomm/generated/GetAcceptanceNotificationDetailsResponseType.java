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
 * <p>Java class for GetAcceptanceNotificationDetailsResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetAcceptanceNotificationDetailsResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}TransactionInfo" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}VisaCaseNumber" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}MemberCaseNumber" minOccurs="0"/&gt;
 *         &lt;element name="AcceptItemID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="AcceptItemType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DisputeCategory" type="{http://www.visa.com/ROLSI}DisputeCategoryType" minOccurs="0"/&gt;
 *         &lt;element name="AcceptanceAmount" type="{http://www.visa.com/ROLSI}AmountType" minOccurs="0"/&gt;
 *         &lt;element name="AcceptanceDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetAcceptanceNotificationDetailsResponseType", propOrder = {
    "transactionInfo",
    "visaCaseNumber",
    "memberCaseNumber",
    "acceptItemID",
    "acceptItemType",
    "disputeCategory",
    "acceptanceAmount",
    "acceptanceDateTime"
})
public class GetAcceptanceNotificationDetailsResponseType {

    @XmlElement(name = "TransactionInfo")
    protected TranHeaderInfoType transactionInfo;
    @XmlElement(name = "VisaCaseNumber")
    protected Long visaCaseNumber;
    @XmlElement(name = "MemberCaseNumber")
    protected String memberCaseNumber;
    @XmlElement(name = "AcceptItemID")
    protected Long acceptItemID;
    @XmlElement(name = "AcceptItemType")
    protected String acceptItemType;
    @XmlElement(name = "DisputeCategory")
    protected DisputeCategoryType disputeCategory;
    @XmlElement(name = "AcceptanceAmount")
    protected AmountType acceptanceAmount;
    @XmlElement(name = "AcceptanceDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar acceptanceDateTime;

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
     * Gets the value of the acceptItemID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAcceptItemID() {
        return acceptItemID;
    }

    /**
     * Sets the value of the acceptItemID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAcceptItemID(Long value) {
        this.acceptItemID = value;
    }

    /**
     * Gets the value of the acceptItemType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcceptItemType() {
        return acceptItemType;
    }

    /**
     * Sets the value of the acceptItemType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcceptItemType(String value) {
        this.acceptItemType = value;
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
     * Gets the value of the acceptanceAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getAcceptanceAmount() {
        return acceptanceAmount;
    }

    /**
     * Sets the value of the acceptanceAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setAcceptanceAmount(AmountType value) {
        this.acceptanceAmount = value;
    }

    /**
     * Gets the value of the acceptanceDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAcceptanceDateTime() {
        return acceptanceDateTime;
    }

    /**
     * Sets the value of the acceptanceDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAcceptanceDateTime(XMLGregorianCalendar value) {
        this.acceptanceDateTime = value;
    }

}
