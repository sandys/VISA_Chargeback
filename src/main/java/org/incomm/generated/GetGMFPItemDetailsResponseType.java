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
 * <p>Java class for GetGMFPItemDetailsResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetGMFPItemDetailsResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GMFPResponse" type="{http://www.visa.com/ROLSI}GMFPResponseType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetGMFPItemDetailsResponseType", propOrder = {
    "gmfpResponse"
})
public class GetGMFPItemDetailsResponseType {

    @XmlElement(name = "GMFPResponse", required = true)
    protected GMFPResponseType gmfpResponse;

    /**
     * Gets the value of the gmfpResponse property.
     * 
     * @return
     *     possible object is
     *     {@link GMFPResponseType }
     *     
     */
    public GMFPResponseType getGMFPResponse() {
        return gmfpResponse;
    }

    /**
     * Sets the value of the gmfpResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link GMFPResponseType }
     *     
     */
    public void setGMFPResponse(GMFPResponseType value) {
        this.gmfpResponse = value;
    }

}
