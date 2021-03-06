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
 * <p>Java class for InitiateOrFollowupType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InitiateOrFollowupType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}CollaborationType" minOccurs="0"/&gt;
 *         &lt;element name="LastDayToRespond" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}Source" minOccurs="0"/&gt;
 *         &lt;element name="CollaborationReason" type="{http://www.visa.com/ROLSI}Desc5000Type" minOccurs="0"/&gt;
 *         &lt;element name="CBRepreTimeframeExpiredInd" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CardholderMerchantNotificationOutsideOfCBRepreTimeframeInd" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ProvideInResponse" type="{http://www.visa.com/ROLSI}Desc5000Type"/&gt;
 *         &lt;element name="CollaborationAmount" type="{http://www.visa.com/ROLSI}AmountType" minOccurs="0"/&gt;
 *         &lt;element name="Notes" type="{http://www.visa.com/ROLSI}Desc5000Type" minOccurs="0"/&gt;
 *         &lt;element name="IssuerContactInfo" type="{http://www.visa.com/ROLSI}IssuerContactInfoType" minOccurs="0"/&gt;
 *         &lt;element name="AcquirerContactInfo" type="{http://www.visa.com/ROLSI}AcquirerContactInfoType" minOccurs="0"/&gt;
 *         &lt;element name="CardholderContactInfo" type="{http://www.visa.com/ROLSI}CardholderContactInfoType" minOccurs="0"/&gt;
 *         &lt;element name="MerchantContactInfo" type="{http://www.visa.com/ROLSI}CollabMerchantContactInfoType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InitiateOrFollowupType", propOrder = {
    "collaborationType",
    "lastDayToRespond",
    "source",
    "collaborationReason",
    "cbRepreTimeframeExpiredInd",
    "cardholderMerchantNotificationOutsideOfCBRepreTimeframeInd",
    "provideInResponse",
    "collaborationAmount",
    "notes",
    "issuerContactInfo",
    "acquirerContactInfo",
    "cardholderContactInfo",
    "merchantContactInfo"
})
public class InitiateOrFollowupType {

    @XmlElement(name = "CollaborationType")
    protected String collaborationType;
    @XmlElement(name = "LastDayToRespond")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar lastDayToRespond;
    @XmlElement(name = "Source")
    protected String source;
    @XmlElement(name = "CollaborationReason")
    protected String collaborationReason;
    @XmlElement(name = "CBRepreTimeframeExpiredInd")
    protected Boolean cbRepreTimeframeExpiredInd;
    @XmlElement(name = "CardholderMerchantNotificationOutsideOfCBRepreTimeframeInd")
    protected Boolean cardholderMerchantNotificationOutsideOfCBRepreTimeframeInd;
    @XmlElement(name = "ProvideInResponse", required = true)
    protected String provideInResponse;
    @XmlElement(name = "CollaborationAmount")
    protected AmountType collaborationAmount;
    @XmlElement(name = "Notes")
    protected String notes;
    @XmlElement(name = "IssuerContactInfo")
    protected IssuerContactInfoType issuerContactInfo;
    @XmlElement(name = "AcquirerContactInfo")
    protected AcquirerContactInfoType acquirerContactInfo;
    @XmlElement(name = "CardholderContactInfo")
    protected CardholderContactInfoType cardholderContactInfo;
    @XmlElement(name = "MerchantContactInfo")
    protected CollabMerchantContactInfoType merchantContactInfo;

    /**
     * Gets the value of the collaborationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollaborationType() {
        return collaborationType;
    }

    /**
     * Sets the value of the collaborationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCollaborationType(String value) {
        this.collaborationType = value;
    }

    /**
     * Gets the value of the lastDayToRespond property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastDayToRespond() {
        return lastDayToRespond;
    }

    /**
     * Sets the value of the lastDayToRespond property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastDayToRespond(XMLGregorianCalendar value) {
        this.lastDayToRespond = value;
    }

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSource(String value) {
        this.source = value;
    }

    /**
     * Gets the value of the collaborationReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollaborationReason() {
        return collaborationReason;
    }

    /**
     * Sets the value of the collaborationReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCollaborationReason(String value) {
        this.collaborationReason = value;
    }

    /**
     * Gets the value of the cbRepreTimeframeExpiredInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCBRepreTimeframeExpiredInd() {
        return cbRepreTimeframeExpiredInd;
    }

    /**
     * Sets the value of the cbRepreTimeframeExpiredInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCBRepreTimeframeExpiredInd(Boolean value) {
        this.cbRepreTimeframeExpiredInd = value;
    }

    /**
     * Gets the value of the cardholderMerchantNotificationOutsideOfCBRepreTimeframeInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCardholderMerchantNotificationOutsideOfCBRepreTimeframeInd() {
        return cardholderMerchantNotificationOutsideOfCBRepreTimeframeInd;
    }

    /**
     * Sets the value of the cardholderMerchantNotificationOutsideOfCBRepreTimeframeInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCardholderMerchantNotificationOutsideOfCBRepreTimeframeInd(Boolean value) {
        this.cardholderMerchantNotificationOutsideOfCBRepreTimeframeInd = value;
    }

    /**
     * Gets the value of the provideInResponse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvideInResponse() {
        return provideInResponse;
    }

    /**
     * Sets the value of the provideInResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvideInResponse(String value) {
        this.provideInResponse = value;
    }

    /**
     * Gets the value of the collaborationAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getCollaborationAmount() {
        return collaborationAmount;
    }

    /**
     * Sets the value of the collaborationAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setCollaborationAmount(AmountType value) {
        this.collaborationAmount = value;
    }

    /**
     * Gets the value of the notes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotes() {
        return notes;
    }

    /**
     * Sets the value of the notes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotes(String value) {
        this.notes = value;
    }

    /**
     * Gets the value of the issuerContactInfo property.
     * 
     * @return
     *     possible object is
     *     {@link IssuerContactInfoType }
     *     
     */
    public IssuerContactInfoType getIssuerContactInfo() {
        return issuerContactInfo;
    }

    /**
     * Sets the value of the issuerContactInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link IssuerContactInfoType }
     *     
     */
    public void setIssuerContactInfo(IssuerContactInfoType value) {
        this.issuerContactInfo = value;
    }

    /**
     * Gets the value of the acquirerContactInfo property.
     * 
     * @return
     *     possible object is
     *     {@link AcquirerContactInfoType }
     *     
     */
    public AcquirerContactInfoType getAcquirerContactInfo() {
        return acquirerContactInfo;
    }

    /**
     * Sets the value of the acquirerContactInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcquirerContactInfoType }
     *     
     */
    public void setAcquirerContactInfo(AcquirerContactInfoType value) {
        this.acquirerContactInfo = value;
    }

    /**
     * Gets the value of the cardholderContactInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CardholderContactInfoType }
     *     
     */
    public CardholderContactInfoType getCardholderContactInfo() {
        return cardholderContactInfo;
    }

    /**
     * Sets the value of the cardholderContactInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardholderContactInfoType }
     *     
     */
    public void setCardholderContactInfo(CardholderContactInfoType value) {
        this.cardholderContactInfo = value;
    }

    /**
     * Gets the value of the merchantContactInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CollabMerchantContactInfoType }
     *     
     */
    public CollabMerchantContactInfoType getMerchantContactInfo() {
        return merchantContactInfo;
    }

    /**
     * Sets the value of the merchantContactInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollabMerchantContactInfoType }
     *     
     */
    public void setMerchantContactInfo(CollabMerchantContactInfoType value) {
        this.merchantContactInfo = value;
    }

}
