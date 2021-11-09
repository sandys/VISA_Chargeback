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
 * <p>Java class for CreateDisputePreCompRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreateDisputePreCompRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}VisaCaseNumber"/&gt;
 *         &lt;element name="RolTransactionId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}DisputePreCompId" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}MemberCaseNumber" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}DisputeAmount" minOccurs="0"/&gt;
 *         &lt;element name="CaseInformation" type="{http://www.visa.com/ROLSI}DisputeCaseInformationType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}CardholderInfo" minOccurs="0"/&gt;
 *         &lt;element name="AccountOwnerInfo" type="{http://www.visa.com/ROLSI}DisputeAccountOwnerContactInfoType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}MerchantContactInfo" minOccurs="0"/&gt;
 *         &lt;element name="Note" type="{http://www.visa.com/ROLSI}NoteType" minOccurs="0"/&gt;
 *         &lt;element name="IssuerAcquirerContactInfo" type="{http://www.visa.com/ROLSI}IssuerAcquirerContactInfoType" minOccurs="0"/&gt;
 *         &lt;element name="DisputeAmountChangeReason" type="{http://www.visa.com/ROLSI}Desc10000Type" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}ExplanationOfCreditPresented" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}InitiatePreFilingReason" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}FirstRuleViolatedCode" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}SecondRuleViolatedCode" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}ThirdRuleViolatedCode" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}RulesViolatedAdditionalInfo" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}ViolationDate" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}ViolationDiscoveryDate" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}ViolationDiscoveryDateInfo" minOccurs="0"/&gt;
 *         &lt;element name="FinancialLossOccurInd" type="{http://www.visa.com/ROLSI}YNType" minOccurs="0"/&gt;
 *         &lt;element name="FinancialLossExplanation" type="{http://www.visa.com/ROLSI}Desc5000Type" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}DisputeAttachmentDescriptor" minOccurs="0"/&gt;
 *         &lt;element name="DocIdList" type="{http://www.visa.com/ROLSI}DocIdListType" minOccurs="0"/&gt;
 *         &lt;element name="Action" type="{http://www.visa.com/ROLSI}DisputeCaseActionType" minOccurs="0"/&gt;
 *         &lt;element name="ProvisionalCreditInformation" type="{http://www.visa.com/ROLSI}DisputeProvisionalCreditInfoType" minOccurs="0"/&gt;
 *         &lt;element name="SupplyDocInd" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateDisputePreCompRequestType", propOrder = {
    "visaCaseNumber",
    "rolTransactionId",
    "disputePreCompId",
    "memberCaseNumber",
    "disputeAmount",
    "caseInformation",
    "cardholderInfo",
    "accountOwnerInfo",
    "merchantContactInfo",
    "note",
    "issuerAcquirerContactInfo",
    "disputeAmountChangeReason",
    "explanationOfCreditPresented",
    "initiatePreFilingReason",
    "firstRuleViolatedCode",
    "secondRuleViolatedCode",
    "thirdRuleViolatedCode",
    "rulesViolatedAdditionalInfo",
    "violationDate",
    "violationDiscoveryDate",
    "violationDiscoveryDateInfo",
    "financialLossOccurInd",
    "financialLossExplanation",
    "disputeAttachmentDescriptor",
    "docIdList",
    "action",
    "provisionalCreditInformation",
    "supplyDocInd"
})
public class CreateDisputePreCompRequestType {

    @XmlElement(name = "VisaCaseNumber")
    protected long visaCaseNumber;
    @XmlElement(name = "RolTransactionId")
    protected Long rolTransactionId;
    @XmlElement(name = "DisputePreCompId")
    protected Long disputePreCompId;
    @XmlElement(name = "MemberCaseNumber")
    protected String memberCaseNumber;
    @XmlElement(name = "DisputeAmount")
    protected AmountType disputeAmount;
    @XmlElement(name = "CaseInformation")
    protected DisputeCaseInformationType caseInformation;
    @XmlElement(name = "CardholderInfo")
    protected AdditionalCardholderInfoType cardholderInfo;
    @XmlElement(name = "AccountOwnerInfo")
    protected DisputeAccountOwnerContactInfoType accountOwnerInfo;
    @XmlElement(name = "MerchantContactInfo")
    protected MerchantContactInfoType merchantContactInfo;
    @XmlElement(name = "Note")
    protected String note;
    @XmlElement(name = "IssuerAcquirerContactInfo")
    protected IssuerAcquirerContactInfoType issuerAcquirerContactInfo;
    @XmlElement(name = "DisputeAmountChangeReason")
    protected String disputeAmountChangeReason;
    @XmlElement(name = "ExplanationOfCreditPresented")
    protected String explanationOfCreditPresented;
    @XmlElement(name = "InitiatePreFilingReason")
    protected String initiatePreFilingReason;
    @XmlElement(name = "FirstRuleViolatedCode")
    protected String firstRuleViolatedCode;
    @XmlElement(name = "SecondRuleViolatedCode")
    protected String secondRuleViolatedCode;
    @XmlElement(name = "ThirdRuleViolatedCode")
    protected String thirdRuleViolatedCode;
    @XmlElement(name = "RulesViolatedAdditionalInfo")
    protected String rulesViolatedAdditionalInfo;
    @XmlElement(name = "ViolationDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar violationDate;
    @XmlElement(name = "ViolationDiscoveryDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar violationDiscoveryDate;
    @XmlElement(name = "ViolationDiscoveryDateInfo")
    protected String violationDiscoveryDateInfo;
    @XmlElement(name = "FinancialLossOccurInd")
    @XmlSchemaType(name = "string")
    protected YNType financialLossOccurInd;
    @XmlElement(name = "FinancialLossExplanation")
    protected String financialLossExplanation;
    @XmlElement(name = "DisputeAttachmentDescriptor")
    protected DisputeAttachmentDescriptorType disputeAttachmentDescriptor;
    @XmlElement(name = "DocIdList")
    protected DocIdListType docIdList;
    @XmlElement(name = "Action")
    @XmlSchemaType(name = "string")
    protected DisputeCaseActionType action;
    @XmlElement(name = "ProvisionalCreditInformation")
    protected DisputeProvisionalCreditInfoType provisionalCreditInformation;
    @XmlElement(name = "SupplyDocInd")
    protected Boolean supplyDocInd;

    /**
     * Gets the value of the visaCaseNumber property.
     * 
     */
    public long getVisaCaseNumber() {
        return visaCaseNumber;
    }

    /**
     * Sets the value of the visaCaseNumber property.
     * 
     */
    public void setVisaCaseNumber(long value) {
        this.visaCaseNumber = value;
    }

    /**
     * Gets the value of the rolTransactionId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRolTransactionId() {
        return rolTransactionId;
    }

    /**
     * Sets the value of the rolTransactionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRolTransactionId(Long value) {
        this.rolTransactionId = value;
    }

    /**
     * Gets the value of the disputePreCompId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDisputePreCompId() {
        return disputePreCompId;
    }

    /**
     * Sets the value of the disputePreCompId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDisputePreCompId(Long value) {
        this.disputePreCompId = value;
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
     * Gets the value of the disputeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getDisputeAmount() {
        return disputeAmount;
    }

    /**
     * Sets the value of the disputeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setDisputeAmount(AmountType value) {
        this.disputeAmount = value;
    }

    /**
     * Gets the value of the caseInformation property.
     * 
     * @return
     *     possible object is
     *     {@link DisputeCaseInformationType }
     *     
     */
    public DisputeCaseInformationType getCaseInformation() {
        return caseInformation;
    }

    /**
     * Sets the value of the caseInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisputeCaseInformationType }
     *     
     */
    public void setCaseInformation(DisputeCaseInformationType value) {
        this.caseInformation = value;
    }

    /**
     * Gets the value of the cardholderInfo property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalCardholderInfoType }
     *     
     */
    public AdditionalCardholderInfoType getCardholderInfo() {
        return cardholderInfo;
    }

    /**
     * Sets the value of the cardholderInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalCardholderInfoType }
     *     
     */
    public void setCardholderInfo(AdditionalCardholderInfoType value) {
        this.cardholderInfo = value;
    }

    /**
     * Gets the value of the accountOwnerInfo property.
     * 
     * @return
     *     possible object is
     *     {@link DisputeAccountOwnerContactInfoType }
     *     
     */
    public DisputeAccountOwnerContactInfoType getAccountOwnerInfo() {
        return accountOwnerInfo;
    }

    /**
     * Sets the value of the accountOwnerInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisputeAccountOwnerContactInfoType }
     *     
     */
    public void setAccountOwnerInfo(DisputeAccountOwnerContactInfoType value) {
        this.accountOwnerInfo = value;
    }

    /**
     * Gets the value of the merchantContactInfo property.
     * 
     * @return
     *     possible object is
     *     {@link MerchantContactInfoType }
     *     
     */
    public MerchantContactInfoType getMerchantContactInfo() {
        return merchantContactInfo;
    }

    /**
     * Sets the value of the merchantContactInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link MerchantContactInfoType }
     *     
     */
    public void setMerchantContactInfo(MerchantContactInfoType value) {
        this.merchantContactInfo = value;
    }

    /**
     * Gets the value of the note property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNote() {
        return note;
    }

    /**
     * Sets the value of the note property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNote(String value) {
        this.note = value;
    }

    /**
     * Gets the value of the issuerAcquirerContactInfo property.
     * 
     * @return
     *     possible object is
     *     {@link IssuerAcquirerContactInfoType }
     *     
     */
    public IssuerAcquirerContactInfoType getIssuerAcquirerContactInfo() {
        return issuerAcquirerContactInfo;
    }

    /**
     * Sets the value of the issuerAcquirerContactInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link IssuerAcquirerContactInfoType }
     *     
     */
    public void setIssuerAcquirerContactInfo(IssuerAcquirerContactInfoType value) {
        this.issuerAcquirerContactInfo = value;
    }

    /**
     * Gets the value of the disputeAmountChangeReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisputeAmountChangeReason() {
        return disputeAmountChangeReason;
    }

    /**
     * Sets the value of the disputeAmountChangeReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisputeAmountChangeReason(String value) {
        this.disputeAmountChangeReason = value;
    }

    /**
     * Gets the value of the explanationOfCreditPresented property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExplanationOfCreditPresented() {
        return explanationOfCreditPresented;
    }

    /**
     * Sets the value of the explanationOfCreditPresented property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExplanationOfCreditPresented(String value) {
        this.explanationOfCreditPresented = value;
    }

    /**
     * Gets the value of the initiatePreFilingReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInitiatePreFilingReason() {
        return initiatePreFilingReason;
    }

    /**
     * Sets the value of the initiatePreFilingReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInitiatePreFilingReason(String value) {
        this.initiatePreFilingReason = value;
    }

    /**
     * Gets the value of the firstRuleViolatedCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstRuleViolatedCode() {
        return firstRuleViolatedCode;
    }

    /**
     * Sets the value of the firstRuleViolatedCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstRuleViolatedCode(String value) {
        this.firstRuleViolatedCode = value;
    }

    /**
     * Gets the value of the secondRuleViolatedCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondRuleViolatedCode() {
        return secondRuleViolatedCode;
    }

    /**
     * Sets the value of the secondRuleViolatedCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondRuleViolatedCode(String value) {
        this.secondRuleViolatedCode = value;
    }

    /**
     * Gets the value of the thirdRuleViolatedCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThirdRuleViolatedCode() {
        return thirdRuleViolatedCode;
    }

    /**
     * Sets the value of the thirdRuleViolatedCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThirdRuleViolatedCode(String value) {
        this.thirdRuleViolatedCode = value;
    }

    /**
     * Gets the value of the rulesViolatedAdditionalInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRulesViolatedAdditionalInfo() {
        return rulesViolatedAdditionalInfo;
    }

    /**
     * Sets the value of the rulesViolatedAdditionalInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRulesViolatedAdditionalInfo(String value) {
        this.rulesViolatedAdditionalInfo = value;
    }

    /**
     * Gets the value of the violationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getViolationDate() {
        return violationDate;
    }

    /**
     * Sets the value of the violationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setViolationDate(XMLGregorianCalendar value) {
        this.violationDate = value;
    }

    /**
     * Gets the value of the violationDiscoveryDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getViolationDiscoveryDate() {
        return violationDiscoveryDate;
    }

    /**
     * Sets the value of the violationDiscoveryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setViolationDiscoveryDate(XMLGregorianCalendar value) {
        this.violationDiscoveryDate = value;
    }

    /**
     * Gets the value of the violationDiscoveryDateInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getViolationDiscoveryDateInfo() {
        return violationDiscoveryDateInfo;
    }

    /**
     * Sets the value of the violationDiscoveryDateInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setViolationDiscoveryDateInfo(String value) {
        this.violationDiscoveryDateInfo = value;
    }

    /**
     * Gets the value of the financialLossOccurInd property.
     * 
     * @return
     *     possible object is
     *     {@link YNType }
     *     
     */
    public YNType getFinancialLossOccurInd() {
        return financialLossOccurInd;
    }

    /**
     * Sets the value of the financialLossOccurInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link YNType }
     *     
     */
    public void setFinancialLossOccurInd(YNType value) {
        this.financialLossOccurInd = value;
    }

    /**
     * Gets the value of the financialLossExplanation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFinancialLossExplanation() {
        return financialLossExplanation;
    }

    /**
     * Sets the value of the financialLossExplanation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFinancialLossExplanation(String value) {
        this.financialLossExplanation = value;
    }

    /**
     * Gets the value of the disputeAttachmentDescriptor property.
     * 
     * @return
     *     possible object is
     *     {@link DisputeAttachmentDescriptorType }
     *     
     */
    public DisputeAttachmentDescriptorType getDisputeAttachmentDescriptor() {
        return disputeAttachmentDescriptor;
    }

    /**
     * Sets the value of the disputeAttachmentDescriptor property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisputeAttachmentDescriptorType }
     *     
     */
    public void setDisputeAttachmentDescriptor(DisputeAttachmentDescriptorType value) {
        this.disputeAttachmentDescriptor = value;
    }

    /**
     * Gets the value of the docIdList property.
     * 
     * @return
     *     possible object is
     *     {@link DocIdListType }
     *     
     */
    public DocIdListType getDocIdList() {
        return docIdList;
    }

    /**
     * Sets the value of the docIdList property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocIdListType }
     *     
     */
    public void setDocIdList(DocIdListType value) {
        this.docIdList = value;
    }

    /**
     * Gets the value of the action property.
     * 
     * @return
     *     possible object is
     *     {@link DisputeCaseActionType }
     *     
     */
    public DisputeCaseActionType getAction() {
        return action;
    }

    /**
     * Sets the value of the action property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisputeCaseActionType }
     *     
     */
    public void setAction(DisputeCaseActionType value) {
        this.action = value;
    }

    /**
     * Gets the value of the provisionalCreditInformation property.
     * 
     * @return
     *     possible object is
     *     {@link DisputeProvisionalCreditInfoType }
     *     
     */
    public DisputeProvisionalCreditInfoType getProvisionalCreditInformation() {
        return provisionalCreditInformation;
    }

    /**
     * Sets the value of the provisionalCreditInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisputeProvisionalCreditInfoType }
     *     
     */
    public void setProvisionalCreditInformation(DisputeProvisionalCreditInfoType value) {
        this.provisionalCreditInformation = value;
    }

    /**
     * Gets the value of the supplyDocInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSupplyDocInd() {
        return supplyDocInd;
    }

    /**
     * Sets the value of the supplyDocInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSupplyDocInd(Boolean value) {
        this.supplyDocInd = value;
    }

}