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
 * <p>Java class for GetFBDisputeQuestionnaireStatusRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetFBDisputeQuestionnaireStatusRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FraudBundleID" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetFBDisputeQuestionnaireStatusRequestType", propOrder = {
    "fraudBundleID"
})
public class GetFBDisputeQuestionnaireStatusRequestType {

    @XmlElement(name = "FraudBundleID")
    protected long fraudBundleID;

    /**
     * Gets the value of the fraudBundleID property.
     * 
     */
    public long getFraudBundleID() {
        return fraudBundleID;
    }

    /**
     * Sets the value of the fraudBundleID property.
     * 
     */
    public void setFraudBundleID(long value) {
        this.fraudBundleID = value;
    }

}