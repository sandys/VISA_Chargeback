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
 * <p>Java class for LinkUnlinkCaseResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LinkUnlinkCaseResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CaseInContext" type="{http://www.visa.com/ROLSI}VisaCaseNumberType"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="CaseLinked" type="{http://www.visa.com/ROLSI}VisaCaseNumberType"/&gt;
 *           &lt;element name="CaseUnlinked" type="{http://www.visa.com/ROLSI}VisaCaseNumberType"/&gt;
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
@XmlType(name = "LinkUnlinkCaseResponseType", propOrder = {
    "caseInContext",
    "caseLinked",
    "caseUnlinked"
})
public class LinkUnlinkCaseResponseType {

    @XmlElement(name = "CaseInContext")
    protected long caseInContext;
    @XmlElement(name = "CaseLinked")
    protected Long caseLinked;
    @XmlElement(name = "CaseUnlinked")
    protected Long caseUnlinked;

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
     * Gets the value of the caseLinked property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCaseLinked() {
        return caseLinked;
    }

    /**
     * Sets the value of the caseLinked property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCaseLinked(Long value) {
        this.caseLinked = value;
    }

    /**
     * Gets the value of the caseUnlinked property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCaseUnlinked() {
        return caseUnlinked;
    }

    /**
     * Sets the value of the caseUnlinked property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCaseUnlinked(Long value) {
        this.caseUnlinked = value;
    }

}