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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for RFCFulfillmentResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RFCFulfillmentResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.visa.com/ROLSI}RFCFulfillmentType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}RFCCPD" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}DomesticProcessingInd" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RFCFulfillmentResponseType", propOrder = {
    "rfccpd",
    "domesticProcessingInd"
})
@XmlSeeAlso({
    RTSIRFCFulfillmentResponseType.class
})
public class RFCFulfillmentResponseType
    extends RFCFulfillmentType
{

    @XmlElement(name = "RFCCPD")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar rfccpd;
    @XmlElement(name = "DomesticProcessingInd")
    protected Boolean domesticProcessingInd;

    /**
     * Gets the value of the rfccpd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRFCCPD() {
        return rfccpd;
    }

    /**
     * Sets the value of the rfccpd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRFCCPD(XMLGregorianCalendar value) {
        this.rfccpd = value;
    }

    /**
     * Gets the value of the domesticProcessingInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDomesticProcessingInd() {
        return domesticProcessingInd;
    }

    /**
     * Sets the value of the domesticProcessingInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDomesticProcessingInd(Boolean value) {
        this.domesticProcessingInd = value;
    }

}
