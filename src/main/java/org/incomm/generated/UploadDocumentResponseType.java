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
 * <p>Java class for UploadDocumentResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UploadDocumentResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.visa.com/ROLSI}BaseQnResponseType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{http://www.visa.com/ROLSI}QnId" minOccurs="0"/&gt;
 *           &lt;element ref="{http://www.visa.com/ROLSI}QuickFormID" minOccurs="0"/&gt;
 *           &lt;element name="DisputeItemInfo" type="{http://www.visa.com/ROLSI}DisputeItemInfoType" minOccurs="0"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}DocId"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UploadDocumentResponseType", propOrder = {
    "qnId",
    "quickFormID",
    "disputeItemInfo",
    "docId"
})
public class UploadDocumentResponseType
    extends BaseQnResponseType
{

    @XmlElement(name = "QnId")
    protected Long qnId;
    @XmlElement(name = "QuickFormID")
    protected Long quickFormID;
    @XmlElement(name = "DisputeItemInfo")
    protected DisputeItemInfoType disputeItemInfo;
    @XmlElement(name = "DocId")
    protected long docId;

    /**
     * Gets the value of the qnId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getQnId() {
        return qnId;
    }

    /**
     * Sets the value of the qnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setQnId(Long value) {
        this.qnId = value;
    }

    /**
     * Gets the value of the quickFormID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getQuickFormID() {
        return quickFormID;
    }

    /**
     * Sets the value of the quickFormID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setQuickFormID(Long value) {
        this.quickFormID = value;
    }

    /**
     * Gets the value of the disputeItemInfo property.
     * 
     * @return
     *     possible object is
     *     {@link DisputeItemInfoType }
     *     
     */
    public DisputeItemInfoType getDisputeItemInfo() {
        return disputeItemInfo;
    }

    /**
     * Sets the value of the disputeItemInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisputeItemInfoType }
     *     
     */
    public void setDisputeItemInfo(DisputeItemInfoType value) {
        this.disputeItemInfo = value;
    }

    /**
     * Gets the value of the docId property.
     * 
     */
    public long getDocId() {
        return docId;
    }

    /**
     * Sets the value of the docId property.
     * 
     */
    public void setDocId(long value) {
        this.docId = value;
    }

}
