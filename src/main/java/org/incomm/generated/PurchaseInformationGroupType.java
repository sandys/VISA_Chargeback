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
 * <p>Java class for PurchaseInformationGroupType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PurchaseInformationGroupType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PurchaseInquiryInformationDetail" type="{http://www.visa.com/ROLSI}PurchaseInquiryInformationResponseDataType" minOccurs="0"/&gt;
 *         &lt;element name="PurchaseInquiryId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="PurchaseInquiryResponseStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PurchaseInformationGroupType", propOrder = {
    "purchaseInquiryInformationDetail",
    "purchaseInquiryId",
    "purchaseInquiryResponseStatus"
})
public class PurchaseInformationGroupType {

    @XmlElement(name = "PurchaseInquiryInformationDetail")
    protected PurchaseInquiryInformationResponseDataType purchaseInquiryInformationDetail;
    @XmlElement(name = "PurchaseInquiryId")
    protected Long purchaseInquiryId;
    @XmlElement(name = "PurchaseInquiryResponseStatus")
    protected String purchaseInquiryResponseStatus;

    /**
     * Gets the value of the purchaseInquiryInformationDetail property.
     * 
     * @return
     *     possible object is
     *     {@link PurchaseInquiryInformationResponseDataType }
     *     
     */
    public PurchaseInquiryInformationResponseDataType getPurchaseInquiryInformationDetail() {
        return purchaseInquiryInformationDetail;
    }

    /**
     * Sets the value of the purchaseInquiryInformationDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurchaseInquiryInformationResponseDataType }
     *     
     */
    public void setPurchaseInquiryInformationDetail(PurchaseInquiryInformationResponseDataType value) {
        this.purchaseInquiryInformationDetail = value;
    }

    /**
     * Gets the value of the purchaseInquiryId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPurchaseInquiryId() {
        return purchaseInquiryId;
    }

    /**
     * Sets the value of the purchaseInquiryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPurchaseInquiryId(Long value) {
        this.purchaseInquiryId = value;
    }

    /**
     * Gets the value of the purchaseInquiryResponseStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurchaseInquiryResponseStatus() {
        return purchaseInquiryResponseStatus;
    }

    /**
     * Sets the value of the purchaseInquiryResponseStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurchaseInquiryResponseStatus(String value) {
        this.purchaseInquiryResponseStatus = value;
    }

}
