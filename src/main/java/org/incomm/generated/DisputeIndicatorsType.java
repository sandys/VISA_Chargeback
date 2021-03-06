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
 * <p>Java class for DisputeIndicatorsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DisputeIndicatorsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DisputeId" type="{http://www.visa.com/ROLSI}DisputeIdIndType" minOccurs="0"/&gt;
 *         &lt;element name="AssociatedTransGroupId" type="{http://www.visa.com/ROLSI}AssociatedTransGroupIdIndType" minOccurs="0"/&gt;
 *         &lt;element name="DisputeResponseId" type="{http://www.visa.com/ROLSI}DisputeResponseIdIndType" minOccurs="0"/&gt;
 *         &lt;element name="DisputePreArbId" type="{http://www.visa.com/ROLSI}DisputePreArbIdIndType" minOccurs="0"/&gt;
 *         &lt;element name="DisputePreArbResponseId" type="{http://www.visa.com/ROLSI}DisputePreArbResponseIdIndType" minOccurs="0"/&gt;
 *         &lt;element name="DisputeFilingItemId" type="{http://www.visa.com/ROLSI}DisputeFilingItemIdIndType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="DisputePreCompId" type="{http://www.visa.com/ROLSI}DisputePreCompIdType" minOccurs="0"/&gt;
 *         &lt;element name="DisputePreCompResponseId" type="{http://www.visa.com/ROLSI}DisputePreCompResponseIdType" minOccurs="0"/&gt;
 *         &lt;element name="ContactMessages" type="{http://www.visa.com/ROLSI}ContactMessagesType" minOccurs="0"/&gt;
 *         &lt;element name="VROLFinancialID" type="{http://www.visa.com/ROLSI}VROLFinancialIDType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="DisputeFinancial" type="{http://www.visa.com/ROLSI}DisputeFinIdentifierType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="DisputeAdviceId" type="{http://www.visa.com/ROLSI}DisputeAdviceIdType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="QuickFormID" type="{http://www.visa.com/ROLSI}QuickFormIDIndType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DisputeIndicatorsType", propOrder = {
    "disputeId",
    "associatedTransGroupId",
    "disputeResponseId",
    "disputePreArbId",
    "disputePreArbResponseId",
    "disputeFilingItemId",
    "disputePreCompId",
    "disputePreCompResponseId",
    "contactMessages",
    "vrolFinancialID",
    "disputeFinancial",
    "disputeAdviceId",
    "quickFormID"
})
public class DisputeIndicatorsType {

    @XmlElement(name = "DisputeId")
    protected DisputeIdIndType disputeId;
    @XmlElement(name = "AssociatedTransGroupId")
    protected AssociatedTransGroupIdIndType associatedTransGroupId;
    @XmlElement(name = "DisputeResponseId")
    protected DisputeResponseIdIndType disputeResponseId;
    @XmlElement(name = "DisputePreArbId")
    protected DisputePreArbIdIndType disputePreArbId;
    @XmlElement(name = "DisputePreArbResponseId")
    protected DisputePreArbResponseIdIndType disputePreArbResponseId;
    @XmlElement(name = "DisputeFilingItemId")
    protected List<DisputeFilingItemIdIndType> disputeFilingItemId;
    @XmlElement(name = "DisputePreCompId")
    protected DisputePreCompIdType disputePreCompId;
    @XmlElement(name = "DisputePreCompResponseId")
    protected DisputePreCompResponseIdType disputePreCompResponseId;
    @XmlElement(name = "ContactMessages")
    protected ContactMessagesType contactMessages;
    @XmlElement(name = "VROLFinancialID")
    protected List<VROLFinancialIDType> vrolFinancialID;
    @XmlElement(name = "DisputeFinancial")
    protected List<DisputeFinIdentifierType> disputeFinancial;
    @XmlElement(name = "DisputeAdviceId")
    protected List<DisputeAdviceIdType> disputeAdviceId;
    @XmlElement(name = "QuickFormID")
    protected QuickFormIDIndType quickFormID;

    /**
     * Gets the value of the disputeId property.
     * 
     * @return
     *     possible object is
     *     {@link DisputeIdIndType }
     *     
     */
    public DisputeIdIndType getDisputeId() {
        return disputeId;
    }

    /**
     * Sets the value of the disputeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisputeIdIndType }
     *     
     */
    public void setDisputeId(DisputeIdIndType value) {
        this.disputeId = value;
    }

    /**
     * Gets the value of the associatedTransGroupId property.
     * 
     * @return
     *     possible object is
     *     {@link AssociatedTransGroupIdIndType }
     *     
     */
    public AssociatedTransGroupIdIndType getAssociatedTransGroupId() {
        return associatedTransGroupId;
    }

    /**
     * Sets the value of the associatedTransGroupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssociatedTransGroupIdIndType }
     *     
     */
    public void setAssociatedTransGroupId(AssociatedTransGroupIdIndType value) {
        this.associatedTransGroupId = value;
    }

    /**
     * Gets the value of the disputeResponseId property.
     * 
     * @return
     *     possible object is
     *     {@link DisputeResponseIdIndType }
     *     
     */
    public DisputeResponseIdIndType getDisputeResponseId() {
        return disputeResponseId;
    }

    /**
     * Sets the value of the disputeResponseId property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisputeResponseIdIndType }
     *     
     */
    public void setDisputeResponseId(DisputeResponseIdIndType value) {
        this.disputeResponseId = value;
    }

    /**
     * Gets the value of the disputePreArbId property.
     * 
     * @return
     *     possible object is
     *     {@link DisputePreArbIdIndType }
     *     
     */
    public DisputePreArbIdIndType getDisputePreArbId() {
        return disputePreArbId;
    }

    /**
     * Sets the value of the disputePreArbId property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisputePreArbIdIndType }
     *     
     */
    public void setDisputePreArbId(DisputePreArbIdIndType value) {
        this.disputePreArbId = value;
    }

    /**
     * Gets the value of the disputePreArbResponseId property.
     * 
     * @return
     *     possible object is
     *     {@link DisputePreArbResponseIdIndType }
     *     
     */
    public DisputePreArbResponseIdIndType getDisputePreArbResponseId() {
        return disputePreArbResponseId;
    }

    /**
     * Sets the value of the disputePreArbResponseId property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisputePreArbResponseIdIndType }
     *     
     */
    public void setDisputePreArbResponseId(DisputePreArbResponseIdIndType value) {
        this.disputePreArbResponseId = value;
    }

    /**
     * Gets the value of the disputeFilingItemId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the disputeFilingItemId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDisputeFilingItemId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DisputeFilingItemIdIndType }
     * 
     * 
     */
    public List<DisputeFilingItemIdIndType> getDisputeFilingItemId() {
        if (disputeFilingItemId == null) {
            disputeFilingItemId = new ArrayList<DisputeFilingItemIdIndType>();
        }
        return this.disputeFilingItemId;
    }

    /**
     * Gets the value of the disputePreCompId property.
     * 
     * @return
     *     possible object is
     *     {@link DisputePreCompIdType }
     *     
     */
    public DisputePreCompIdType getDisputePreCompId() {
        return disputePreCompId;
    }

    /**
     * Sets the value of the disputePreCompId property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisputePreCompIdType }
     *     
     */
    public void setDisputePreCompId(DisputePreCompIdType value) {
        this.disputePreCompId = value;
    }

    /**
     * Gets the value of the disputePreCompResponseId property.
     * 
     * @return
     *     possible object is
     *     {@link DisputePreCompResponseIdType }
     *     
     */
    public DisputePreCompResponseIdType getDisputePreCompResponseId() {
        return disputePreCompResponseId;
    }

    /**
     * Sets the value of the disputePreCompResponseId property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisputePreCompResponseIdType }
     *     
     */
    public void setDisputePreCompResponseId(DisputePreCompResponseIdType value) {
        this.disputePreCompResponseId = value;
    }

    /**
     * Gets the value of the contactMessages property.
     * 
     * @return
     *     possible object is
     *     {@link ContactMessagesType }
     *     
     */
    public ContactMessagesType getContactMessages() {
        return contactMessages;
    }

    /**
     * Sets the value of the contactMessages property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactMessagesType }
     *     
     */
    public void setContactMessages(ContactMessagesType value) {
        this.contactMessages = value;
    }

    /**
     * Gets the value of the vrolFinancialID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vrolFinancialID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVROLFinancialID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VROLFinancialIDType }
     * 
     * 
     */
    public List<VROLFinancialIDType> getVROLFinancialID() {
        if (vrolFinancialID == null) {
            vrolFinancialID = new ArrayList<VROLFinancialIDType>();
        }
        return this.vrolFinancialID;
    }

    /**
     * Gets the value of the disputeFinancial property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the disputeFinancial property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDisputeFinancial().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DisputeFinIdentifierType }
     * 
     * 
     */
    public List<DisputeFinIdentifierType> getDisputeFinancial() {
        if (disputeFinancial == null) {
            disputeFinancial = new ArrayList<DisputeFinIdentifierType>();
        }
        return this.disputeFinancial;
    }

    /**
     * Gets the value of the disputeAdviceId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the disputeAdviceId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDisputeAdviceId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DisputeAdviceIdType }
     * 
     * 
     */
    public List<DisputeAdviceIdType> getDisputeAdviceId() {
        if (disputeAdviceId == null) {
            disputeAdviceId = new ArrayList<DisputeAdviceIdType>();
        }
        return this.disputeAdviceId;
    }

    /**
     * Gets the value of the quickFormID property.
     * 
     * @return
     *     possible object is
     *     {@link QuickFormIDIndType }
     *     
     */
    public QuickFormIDIndType getQuickFormID() {
        return quickFormID;
    }

    /**
     * Sets the value of the quickFormID property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuickFormIDIndType }
     *     
     */
    public void setQuickFormID(QuickFormIDIndType value) {
        this.quickFormID = value;
    }

}
