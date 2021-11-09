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
 * <p>Java class for SubmitCollaborationRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubmitCollaborationRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}VisaCaseNumber"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}CollaborationId" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}MemberCaseNumber" minOccurs="0"/&gt;
 *         &lt;element name="CollaborationDescriptor" type="{http://www.visa.com/ROLSI}CollaborationDescriptorType" minOccurs="0"/&gt;
 *         &lt;element name="CollaborationAttachment" type="{http://www.visa.com/ROLSI}CollabAttachType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubmitCollaborationRequestType", propOrder = {
    "visaCaseNumber",
    "collaborationId",
    "memberCaseNumber",
    "collaborationDescriptor",
    "collaborationAttachment"
})
public class SubmitCollaborationRequestType {

    @XmlElement(name = "VisaCaseNumber")
    protected long visaCaseNumber;
    @XmlElement(name = "CollaborationId")
    protected Long collaborationId;
    @XmlElement(name = "MemberCaseNumber")
    protected String memberCaseNumber;
    @XmlElement(name = "CollaborationDescriptor")
    protected CollaborationDescriptorType collaborationDescriptor;
    @XmlElement(name = "CollaborationAttachment")
    protected CollabAttachType collaborationAttachment;

    /**
     * Gets the value of the visaCaseNumber property.
     * 
     */
    public long getVisaCaseNumber() {
        return visaCaseNumber;
    }

    /**
     * Sets the value of the visaCaseNumber property.
     * 
     */
    public void setVisaCaseNumber(long value) {
        this.visaCaseNumber = value;
    }

    /**
     * Gets the value of the collaborationId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCollaborationId() {
        return collaborationId;
    }

    /**
     * Sets the value of the collaborationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCollaborationId(Long value) {
        this.collaborationId = value;
    }

    /**
     * Gets the value of the memberCaseNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemberCaseNumber() {
        return memberCaseNumber;
    }

    /**
     * Sets the value of the memberCaseNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMemberCaseNumber(String value) {
        this.memberCaseNumber = value;
    }

    /**
     * Gets the value of the collaborationDescriptor property.
     * 
     * @return
     *     possible object is
     *     {@link CollaborationDescriptorType }
     *     
     */
    public CollaborationDescriptorType getCollaborationDescriptor() {
        return collaborationDescriptor;
    }

    /**
     * Sets the value of the collaborationDescriptor property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollaborationDescriptorType }
     *     
     */
    public void setCollaborationDescriptor(CollaborationDescriptorType value) {
        this.collaborationDescriptor = value;
    }

    /**
     * Gets the value of the collaborationAttachment property.
     * 
     * @return
     *     possible object is
     *     {@link CollabAttachType }
     *     
     */
    public CollabAttachType getCollaborationAttachment() {
        return collaborationAttachment;
    }

    /**
     * Sets the value of the collaborationAttachment property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollabAttachType }
     *     
     */
    public void setCollaborationAttachment(CollabAttachType value) {
        this.collaborationAttachment = value;
    }

}