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
 * <p>Java class for UpdateGMFPItemDetailsResponseBodyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateGMFPItemDetailsResponseBodyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.visa.com/ROLSI}ResponseBodyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element name="UpdateGMFPItemDetailsResponse" type="{http://www.visa.com/ROLSI}UpdateGMFPItemDetailsResponseType"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateGMFPItemDetailsResponseBodyType", propOrder = {
    "updateGMFPItemDetailsResponse"
})
public class UpdateGMFPItemDetailsResponseBodyType
    extends ResponseBodyType
{

    @XmlElement(name = "UpdateGMFPItemDetailsResponse")
    protected UpdateGMFPItemDetailsResponseType updateGMFPItemDetailsResponse;

    /**
     * Gets the value of the updateGMFPItemDetailsResponse property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateGMFPItemDetailsResponseType }
     *     
     */
    public UpdateGMFPItemDetailsResponseType getUpdateGMFPItemDetailsResponse() {
        return updateGMFPItemDetailsResponse;
    }

    /**
     * Sets the value of the updateGMFPItemDetailsResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateGMFPItemDetailsResponseType }
     *     
     */
    public void setUpdateGMFPItemDetailsResponse(UpdateGMFPItemDetailsResponseType value) {
        this.updateGMFPItemDetailsResponse = value;
    }

}
