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
 * <p>Java class for RfiIndicatorsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RfiIndicatorsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RfiEventId" type="{http://www.visa.com/ROLSI}RfiEventIdType" minOccurs="0"/&gt;
 *         &lt;element name="RfiComplete" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RfiIndicatorsType", propOrder = {
    "rfiEventId",
    "rfiComplete"
})
public class RfiIndicatorsType {

    @XmlElement(name = "RfiEventId")
    protected RfiEventIdType rfiEventId;
    @XmlElement(name = "RfiComplete")
    protected Boolean rfiComplete;

    /**
     * Gets the value of the rfiEventId property.
     * 
     * @return
     *     possible object is
     *     {@link RfiEventIdType }
     *     
     */
    public RfiEventIdType getRfiEventId() {
        return rfiEventId;
    }

    /**
     * Sets the value of the rfiEventId property.
     * 
     * @param value
     *     allowed object is
     *     {@link RfiEventIdType }
     *     
     */
    public void setRfiEventId(RfiEventIdType value) {
        this.rfiEventId = value;
    }

    /**
     * Gets the value of the rfiComplete property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRfiComplete() {
        return rfiComplete;
    }

    /**
     * Sets the value of the rfiComplete property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRfiComplete(Boolean value) {
        this.rfiComplete = value;
    }

}
