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
 * <p>Java class for VDASRequestBodyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VDASRequestBodyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.visa.com/ROLSI}RequestBodyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element name="GetVDASDetailsRequest" type="{http://www.visa.com/ROLSI}GetVDASDetailsRequestType"/&gt;
 *           &lt;element name="IgnoreVDASRequest" type="{http://www.visa.com/ROLSI}IgnoreVDASRequestType"/&gt;
 *           &lt;element name="IgnoreReverseVDASRequest" type="{http://www.visa.com/ROLSI}IgnoreReverseVDASRequestType"/&gt;
 *           &lt;element name="ViewPotentialQnMatchesRequest" type="{http://www.visa.com/ROLSI}ViewPotentialQnMatchesType"/&gt;
 *           &lt;element name="ViewPotentialVDASMatchesRequest" type="{http://www.visa.com/ROLSI}ViewPotentialVDASMatchesType"/&gt;
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
@XmlType(name = "VDASRequestBodyType", propOrder = {
    "getVDASDetailsRequest",
    "ignoreVDASRequest",
    "ignoreReverseVDASRequest",
    "viewPotentialQnMatchesRequest",
    "viewPotentialVDASMatchesRequest"
})
public class VDASRequestBodyType
    extends RequestBodyType
{

    @XmlElement(name = "GetVDASDetailsRequest")
    protected GetVDASDetailsRequestType getVDASDetailsRequest;
    @XmlElement(name = "IgnoreVDASRequest")
    protected IgnoreVDASRequestType ignoreVDASRequest;
    @XmlElement(name = "IgnoreReverseVDASRequest")
    protected IgnoreReverseVDASRequestType ignoreReverseVDASRequest;
    @XmlElement(name = "ViewPotentialQnMatchesRequest")
    protected ViewPotentialQnMatchesType viewPotentialQnMatchesRequest;
    @XmlElement(name = "ViewPotentialVDASMatchesRequest")
    protected ViewPotentialVDASMatchesType viewPotentialVDASMatchesRequest;

    /**
     * Gets the value of the getVDASDetailsRequest property.
     * 
     * @return
     *     possible object is
     *     {@link GetVDASDetailsRequestType }
     *     
     */
    public GetVDASDetailsRequestType getGetVDASDetailsRequest() {
        return getVDASDetailsRequest;
    }

    /**
     * Sets the value of the getVDASDetailsRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetVDASDetailsRequestType }
     *     
     */
    public void setGetVDASDetailsRequest(GetVDASDetailsRequestType value) {
        this.getVDASDetailsRequest = value;
    }

    /**
     * Gets the value of the ignoreVDASRequest property.
     * 
     * @return
     *     possible object is
     *     {@link IgnoreVDASRequestType }
     *     
     */
    public IgnoreVDASRequestType getIgnoreVDASRequest() {
        return ignoreVDASRequest;
    }

    /**
     * Sets the value of the ignoreVDASRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link IgnoreVDASRequestType }
     *     
     */
    public void setIgnoreVDASRequest(IgnoreVDASRequestType value) {
        this.ignoreVDASRequest = value;
    }

    /**
     * Gets the value of the ignoreReverseVDASRequest property.
     * 
     * @return
     *     possible object is
     *     {@link IgnoreReverseVDASRequestType }
     *     
     */
    public IgnoreReverseVDASRequestType getIgnoreReverseVDASRequest() {
        return ignoreReverseVDASRequest;
    }

    /**
     * Sets the value of the ignoreReverseVDASRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link IgnoreReverseVDASRequestType }
     *     
     */
    public void setIgnoreReverseVDASRequest(IgnoreReverseVDASRequestType value) {
        this.ignoreReverseVDASRequest = value;
    }

    /**
     * Gets the value of the viewPotentialQnMatchesRequest property.
     * 
     * @return
     *     possible object is
     *     {@link ViewPotentialQnMatchesType }
     *     
     */
    public ViewPotentialQnMatchesType getViewPotentialQnMatchesRequest() {
        return viewPotentialQnMatchesRequest;
    }

    /**
     * Sets the value of the viewPotentialQnMatchesRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link ViewPotentialQnMatchesType }
     *     
     */
    public void setViewPotentialQnMatchesRequest(ViewPotentialQnMatchesType value) {
        this.viewPotentialQnMatchesRequest = value;
    }

    /**
     * Gets the value of the viewPotentialVDASMatchesRequest property.
     * 
     * @return
     *     possible object is
     *     {@link ViewPotentialVDASMatchesType }
     *     
     */
    public ViewPotentialVDASMatchesType getViewPotentialVDASMatchesRequest() {
        return viewPotentialVDASMatchesRequest;
    }

    /**
     * Sets the value of the viewPotentialVDASMatchesRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link ViewPotentialVDASMatchesType }
     *     
     */
    public void setViewPotentialVDASMatchesRequest(ViewPotentialVDASMatchesType value) {
        this.viewPotentialVDASMatchesRequest = value;
    }

}
