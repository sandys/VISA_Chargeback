//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.02.13 at 11:38:26 AM EST 
//


package org.incomm.generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for MerchantDataResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MerchantDataResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}Status" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="CardholderName" type="{http://www.visa.com/ROLSI}Name50Type" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}CPD" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}MerchantName" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}ProcessingCode" minOccurs="0"/&gt;
 *         &lt;element name="ProcessingCodeDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}ECMOTO" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}ECMOTODescription" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}EntryMode" minOccurs="0"/&gt;
 *         &lt;element name="EntryModeDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SurchargeFeeAmount" type="{http://www.visa.com/ROLSI}AmountType" minOccurs="0"/&gt;
 *         &lt;element name="LocalCashBackAmount" type="{http://www.visa.com/ROLSI}AmountType" minOccurs="0"/&gt;
 *         &lt;element name="MerchantGroupDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MerchantCategoryGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}MCC" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}MCCDescription" minOccurs="0"/&gt;
 *         &lt;element name="GMRVisaStoreName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GMRVisaMerchantName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GMRMerchantStreetAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GMRMerchantCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GMRMerchantState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GMRMerchantPostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GMRMerchantCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GMRMerchantURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GMRMerchantContactPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PurchaseInquiryInformationDetail" type="{http://www.visa.com/ROLSI}PurchaseInquiryInformationResponseDataType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MerchantDataResponseType", propOrder = {
    "status",
    "cardholderName",
    "cpd",
    "merchantName",
    "processingCode",
    "processingCodeDescription",
    "ecmoto",
    "ecmotoDescription",
    "entryMode",
    "entryModeDesc",
    "surchargeFeeAmount",
    "localCashBackAmount",
    "merchantGroupDescription",
    "merchantCategoryGroup",
    "mcc",
    "mccDescription",
    "gmrVisaStoreName",
    "gmrVisaMerchantName",
    "gmrMerchantStreetAddress",
    "gmrMerchantCity",
    "gmrMerchantState",
    "gmrMerchantPostalCode",
    "gmrMerchantCountryCode",
    "gmrMerchantURL",
    "gmrMerchantContactPhone",
    "purchaseInquiryInformationDetail"
})
public class MerchantDataResponseType {

    @XmlElement(name = "Status")
    protected List<StatusType> status;
    @XmlElement(name = "CardholderName")
    protected String cardholderName;
    @XmlElement(name = "CPD")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar cpd;
    @XmlElement(name = "MerchantName")
    protected String merchantName;
    @XmlElement(name = "ProcessingCode")
    protected String processingCode;
    @XmlElement(name = "ProcessingCodeDescription")
    protected String processingCodeDescription;
    @XmlElement(name = "ECMOTO")
    protected String ecmoto;
    @XmlElement(name = "ECMOTODescription")
    protected String ecmotoDescription;
    @XmlElement(name = "EntryMode")
    protected String entryMode;
    @XmlElement(name = "EntryModeDesc")
    protected String entryModeDesc;
    @XmlElement(name = "SurchargeFeeAmount")
    protected AmountType surchargeFeeAmount;
    @XmlElement(name = "LocalCashBackAmount")
    protected AmountType localCashBackAmount;
    @XmlElement(name = "MerchantGroupDescription")
    protected String merchantGroupDescription;
    @XmlElement(name = "MerchantCategoryGroup")
    protected String merchantCategoryGroup;
    @XmlElement(name = "MCC")
    protected String mcc;
    @XmlElement(name = "MCCDescription")
    protected String mccDescription;
    @XmlElement(name = "GMRVisaStoreName")
    protected String gmrVisaStoreName;
    @XmlElement(name = "GMRVisaMerchantName")
    protected String gmrVisaMerchantName;
    @XmlElement(name = "GMRMerchantStreetAddress")
    protected String gmrMerchantStreetAddress;
    @XmlElement(name = "GMRMerchantCity")
    protected String gmrMerchantCity;
    @XmlElement(name = "GMRMerchantState")
    protected String gmrMerchantState;
    @XmlElement(name = "GMRMerchantPostalCode")
    protected String gmrMerchantPostalCode;
    @XmlElement(name = "GMRMerchantCountryCode")
    protected String gmrMerchantCountryCode;
    @XmlElement(name = "GMRMerchantURL")
    protected String gmrMerchantURL;
    @XmlElement(name = "GMRMerchantContactPhone")
    protected String gmrMerchantContactPhone;
    @XmlElement(name = "PurchaseInquiryInformationDetail")
    protected List<PurchaseInquiryInformationResponseDataType> purchaseInquiryInformationDetail;

    /**
     * Gets the value of the status property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the status property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StatusType }
     * 
     * 
     */
    public List<StatusType> getStatus() {
        if (status == null) {
            status = new ArrayList<StatusType>();
        }
        return this.status;
    }

    /**
     * Gets the value of the cardholderName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardholderName() {
        return cardholderName;
    }

    /**
     * Sets the value of the cardholderName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardholderName(String value) {
        this.cardholderName = value;
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
     * Gets the value of the processingCodeDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessingCodeDescription() {
        return processingCodeDescription;
    }

    /**
     * Sets the value of the processingCodeDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessingCodeDescription(String value) {
        this.processingCodeDescription = value;
    }

    /**
     * Gets the value of the ecmoto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getECMOTO() {
        return ecmoto;
    }

    /**
     * Sets the value of the ecmoto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setECMOTO(String value) {
        this.ecmoto = value;
    }

    /**
     * Gets the value of the ecmotoDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getECMOTODescription() {
        return ecmotoDescription;
    }

    /**
     * Sets the value of the ecmotoDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setECMOTODescription(String value) {
        this.ecmotoDescription = value;
    }

    /**
     * Gets the value of the entryMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntryMode() {
        return entryMode;
    }

    /**
     * Sets the value of the entryMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntryMode(String value) {
        this.entryMode = value;
    }

    /**
     * Gets the value of the entryModeDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntryModeDesc() {
        return entryModeDesc;
    }

    /**
     * Sets the value of the entryModeDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntryModeDesc(String value) {
        this.entryModeDesc = value;
    }

    /**
     * Gets the value of the surchargeFeeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getSurchargeFeeAmount() {
        return surchargeFeeAmount;
    }

    /**
     * Sets the value of the surchargeFeeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setSurchargeFeeAmount(AmountType value) {
        this.surchargeFeeAmount = value;
    }

    /**
     * Gets the value of the localCashBackAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getLocalCashBackAmount() {
        return localCashBackAmount;
    }

    /**
     * Sets the value of the localCashBackAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setLocalCashBackAmount(AmountType value) {
        this.localCashBackAmount = value;
    }

    /**
     * Gets the value of the merchantGroupDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantGroupDescription() {
        return merchantGroupDescription;
    }

    /**
     * Sets the value of the merchantGroupDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantGroupDescription(String value) {
        this.merchantGroupDescription = value;
    }

    /**
     * Gets the value of the merchantCategoryGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantCategoryGroup() {
        return merchantCategoryGroup;
    }

    /**
     * Sets the value of the merchantCategoryGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantCategoryGroup(String value) {
        this.merchantCategoryGroup = value;
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
     * Gets the value of the mccDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMCCDescription() {
        return mccDescription;
    }

    /**
     * Sets the value of the mccDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMCCDescription(String value) {
        this.mccDescription = value;
    }

    /**
     * Gets the value of the gmrVisaStoreName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGMRVisaStoreName() {
        return gmrVisaStoreName;
    }

    /**
     * Sets the value of the gmrVisaStoreName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGMRVisaStoreName(String value) {
        this.gmrVisaStoreName = value;
    }

    /**
     * Gets the value of the gmrVisaMerchantName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGMRVisaMerchantName() {
        return gmrVisaMerchantName;
    }

    /**
     * Sets the value of the gmrVisaMerchantName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGMRVisaMerchantName(String value) {
        this.gmrVisaMerchantName = value;
    }

    /**
     * Gets the value of the gmrMerchantStreetAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGMRMerchantStreetAddress() {
        return gmrMerchantStreetAddress;
    }

    /**
     * Sets the value of the gmrMerchantStreetAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGMRMerchantStreetAddress(String value) {
        this.gmrMerchantStreetAddress = value;
    }

    /**
     * Gets the value of the gmrMerchantCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGMRMerchantCity() {
        return gmrMerchantCity;
    }

    /**
     * Sets the value of the gmrMerchantCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGMRMerchantCity(String value) {
        this.gmrMerchantCity = value;
    }

    /**
     * Gets the value of the gmrMerchantState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGMRMerchantState() {
        return gmrMerchantState;
    }

    /**
     * Sets the value of the gmrMerchantState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGMRMerchantState(String value) {
        this.gmrMerchantState = value;
    }

    /**
     * Gets the value of the gmrMerchantPostalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGMRMerchantPostalCode() {
        return gmrMerchantPostalCode;
    }

    /**
     * Sets the value of the gmrMerchantPostalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGMRMerchantPostalCode(String value) {
        this.gmrMerchantPostalCode = value;
    }

    /**
     * Gets the value of the gmrMerchantCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGMRMerchantCountryCode() {
        return gmrMerchantCountryCode;
    }

    /**
     * Sets the value of the gmrMerchantCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGMRMerchantCountryCode(String value) {
        this.gmrMerchantCountryCode = value;
    }

    /**
     * Gets the value of the gmrMerchantURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGMRMerchantURL() {
        return gmrMerchantURL;
    }

    /**
     * Sets the value of the gmrMerchantURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGMRMerchantURL(String value) {
        this.gmrMerchantURL = value;
    }

    /**
     * Gets the value of the gmrMerchantContactPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGMRMerchantContactPhone() {
        return gmrMerchantContactPhone;
    }

    /**
     * Sets the value of the gmrMerchantContactPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGMRMerchantContactPhone(String value) {
        this.gmrMerchantContactPhone = value;
    }

    /**
     * Gets the value of the purchaseInquiryInformationDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the purchaseInquiryInformationDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPurchaseInquiryInformationDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PurchaseInquiryInformationResponseDataType }
     * 
     * 
     */
    public List<PurchaseInquiryInformationResponseDataType> getPurchaseInquiryInformationDetail() {
        if (purchaseInquiryInformationDetail == null) {
            purchaseInquiryInformationDetail = new ArrayList<PurchaseInquiryInformationResponseDataType>();
        }
        return this.purchaseInquiryInformationDetail;
    }

}