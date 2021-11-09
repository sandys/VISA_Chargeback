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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SubmitContactMessageResponseRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubmitContactMessageResponseRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}VisaCaseNumber" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}ContactMessageId" minOccurs="0"/&gt;
 *         &lt;element name="Comments" type="{http://www.visa.com/ROLSI}Desc5000Type" minOccurs="0"/&gt;
 *         &lt;group ref="{http://www.visa.com/ROLSI}SubmitDisputeContactMessageResponseRequest" minOccurs="0"/&gt;
 *         &lt;element name="Action" type="{http://www.visa.com/ROLSI}DisputeContactActionType" minOccurs="0"/&gt;
 *         &lt;element name="SupplyDocInd" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubmitContactMessageResponseRequestType", propOrder = {
    "visaCaseNumber",
    "contactMessageId",
    "comments",
    "disputeAttachmentDescriptor",
    "docIdList",
    "action",
    "supplyDocInd"
})
public class SubmitContactMessageResponseRequestType {

    @XmlElement(name = "VisaCaseNumber")
    protected Long visaCaseNumber;
    @XmlElement(name = "ContactMessageId")
    protected Long contactMessageId;
    @XmlElement(name = "Comments")
    protected String comments;
    @XmlElement(name = "DisputeAttachmentDescriptor")
    protected DisputeAttachmentDescriptorType disputeAttachmentDescriptor;
    @XmlElement(name = "DocIdList")
    protected DocIdListType docIdList;
    @XmlElement(name = "Action")
    @XmlSchemaType(name = "string")
    protected DisputeContactActionType action;
    @XmlElement(name = "SupplyDocInd")
    protected Boolean supplyDocInd;

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
     * Gets the value of the contactMessageId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getContactMessageId() {
        return contactMessageId;
    }

    /**
     * Sets the value of the contactMessageId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setContactMessageId(Long value) {
        this.contactMessageId = value;
    }

    /**
     * Gets the value of the comments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComments() {
        return comments;
    }

    /**
     * Sets the value of the comments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComments(String value) {
        this.comments = value;
    }

    /**
     * Gets the value of the disputeAttachmentDescriptor property.
     * 
     * @return
     *     possible object is
     *     {@link DisputeAttachmentDescriptorType }
     *     
     */
    public DisputeAttachmentDescriptorType getDisputeAttachmentDescriptor() {
        return disputeAttachmentDescriptor;
    }

    /**
     * Sets the value of the disputeAttachmentDescriptor property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisputeAttachmentDescriptorType }
     *     
     */
    public void setDisputeAttachmentDescriptor(DisputeAttachmentDescriptorType value) {
        this.disputeAttachmentDescriptor = value;
    }

    /**
     * Gets the value of the docIdList property.
     * 
     * @return
     *     possible object is
     *     {@link DocIdListType }
     *     
     */
    public DocIdListType getDocIdList() {
        return docIdList;
    }

    /**
     * Sets the value of the docIdList property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocIdListType }
     *     
     */
    public void setDocIdList(DocIdListType value) {
        this.docIdList = value;
    }

    /**
     * Gets the value of the action property.
     * 
     * @return
     *     possible object is
     *     {@link DisputeContactActionType }
     *     
     */
    public DisputeContactActionType getAction() {
        return action;
    }

    /**
     * Sets the value of the action property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisputeContactActionType }
     *     
     */
    public void setAction(DisputeContactActionType value) {
        this.action = value;
    }

    /**
     * Gets the value of the supplyDocInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSupplyDocInd() {
        return supplyDocInd;
    }

    /**
     * Sets the value of the supplyDocInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSupplyDocInd(Boolean value) {
        this.supplyDocInd = value;
    }

}
