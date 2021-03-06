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
 * <p>Java class for FormatDQueueItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FormatDQueueItemType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}BatchQueueItemSID" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}VisaCaseNumber" minOccurs="0"/&gt;
 *         &lt;element name="FollowUpDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="CaseStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DaysToAct" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="DateToRespond" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="DisputeAmt" type="{http://www.visa.com/ROLSI}AmountType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}AccountNumber" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}Token" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}MemberCaseNumber" minOccurs="0"/&gt;
 *         &lt;element name="FraudBundleCaseNumber" type="{http://www.visa.com/ROLSI}VisaCaseNumberType" minOccurs="0"/&gt;
 *         &lt;element name="MemberStatus" type="{http://www.visa.com/ROLSI}DisputeMemberStatusType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}ARN" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}RetrievalReferenceNumber" minOccurs="0"/&gt;
 *         &lt;element name="User" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LastActionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}BIDName" minOccurs="0"/&gt;
 *         &lt;element name="MerchantName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}NetworkID" minOccurs="0"/&gt;
 *         &lt;element name="Jurisdiction" type="{http://www.visa.com/ROLSI}JurisdictionType" minOccurs="0"/&gt;
 *         &lt;element name="InternalId" type="{http://www.visa.com/ROLSI}InternalId" minOccurs="0"/&gt;
 *         &lt;element name="DCCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DCCodeDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}OnUsAffiliation" minOccurs="0"/&gt;
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
@XmlType(name = "FormatDQueueItemType", propOrder = {
    "batchQueueItemSID",
    "visaCaseNumber",
    "followUpDate",
    "caseStatus",
    "daysToAct",
    "dateToRespond",
    "disputeAmt",
    "accountNumber",
    "token",
    "memberCaseNumber",
    "fraudBundleCaseNumber",
    "memberStatus",
    "arn",
    "retrievalReferenceNumber",
    "user",
    "lastActionDate",
    "bidName",
    "merchantName",
    "networkID",
    "jurisdiction",
    "internalId",
    "dcCode",
    "dcCodeDescription",
    "onUsAffiliation",
    "parceladoCaseNumber"
})
public class FormatDQueueItemType {

    @XmlElement(name = "BatchQueueItemSID")
    protected Long batchQueueItemSID;
    @XmlElement(name = "VisaCaseNumber")
    protected Long visaCaseNumber;
    @XmlElement(name = "FollowUpDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar followUpDate;
    @XmlElement(name = "CaseStatus")
    protected String caseStatus;
    @XmlElement(name = "DaysToAct")
    protected Integer daysToAct;
    @XmlElement(name = "DateToRespond")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateToRespond;
    @XmlElement(name = "DisputeAmt")
    protected AmountType disputeAmt;
    @XmlElement(name = "AccountNumber")
    protected String accountNumber;
    @XmlElement(name = "Token")
    protected String token;
    @XmlElement(name = "MemberCaseNumber")
    protected String memberCaseNumber;
    @XmlElement(name = "FraudBundleCaseNumber")
    protected Long fraudBundleCaseNumber;
    @XmlElement(name = "MemberStatus")
    protected String memberStatus;
    @XmlElement(name = "ARN")
    protected String arn;
    @XmlElement(name = "RetrievalReferenceNumber")
    protected String retrievalReferenceNumber;
    @XmlElement(name = "User")
    protected String user;
    @XmlElement(name = "LastActionDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastActionDate;
    @XmlElement(name = "BIDName")
    protected String bidName;
    @XmlElement(name = "MerchantName")
    protected String merchantName;
    @XmlElement(name = "NetworkID")
    protected String networkID;
    @XmlElement(name = "Jurisdiction")
    protected JurisdictionType jurisdiction;
    @XmlElement(name = "InternalId")
    protected InternalId internalId;
    @XmlElement(name = "DCCode")
    protected String dcCode;
    @XmlElement(name = "DCCodeDescription")
    protected String dcCodeDescription;
    @XmlElement(name = "OnUsAffiliation")
    protected String onUsAffiliation;
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
     * Gets the value of the followUpDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFollowUpDate() {
        return followUpDate;
    }

    /**
     * Sets the value of the followUpDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFollowUpDate(XMLGregorianCalendar value) {
        this.followUpDate = value;
    }

    /**
     * Gets the value of the caseStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaseStatus() {
        return caseStatus;
    }

    /**
     * Sets the value of the caseStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaseStatus(String value) {
        this.caseStatus = value;
    }

    /**
     * Gets the value of the daysToAct property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDaysToAct() {
        return daysToAct;
    }

    /**
     * Sets the value of the daysToAct property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDaysToAct(Integer value) {
        this.daysToAct = value;
    }

    /**
     * Gets the value of the dateToRespond property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateToRespond() {
        return dateToRespond;
    }

    /**
     * Sets the value of the dateToRespond property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateToRespond(XMLGregorianCalendar value) {
        this.dateToRespond = value;
    }

    /**
     * Gets the value of the disputeAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getDisputeAmt() {
        return disputeAmt;
    }

    /**
     * Sets the value of the disputeAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setDisputeAmt(AmountType value) {
        this.disputeAmt = value;
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
     * Gets the value of the memberStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemberStatus() {
        return memberStatus;
    }

    /**
     * Sets the value of the memberStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMemberStatus(String value) {
        this.memberStatus = value;
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
     * Gets the value of the lastActionDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastActionDate() {
        return lastActionDate;
    }

    /**
     * Sets the value of the lastActionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastActionDate(XMLGregorianCalendar value) {
        this.lastActionDate = value;
    }

    /**
     * Gets the value of the bidName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBIDName() {
        return bidName;
    }

    /**
     * Sets the value of the bidName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBIDName(String value) {
        this.bidName = value;
    }

    /**
     * Gets the value of the merchantName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantName() {
        return merchantName;
    }

    /**
     * Sets the value of the merchantName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantName(String value) {
        this.merchantName = value;
    }

    /**
     * Gets the value of the networkID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetworkID() {
        return networkID;
    }

    /**
     * Sets the value of the networkID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetworkID(String value) {
        this.networkID = value;
    }

    /**
     * Gets the value of the jurisdiction property.
     * 
     * @return
     *     possible object is
     *     {@link JurisdictionType }
     *     
     */
    public JurisdictionType getJurisdiction() {
        return jurisdiction;
    }

    /**
     * Sets the value of the jurisdiction property.
     * 
     * @param value
     *     allowed object is
     *     {@link JurisdictionType }
     *     
     */
    public void setJurisdiction(JurisdictionType value) {
        this.jurisdiction = value;
    }

    /**
     * Gets the value of the internalId property.
     * 
     * @return
     *     possible object is
     *     {@link InternalId }
     *     
     */
    public InternalId getInternalId() {
        return internalId;
    }

    /**
     * Sets the value of the internalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link InternalId }
     *     
     */
    public void setInternalId(InternalId value) {
        this.internalId = value;
    }

    /**
     * Gets the value of the dcCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDCCode() {
        return dcCode;
    }

    /**
     * Sets the value of the dcCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDCCode(String value) {
        this.dcCode = value;
    }

    /**
     * Gets the value of the dcCodeDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDCCodeDescription() {
        return dcCodeDescription;
    }

    /**
     * Sets the value of the dcCodeDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDCCodeDescription(String value) {
        this.dcCodeDescription = value;
    }

    /**
     * Gets the value of the onUsAffiliation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOnUsAffiliation() {
        return onUsAffiliation;
    }

    /**
     * Sets the value of the onUsAffiliation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOnUsAffiliation(String value) {
        this.onUsAffiliation = value;
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
