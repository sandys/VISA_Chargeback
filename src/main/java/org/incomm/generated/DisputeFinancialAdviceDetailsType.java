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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for DisputeFinancialAdviceDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DisputeFinancialAdviceDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DisputeAdviceId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="ProcessingCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CPD" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="DisputeCategory" type="{http://www.visa.com/ROLSI}DisputeCategoryType" minOccurs="0"/&gt;
 *         &lt;element name="DisputeCondition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DisputeStatus" type="{http://www.visa.com/ROLSI}DisputeStatusAdviceType" minOccurs="0"/&gt;
 *         &lt;element name="DisputeTransactionCode" type="{http://www.visa.com/ROLSI}DisputeTransactionCodeType" minOccurs="0"/&gt;
 *         &lt;element name="DisputeTransactionCodeQualifier" type="{http://www.visa.com/ROLSI}DisputeTransactionCodeQualifierType" minOccurs="0"/&gt;
 *         &lt;element name="DisputeAmountInUSD" type="{http://www.visa.com/ROLSI}AmountType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}VROLFinancialID" minOccurs="0"/&gt;
 *         &lt;element name="VROLBundleCaseNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="IssuerCaseNumber" type="{http://www.visa.com/ROLSI}MemberCaseNumberType" minOccurs="0"/&gt;
 *         &lt;element name="AcquirerCaseNumber" type="{http://www.visa.com/ROLSI}MemberCaseNumberType" minOccurs="0"/&gt;
 *         &lt;element name="SettlementDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}MerchantName" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}MerchantCity" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}MerchantCountryCode" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}MerchantCountrySubEntityCode" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}MerchantPostalCode" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}MCC" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}CardAcceptorId" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}AcquirerBID" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}ARN" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}AcquirerBIN" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}NetworkID" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}DraftTransactionCode" minOccurs="0"/&gt;
 *         &lt;element name="PosEntryModeCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RequestedPaymentService" type="{http://www.visa.com/ROLSI}DisputeRequestedPaymentServicesType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}IssuerInterchangeReimbursementFee" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}IssuerCashbackInterchangeReimbursementFee" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}AcquirerInterchangeReimbursementFee" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}AcquirerCashbackInterchangeReimbursementFee" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}AuthCode" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}ReimbursementAttribute" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}IssuerFinancialBIN" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}AcquirerFinancialBIN" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}SettlementFlag" minOccurs="0"/&gt;
 *         &lt;element name="CrissCrossIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}AccountNumber" minOccurs="0"/&gt;
 *         &lt;element name="AccountNumberExtension" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}Token" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}TransactionID" minOccurs="0"/&gt;
 *         &lt;element name="MultipleClearingSequenceCount" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}TranDate" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}SrcAmt" minOccurs="0"/&gt;
 *         &lt;element name="DestAmt" type="{http://www.visa.com/ROLSI}AmountType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}ProductId" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}RetrievalReferenceNumber" minOccurs="0"/&gt;
 *         &lt;element name="SpndQlfdInd" type="{http://www.visa.com/ROLSI}SpndQlfdIndType" minOccurs="0"/&gt;
 *         &lt;element name="UsageCode" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DisputeFinancialAdviceDetailsType", propOrder = {
    "disputeAdviceId",
    "processingCode",
    "cpd",
    "disputeCategory",
    "disputeCondition",
    "disputeStatus",
    "disputeTransactionCode",
    "disputeTransactionCodeQualifier",
    "disputeAmountInUSD",
    "vrolFinancialID",
    "vrolBundleCaseNumber",
    "issuerCaseNumber",
    "acquirerCaseNumber",
    "settlementDate",
    "merchantName",
    "merchantCity",
    "merchantCountryCode",
    "merchantCountrySubEntityCode",
    "merchantPostalCode",
    "mcc",
    "cardAcceptorId",
    "acquirerBID",
    "arn",
    "acquirerBIN",
    "networkID",
    "draftTransactionCode",
    "posEntryModeCd",
    "requestedPaymentService",
    "issuerInterchangeReimbursementFee",
    "issuerCashbackInterchangeReimbursementFee",
    "acquirerInterchangeReimbursementFee",
    "acquirerCashbackInterchangeReimbursementFee",
    "authCode",
    "reimbursementAttribute",
    "issuerFinancialBIN",
    "acquirerFinancialBIN",
    "settlementFlag",
    "crissCrossIndicator",
    "accountNumber",
    "accountNumberExtension",
    "token",
    "transactionID",
    "multipleClearingSequenceCount",
    "tranDate",
    "srcAmt",
    "destAmt",
    "productId",
    "retrievalReferenceNumber",
    "spndQlfdInd",
    "usageCode"
})
public class DisputeFinancialAdviceDetailsType {

    @XmlElement(name = "DisputeAdviceId")
    protected long disputeAdviceId;
    @XmlElement(name = "ProcessingCode")
    protected String processingCode;
    @XmlElement(name = "CPD")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar cpd;
    @XmlElement(name = "DisputeCategory")
    protected DisputeCategoryType disputeCategory;
    @XmlElement(name = "DisputeCondition")
    protected String disputeCondition;
    @XmlElement(name = "DisputeStatus")
    @XmlSchemaType(name = "string")
    protected DisputeStatusAdviceType disputeStatus;
    @XmlElement(name = "DisputeTransactionCode")
    protected String disputeTransactionCode;
    @XmlElement(name = "DisputeTransactionCodeQualifier")
    protected String disputeTransactionCodeQualifier;
    @XmlElement(name = "DisputeAmountInUSD")
    protected AmountType disputeAmountInUSD;
    @XmlElement(name = "VROLFinancialID")
    protected String vrolFinancialID;
    @XmlElement(name = "VROLBundleCaseNumber")
    protected Long vrolBundleCaseNumber;
    @XmlElement(name = "IssuerCaseNumber")
    protected String issuerCaseNumber;
    @XmlElement(name = "AcquirerCaseNumber")
    protected String acquirerCaseNumber;
    @XmlElement(name = "SettlementDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar settlementDate;
    @XmlElement(name = "MerchantName")
    protected String merchantName;
    @XmlElement(name = "MerchantCity")
    protected String merchantCity;
    @XmlElement(name = "MerchantCountryCode")
    protected String merchantCountryCode;
    @XmlElement(name = "MerchantCountrySubEntityCode")
    protected String merchantCountrySubEntityCode;
    @XmlElement(name = "MerchantPostalCode")
    protected String merchantPostalCode;
    @XmlElement(name = "MCC")
    protected String mcc;
    @XmlElement(name = "CardAcceptorId")
    protected String cardAcceptorId;
    @XmlElement(name = "AcquirerBID")
    protected String acquirerBID;
    @XmlElement(name = "ARN")
    protected String arn;
    @XmlElement(name = "AcquirerBIN")
    protected String acquirerBIN;
    @XmlElement(name = "NetworkID")
    protected String networkID;
    @XmlElement(name = "DraftTransactionCode")
    protected String draftTransactionCode;
    @XmlElement(name = "PosEntryModeCd")
    protected String posEntryModeCd;
    @XmlElement(name = "RequestedPaymentService")
    protected String requestedPaymentService;
    @XmlElement(name = "IssuerInterchangeReimbursementFee")
    protected IssuerInterchangeReimbursementFee issuerInterchangeReimbursementFee;
    @XmlElement(name = "IssuerCashbackInterchangeReimbursementFee")
    protected IssuerCashbackInterchangeReimbursementFee issuerCashbackInterchangeReimbursementFee;
    @XmlElement(name = "AcquirerInterchangeReimbursementFee")
    protected AcquirerInterchangeReimbursementFee acquirerInterchangeReimbursementFee;
    @XmlElement(name = "AcquirerCashbackInterchangeReimbursementFee")
    protected AcquirerCashbackInterchangeReimbursementFee acquirerCashbackInterchangeReimbursementFee;
    @XmlElement(name = "AuthCode")
    protected String authCode;
    @XmlElement(name = "ReimbursementAttribute")
    protected String reimbursementAttribute;
    @XmlElement(name = "IssuerFinancialBIN")
    protected String issuerFinancialBIN;
    @XmlElement(name = "AcquirerFinancialBIN")
    protected String acquirerFinancialBIN;
    @XmlElement(name = "SettlementFlag")
    protected String settlementFlag;
    @XmlElement(name = "CrissCrossIndicator")
    protected String crissCrossIndicator;
    @XmlElement(name = "AccountNumber")
    protected String accountNumber;
    @XmlElement(name = "AccountNumberExtension")
    protected String accountNumberExtension;
    @XmlElement(name = "Token")
    protected String token;
    @XmlElement(name = "TransactionID")
    protected String transactionID;
    @XmlElement(name = "MultipleClearingSequenceCount")
    protected BigInteger multipleClearingSequenceCount;
    @XmlElement(name = "TranDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar tranDate;
    @XmlElement(name = "SrcAmt")
    protected AmountType srcAmt;
    @XmlElement(name = "DestAmt")
    protected AmountType destAmt;
    @XmlElement(name = "ProductId")
    protected String productId;
    @XmlElement(name = "RetrievalReferenceNumber")
    protected String retrievalReferenceNumber;
    @XmlElement(name = "SpndQlfdInd")
    protected String spndQlfdInd;
    @XmlElement(name = "UsageCode")
    protected BigInteger usageCode;

    /**
     * Gets the value of the disputeAdviceId property.
     * 
     */
    public long getDisputeAdviceId() {
        return disputeAdviceId;
    }

    /**
     * Sets the value of the disputeAdviceId property.
     * 
     */
    public void setDisputeAdviceId(long value) {
        this.disputeAdviceId = value;
    }

    /**
     * Gets the value of the processingCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessingCode() {
        return processingCode;
    }

    /**
     * Sets the value of the processingCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessingCode(String value) {
        this.processingCode = value;
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
     * Gets the value of the disputeTransactionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisputeTransactionCode() {
        return disputeTransactionCode;
    }

    /**
     * Sets the value of the disputeTransactionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisputeTransactionCode(String value) {
        this.disputeTransactionCode = value;
    }

    /**
     * Gets the value of the disputeTransactionCodeQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisputeTransactionCodeQualifier() {
        return disputeTransactionCodeQualifier;
    }

    /**
     * Sets the value of the disputeTransactionCodeQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisputeTransactionCodeQualifier(String value) {
        this.disputeTransactionCodeQualifier = value;
    }

    /**
     * Gets the value of the disputeAmountInUSD property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getDisputeAmountInUSD() {
        return disputeAmountInUSD;
    }

    /**
     * Sets the value of the disputeAmountInUSD property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setDisputeAmountInUSD(AmountType value) {
        this.disputeAmountInUSD = value;
    }

    /**
     * Gets the value of the vrolFinancialID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVROLFinancialID() {
        return vrolFinancialID;
    }

    /**
     * Sets the value of the vrolFinancialID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVROLFinancialID(String value) {
        this.vrolFinancialID = value;
    }

    /**
     * Gets the value of the vrolBundleCaseNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getVROLBundleCaseNumber() {
        return vrolBundleCaseNumber;
    }

    /**
     * Sets the value of the vrolBundleCaseNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setVROLBundleCaseNumber(Long value) {
        this.vrolBundleCaseNumber = value;
    }

    /**
     * Gets the value of the issuerCaseNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssuerCaseNumber() {
        return issuerCaseNumber;
    }

    /**
     * Sets the value of the issuerCaseNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssuerCaseNumber(String value) {
        this.issuerCaseNumber = value;
    }

    /**
     * Gets the value of the acquirerCaseNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcquirerCaseNumber() {
        return acquirerCaseNumber;
    }

    /**
     * Sets the value of the acquirerCaseNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcquirerCaseNumber(String value) {
        this.acquirerCaseNumber = value;
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
     * Gets the value of the merchantCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantCity() {
        return merchantCity;
    }

    /**
     * Sets the value of the merchantCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantCity(String value) {
        this.merchantCity = value;
    }

    /**
     * Gets the value of the merchantCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantCountryCode() {
        return merchantCountryCode;
    }

    /**
     * Sets the value of the merchantCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantCountryCode(String value) {
        this.merchantCountryCode = value;
    }

    /**
     * Gets the value of the merchantCountrySubEntityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantCountrySubEntityCode() {
        return merchantCountrySubEntityCode;
    }

    /**
     * Sets the value of the merchantCountrySubEntityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantCountrySubEntityCode(String value) {
        this.merchantCountrySubEntityCode = value;
    }

    /**
     * Gets the value of the merchantPostalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantPostalCode() {
        return merchantPostalCode;
    }

    /**
     * Sets the value of the merchantPostalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantPostalCode(String value) {
        this.merchantPostalCode = value;
    }

    /**
     * Gets the value of the mcc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMCC() {
        return mcc;
    }

    /**
     * Sets the value of the mcc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMCC(String value) {
        this.mcc = value;
    }

    /**
     * Gets the value of the cardAcceptorId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardAcceptorId() {
        return cardAcceptorId;
    }

    /**
     * Sets the value of the cardAcceptorId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardAcceptorId(String value) {
        this.cardAcceptorId = value;
    }

    /**
     * Gets the value of the acquirerBID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcquirerBID() {
        return acquirerBID;
    }

    /**
     * Sets the value of the acquirerBID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcquirerBID(String value) {
        this.acquirerBID = value;
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
     * Gets the value of the draftTransactionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDraftTransactionCode() {
        return draftTransactionCode;
    }

    /**
     * Sets the value of the draftTransactionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDraftTransactionCode(String value) {
        this.draftTransactionCode = value;
    }

    /**
     * Gets the value of the posEntryModeCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPosEntryModeCd() {
        return posEntryModeCd;
    }

    /**
     * Sets the value of the posEntryModeCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPosEntryModeCd(String value) {
        this.posEntryModeCd = value;
    }

    /**
     * Gets the value of the requestedPaymentService property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestedPaymentService() {
        return requestedPaymentService;
    }

    /**
     * Sets the value of the requestedPaymentService property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestedPaymentService(String value) {
        this.requestedPaymentService = value;
    }

    /**
     * Gets the value of the issuerInterchangeReimbursementFee property.
     * 
     * @return
     *     possible object is
     *     {@link IssuerInterchangeReimbursementFee }
     *     
     */
    public IssuerInterchangeReimbursementFee getIssuerInterchangeReimbursementFee() {
        return issuerInterchangeReimbursementFee;
    }

    /**
     * Sets the value of the issuerInterchangeReimbursementFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link IssuerInterchangeReimbursementFee }
     *     
     */
    public void setIssuerInterchangeReimbursementFee(IssuerInterchangeReimbursementFee value) {
        this.issuerInterchangeReimbursementFee = value;
    }

    /**
     * Gets the value of the issuerCashbackInterchangeReimbursementFee property.
     * 
     * @return
     *     possible object is
     *     {@link IssuerCashbackInterchangeReimbursementFee }
     *     
     */
    public IssuerCashbackInterchangeReimbursementFee getIssuerCashbackInterchangeReimbursementFee() {
        return issuerCashbackInterchangeReimbursementFee;
    }

    /**
     * Sets the value of the issuerCashbackInterchangeReimbursementFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link IssuerCashbackInterchangeReimbursementFee }
     *     
     */
    public void setIssuerCashbackInterchangeReimbursementFee(IssuerCashbackInterchangeReimbursementFee value) {
        this.issuerCashbackInterchangeReimbursementFee = value;
    }

    /**
     * Gets the value of the acquirerInterchangeReimbursementFee property.
     * 
     * @return
     *     possible object is
     *     {@link AcquirerInterchangeReimbursementFee }
     *     
     */
    public AcquirerInterchangeReimbursementFee getAcquirerInterchangeReimbursementFee() {
        return acquirerInterchangeReimbursementFee;
    }

    /**
     * Sets the value of the acquirerInterchangeReimbursementFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcquirerInterchangeReimbursementFee }
     *     
     */
    public void setAcquirerInterchangeReimbursementFee(AcquirerInterchangeReimbursementFee value) {
        this.acquirerInterchangeReimbursementFee = value;
    }

    /**
     * Gets the value of the acquirerCashbackInterchangeReimbursementFee property.
     * 
     * @return
     *     possible object is
     *     {@link AcquirerCashbackInterchangeReimbursementFee }
     *     
     */
    public AcquirerCashbackInterchangeReimbursementFee getAcquirerCashbackInterchangeReimbursementFee() {
        return acquirerCashbackInterchangeReimbursementFee;
    }

    /**
     * Sets the value of the acquirerCashbackInterchangeReimbursementFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcquirerCashbackInterchangeReimbursementFee }
     *     
     */
    public void setAcquirerCashbackInterchangeReimbursementFee(AcquirerCashbackInterchangeReimbursementFee value) {
        this.acquirerCashbackInterchangeReimbursementFee = value;
    }

    /**
     * Gets the value of the authCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthCode() {
        return authCode;
    }

    /**
     * Sets the value of the authCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthCode(String value) {
        this.authCode = value;
    }

    /**
     * Gets the value of the reimbursementAttribute property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReimbursementAttribute() {
        return reimbursementAttribute;
    }

    /**
     * Sets the value of the reimbursementAttribute property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReimbursementAttribute(String value) {
        this.reimbursementAttribute = value;
    }

    /**
     * Gets the value of the issuerFinancialBIN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssuerFinancialBIN() {
        return issuerFinancialBIN;
    }

    /**
     * Sets the value of the issuerFinancialBIN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssuerFinancialBIN(String value) {
        this.issuerFinancialBIN = value;
    }

    /**
     * Gets the value of the acquirerFinancialBIN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcquirerFinancialBIN() {
        return acquirerFinancialBIN;
    }

    /**
     * Sets the value of the acquirerFinancialBIN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcquirerFinancialBIN(String value) {
        this.acquirerFinancialBIN = value;
    }

    /**
     * Gets the value of the settlementFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSettlementFlag() {
        return settlementFlag;
    }

    /**
     * Sets the value of the settlementFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSettlementFlag(String value) {
        this.settlementFlag = value;
    }

    /**
     * Gets the value of the crissCrossIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCrissCrossIndicator() {
        return crissCrossIndicator;
    }

    /**
     * Sets the value of the crissCrossIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCrissCrossIndicator(String value) {
        this.crissCrossIndicator = value;
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
     * Gets the value of the accountNumberExtension property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountNumberExtension() {
        return accountNumberExtension;
    }

    /**
     * Sets the value of the accountNumberExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountNumberExtension(String value) {
        this.accountNumberExtension = value;
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
     * Gets the value of the multipleClearingSequenceCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMultipleClearingSequenceCount() {
        return multipleClearingSequenceCount;
    }

    /**
     * Sets the value of the multipleClearingSequenceCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMultipleClearingSequenceCount(BigInteger value) {
        this.multipleClearingSequenceCount = value;
    }

    /**
     * Gets the value of the tranDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTranDate() {
        return tranDate;
    }

    /**
     * Sets the value of the tranDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTranDate(XMLGregorianCalendar value) {
        this.tranDate = value;
    }

    /**
     * Gets the value of the srcAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getSrcAmt() {
        return srcAmt;
    }

    /**
     * Sets the value of the srcAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setSrcAmt(AmountType value) {
        this.srcAmt = value;
    }

    /**
     * Gets the value of the destAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getDestAmt() {
        return destAmt;
    }

    /**
     * Sets the value of the destAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setDestAmt(AmountType value) {
        this.destAmt = value;
    }

    /**
     * Gets the value of the productId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductId() {
        return productId;
    }

    /**
     * Sets the value of the productId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductId(String value) {
        this.productId = value;
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
     * Gets the value of the spndQlfdInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpndQlfdInd() {
        return spndQlfdInd;
    }

    /**
     * Sets the value of the spndQlfdInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpndQlfdInd(String value) {
        this.spndQlfdInd = value;
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

}
