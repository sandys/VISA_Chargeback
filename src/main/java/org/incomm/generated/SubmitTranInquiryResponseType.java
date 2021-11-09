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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SubmitTranInquiryResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubmitTranInquiryResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}TIEventID"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="TransactionSummary" type="{http://www.visa.com/ROLSI}TransactionSummaryType" maxOccurs="999" minOccurs="0"/&gt;
 *           &lt;element ref="{http://www.visa.com/ROLSI}TIErrorResponse" minOccurs="0"/&gt;
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
@XmlType(name = "SubmitTranInquiryResponseType", propOrder = {
    "tiEventID",
    "transactionSummary",
    "tiErrorResponse"
})
public class SubmitTranInquiryResponseType {

    @XmlElement(name = "TIEventID")
    protected long tiEventID;
    @XmlElement(name = "TransactionSummary")
    protected List<TransactionSummaryType> transactionSummary;
    @XmlElement(name = "TIErrorResponse")
    protected TIErrorResponse tiErrorResponse;

    /**
     * Gets the value of the tiEventID property.
     * 
     */
    public long getTIEventID() {
        return tiEventID;
    }

    /**
     * Sets the value of the tiEventID property.
     * 
     */
    public void setTIEventID(long value) {
        this.tiEventID = value;
    }

    /**
     * Gets the value of the transactionSummary property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transactionSummary property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransactionSummary().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransactionSummaryType }
     * 
     * 
     */
    public List<TransactionSummaryType> getTransactionSummary() {
        if (transactionSummary == null) {
            transactionSummary = new ArrayList<TransactionSummaryType>();
        }
        return this.transactionSummary;
    }

    /**
     * Gets the value of the tiErrorResponse property.
     * 
     * @return
     *     possible object is
     *     {@link TIErrorResponse }
     *     
     */
    public TIErrorResponse getTIErrorResponse() {
        return tiErrorResponse;
    }

    /**
     * Sets the value of the tiErrorResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link TIErrorResponse }
     *     
     */
    public void setTIErrorResponse(TIErrorResponse value) {
        this.tiErrorResponse = value;
    }

}
