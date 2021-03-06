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
 * <p>Java class for DisputeFraudType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DisputeFraudType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FraudType" type="{http://www.visa.com/ROLSI}FraudType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}CardStatusWhenTransactionHappened" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}FraudOtherExplanation" minOccurs="0"/&gt;
 *         &lt;element name="PinPreferringCard" type="{http://www.visa.com/ROLSI}YNType" minOccurs="0"/&gt;
 *         &lt;element name="PINPadPresentWorking" type="{http://www.visa.com/ROLSI}YNType" minOccurs="0"/&gt;
 *         &lt;element name="ChipOnCard" type="{http://www.visa.com/ROLSI}YNType" minOccurs="0"/&gt;
 *         &lt;element name="CardholderDidNotAuthorizeOrParticipate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CardholderDeniesAuthorizingInd" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CardholderOnlineBankingCertificationObtainedInd" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="UniqueIdentity" type="{http://www.visa.com/ROLSI}UniqueIdentityType" minOccurs="0"/&gt;
 *         &lt;element name="CardholderTeleBankingCertificationObtainedInd" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DateAndTimeOfCall" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="NameOfIssuerRepresentative" type="{http://www.visa.com/ROLSI}NameOfIssuerRepresentativeType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DisputeFraudType", propOrder = {
    "fraudType",
    "cardStatusWhenTransactionHappened",
    "fraudOtherExplanation",
    "pinPreferringCard",
    "pinPadPresentWorking",
    "chipOnCard",
    "cardholderDidNotAuthorizeOrParticipate",
    "cardholderDeniesAuthorizingInd",
    "cardholderOnlineBankingCertificationObtainedInd",
    "uniqueIdentity",
    "cardholderTeleBankingCertificationObtainedInd",
    "dateAndTimeOfCall",
    "nameOfIssuerRepresentative"
})
public class DisputeFraudType {

    @XmlElement(name = "FraudType")
    protected String fraudType;
    @XmlElement(name = "CardStatusWhenTransactionHappened")
    @XmlSchemaType(name = "string")
    protected CardStatusWhenTransactionHappenedType cardStatusWhenTransactionHappened;
    @XmlElement(name = "FraudOtherExplanation")
    protected String fraudOtherExplanation;
    @XmlElement(name = "PinPreferringCard")
    @XmlSchemaType(name = "string")
    protected YNType pinPreferringCard;
    @XmlElement(name = "PINPadPresentWorking")
    @XmlSchemaType(name = "string")
    protected YNType pinPadPresentWorking;
    @XmlElement(name = "ChipOnCard")
    @XmlSchemaType(name = "string")
    protected YNType chipOnCard;
    @XmlElement(name = "CardholderDidNotAuthorizeOrParticipate")
    protected Boolean cardholderDidNotAuthorizeOrParticipate;
    @XmlElement(name = "CardholderDeniesAuthorizingInd")
    protected Boolean cardholderDeniesAuthorizingInd;
    @XmlElement(name = "CardholderOnlineBankingCertificationObtainedInd")
    protected Boolean cardholderOnlineBankingCertificationObtainedInd;
    @XmlElement(name = "UniqueIdentity")
    protected String uniqueIdentity;
    @XmlElement(name = "CardholderTeleBankingCertificationObtainedInd")
    protected Boolean cardholderTeleBankingCertificationObtainedInd;
    @XmlElement(name = "DateAndTimeOfCall")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateAndTimeOfCall;
    @XmlElement(name = "NameOfIssuerRepresentative")
    protected String nameOfIssuerRepresentative;

    /**
     * Gets the value of the fraudType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFraudType() {
        return fraudType;
    }

    /**
     * Sets the value of the fraudType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFraudType(String value) {
        this.fraudType = value;
    }

    /**
     * Gets the value of the cardStatusWhenTransactionHappened property.
     * 
     * @return
     *     possible object is
     *     {@link CardStatusWhenTransactionHappenedType }
     *     
     */
    public CardStatusWhenTransactionHappenedType getCardStatusWhenTransactionHappened() {
        return cardStatusWhenTransactionHappened;
    }

    /**
     * Sets the value of the cardStatusWhenTransactionHappened property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardStatusWhenTransactionHappenedType }
     *     
     */
    public void setCardStatusWhenTransactionHappened(CardStatusWhenTransactionHappenedType value) {
        this.cardStatusWhenTransactionHappened = value;
    }

    /**
     * Gets the value of the fraudOtherExplanation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFraudOtherExplanation() {
        return fraudOtherExplanation;
    }

    /**
     * Sets the value of the fraudOtherExplanation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFraudOtherExplanation(String value) {
        this.fraudOtherExplanation = value;
    }

    /**
     * Gets the value of the pinPreferringCard property.
     * 
     * @return
     *     possible object is
     *     {@link YNType }
     *     
     */
    public YNType getPinPreferringCard() {
        return pinPreferringCard;
    }

    /**
     * Sets the value of the pinPreferringCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link YNType }
     *     
     */
    public void setPinPreferringCard(YNType value) {
        this.pinPreferringCard = value;
    }

    /**
     * Gets the value of the pinPadPresentWorking property.
     * 
     * @return
     *     possible object is
     *     {@link YNType }
     *     
     */
    public YNType getPINPadPresentWorking() {
        return pinPadPresentWorking;
    }

    /**
     * Sets the value of the pinPadPresentWorking property.
     * 
     * @param value
     *     allowed object is
     *     {@link YNType }
     *     
     */
    public void setPINPadPresentWorking(YNType value) {
        this.pinPadPresentWorking = value;
    }

    /**
     * Gets the value of the chipOnCard property.
     * 
     * @return
     *     possible object is
     *     {@link YNType }
     *     
     */
    public YNType getChipOnCard() {
        return chipOnCard;
    }

    /**
     * Sets the value of the chipOnCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link YNType }
     *     
     */
    public void setChipOnCard(YNType value) {
        this.chipOnCard = value;
    }

    /**
     * Gets the value of the cardholderDidNotAuthorizeOrParticipate property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCardholderDidNotAuthorizeOrParticipate() {
        return cardholderDidNotAuthorizeOrParticipate;
    }

    /**
     * Sets the value of the cardholderDidNotAuthorizeOrParticipate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCardholderDidNotAuthorizeOrParticipate(Boolean value) {
        this.cardholderDidNotAuthorizeOrParticipate = value;
    }

    /**
     * Gets the value of the cardholderDeniesAuthorizingInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCardholderDeniesAuthorizingInd() {
        return cardholderDeniesAuthorizingInd;
    }

    /**
     * Sets the value of the cardholderDeniesAuthorizingInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCardholderDeniesAuthorizingInd(Boolean value) {
        this.cardholderDeniesAuthorizingInd = value;
    }

    /**
     * Gets the value of the cardholderOnlineBankingCertificationObtainedInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCardholderOnlineBankingCertificationObtainedInd() {
        return cardholderOnlineBankingCertificationObtainedInd;
    }

    /**
     * Sets the value of the cardholderOnlineBankingCertificationObtainedInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCardholderOnlineBankingCertificationObtainedInd(Boolean value) {
        this.cardholderOnlineBankingCertificationObtainedInd = value;
    }

    /**
     * Gets the value of the uniqueIdentity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniqueIdentity() {
        return uniqueIdentity;
    }

    /**
     * Sets the value of the uniqueIdentity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniqueIdentity(String value) {
        this.uniqueIdentity = value;
    }

    /**
     * Gets the value of the cardholderTeleBankingCertificationObtainedInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCardholderTeleBankingCertificationObtainedInd() {
        return cardholderTeleBankingCertificationObtainedInd;
    }

    /**
     * Sets the value of the cardholderTeleBankingCertificationObtainedInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCardholderTeleBankingCertificationObtainedInd(Boolean value) {
        this.cardholderTeleBankingCertificationObtainedInd = value;
    }

    /**
     * Gets the value of the dateAndTimeOfCall property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateAndTimeOfCall() {
        return dateAndTimeOfCall;
    }

    /**
     * Sets the value of the dateAndTimeOfCall property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateAndTimeOfCall(XMLGregorianCalendar value) {
        this.dateAndTimeOfCall = value;
    }

    /**
     * Gets the value of the nameOfIssuerRepresentative property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameOfIssuerRepresentative() {
        return nameOfIssuerRepresentative;
    }

    /**
     * Sets the value of the nameOfIssuerRepresentative property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameOfIssuerRepresentative(String value) {
        this.nameOfIssuerRepresentative = value;
    }

}
