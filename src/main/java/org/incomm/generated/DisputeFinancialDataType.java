//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.02.13 at 11:38:26 AM EST 
//


package org.incomm.generated;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for DisputeFinancialDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DisputeFinancialDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DisputeCategory" type="{http://www.visa.com/ROLSI}DisputeCategoryValueType" minOccurs="0"/&gt;
 *         &lt;element name="DisputeCategoryDesc" type="{http://www.visa.com/ROLSI}DisputeCategoryDescType" minOccurs="0"/&gt;
 *         &lt;element name="DisputeCondition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DisputeConditionDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SrcAmt" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.visa.com/ROLSI&gt;AmountType"&gt;
 *                 &lt;attribute name="SrcAmtDebitCreditInd" type="{http://www.visa.com/ROLSI}DebitCreditType" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DestAmt" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.visa.com/ROLSI&gt;AmountType"&gt;
 *                 &lt;attribute name="DestAmtDebitCreditInd" type="{http://www.visa.com/ROLSI}DebitCreditType" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SettlementAmount" type="{http://www.visa.com/ROLSI}AmountType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}PartialInd" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}CPD" minOccurs="0"/&gt;
 *         &lt;element name="SettlementDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}ChargebackRefNum" minOccurs="0"/&gt;
 *         &lt;element name="DocumentationInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}MemberMsgEditText" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}ExcludedTranIdReason" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}CRSProcessingCode" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}RetrievalReferenceNumber" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}SystemTraceAuditNumber" minOccurs="0"/&gt;
 *         &lt;element name="DisputeStatus" type="{http://www.visa.com/ROLSI}DisputeStatusAdviceType" minOccurs="0"/&gt;
 *         &lt;element name="VROLBundleID" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="UsageCode" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="Code" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Message" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="200"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DisputeFinancialDataType", propOrder = {
    "disputeCategory",
    "disputeCategoryDesc",
    "disputeCondition",
    "disputeConditionDesc",
    "srcAmt",
    "destAmt",
    "settlementAmount",
    "partialInd",
    "cpd",
    "settlementDate",
    "chargebackRefNum",
    "documentationInd",
    "memberMsgEditText",
    "excludedTranIdReason",
    "crsProcessingCode",
    "retrievalReferenceNumber",
    "systemTraceAuditNumber",
    "disputeStatus",
    "vrolBundleID",
    "usageCode",
    "code",
    "message"
})
public class DisputeFinancialDataType {

    @XmlElement(name = "DisputeCategory")
    protected String disputeCategory;
    @XmlElement(name = "DisputeCategoryDesc")
    @XmlSchemaType(name = "string")
    protected DisputeCategoryDescType disputeCategoryDesc;
    @XmlElement(name = "DisputeCondition")
    protected String disputeCondition;
    @XmlElement(name = "DisputeConditionDesc")
    protected String disputeConditionDesc;
    @XmlElement(name = "SrcAmt")
    protected DisputeFinancialDataType.SrcAmt srcAmt;
    @XmlElement(name = "DestAmt")
    protected DisputeFinancialDataType.DestAmt destAmt;
    @XmlElement(name = "SettlementAmount")
    protected AmountType settlementAmount;
    @XmlElement(name = "PartialInd")
    protected String partialInd;
    @XmlElement(name = "CPD")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar cpd;
    @XmlElement(name = "SettlementDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar settlementDate;
    @XmlElement(name = "ChargebackRefNum")
    protected String chargebackRefNum;
    @XmlElement(name = "DocumentationInd")
    protected String documentationInd;
    @XmlElement(name = "MemberMsgEditText")
    protected String memberMsgEditText;
    @XmlElement(name = "ExcludedTranIdReason")
    protected String excludedTranIdReason;
    @XmlElement(name = "CRSProcessingCode")
    protected String crsProcessingCode;
    @XmlElement(name = "RetrievalReferenceNumber")
    protected String retrievalReferenceNumber;
    @XmlElement(name = "SystemTraceAuditNumber")
    protected String systemTraceAuditNumber;
    @XmlElement(name = "DisputeStatus")
    @XmlSchemaType(name = "string")
    protected DisputeStatusAdviceType disputeStatus;
    @XmlElement(name = "VROLBundleID")
    protected BigInteger vrolBundleID;
    @XmlElement(name = "UsageCode")
    protected BigInteger usageCode;
    @XmlElement(name = "Code")
    protected String code;
    @XmlElement(name = "Message")
    protected String message;

    /**
     * Gets the value of the disputeCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisputeCategory() {
        return disputeCategory;
    }

    /**
     * Sets the value of the disputeCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisputeCategory(String value) {
        this.disputeCategory = value;
    }

    /**
     * Gets the value of the disputeCategoryDesc property.
     * 
     * @return
     *     possible object is
     *     {@link DisputeCategoryDescType }
     *     
     */
    public DisputeCategoryDescType getDisputeCategoryDesc() {
        return disputeCategoryDesc;
    }

    /**
     * Sets the value of the disputeCategoryDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisputeCategoryDescType }
     *     
     */
    public void setDisputeCategoryDesc(DisputeCategoryDescType value) {
        this.disputeCategoryDesc = value;
    }

    /**
     * Gets the value of the disputeCondition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisputeCondition() {
        return disputeCondition;
    }

    /**
     * Sets the value of the disputeCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisputeCondition(String value) {
        this.disputeCondition = value;
    }

    /**
     * Gets the value of the disputeConditionDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisputeConditionDesc() {
        return disputeConditionDesc;
    }

    /**
     * Sets the value of the disputeConditionDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisputeConditionDesc(String value) {
        this.disputeConditionDesc = value;
    }

    /**
     * Gets the value of the srcAmt property.
     * 
     * @return
     *     possible object is
     *     {@link DisputeFinancialDataType.SrcAmt }
     *     
     */
    public DisputeFinancialDataType.SrcAmt getSrcAmt() {
        return srcAmt;
    }

    /**
     * Sets the value of the srcAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisputeFinancialDataType.SrcAmt }
     *     
     */
    public void setSrcAmt(DisputeFinancialDataType.SrcAmt value) {
        this.srcAmt = value;
    }

    /**
     * Gets the value of the destAmt property.
     * 
     * @return
     *     possible object is
     *     {@link DisputeFinancialDataType.DestAmt }
     *     
     */
    public DisputeFinancialDataType.DestAmt getDestAmt() {
        return destAmt;
    }

    /**
     * Sets the value of the destAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisputeFinancialDataType.DestAmt }
     *     
     */
    public void setDestAmt(DisputeFinancialDataType.DestAmt value) {
        this.destAmt = value;
    }

    /**
     * Gets the value of the settlementAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getSettlementAmount() {
        return settlementAmount;
    }

    /**
     * Sets the value of the settlementAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setSettlementAmount(AmountType value) {
        this.settlementAmount = value;
    }

    /**
     * Gets the value of the partialInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartialInd() {
        return partialInd;
    }

    /**
     * Sets the value of the partialInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartialInd(String value) {
        this.partialInd = value;
    }

    /**
     * Gets the value of the cpd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCPD() {
        return cpd;
    }

    /**
     * Sets the value of the cpd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCPD(XMLGregorianCalendar value) {
        this.cpd = value;
    }

    /**
     * Gets the value of the settlementDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSettlementDate() {
        return settlementDate;
    }

    /**
     * Sets the value of the settlementDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSettlementDate(XMLGregorianCalendar value) {
        this.settlementDate = value;
    }

    /**
     * Gets the value of the chargebackRefNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChargebackRefNum() {
        return chargebackRefNum;
    }

    /**
     * Sets the value of the chargebackRefNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChargebackRefNum(String value) {
        this.chargebackRefNum = value;
    }

    /**
     * Gets the value of the documentationInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentationInd() {
        return documentationInd;
    }

    /**
     * Sets the value of the documentationInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentationInd(String value) {
        this.documentationInd = value;
    }

    /**
     * Gets the value of the memberMsgEditText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemberMsgEditText() {
        return memberMsgEditText;
    }

    /**
     * Sets the value of the memberMsgEditText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMemberMsgEditText(String value) {
        this.memberMsgEditText = value;
    }

    /**
     * Gets the value of the excludedTranIdReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExcludedTranIdReason() {
        return excludedTranIdReason;
    }

    /**
     * Sets the value of the excludedTranIdReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExcludedTranIdReason(String value) {
        this.excludedTranIdReason = value;
    }

    /**
     * Gets the value of the crsProcessingCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCRSProcessingCode() {
        return crsProcessingCode;
    }

    /**
     * Sets the value of the crsProcessingCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCRSProcessingCode(String value) {
        this.crsProcessingCode = value;
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
     * Gets the value of the disputeStatus property.
     * 
     * @return
     *     possible object is
     *     {@link DisputeStatusAdviceType }
     *     
     */
    public DisputeStatusAdviceType getDisputeStatus() {
        return disputeStatus;
    }

    /**
     * Sets the value of the disputeStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisputeStatusAdviceType }
     *     
     */
    public void setDisputeStatus(DisputeStatusAdviceType value) {
        this.disputeStatus = value;
    }

    /**
     * Gets the value of the vrolBundleID property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getVROLBundleID() {
        return vrolBundleID;
    }

    /**
     * Sets the value of the vrolBundleID property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setVROLBundleID(BigInteger value) {
        this.vrolBundleID = value;
    }

    /**
     * Gets the value of the usageCode property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getUsageCode() {
        return usageCode;
    }

    /**
     * Sets the value of the usageCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setUsageCode(BigInteger value) {
        this.usageCode = value;
    }

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;http://www.visa.com/ROLSI&gt;AmountType"&gt;
     *       &lt;attribute name="DestAmtDebitCreditInd" type="{http://www.visa.com/ROLSI}DebitCreditType" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class DestAmt
        extends AmountType
    {

        @XmlAttribute(name = "DestAmtDebitCreditInd")
        protected DebitCreditType destAmtDebitCreditInd;

        /**
         * Gets the value of the destAmtDebitCreditInd property.
         * 
         * @return
         *     possible object is
         *     {@link DebitCreditType }
         *     
         */
        public DebitCreditType getDestAmtDebitCreditInd() {
            return destAmtDebitCreditInd;
        }

        /**
         * Sets the value of the destAmtDebitCreditInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link DebitCreditType }
         *     
         */
        public void setDestAmtDebitCreditInd(DebitCreditType value) {
            this.destAmtDebitCreditInd = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;http://www.visa.com/ROLSI&gt;AmountType"&gt;
     *       &lt;attribute name="SrcAmtDebitCreditInd" type="{http://www.visa.com/ROLSI}DebitCreditType" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class SrcAmt
        extends AmountType
    {

        @XmlAttribute(name = "SrcAmtDebitCreditInd")
        protected DebitCreditType srcAmtDebitCreditInd;

        /**
         * Gets the value of the srcAmtDebitCreditInd property.
         * 
         * @return
         *     possible object is
         *     {@link DebitCreditType }
         *     
         */
        public DebitCreditType getSrcAmtDebitCreditInd() {
            return srcAmtDebitCreditInd;
        }

        /**
         * Sets the value of the srcAmtDebitCreditInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link DebitCreditType }
         *     
         */
        public void setSrcAmtDebitCreditInd(DebitCreditType value) {
            this.srcAmtDebitCreditInd = value;
        }

    }

}
