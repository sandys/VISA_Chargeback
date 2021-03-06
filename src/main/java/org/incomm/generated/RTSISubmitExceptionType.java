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
 * <p>Java class for RTSISubmitExceptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RTSISubmitExceptionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.visa.com/ROLSI}ExceptionFileGroup"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RTSISubmitExceptionType", propOrder = {
    "deleteExceptionFile",
    "listNegativeExceptionFile",
    "listVIPExceptionFile"
})
public class RTSISubmitExceptionType {

    @XmlElement(name = "DeleteExceptionFile")
    protected RTSISubmitExceptionType.DeleteExceptionFile deleteExceptionFile;
    @XmlElement(name = "ListNegativeExceptionFile")
    protected RTSISubmitExceptionType.ListNegativeExceptionFile listNegativeExceptionFile;
    @XmlElement(name = "ListVIPExceptionFile")
    protected RTSISubmitExceptionType.ListVIPExceptionFile listVIPExceptionFile;

    /**
     * Gets the value of the deleteExceptionFile property.
     * 
     * @return
     *     possible object is
     *     {@link RTSISubmitExceptionType.DeleteExceptionFile }
     *     
     */
    public RTSISubmitExceptionType.DeleteExceptionFile getDeleteExceptionFile() {
        return deleteExceptionFile;
    }

    /**
     * Sets the value of the deleteExceptionFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link RTSISubmitExceptionType.DeleteExceptionFile }
     *     
     */
    public void setDeleteExceptionFile(RTSISubmitExceptionType.DeleteExceptionFile value) {
        this.deleteExceptionFile = value;
    }

    /**
     * Gets the value of the listNegativeExceptionFile property.
     * 
     * @return
     *     possible object is
     *     {@link RTSISubmitExceptionType.ListNegativeExceptionFile }
     *     
     */
    public RTSISubmitExceptionType.ListNegativeExceptionFile getListNegativeExceptionFile() {
        return listNegativeExceptionFile;
    }

    /**
     * Sets the value of the listNegativeExceptionFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link RTSISubmitExceptionType.ListNegativeExceptionFile }
     *     
     */
    public void setListNegativeExceptionFile(RTSISubmitExceptionType.ListNegativeExceptionFile value) {
        this.listNegativeExceptionFile = value;
    }

    /**
     * Gets the value of the listVIPExceptionFile property.
     * 
     * @return
     *     possible object is
     *     {@link RTSISubmitExceptionType.ListVIPExceptionFile }
     *     
     */
    public RTSISubmitExceptionType.ListVIPExceptionFile getListVIPExceptionFile() {
        return listVIPExceptionFile;
    }

    /**
     * Sets the value of the listVIPExceptionFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link RTSISubmitExceptionType.ListVIPExceptionFile }
     *     
     */
    public void setListVIPExceptionFile(RTSISubmitExceptionType.ListVIPExceptionFile value) {
        this.listVIPExceptionFile = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;group ref="{http://www.visa.com/ROLSI}DeleteExceptionFileGroup"/&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "visaCaseNumber",
        "accountNumber",
        "cardholderTransactionLimitInd"
    })
    public static class DeleteExceptionFile {

        @XmlElement(name = "VisaCaseNumber")
        protected Long visaCaseNumber;
        @XmlElement(name = "AccountNumber")
        protected String accountNumber;
        @XmlElement(name = "CardholderTransactionLimitInd")
        protected Boolean cardholderTransactionLimitInd;

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
         * Gets the value of the cardholderTransactionLimitInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isCardholderTransactionLimitInd() {
            return cardholderTransactionLimitInd;
        }

        /**
         * Sets the value of the cardholderTransactionLimitInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setCardholderTransactionLimitInd(Boolean value) {
            this.cardholderTransactionLimitInd = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;group ref="{http://www.visa.com/ROLSI}ListNegativeExceptionFileGroup"/&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "visaCaseNumber",
        "accountNumber",
        "purgeDate",
        "doNotPurgeInd",
        "actionCode",
        "cardRecoveryBulletinRegions"
    })
    public static class ListNegativeExceptionFile {

        @XmlElement(name = "VisaCaseNumber")
        protected Long visaCaseNumber;
        @XmlElement(name = "AccountNumber")
        protected String accountNumber;
        @XmlElement(name = "PurgeDate")
        @XmlSchemaType(name = "date")
        protected String purgeDate;
        @XmlElement(name = "DoNotPurgeInd")
        protected Boolean doNotPurgeInd;
        @XmlElement(name = "ActionCode", required = true)
        protected String actionCode;
        @XmlElement(name = "CardRecoveryBulletinRegions")
        protected CRBRegionType cardRecoveryBulletinRegions;

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
         * Gets the value of the purgeDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public String getPurgeDate() {
            return purgeDate;
        }

        /**
         * Sets the value of the purgeDate property.
         * 
         * @param string
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setPurgeDate(String string) {
            this.purgeDate = string;
        }

        /**
         * Gets the value of the doNotPurgeInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isDoNotPurgeInd() {
            return doNotPurgeInd;
        }

        /**
         * Sets the value of the doNotPurgeInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setDoNotPurgeInd(Boolean value) {
            this.doNotPurgeInd = value;
        }

        /**
         * Gets the value of the actionCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getActionCode() {
            return actionCode;
        }

        /**
         * Sets the value of the actionCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setActionCode(String value) {
            this.actionCode = value;
        }

        /**
         * Gets the value of the cardRecoveryBulletinRegions property.
         * 
         * @return
         *     possible object is
         *     {@link CRBRegionType }
         *     
         */
        public CRBRegionType getCardRecoveryBulletinRegions() {
            return cardRecoveryBulletinRegions;
        }

        /**
         * Sets the value of the cardRecoveryBulletinRegions property.
         * 
         * @param value
         *     allowed object is
         *     {@link CRBRegionType }
         *     
         */
        public void setCardRecoveryBulletinRegions(CRBRegionType value) {
            this.cardRecoveryBulletinRegions = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;group ref="{http://www.visa.com/ROLSI}ListVIPExceptionFileGroup"/&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "visaCaseNumber",
        "accountNumber",
        "purgeDate",
        "doNotPurgeInd",
        "activityLimit",
        "cardholderTransactionLimit"
    })
    public static class ListVIPExceptionFile {

        @XmlElement(name = "VisaCaseNumber")
        protected Long visaCaseNumber;
        @XmlElement(name = "AccountNumber")
        protected String accountNumber;
        @XmlElement(name = "PurgeDate")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar purgeDate;
        @XmlElement(name = "DoNotPurgeInd")
        protected Boolean doNotPurgeInd;
        @XmlElement(name = "ActivityLimit")
        protected String activityLimit;
        @XmlElement(name = "CardholderTransactionLimit")
        protected BigInteger cardholderTransactionLimit;

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
         * Gets the value of the purgeDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getPurgeDate() {
            return purgeDate;
        }

        /**
         * Sets the value of the purgeDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setPurgeDate(XMLGregorianCalendar value) {
            this.purgeDate = value;
        }

        /**
         * Gets the value of the doNotPurgeInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isDoNotPurgeInd() {
            return doNotPurgeInd;
        }

        /**
         * Sets the value of the doNotPurgeInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setDoNotPurgeInd(Boolean value) {
            this.doNotPurgeInd = value;
        }

        /**
         * Gets the value of the activityLimit property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getActivityLimit() {
            return activityLimit;
        }

        /**
         * Sets the value of the activityLimit property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setActivityLimit(String value) {
            this.activityLimit = value;
        }

        /**
         * Gets the value of the cardholderTransactionLimit property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getCardholderTransactionLimit() {
            return cardholderTransactionLimit;
        }

        /**
         * Sets the value of the cardholderTransactionLimit property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setCardholderTransactionLimit(BigInteger value) {
            this.cardholderTransactionLimit = value;
        }

    }

}
