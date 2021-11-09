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
 * <p>Java class for ComplianceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ComplianceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.visa.com/ROLSI}CommonFormDataType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FilingReason" type="{http://www.visa.com/ROLSI}DescType" minOccurs="0"/&gt;
 *         &lt;element name="PreComplianceDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}FirstRuleViolatedCode" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}SecondRuleViolatedCode" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}ThirdRuleViolatedCode" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}RulesViolatedAdditionalInfo" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}ViolationDate" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}ViolationDiscoveryDate" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}FinancialLossExplanation" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}CaseFilingAmount" minOccurs="0"/&gt;
 *         &lt;element name="CaseFilingDateFromPreCompDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CaseFilingDateFromViolationDiscoveryDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ViolationDiscoveryDateFromTranCPD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}AppealInd" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}MultiFilingCd" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ComplianceType", propOrder = {
    "filingReason",
    "preComplianceDate",
    "firstRuleViolatedCode",
    "secondRuleViolatedCode",
    "thirdRuleViolatedCode",
    "rulesViolatedAdditionalInfo",
    "violationDate",
    "violationDiscoveryDate",
    "financialLossExplanation",
    "caseFilingAmount",
    "caseFilingDateFromPreCompDate",
    "caseFilingDateFromViolationDiscoveryDate",
    "violationDiscoveryDateFromTranCPD",
    "appealInd",
    "multiFilingCd"
})
public class ComplianceType
    extends CommonFormDataType
{

    @XmlElement(name = "FilingReason")
    protected String filingReason;
    @XmlElement(name = "PreComplianceDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar preComplianceDate;
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
    @XmlElement(name = "FinancialLossExplanation")
    protected String financialLossExplanation;
    @XmlElement(name = "CaseFilingAmount")
    protected AmountType caseFilingAmount;
    @XmlElement(name = "CaseFilingDateFromPreCompDate")
    protected String caseFilingDateFromPreCompDate;
    @XmlElement(name = "CaseFilingDateFromViolationDiscoveryDate")
    protected String caseFilingDateFromViolationDiscoveryDate;
    @XmlElement(name = "ViolationDiscoveryDateFromTranCPD")
    protected String violationDiscoveryDateFromTranCPD;
    @XmlElement(name = "AppealInd")
    protected Boolean appealInd;
    @XmlElement(name = "MultiFilingCd")
    protected String multiFilingCd;

    /**
     * Gets the value of the filingReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilingReason() {
        return filingReason;
    }

    /**
     * Sets the value of the filingReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilingReason(String value) {
        this.filingReason = value;
    }

    /**
     * Gets the value of the preComplianceDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPreComplianceDate() {
        return preComplianceDate;
    }

    /**
     * Sets the value of the preComplianceDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPreComplianceDate(XMLGregorianCalendar value) {
        this.preComplianceDate = value;
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
     * Gets the value of the caseFilingAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getCaseFilingAmount() {
        return caseFilingAmount;
    }

    /**
     * Sets the value of the caseFilingAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setCaseFilingAmount(AmountType value) {
        this.caseFilingAmount = value;
    }

    /**
     * Gets the value of the caseFilingDateFromPreCompDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaseFilingDateFromPreCompDate() {
        return caseFilingDateFromPreCompDate;
    }

    /**
     * Sets the value of the caseFilingDateFromPreCompDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaseFilingDateFromPreCompDate(String value) {
        this.caseFilingDateFromPreCompDate = value;
    }

    /**
     * Gets the value of the caseFilingDateFromViolationDiscoveryDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaseFilingDateFromViolationDiscoveryDate() {
        return caseFilingDateFromViolationDiscoveryDate;
    }

    /**
     * Sets the value of the caseFilingDateFromViolationDiscoveryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaseFilingDateFromViolationDiscoveryDate(String value) {
        this.caseFilingDateFromViolationDiscoveryDate = value;
    }

    /**
     * Gets the value of the violationDiscoveryDateFromTranCPD property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getViolationDiscoveryDateFromTranCPD() {
        return violationDiscoveryDateFromTranCPD;
    }

    /**
     * Sets the value of the violationDiscoveryDateFromTranCPD property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setViolationDiscoveryDateFromTranCPD(String value) {
        this.violationDiscoveryDateFromTranCPD = value;
    }

    /**
     * Gets the value of the appealInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAppealInd() {
        return appealInd;
    }

    /**
     * Sets the value of the appealInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAppealInd(Boolean value) {
        this.appealInd = value;
    }

    /**
     * Gets the value of the multiFilingCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMultiFilingCd() {
        return multiFilingCd;
    }

    /**
     * Sets the value of the multiFilingCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMultiFilingCd(String value) {
        this.multiFilingCd = value;
    }

}