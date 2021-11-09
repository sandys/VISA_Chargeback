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
 * <p>Java class for InitiateDisputeFromTransactionOrCaseRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InitiateDisputeFromTransactionOrCaseRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.visa.com/ROLSI}InitiateDisputeFromTransactionOrCaseRequest" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InitiateDisputeFromTransactionOrCaseRequestType", propOrder = {
    "visaCaseNumber",
    "rolTransactionId",
    "memberCaseNumber",
    "disputeCategory",
    "disputeAmount",
    "exceptionCPD",
    "disputeAmtExcludeCashbackInd",
    "selectedTransExcludeCashbackInd",
    "caseInformation",
    "disputeCardholderInfo",
    "accountOwnerInfo",
    "disputeFraudInfo",
    "disputeEFLInfo"
})
public class InitiateDisputeFromTransactionOrCaseRequestType {

    @XmlElement(name = "VisaCaseNumber")
    protected Long visaCaseNumber;
    @XmlElement(name = "RolTransactionId")
    protected Long rolTransactionId;
    @XmlElement(name = "MemberCaseNumber")
    protected String memberCaseNumber;
    @XmlElement(name = "DisputeCategory")
    protected DisputeCategoryType disputeCategory;
    @XmlElement(name = "DisputeAmount")
    protected AmountType disputeAmount;
    @XmlElement(name = "ExceptionCPD")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar exceptionCPD;
    @XmlElement(name = "DisputeAmtExcludeCashbackInd")
    protected Boolean disputeAmtExcludeCashbackInd;
    @XmlElement(name = "SelectedTransExcludeCashbackInd")
    protected Boolean selectedTransExcludeCashbackInd;
    @XmlElement(name = "CaseInformation")
    protected DisputeCaseInformationType caseInformation;
    @XmlElement(name = "DisputeCardholderInfo")
    protected DisputeCardholderInfoType disputeCardholderInfo;
    @XmlElement(name = "AccountOwnerInfo")
    protected DisputeAccountOwnerContactInfoType accountOwnerInfo;
    @XmlElement(name = "DisputeFraudInfo")
    protected DisputeFraudInfoType disputeFraudInfo;
    @XmlElement(name = "DisputeEFLInfo")
    protected DisputeEFLInfoType disputeEFLInfo;

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
     * Gets the value of the exceptionCPD property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExceptionCPD() {
        return exceptionCPD;
    }

    /**
     * Sets the value of the exceptionCPD property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExceptionCPD(XMLGregorianCalendar value) {
        this.exceptionCPD = value;
    }

    /**
     * Gets the value of the disputeAmtExcludeCashbackInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDisputeAmtExcludeCashbackInd() {
        return disputeAmtExcludeCashbackInd;
    }

    /**
     * Sets the value of the disputeAmtExcludeCashbackInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDisputeAmtExcludeCashbackInd(Boolean value) {
        this.disputeAmtExcludeCashbackInd = value;
    }

    /**
     * Gets the value of the selectedTransExcludeCashbackInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSelectedTransExcludeCashbackInd() {
        return selectedTransExcludeCashbackInd;
    }

    /**
     * Sets the value of the selectedTransExcludeCashbackInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSelectedTransExcludeCashbackInd(Boolean value) {
        this.selectedTransExcludeCashbackInd = value;
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
     * Gets the value of the disputeCardholderInfo property.
     * 
     * @return
     *     possible object is
     *     {@link DisputeCardholderInfoType }
     *     
     */
    public DisputeCardholderInfoType getDisputeCardholderInfo() {
        return disputeCardholderInfo;
    }

    /**
     * Sets the value of the disputeCardholderInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisputeCardholderInfoType }
     *     
     */
    public void setDisputeCardholderInfo(DisputeCardholderInfoType value) {
        this.disputeCardholderInfo = value;
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
     * Gets the value of the disputeFraudInfo property.
     * 
     * @return
     *     possible object is
     *     {@link DisputeFraudInfoType }
     *     
     */
    public DisputeFraudInfoType getDisputeFraudInfo() {
        return disputeFraudInfo;
    }

    /**
     * Sets the value of the disputeFraudInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisputeFraudInfoType }
     *     
     */
    public void setDisputeFraudInfo(DisputeFraudInfoType value) {
        this.disputeFraudInfo = value;
    }

    /**
     * Gets the value of the disputeEFLInfo property.
     * 
     * @return
     *     possible object is
     *     {@link DisputeEFLInfoType }
     *     
     */
    public DisputeEFLInfoType getDisputeEFLInfo() {
        return disputeEFLInfo;
    }

    /**
     * Sets the value of the disputeEFLInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisputeEFLInfoType }
     *     
     */
    public void setDisputeEFLInfo(DisputeEFLInfoType value) {
        this.disputeEFLInfo = value;
    }

}