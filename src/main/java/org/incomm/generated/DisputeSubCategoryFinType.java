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
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for DisputeSubCategoryFinType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DisputeSubCategoryFinType"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.visa.com/ROLSI&gt;DisputeSubCategoryValueType"&gt;
 *       &lt;attribute name="DisputeSubCategoryDesc" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DisputeSubCategoryFinType", propOrder = {
    "value"
})
public class DisputeSubCategoryFinType {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "DisputeSubCategoryDesc")
    protected String disputeSubCategoryDesc;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the disputeSubCategoryDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisputeSubCategoryDesc() {
        return disputeSubCategoryDesc;
    }

    /**
     * Sets the value of the disputeSubCategoryDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisputeSubCategoryDesc(String value) {
        this.disputeSubCategoryDesc = value;
    }

}