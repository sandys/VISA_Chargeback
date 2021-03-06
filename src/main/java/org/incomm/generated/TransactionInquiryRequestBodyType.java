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
 * <p>Java class for TransactionInquiryRequestBodyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransactionInquiryRequestBodyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.visa.com/ROLSI}RequestBodyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element name="SubmitTranInquiryRequest" type="{http://www.visa.com/ROLSI}SubmitTranInquiryRequestType"/&gt;
 *           &lt;element name="GetTransInquiryResultsRequest" type="{http://www.visa.com/ROLSI}GetTransInquiryResultsRequestType"/&gt;
 *           &lt;element name="GetTransDetailsRequest" type="{http://www.visa.com/ROLSI}GetTransDetailsRequestType"/&gt;
 *           &lt;element name="CreateCaseFromTransactionRequest" type="{http://www.visa.com/ROLSI}CreateCaseFromTransactionRequestType"/&gt;
 *           &lt;element name="SetTransactionForCaseRequest" type="{http://www.visa.com/ROLSI}SetTransactionForCaseRequestType"/&gt;
 *           &lt;element name="GetTransactionsFromCaseRequest" type="{http://www.visa.com/ROLSI}GetTransactionsFromCaseRequestType"/&gt;
 *           &lt;element name="GetMMIRequest" type="{http://www.visa.com/ROLSI}GetMMIRequestType"/&gt;
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
@XmlType(name = "TransactionInquiryRequestBodyType", propOrder = {
    "submitTranInquiryRequest",
    "getTransInquiryResultsRequest",
    "getTransDetailsRequest",
    "createCaseFromTransactionRequest",
    "setTransactionForCaseRequest",
    "getTransactionsFromCaseRequest",
    "getMMIRequest"
})
public class TransactionInquiryRequestBodyType
    extends RequestBodyType
{

    @XmlElement(name = "SubmitTranInquiryRequest")
    protected SubmitTranInquiryRequestType submitTranInquiryRequest;
    @XmlElement(name = "GetTransInquiryResultsRequest")
    protected GetTransInquiryResultsRequestType getTransInquiryResultsRequest;
    @XmlElement(name = "GetTransDetailsRequest")
    protected GetTransDetailsRequestType getTransDetailsRequest;
    @XmlElement(name = "CreateCaseFromTransactionRequest")
    protected CreateCaseFromTransactionRequestType createCaseFromTransactionRequest;
    @XmlElement(name = "SetTransactionForCaseRequest")
    protected SetTransactionForCaseRequestType setTransactionForCaseRequest;
    @XmlElement(name = "GetTransactionsFromCaseRequest")
    protected GetTransactionsFromCaseRequestType getTransactionsFromCaseRequest;
    @XmlElement(name = "GetMMIRequest")
    protected GetMMIRequestType getMMIRequest;

    /**
     * Gets the value of the submitTranInquiryRequest property.
     * 
     * @return
     *     possible object is
     *     {@link SubmitTranInquiryRequestType }
     *     
     */
    public SubmitTranInquiryRequestType getSubmitTranInquiryRequest() {
        return submitTranInquiryRequest;
    }

    /**
     * Sets the value of the submitTranInquiryRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubmitTranInquiryRequestType }
     *     
     */
    public void setSubmitTranInquiryRequest(SubmitTranInquiryRequestType value) {
        this.submitTranInquiryRequest = value;
    }

    /**
     * Gets the value of the getTransInquiryResultsRequest property.
     * 
     * @return
     *     possible object is
     *     {@link GetTransInquiryResultsRequestType }
     *     
     */
    public GetTransInquiryResultsRequestType getGetTransInquiryResultsRequest() {
        return getTransInquiryResultsRequest;
    }

    /**
     * Sets the value of the getTransInquiryResultsRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetTransInquiryResultsRequestType }
     *     
     */
    public void setGetTransInquiryResultsRequest(GetTransInquiryResultsRequestType value) {
        this.getTransInquiryResultsRequest = value;
    }

    /**
     * Gets the value of the getTransDetailsRequest property.
     * 
     * @return
     *     possible object is
     *     {@link GetTransDetailsRequestType }
     *     
     */
    public GetTransDetailsRequestType getGetTransDetailsRequest() {
        return getTransDetailsRequest;
    }

    /**
     * Sets the value of the getTransDetailsRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetTransDetailsRequestType }
     *     
     */
    public void setGetTransDetailsRequest(GetTransDetailsRequestType value) {
        this.getTransDetailsRequest = value;
    }

    /**
     * Gets the value of the createCaseFromTransactionRequest property.
     * 
     * @return
     *     possible object is
     *     {@link CreateCaseFromTransactionRequestType }
     *     
     */
    public CreateCaseFromTransactionRequestType getCreateCaseFromTransactionRequest() {
        return createCaseFromTransactionRequest;
    }

    /**
     * Sets the value of the createCaseFromTransactionRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreateCaseFromTransactionRequestType }
     *     
     */
    public void setCreateCaseFromTransactionRequest(CreateCaseFromTransactionRequestType value) {
        this.createCaseFromTransactionRequest = value;
    }

    /**
     * Gets the value of the setTransactionForCaseRequest property.
     * 
     * @return
     *     possible object is
     *     {@link SetTransactionForCaseRequestType }
     *     
     */
    public SetTransactionForCaseRequestType getSetTransactionForCaseRequest() {
        return setTransactionForCaseRequest;
    }

    /**
     * Sets the value of the setTransactionForCaseRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link SetTransactionForCaseRequestType }
     *     
     */
    public void setSetTransactionForCaseRequest(SetTransactionForCaseRequestType value) {
        this.setTransactionForCaseRequest = value;
    }

    /**
     * Gets the value of the getTransactionsFromCaseRequest property.
     * 
     * @return
     *     possible object is
     *     {@link GetTransactionsFromCaseRequestType }
     *     
     */
    public GetTransactionsFromCaseRequestType getGetTransactionsFromCaseRequest() {
        return getTransactionsFromCaseRequest;
    }

    /**
     * Sets the value of the getTransactionsFromCaseRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetTransactionsFromCaseRequestType }
     *     
     */
    public void setGetTransactionsFromCaseRequest(GetTransactionsFromCaseRequestType value) {
        this.getTransactionsFromCaseRequest = value;
    }

    /**
     * Gets the value of the getMMIRequest property.
     * 
     * @return
     *     possible object is
     *     {@link GetMMIRequestType }
     *     
     */
    public GetMMIRequestType getGetMMIRequest() {
        return getMMIRequest;
    }

    /**
     * Sets the value of the getMMIRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetMMIRequestType }
     *     
     */
    public void setGetMMIRequest(GetMMIRequestType value) {
        this.getMMIRequest = value;
    }

}
