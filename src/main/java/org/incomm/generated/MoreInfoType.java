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
 * @definition: More Information.
 * 
 * <p>Java class for MoreInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MoreInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ConditionOfGoods" type="{http://www.visa.com/ROLSI}ConditionOfGoodsType" minOccurs="0"/&gt;
 *         &lt;element name="VersionOfItems" type="{http://www.visa.com/ROLSI}VersionOfItemsType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MoreInfoType", propOrder = {
    "conditionOfGoods",
    "versionOfItems"
})
public class MoreInfoType {

    @XmlElement(name = "ConditionOfGoods")
    protected String conditionOfGoods;
    @XmlElement(name = "VersionOfItems")
    protected String versionOfItems;

    /**
     * Gets the value of the conditionOfGoods property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConditionOfGoods() {
        return conditionOfGoods;
    }

    /**
     * Sets the value of the conditionOfGoods property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConditionOfGoods(String value) {
        this.conditionOfGoods = value;
    }

    /**
     * Gets the value of the versionOfItems property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersionOfItems() {
        return versionOfItems;
    }

    /**
     * Sets the value of the versionOfItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersionOfItems(String value) {
        this.versionOfItems = value;
    }

}
