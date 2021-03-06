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
 * <p>Java class for GoodFaithRespType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GoodFaithRespType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.visa.com/ROLSI}AbstractGoodFaithType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AdditionalInfo" type="{http://www.visa.com/ROLSI}DescType" minOccurs="0"/&gt;
 *         &lt;element name="DeclineReason" type="{http://www.visa.com/ROLSI}DescType" minOccurs="0"/&gt;
 *         &lt;element name="PaymentAmount" type="{http://www.visa.com/ROLSI}AmountType" minOccurs="0"/&gt;
 *         &lt;element name="WhenAmountSentDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}PaymentMethodCode" minOccurs="0"/&gt;
 *         &lt;element name="PaymentInstructions" type="{http://www.visa.com/ROLSI}Desc256Type" minOccurs="0"/&gt;
 *         &lt;element name="ResponseTypeCode"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="ACPT"/&gt;
 *               &lt;enumeration value="DECL"/&gt;
 *               &lt;enumeration value="NDMI"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}TimeLimitExpiredInd" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}InitCHNotificationTimeLimitExpiredInd" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GoodFaithRespType", propOrder = {
    "additionalInfo",
    "declineReason",
    "paymentAmount",
    "whenAmountSentDate",
    "paymentMethodCode",
    "paymentInstructions",
    "responseTypeCode",
    "timeLimitExpiredInd",
    "initCHNotificationTimeLimitExpiredInd"
})
public class GoodFaithRespType
    extends AbstractGoodFaithType
{

    @XmlElement(name = "AdditionalInfo")
    protected String additionalInfo;
    @XmlElement(name = "DeclineReason")
    protected String declineReason;
    @XmlElement(name = "PaymentAmount")
    protected AmountType paymentAmount;
    @XmlElement(name = "WhenAmountSentDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar whenAmountSentDate;
    @XmlElement(name = "PaymentMethodCode")
    protected String paymentMethodCode;
    @XmlElement(name = "PaymentInstructions")
    protected String paymentInstructions;
    @XmlElement(name = "ResponseTypeCode", required = true)
    protected String responseTypeCode;
    @XmlElement(name = "TimeLimitExpiredInd")
    protected Boolean timeLimitExpiredInd;
    @XmlElement(name = "InitCHNotificationTimeLimitExpiredInd")
    protected Boolean initCHNotificationTimeLimitExpiredInd;

    /**
     * Gets the value of the additionalInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalInfo() {
        return additionalInfo;
    }

    /**
     * Sets the value of the additionalInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalInfo(String value) {
        this.additionalInfo = value;
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
     * Gets the value of the paymentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getPaymentAmount() {
        return paymentAmount;
    }

    /**
     * Sets the value of the paymentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setPaymentAmount(AmountType value) {
        this.paymentAmount = value;
    }

    /**
     * Gets the value of the whenAmountSentDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getWhenAmountSentDate() {
        return whenAmountSentDate;
    }

    /**
     * Sets the value of the whenAmountSentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setWhenAmountSentDate(XMLGregorianCalendar value) {
        this.whenAmountSentDate = value;
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
     * Gets the value of the timeLimitExpiredInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTimeLimitExpiredInd() {
        return timeLimitExpiredInd;
    }

    /**
     * Sets the value of the timeLimitExpiredInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTimeLimitExpiredInd(Boolean value) {
        this.timeLimitExpiredInd = value;
    }

    /**
     * Gets the value of the initCHNotificationTimeLimitExpiredInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInitCHNotificationTimeLimitExpiredInd() {
        return initCHNotificationTimeLimitExpiredInd;
    }

    /**
     * Sets the value of the initCHNotificationTimeLimitExpiredInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInitCHNotificationTimeLimitExpiredInd(Boolean value) {
        this.initCHNotificationTimeLimitExpiredInd = value;
    }

}
