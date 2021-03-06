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
 * <p>Java class for RespondOrFollowupType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RespondOrFollowupType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}ResponseTypeCode" minOccurs="0"/&gt;
 *         &lt;element name="AcceptanceAmount" type="{http://www.visa.com/ROLSI}AmountType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}PaymentMethodCode" minOccurs="0"/&gt;
 *         &lt;element name="AmountSentDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="PaymentInstructions" type="{http://www.visa.com/ROLSI}Desc5000Type" minOccurs="0"/&gt;
 *         &lt;element name="AcceptPartialReason" type="{http://www.visa.com/ROLSI}Desc5000Type" minOccurs="0"/&gt;
 *         &lt;element name="DeclineReason" type="{http://www.visa.com/ROLSI}Desc5000Type" minOccurs="0"/&gt;
 *         &lt;element name="AdditionalInfoNeeded" type="{http://www.visa.com/ROLSI}Desc5000Type" minOccurs="0"/&gt;
 *         &lt;element name="FulfillmentInfo" type="{http://www.visa.com/ROLSI}Desc5000Type" minOccurs="0"/&gt;
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
@XmlType(name = "RespondOrFollowupType", propOrder = {
    "responseTypeCode",
    "acceptanceAmount",
    "paymentMethodCode",
    "amountSentDate",
    "paymentInstructions",
    "acceptPartialReason",
    "declineReason",
    "additionalInfoNeeded",
    "fulfillmentInfo",
    "notes",
    "issuerContactInfo",
    "acquirerContactInfo",
    "cardholderContactInfo",
    "merchantContactInfo"
})
public class RespondOrFollowupType {

    @XmlElement(name = "ResponseTypeCode")
    protected String responseTypeCode;
    @XmlElement(name = "AcceptanceAmount")
    protected AmountType acceptanceAmount;
    @XmlElement(name = "PaymentMethodCode")
    protected String paymentMethodCode;
    @XmlElement(name = "AmountSentDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar amountSentDate;
    @XmlElement(name = "PaymentInstructions")
    protected String paymentInstructions;
    @XmlElement(name = "AcceptPartialReason")
    protected String acceptPartialReason;
    @XmlElement(name = "DeclineReason")
    protected String declineReason;
    @XmlElement(name = "AdditionalInfoNeeded")
    protected String additionalInfoNeeded;
    @XmlElement(name = "FulfillmentInfo")
    protected String fulfillmentInfo;
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
     * Gets the value of the responseTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponseTypeCode() {
        return responseTypeCode;
    }

    /**
     * Sets the value of the responseTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponseTypeCode(String value) {
        this.responseTypeCode = value;
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
     * Gets the value of the paymentMethodCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentMethodCode() {
        return paymentMethodCode;
    }

    /**
     * Sets the value of the paymentMethodCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentMethodCode(String value) {
        this.paymentMethodCode = value;
    }

    /**
     * Gets the value of the amountSentDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAmountSentDate() {
        return amountSentDate;
    }

    /**
     * Sets the value of the amountSentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAmountSentDate(XMLGregorianCalendar value) {
        this.amountSentDate = value;
    }

    /**
     * Gets the value of the paymentInstructions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentInstructions() {
        return paymentInstructions;
    }

    /**
     * Sets the value of the paymentInstructions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentInstructions(String value) {
        this.paymentInstructions = value;
    }

    /**
     * Gets the value of the acceptPartialReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcceptPartialReason() {
        return acceptPartialReason;
    }

    /**
     * Sets the value of the acceptPartialReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcceptPartialReason(String value) {
        this.acceptPartialReason = value;
    }

    /**
     * Gets the value of the declineReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeclineReason() {
        return declineReason;
    }

    /**
     * Sets the value of the declineReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeclineReason(String value) {
        this.declineReason = value;
    }

    /**
     * Gets the value of the additionalInfoNeeded property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalInfoNeeded() {
        return additionalInfoNeeded;
    }

    /**
     * Sets the value of the additionalInfoNeeded property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalInfoNeeded(String value) {
        this.additionalInfoNeeded = value;
    }

    /**
     * Gets the value of the fulfillmentInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFulfillmentInfo() {
        return fulfillmentInfo;
    }

    /**
     * Sets the value of the fulfillmentInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFulfillmentInfo(String value) {
        this.fulfillmentInfo = value;
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
