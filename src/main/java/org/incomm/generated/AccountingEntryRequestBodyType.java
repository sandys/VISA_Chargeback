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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountingEntryRequestBodyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccountingEntryRequestBodyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.visa.com/ROLSI}RequestBodyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element name="AccountingEntryRequest" type="{http://www.visa.com/ROLSI}AccountingEntryRequestType"/&gt;
 *           &lt;element name="AccountingEntryDetailsRequest" type="{http://www.visa.com/ROLSI}AccountingEntryDetailsRequestType"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountingEntryRequestBodyType", propOrder = {
    "accountingEntryRequest",
    "accountingEntryDetailsRequest"
})
public class AccountingEntryRequestBodyType
    extends RequestBodyType
{

    @XmlElement(name = "AccountingEntryRequest")
    protected AccountingEntryRequestType accountingEntryRequest;
    @XmlElement(name = "AccountingEntryDetailsRequest")
    protected AccountingEntryDetailsRequestType accountingEntryDetailsRequest;

    /**
     * Gets the value of the accountingEntryRequest property.
     * 
     * @return
     *     possible object is
     *     {@link AccountingEntryRequestType }
     *     
     */
    public AccountingEntryRequestType getAccountingEntryRequest() {
        return accountingEntryRequest;
    }

    /**
     * Sets the value of the accountingEntryRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountingEntryRequestType }
     *     
     */
    public void setAccountingEntryRequest(AccountingEntryRequestType value) {
        this.accountingEntryRequest = value;
    }

    /**
     * Gets the value of the accountingEntryDetailsRequest property.
     * 
     * @return
     *     possible object is
     *     {@link AccountingEntryDetailsRequestType }
     *     
     */
    public AccountingEntryDetailsRequestType getAccountingEntryDetailsRequest() {
        return accountingEntryDetailsRequest;
    }

    /**
     * Sets the value of the accountingEntryDetailsRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountingEntryDetailsRequestType }
     *     
     */
    public void setAccountingEntryDetailsRequest(AccountingEntryDetailsRequestType value) {
        this.accountingEntryDetailsRequest = value;
    }

}
