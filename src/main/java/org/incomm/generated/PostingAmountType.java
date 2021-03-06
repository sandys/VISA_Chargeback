//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.02.13 at 11:38:26 AM EST 
//


package org.incomm.generated;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * This defines the posting amount with a Debit/credit flag.
 * 
 * <p>Java class for PostingAmountType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PostingAmountType"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.visa.com/ROLSI&gt;MonetaryAmount"&gt;
 *       &lt;attribute name="postingType" type="{http://www.visa.com/ROLSI}DebitCreditType" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PostingAmountType", propOrder = {
    "value"
})
public class PostingAmountType {

    @XmlValue
    protected BigDecimal value;
    @XmlAttribute(name = "postingType")
    protected DebitCreditType postingType;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValue(BigDecimal value) {
        this.value = value;
    }

    /**
     * Gets the value of the postingType property.
     * 
     * @return
     *     possible object is
     *     {@link DebitCreditType }
     *     
     */
    public DebitCreditType getPostingType() {
        return postingType;
    }

    /**
     * Sets the value of the postingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DebitCreditType }
     *     
     */
    public void setPostingType(DebitCreditType value) {
        this.postingType = value;
    }

}
