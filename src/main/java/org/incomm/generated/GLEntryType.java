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
 * <p>Java class for GLEntryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GLEntryType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GLType"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="PA"/&gt;
 *               &lt;enumeration value="DR"/&gt;
 *               &lt;enumeration value="WO"/&gt;
 *               &lt;enumeration value="O1"/&gt;
 *               &lt;enumeration value="O2"/&gt;
 *               &lt;enumeration value="O3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="GLEntryAmount" type="{http://www.visa.com/ROLSI}PostingAmountType"/&gt;
 *         &lt;element name="GLAccount" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="GLAccountDescription" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GLEntryType", propOrder = {
    "glType",
    "glEntryAmount",
    "glAccount",
    "glAccountDescription"
})
public class GLEntryType {

    @XmlElement(name = "GLType", required = true)
    protected String glType;
    @XmlElement(name = "GLEntryAmount", required = true)
    protected PostingAmountType glEntryAmount;
    @XmlElement(name = "GLAccount", required = true)
    protected String glAccount;
    @XmlElement(name = "GLAccountDescription", required = true)
    protected String glAccountDescription;

    /**
     * Gets the value of the glType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGLType() {
        return glType;
    }

    /**
     * Sets the value of the glType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGLType(String value) {
        this.glType = value;
    }

    /**
     * Gets the value of the glEntryAmount property.
     * 
     * @return
     *     possible object is
     *     {@link PostingAmountType }
     *     
     */
    public PostingAmountType getGLEntryAmount() {
        return glEntryAmount;
    }

    /**
     * Sets the value of the glEntryAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostingAmountType }
     *     
     */
    public void setGLEntryAmount(PostingAmountType value) {
        this.glEntryAmount = value;
    }

    /**
     * Gets the value of the glAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGLAccount() {
        return glAccount;
    }

    /**
     * Sets the value of the glAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGLAccount(String value) {
        this.glAccount = value;
    }

    /**
     * Gets the value of the glAccountDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGLAccountDescription() {
        return glAccountDescription;
    }

    /**
     * Sets the value of the glAccountDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGLAccountDescription(String value) {
        this.glAccountDescription = value;
    }

}
