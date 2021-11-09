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
 * <p>Java class for UnmatchedItemRequestBodyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UnmatchedItemRequestBodyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.visa.com/ROLSI}RequestBodyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element name="RetrievePotentialMatchesRequest" type="{http://www.visa.com/ROLSI}RetrievePotentialMatchesRequestType"/&gt;
 *           &lt;element name="IgnoreUnmatchedItemRequest" type="{http://www.visa.com/ROLSI}IgnoreUnmatchedItemRequestType"/&gt;
 *           &lt;element name="AddUnmatchedItemToCaseRequest" type="{http://www.visa.com/ROLSI}AddUnmatchedItemToCaseRequestType"/&gt;
 *           &lt;element name="LinkAsSameDisputeRequest" type="{http://www.visa.com/ROLSI}LinkAsSameDisputeRequestType"/&gt;
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
@XmlType(name = "UnmatchedItemRequestBodyType", propOrder = {
    "retrievePotentialMatchesRequest",
    "ignoreUnmatchedItemRequest",
    "addUnmatchedItemToCaseRequest",
    "linkAsSameDisputeRequest"
})
public class UnmatchedItemRequestBodyType
    extends RequestBodyType
{

    @XmlElement(name = "RetrievePotentialMatchesRequest")
    protected RetrievePotentialMatchesRequestType retrievePotentialMatchesRequest;
    @XmlElement(name = "IgnoreUnmatchedItemRequest")
    protected IgnoreUnmatchedItemRequestType ignoreUnmatchedItemRequest;
    @XmlElement(name = "AddUnmatchedItemToCaseRequest")
    protected AddUnmatchedItemToCaseRequestType addUnmatchedItemToCaseRequest;
    @XmlElement(name = "LinkAsSameDisputeRequest")
    protected LinkAsSameDisputeRequestType linkAsSameDisputeRequest;

    /**
     * Gets the value of the retrievePotentialMatchesRequest property.
     * 
     * @return
     *     possible object is
     *     {@link RetrievePotentialMatchesRequestType }
     *     
     */
    public RetrievePotentialMatchesRequestType getRetrievePotentialMatchesRequest() {
        return retrievePotentialMatchesRequest;
    }

    /**
     * Sets the value of the retrievePotentialMatchesRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link RetrievePotentialMatchesRequestType }
     *     
     */
    public void setRetrievePotentialMatchesRequest(RetrievePotentialMatchesRequestType value) {
        this.retrievePotentialMatchesRequest = value;
    }

    /**
     * Gets the value of the ignoreUnmatchedItemRequest property.
     * 
     * @return
     *     possible object is
     *     {@link IgnoreUnmatchedItemRequestType }
     *     
     */
    public IgnoreUnmatchedItemRequestType getIgnoreUnmatchedItemRequest() {
        return ignoreUnmatchedItemRequest;
    }

    /**
     * Sets the value of the ignoreUnmatchedItemRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link IgnoreUnmatchedItemRequestType }
     *     
     */
    public void setIgnoreUnmatchedItemRequest(IgnoreUnmatchedItemRequestType value) {
        this.ignoreUnmatchedItemRequest = value;
    }

    /**
     * Gets the value of the addUnmatchedItemToCaseRequest property.
     * 
     * @return
     *     possible object is
     *     {@link AddUnmatchedItemToCaseRequestType }
     *     
     */
    public AddUnmatchedItemToCaseRequestType getAddUnmatchedItemToCaseRequest() {
        return addUnmatchedItemToCaseRequest;
    }

    /**
     * Sets the value of the addUnmatchedItemToCaseRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddUnmatchedItemToCaseRequestType }
     *     
     */
    public void setAddUnmatchedItemToCaseRequest(AddUnmatchedItemToCaseRequestType value) {
        this.addUnmatchedItemToCaseRequest = value;
    }

    /**
     * Gets the value of the linkAsSameDisputeRequest property.
     * 
     * @return
     *     possible object is
     *     {@link LinkAsSameDisputeRequestType }
     *     
     */
    public LinkAsSameDisputeRequestType getLinkAsSameDisputeRequest() {
        return linkAsSameDisputeRequest;
    }

    /**
     * Sets the value of the linkAsSameDisputeRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link LinkAsSameDisputeRequestType }
     *     
     */
    public void setLinkAsSameDisputeRequest(LinkAsSameDisputeRequestType value) {
        this.linkAsSameDisputeRequest = value;
    }

}