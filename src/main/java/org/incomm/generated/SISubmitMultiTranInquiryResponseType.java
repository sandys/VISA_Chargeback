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
 * <p>Java class for SISubmitMultiTranInquiryResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SISubmitMultiTranInquiryResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.visa.com/ROLSI}ResponseBodyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}Status" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ResponseData" type="{http://www.visa.com/ROLSI}SubmitMultiTranInquiryResponseType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SISubmitMultiTranInquiryResponseType", propOrder = {
    "status",
    "responseData"
})
public class SISubmitMultiTranInquiryResponseType
    extends ResponseBodyType
{

    @XmlElement(name = "Status")
    protected List<StatusType> status;
    @XmlElement(name = "ResponseData", required = true)
    protected SubmitMultiTranInquiryResponseType responseData;

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
     * Gets the value of the responseData property.
     * 
     * @return
     *     possible object is
     *     {@link SubmitMultiTranInquiryResponseType }
     *     
     */
    public SubmitMultiTranInquiryResponseType getResponseData() {
        return responseData;
    }

    /**
     * Sets the value of the responseData property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubmitMultiTranInquiryResponseType }
     *     
     */
    public void setResponseData(SubmitMultiTranInquiryResponseType value) {
        this.responseData = value;
    }

}
