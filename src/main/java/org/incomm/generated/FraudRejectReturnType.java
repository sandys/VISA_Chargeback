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
 * <p>Java class for FraudRejectReturnType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FraudRejectReturnType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.visa.com/ROLSI}RejectReturnType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}FraudReport"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FraudRejectReturnType", propOrder = {
    "fraudReport"
})
public class FraudRejectReturnType
    extends RejectReturnType
{

    @XmlElement(name = "FraudReport", required = true)
    protected FraudReport fraudReport;

    /**
     * Gets the value of the fraudReport property.
     * 
     * @return
     *     possible object is
     *     {@link FraudReport }
     *     
     */
    public FraudReport getFraudReport() {
        return fraudReport;
    }

    /**
     * Sets the value of the fraudReport property.
     * 
     * @param value
     *     allowed object is
     *     {@link FraudReport }
     *     
     */
    public void setFraudReport(FraudReport value) {
        this.fraudReport = value;
    }

}