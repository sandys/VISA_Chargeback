//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.02.13 at 11:38:26 AM EST 
//


package org.incomm.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LinkUnlinkCasesRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LinkUnlinkCasesRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CaseInContext" type="{http://www.visa.com/ROLSI}VisaCaseNumberType"/&gt;
 *         &lt;element name="CaseToBeLinkedUnlinked" type="{http://www.visa.com/ROLSI}VisaCaseNumberType"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="operation" use="required" type="{http://www.visa.com/ROLSI}LinkUnlinkOperationType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LinkUnlinkCasesRequestType", propOrder = {
    "caseInContext",
    "caseToBeLinkedUnlinked"
})
public class LinkUnlinkCasesRequestType {

    @XmlElement(name = "CaseInContext")
    protected long caseInContext;
    @XmlElement(name = "CaseToBeLinkedUnlinked")
    protected long caseToBeLinkedUnlinked;
    @XmlAttribute(name = "operation", required = true)
    protected LinkUnlinkOperationType operation;

    /**
     * Gets the value of the caseInContext property.
     * 
     */
    public long getCaseInContext() {
        return caseInContext;
    }

    /**
     * Sets the value of the caseInContext property.
     * 
     */
    public void setCaseInContext(long value) {
        this.caseInContext = value;
    }

    /**
     * Gets the value of the caseToBeLinkedUnlinked property.
     * 
     */
    public long getCaseToBeLinkedUnlinked() {
        return caseToBeLinkedUnlinked;
    }

    /**
     * Sets the value of the caseToBeLinkedUnlinked property.
     * 
     */
    public void setCaseToBeLinkedUnlinked(long value) {
        this.caseToBeLinkedUnlinked = value;
    }

    /**
     * Gets the value of the operation property.
     * 
     * @return
     *     possible object is
     *     {@link LinkUnlinkOperationType }
     *     
     */
    public LinkUnlinkOperationType getOperation() {
        return operation;
    }

    /**
     * Sets the value of the operation property.
     * 
     * @param value
     *     allowed object is
     *     {@link LinkUnlinkOperationType }
     *     
     */
    public void setOperation(LinkUnlinkOperationType value) {
        this.operation = value;
    }

}
