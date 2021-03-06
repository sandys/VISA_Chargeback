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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * @direction: Response
 * 
 * <p>Java class for CaseFilingFormDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CaseFilingFormDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}TransactionInfo" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{http://www.visa.com/ROLSI}Arbitration"/&gt;
 *           &lt;element ref="{http://www.visa.com/ROLSI}Compliance"/&gt;
 *           &lt;element ref="{http://www.visa.com/ROLSI}FilingResp"/&gt;
 *           &lt;element ref="{http://www.visa.com/ROLSI}ContactMessage"/&gt;
 *           &lt;element ref="{http://www.visa.com/ROLSI}Letter"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CaseFilingFormDataType", propOrder = {
    "transactionInfo",
    "arbitration",
    "compliance",
    "filingResp",
    "contactMessage",
    "letter"
})
@XmlSeeAlso({
    RTSIFilingDescriptorType.class
})
public class CaseFilingFormDataType {

    @XmlElement(name = "TransactionInfo")
    protected TranHeaderInfoType transactionInfo;
    @XmlElement(name = "Arbitration")
    protected ArbitrationType arbitration;
    @XmlElement(name = "Compliance")
    protected ComplianceType compliance;
    @XmlElement(name = "FilingResp")
    protected FilingRespType filingResp;
    @XmlElement(name = "ContactMessage")
    protected ContactMessageType contactMessage;
    @XmlElement(name = "Letter")
    protected LetterType letter;

    /**
     * Gets the value of the transactionInfo property.
     * 
     * @return
     *     possible object is
     *     {@link TranHeaderInfoType }
     *     
     */
    public TranHeaderInfoType getTransactionInfo() {
        return transactionInfo;
    }

    /**
     * Sets the value of the transactionInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TranHeaderInfoType }
     *     
     */
    public void setTransactionInfo(TranHeaderInfoType value) {
        this.transactionInfo = value;
    }

    /**
     * Gets the value of the arbitration property.
     * 
     * @return
     *     possible object is
     *     {@link ArbitrationType }
     *     
     */
    public ArbitrationType getArbitration() {
        return arbitration;
    }

    /**
     * Sets the value of the arbitration property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArbitrationType }
     *     
     */
    public void setArbitration(ArbitrationType value) {
        this.arbitration = value;
    }

    /**
     * Gets the value of the compliance property.
     * 
     * @return
     *     possible object is
     *     {@link ComplianceType }
     *     
     */
    public ComplianceType getCompliance() {
        return compliance;
    }

    /**
     * Sets the value of the compliance property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComplianceType }
     *     
     */
    public void setCompliance(ComplianceType value) {
        this.compliance = value;
    }

    /**
     * Gets the value of the filingResp property.
     * 
     * @return
     *     possible object is
     *     {@link FilingRespType }
     *     
     */
    public FilingRespType getFilingResp() {
        return filingResp;
    }

    /**
     * Sets the value of the filingResp property.
     * 
     * @param value
     *     allowed object is
     *     {@link FilingRespType }
     *     
     */
    public void setFilingResp(FilingRespType value) {
        this.filingResp = value;
    }

    /**
     * Gets the value of the contactMessage property.
     * 
     * @return
     *     possible object is
     *     {@link ContactMessageType }
     *     
     */
    public ContactMessageType getContactMessage() {
        return contactMessage;
    }

    /**
     * Sets the value of the contactMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactMessageType }
     *     
     */
    public void setContactMessage(ContactMessageType value) {
        this.contactMessage = value;
    }

    /**
     * Gets the value of the letter property.
     * 
     * @return
     *     possible object is
     *     {@link LetterType }
     *     
     */
    public LetterType getLetter() {
        return letter;
    }

    /**
     * Sets the value of the letter property.
     * 
     * @param value
     *     allowed object is
     *     {@link LetterType }
     *     
     */
    public void setLetter(LetterType value) {
        this.letter = value;
    }

}
