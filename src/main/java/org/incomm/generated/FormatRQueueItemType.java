//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.02.13 at 11:38:26 AM EST 
//


package org.incomm.generated;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for FormatRQueueItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FormatRQueueItemType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}BatchQueueItemSID" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}VisaCaseNumber" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}MasterCaseNumber" minOccurs="0"/&gt;
 *         &lt;element name="RejectedTransactionType" type="{http://www.visa.com/ROLSI}RejectedTransactionTypeType" minOccurs="0"/&gt;
 *         &lt;element name="Reason" type="{http://www.visa.com/ROLSI}ReasonType" minOccurs="0"/&gt;
 *         &lt;element name="DaysAged" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}Amount" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{http://www.visa.com/ROLSI}AccountNumber" minOccurs="0"/&gt;
 *           &lt;group ref="{http://www.visa.com/ROLSI}PANlessFieldGroup" minOccurs="0"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="User" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}RejectID" minOccurs="0"/&gt;
 *         &lt;element name="RejectReason" type="{http://www.visa.com/ROLSI}ReasonType" maxOccurs="50" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}MemberCaseNumber" minOccurs="0"/&gt;
 *         &lt;element name="FraudBundleCaseNumber" type="{http://www.visa.com/ROLSI}VisaCaseNumberType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}ARN" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}RetrievalReferenceNumber" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}Token" minOccurs="0"/&gt;
 *         &lt;element name="DateAdded" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="ERRequestedInd" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ParceladoCaseNumber" type="{http://www.visa.com/ROLSI}VisaCaseNumberType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FormatRQueueItemType", propOrder = {
    "batchQueueItemSID",
    "visaCaseNumber",
    "masterCaseNumber",
    "rejectedTransactionType",
    "reason",
    "daysAged",
    "amount",
    "accountNumber",
    "trn",
    "consumerAccountNumber",
    "checkNumber",
    "user",
    "rejectID",
    "rejectReason",
    "memberCaseNumber",
    "fraudBundleCaseNumber",
    "arn",
    "retrievalReferenceNumber",
    "token",
    "dateAdded",
    "erRequestedInd",
    "parceladoCaseNumber"
})
public class FormatRQueueItemType {

    @XmlElement(name = "BatchQueueItemSID")
    protected Long batchQueueItemSID;
    @XmlElement(name = "VisaCaseNumber")
    protected Long visaCaseNumber;
    @XmlElement(name = "MasterCaseNumber")
    protected Long masterCaseNumber;
    @XmlElement(name = "RejectedTransactionType")
    protected RejectedTransactionTypeType rejectedTransactionType;
    @XmlElement(name = "Reason")
    protected ReasonType reason;
    @XmlElement(name = "DaysAged")
    protected BigInteger daysAged;
    @XmlElement(name = "Amount")
    protected AmountType amount;
    @XmlElement(name = "AccountNumber")
    protected String accountNumber;
    @XmlElement(name = "TRN")
    protected String trn;
    @XmlElement(name = "ConsumerAccountNumber")
    protected String consumerAccountNumber;
    @XmlElement(name = "CheckNumber")
    protected String checkNumber;
    @XmlElement(name = "User")
    protected String user;
    @XmlElement(name = "RejectID")
    protected Long rejectID;
    @XmlElement(name = "RejectReason")
    protected List<ReasonType> rejectReason;
    @XmlElement(name = "MemberCaseNumber")
    protected String memberCaseNumber;
    @XmlElement(name = "FraudBundleCaseNumber")
    protected Long fraudBundleCaseNumber;
    @XmlElement(name = "ARN")
    protected String arn;
    @XmlElement(name = "RetrievalReferenceNumber")
    protected String retrievalReferenceNumber;
    @XmlElement(name = "Token")
    protected String token;
    @XmlElement(name = "DateAdded")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateAdded;
    @XmlElement(name = "ERRequestedInd")
    protected Boolean erRequestedInd;
    @XmlElement(name = "ParceladoCaseNumber")
    protected Long parceladoCaseNumber;

    /**
     * Gets the value of the batchQueueItemSID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBatchQueueItemSID() {
        return batchQueueItemSID;
    }

    /**
     * Sets the value of the batchQueueItemSID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBatchQueueItemSID(Long value) {
        this.batchQueueItemSID = value;
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
     * Gets the value of the masterCaseNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMasterCaseNumber() {
        return masterCaseNumber;
    }

    /**
     * Sets the value of the masterCaseNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMasterCaseNumber(Long value) {
        this.masterCaseNumber = value;
    }

    /**
     * Gets the value of the rejectedTransactionType property.
     * 
     * @return
     *     possible object is
     *     {@link RejectedTransactionTypeType }
     *     
     */
    public RejectedTransactionTypeType getRejectedTransactionType() {
        return rejectedTransactionType;
    }

    /**
     * Sets the value of the rejectedTransactionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RejectedTransactionTypeType }
     *     
     */
    public void setRejectedTransactionType(RejectedTransactionTypeType value) {
        this.rejectedTransactionType = value;
    }

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link ReasonType }
     *     
     */
    public ReasonType getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReasonType }
     *     
     */
    public void setReason(ReasonType value) {
        this.reason = value;
    }

    /**
     * Gets the value of the daysAged property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDaysAged() {
        return daysAged;
    }

    /**
     * Sets the value of the daysAged property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDaysAged(BigInteger value) {
        this.daysAged = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setAmount(AmountType value) {
        this.amount = value;
    }

    /**
     * Gets the value of the accountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * Sets the value of the accountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountNumber(String value) {
        this.accountNumber = value;
    }

    /**
     * Gets the value of the trn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTRN() {
        return trn;
    }

    /**
     * Sets the value of the trn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTRN(String value) {
        this.trn = value;
    }

    /**
     * Gets the value of the consumerAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsumerAccountNumber() {
        return consumerAccountNumber;
    }

    /**
     * Sets the value of the consumerAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsumerAccountNumber(String value) {
        this.consumerAccountNumber = value;
    }

    /**
     * Gets the value of the checkNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckNumber() {
        return checkNumber;
    }

    /**
     * Sets the value of the checkNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckNumber(String value) {
        this.checkNumber = value;
    }

    /**
     * Gets the value of the user property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUser() {
        return user;
    }

    /**
     * Sets the value of the user property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUser(String value) {
        this.user = value;
    }

    /**
     * Gets the value of the rejectID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRejectID() {
        return rejectID;
    }

    /**
     * Sets the value of the rejectID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRejectID(Long value) {
        this.rejectID = value;
    }

    /**
     * Gets the value of the rejectReason property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rejectReason property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRejectReason().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReasonType }
     * 
     * 
     */
    public List<ReasonType> getRejectReason() {
        if (rejectReason == null) {
            rejectReason = new ArrayList<ReasonType>();
        }
        return this.rejectReason;
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
     * Gets the value of the fraudBundleCaseNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFraudBundleCaseNumber() {
        return fraudBundleCaseNumber;
    }

    /**
     * Sets the value of the fraudBundleCaseNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFraudBundleCaseNumber(Long value) {
        this.fraudBundleCaseNumber = value;
    }

    /**
     * Gets the value of the arn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getARN() {
        return arn;
    }

    /**
     * Sets the value of the arn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setARN(String value) {
        this.arn = value;
    }

    /**
     * Gets the value of the retrievalReferenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRetrievalReferenceNumber() {
        return retrievalReferenceNumber;
    }

    /**
     * Sets the value of the retrievalReferenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRetrievalReferenceNumber(String value) {
        this.retrievalReferenceNumber = value;
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
     * Gets the value of the dateAdded property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateAdded() {
        return dateAdded;
    }

    /**
     * Sets the value of the dateAdded property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateAdded(XMLGregorianCalendar value) {
        this.dateAdded = value;
    }

    /**
     * Gets the value of the erRequestedInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isERRequestedInd() {
        return erRequestedInd;
    }

    /**
     * Sets the value of the erRequestedInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setERRequestedInd(Boolean value) {
        this.erRequestedInd = value;
    }

    /**
     * Gets the value of the parceladoCaseNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getParceladoCaseNumber() {
        return parceladoCaseNumber;
    }

    /**
     * Sets the value of the parceladoCaseNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setParceladoCaseNumber(Long value) {
        this.parceladoCaseNumber = value;
    }

}
