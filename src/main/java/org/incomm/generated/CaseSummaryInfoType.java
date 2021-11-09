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
 * @direction: Response
 * 
 * <p>Java class for CaseSummaryInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CaseSummaryInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}VisaCaseNumber" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}MemberCaseNumber" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{http://www.visa.com/ROLSI}AccountNumber" minOccurs="0"/&gt;
 *           &lt;group ref="{http://www.visa.com/ROLSI}PANlessFieldGroup" minOccurs="0"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}ARN" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}DisputeGroupCode" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}DisputeReasonCode" minOccurs="0"/&gt;
 *         &lt;element name="DisputeJurisdiction" type="{http://www.visa.com/ROLSI}JurisdictionType" minOccurs="0"/&gt;
 *         &lt;group ref="{http://www.visa.com/ROLSI}TranGroup"/&gt;
 *         &lt;element name="MemberDisputeStage" type="{http://www.visa.com/ROLSI}DisputeStageType" minOccurs="0"/&gt;
 *         &lt;element name="DocumentationType" type="{http://www.visa.com/ROLSI}DisputeStageType" minOccurs="0"/&gt;
 *         &lt;element name="CaseStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LastActionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="DaysToAct" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ToBIN" type="{http://www.visa.com/ROLSI}BINType" minOccurs="0"/&gt;
 *         &lt;element name="FromBIN" type="{http://www.visa.com/ROLSI}BINType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}AcquirerBIN" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}RetrievalReferenceNumber" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}SystemTraceAuditNumber" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}CaseResolutionStatus" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{http://www.visa.com/ROLSI}MasterCaseNumber" minOccurs="0"/&gt;
 *           &lt;element name="SubordinateCases" type="{http://www.visa.com/ROLSI}SubordinateCasesCollectionType" minOccurs="0"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}RegERegZExpirationDate" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}NetworkID" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}DisputeAmt" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}OnUsAffiliation" minOccurs="0"/&gt;
 *         &lt;element name="OctMRDowngradeInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ATMCaseInd" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}CaseType" minOccurs="0"/&gt;
 *         &lt;element name="LastDateToAct" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="AssignedAnalyst" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}FollowUpDate" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}FraudClassification" minOccurs="0"/&gt;
 *         &lt;element name="FraudBundleCaseNumber" type="{http://www.visa.com/ROLSI}VisaCaseNumberType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}PriorityCaseInd" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}RegEIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}PurchaseInquiryEligibleInd" minOccurs="0"/&gt;
 *         &lt;element name="VROLProductType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MemberStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CaseSummaryInfoType", propOrder = {
    "visaCaseNumber",
    "memberCaseNumber",
    "accountNumber",
    "trn",
    "consumerAccountNumber",
    "checkNumber",
    "arn",
    "disputeGroupCode",
    "disputeReasonCode",
    "disputeJurisdiction",
    "transactionID",
    "transactionDate",
    "transactionAmount",
    "memberDisputeStage",
    "documentationType",
    "caseStatus",
    "lastActionDate",
    "daysToAct",
    "toBIN",
    "fromBIN",
    "acquirerBIN",
    "retrievalReferenceNumber",
    "systemTraceAuditNumber",
    "caseResolutionStatus",
    "masterCaseNumber",
    "subordinateCases",
    "regERegZExpirationDate",
    "networkID",
    "disputeAmt",
    "onUsAffiliation",
    "octMRDowngradeInd",
    "atmCaseInd",
    "caseType",
    "lastDateToAct",
    "assignedAnalyst",
    "followUpDate",
    "fraudClassification",
    "fraudBundleCaseNumber",
    "priorityCaseInd",
    "regEIndicator",
    "purchaseInquiryEligibleInd",
    "vrolProductType",
    "memberStatus"
})
public class CaseSummaryInfoType {

    @XmlElement(name = "VisaCaseNumber")
    protected Long visaCaseNumber;
    @XmlElement(name = "MemberCaseNumber")
    protected String memberCaseNumber;
    @XmlElement(name = "AccountNumber")
    protected String accountNumber;
    @XmlElement(name = "TRN")
    protected String trn;
    @XmlElement(name = "ConsumerAccountNumber")
    protected String consumerAccountNumber;
    @XmlElement(name = "CheckNumber")
    protected String checkNumber;
    @XmlElement(name = "ARN")
    protected String arn;
    @XmlElement(name = "DisputeGroupCode")
    protected String disputeGroupCode;
    @XmlElement(name = "DisputeReasonCode")
    protected String disputeReasonCode;
    @XmlElement(name = "DisputeJurisdiction")
    protected JurisdictionType disputeJurisdiction;
    @XmlElement(name = "TransactionID")
    protected String transactionID;
    @XmlElement(name = "TransactionDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar transactionDate;
    @XmlElement(name = "TransactionAmount")
    protected AmountType transactionAmount;
    @XmlElement(name = "MemberDisputeStage")
    @XmlSchemaType(name = "string")
    protected DisputeStageType memberDisputeStage;
    @XmlElement(name = "DocumentationType")
    @XmlSchemaType(name = "string")
    protected DisputeStageType documentationType;
    @XmlElement(name = "CaseStatus")
    protected String caseStatus;
    @XmlElement(name = "LastActionDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastActionDate;
    @XmlElement(name = "DaysToAct")
    protected Integer daysToAct;
    @XmlElement(name = "ToBIN")
    protected String toBIN;
    @XmlElement(name = "FromBIN")
    protected String fromBIN;
    @XmlElement(name = "AcquirerBIN")
    protected String acquirerBIN;
    @XmlElement(name = "RetrievalReferenceNumber")
    protected String retrievalReferenceNumber;
    @XmlElement(name = "SystemTraceAuditNumber")
    protected String systemTraceAuditNumber;
    @XmlElement(name = "CaseResolutionStatus")
    protected String caseResolutionStatus;
    @XmlElement(name = "MasterCaseNumber")
    protected Long masterCaseNumber;
    @XmlElement(name = "SubordinateCases")
    protected SubordinateCasesCollectionType subordinateCases;
    @XmlElement(name = "RegERegZExpirationDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar regERegZExpirationDate;
    @XmlElement(name = "NetworkID")
    protected String networkID;
    @XmlElement(name = "DisputeAmt")
    protected AmountType disputeAmt;
    @XmlElement(name = "OnUsAffiliation")
    protected String onUsAffiliation;
    @XmlElement(name = "OctMRDowngradeInd")
    protected String octMRDowngradeInd;
    @XmlElement(name = "ATMCaseInd")
    protected Boolean atmCaseInd;
    @XmlElement(name = "CaseType")
    protected String caseType;
    @XmlElement(name = "LastDateToAct")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar lastDateToAct;
    @XmlElement(name = "AssignedAnalyst")
    protected String assignedAnalyst;
    @XmlElement(name = "FollowUpDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar followUpDate;
    @XmlElement(name = "FraudClassification")
    protected String fraudClassification;
    @XmlElement(name = "FraudBundleCaseNumber")
    protected Long fraudBundleCaseNumber;
    @XmlElement(name = "PriorityCaseInd")
    protected Boolean priorityCaseInd;
    @XmlElement(name = "RegEIndicator")
    protected Boolean regEIndicator;
    @XmlElement(name = "PurchaseInquiryEligibleInd")
    protected Boolean purchaseInquiryEligibleInd;
    @XmlElement(name = "VROLProductType")
    protected String vrolProductType;
    @XmlElement(name = "MemberStatus")
    protected String memberStatus;

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
     * Gets the value of the disputeGroupCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisputeGroupCode() {
        return disputeGroupCode;
    }

    /**
     * Sets the value of the disputeGroupCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisputeGroupCode(String value) {
        this.disputeGroupCode = value;
    }

    /**
     * Gets the value of the disputeReasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisputeReasonCode() {
        return disputeReasonCode;
    }

    /**
     * Sets the value of the disputeReasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisputeReasonCode(String value) {
        this.disputeReasonCode = value;
    }

    /**
     * Gets the value of the disputeJurisdiction property.
     * 
     * @return
     *     possible object is
     *     {@link JurisdictionType }
     *     
     */
    public JurisdictionType getDisputeJurisdiction() {
        return disputeJurisdiction;
    }

    /**
     * Sets the value of the disputeJurisdiction property.
     * 
     * @param value
     *     allowed object is
     *     {@link JurisdictionType }
     *     
     */
    public void setDisputeJurisdiction(JurisdictionType value) {
        this.disputeJurisdiction = value;
    }

    /**
     * Gets the value of the transactionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionID() {
        return transactionID;
    }

    /**
     * Sets the value of the transactionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionID(String value) {
        this.transactionID = value;
    }

    /**
     * Gets the value of the transactionDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTransactionDate() {
        return transactionDate;
    }

    /**
     * Sets the value of the transactionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTransactionDate(XMLGregorianCalendar value) {
        this.transactionDate = value;
    }

    /**
     * Gets the value of the transactionAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTransactionAmount() {
        return transactionAmount;
    }

    /**
     * Sets the value of the transactionAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setTransactionAmount(AmountType value) {
        this.transactionAmount = value;
    }

    /**
     * Gets the value of the memberDisputeStage property.
     * 
     * @return
     *     possible object is
     *     {@link DisputeStageType }
     *     
     */
    public DisputeStageType getMemberDisputeStage() {
        return memberDisputeStage;
    }

    /**
     * Sets the value of the memberDisputeStage property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisputeStageType }
     *     
     */
    public void setMemberDisputeStage(DisputeStageType value) {
        this.memberDisputeStage = value;
    }

    /**
     * Gets the value of the documentationType property.
     * 
     * @return
     *     possible object is
     *     {@link DisputeStageType }
     *     
     */
    public DisputeStageType getDocumentationType() {
        return documentationType;
    }

    /**
     * Sets the value of the documentationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisputeStageType }
     *     
     */
    public void setDocumentationType(DisputeStageType value) {
        this.documentationType = value;
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
     * Gets the value of the toBIN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToBIN() {
        return toBIN;
    }

    /**
     * Sets the value of the toBIN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToBIN(String value) {
        this.toBIN = value;
    }

    /**
     * Gets the value of the fromBIN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromBIN() {
        return fromBIN;
    }

    /**
     * Sets the value of the fromBIN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromBIN(String value) {
        this.fromBIN = value;
    }

    /**
     * Gets the value of the acquirerBIN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcquirerBIN() {
        return acquirerBIN;
    }

    /**
     * Sets the value of the acquirerBIN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcquirerBIN(String value) {
        this.acquirerBIN = value;
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
     * Gets the value of the systemTraceAuditNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSystemTraceAuditNumber() {
        return systemTraceAuditNumber;
    }

    /**
     * Sets the value of the systemTraceAuditNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSystemTraceAuditNumber(String value) {
        this.systemTraceAuditNumber = value;
    }

    /**
     * @direction: Response
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaseResolutionStatus() {
        return caseResolutionStatus;
    }

    /**
     * Sets the value of the caseResolutionStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaseResolutionStatus(String value) {
        this.caseResolutionStatus = value;
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
     * Gets the value of the subordinateCases property.
     * 
     * @return
     *     possible object is
     *     {@link SubordinateCasesCollectionType }
     *     
     */
    public SubordinateCasesCollectionType getSubordinateCases() {
        return subordinateCases;
    }

    /**
     * Sets the value of the subordinateCases property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubordinateCasesCollectionType }
     *     
     */
    public void setSubordinateCases(SubordinateCasesCollectionType value) {
        this.subordinateCases = value;
    }

    /**
     * Gets the value of the regERegZExpirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRegERegZExpirationDate() {
        return regERegZExpirationDate;
    }

    /**
     * Sets the value of the regERegZExpirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRegERegZExpirationDate(XMLGregorianCalendar value) {
        this.regERegZExpirationDate = value;
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
     * Gets the value of the octMRDowngradeInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOctMRDowngradeInd() {
        return octMRDowngradeInd;
    }

    /**
     * Sets the value of the octMRDowngradeInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOctMRDowngradeInd(String value) {
        this.octMRDowngradeInd = value;
    }

    /**
     * Gets the value of the atmCaseInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isATMCaseInd() {
        return atmCaseInd;
    }

    /**
     * Sets the value of the atmCaseInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setATMCaseInd(Boolean value) {
        this.atmCaseInd = value;
    }

    /**
     * Gets the value of the caseType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaseType() {
        return caseType;
    }

    /**
     * Sets the value of the caseType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaseType(String value) {
        this.caseType = value;
    }

    /**
     * Gets the value of the lastDateToAct property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastDateToAct() {
        return lastDateToAct;
    }

    /**
     * Sets the value of the lastDateToAct property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastDateToAct(XMLGregorianCalendar value) {
        this.lastDateToAct = value;
    }

    /**
     * Gets the value of the assignedAnalyst property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssignedAnalyst() {
        return assignedAnalyst;
    }

    /**
     * Sets the value of the assignedAnalyst property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssignedAnalyst(String value) {
        this.assignedAnalyst = value;
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
     * Gets the value of the fraudClassification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFraudClassification() {
        return fraudClassification;
    }

    /**
     * Sets the value of the fraudClassification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFraudClassification(String value) {
        this.fraudClassification = value;
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
     * Gets the value of the priorityCaseInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPriorityCaseInd() {
        return priorityCaseInd;
    }

    /**
     * Sets the value of the priorityCaseInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPriorityCaseInd(Boolean value) {
        this.priorityCaseInd = value;
    }

    /**
     * Gets the value of the regEIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRegEIndicator() {
        return regEIndicator;
    }

    /**
     * Sets the value of the regEIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRegEIndicator(Boolean value) {
        this.regEIndicator = value;
    }

    /**
     * Gets the value of the purchaseInquiryEligibleInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPurchaseInquiryEligibleInd() {
        return purchaseInquiryEligibleInd;
    }

    /**
     * Sets the value of the purchaseInquiryEligibleInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPurchaseInquiryEligibleInd(Boolean value) {
        this.purchaseInquiryEligibleInd = value;
    }

    /**
     * Gets the value of the vrolProductType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVROLProductType() {
        return vrolProductType;
    }

    /**
     * Sets the value of the vrolProductType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVROLProductType(String value) {
        this.vrolProductType = value;
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

}
