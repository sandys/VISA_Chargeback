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
 * <p>Java class for RTSIRFCNonFulfillmentResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RTSIRFCNonFulfillmentResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.visa.com/ROLSI}RFCNonFulfillmentResponseType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}VisaCaseNumber"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}RFCID"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RTSIRFCNonFulfillmentResponseType", propOrder = {
    "visaCaseNumber",
    "rfcid"
})
public class RTSIRFCNonFulfillmentResponseType
    extends RFCNonFulfillmentResponseType
{

    @XmlElement(name = "VisaCaseNumber")
    protected long visaCaseNumber;
    @XmlElement(name = "RFCID")
    protected long rfcid;

    /**
     * Gets the value of the visaCaseNumber property.
     * 
     */
    public long getVisaCaseNumber() {
        return visaCaseNumber;
    }

    /**
     * Sets the value of the visaCaseNumber property.
     * 
     */
    public void setVisaCaseNumber(long value) {
        this.visaCaseNumber = value;
    }

    /**
     * Gets the value of the rfcid property.
     * 
     */
    public long getRFCID() {
        return rfcid;
    }

    /**
     * Sets the value of the rfcid property.
     * 
     */
    public void setRFCID(long value) {
        this.rfcid = value;
    }

}
