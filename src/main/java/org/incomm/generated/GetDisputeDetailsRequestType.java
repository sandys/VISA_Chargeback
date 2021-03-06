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
 * <p>Java class for GetDisputeDetailsRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetDisputeDetailsRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}VisaCaseNumber" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}DisputeId"/&gt;
 *         &lt;element name="IncludeDisputeAsImageInd" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DownloadImageInd" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetDisputeDetailsRequestType", propOrder = {
    "visaCaseNumber",
    "disputeId",
    "includeDisputeAsImageInd",
    "downloadImageInd"
})
public class GetDisputeDetailsRequestType {

    @XmlElement(name = "VisaCaseNumber")
    protected Long visaCaseNumber;
    @XmlElement(name = "DisputeId")
    protected long disputeId;
    @XmlElement(name = "IncludeDisputeAsImageInd")
    protected Boolean includeDisputeAsImageInd;
    @XmlElement(name = "DownloadImageInd")
    protected Boolean downloadImageInd;

    /**
     * Gets the value of the visaCaseNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getVisaCaseNumber() {
        return visaCaseNumber;
    }

    /**
     * Sets the value of the visaCaseNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setVisaCaseNumber(Long value) {
        this.visaCaseNumber = value;
    }

    /**
     * Gets the value of the disputeId property.
     * 
     */
    public long getDisputeId() {
        return disputeId;
    }

    /**
     * Sets the value of the disputeId property.
     * 
     */
    public void setDisputeId(long value) {
        this.disputeId = value;
    }

    /**
     * Gets the value of the includeDisputeAsImageInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeDisputeAsImageInd() {
        return includeDisputeAsImageInd;
    }

    /**
     * Sets the value of the includeDisputeAsImageInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeDisputeAsImageInd(Boolean value) {
        this.includeDisputeAsImageInd = value;
    }

    /**
     * Gets the value of the downloadImageInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDownloadImageInd() {
        return downloadImageInd;
    }

    /**
     * Sets the value of the downloadImageInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDownloadImageInd(Boolean value) {
        this.downloadImageInd = value;
    }

}
