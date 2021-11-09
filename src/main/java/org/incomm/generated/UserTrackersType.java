//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.02.13 at 11:38:26 AM EST 
//


package org.incomm.generated;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UserTrackersType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UserTrackersType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UserTracker" type="{http://www.visa.com/ROLSI}UserTrackerType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="numberOfUserTrackers" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserTrackersType", propOrder = {
    "userTracker"
})
public class UserTrackersType {

    @XmlElement(name = "UserTracker")
    protected List<UserTrackerType> userTracker;
    @XmlAttribute(name = "numberOfUserTrackers")
    protected BigInteger numberOfUserTrackers;

    /**
     * Gets the value of the userTracker property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the userTracker property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUserTracker().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UserTrackerType }
     * 
     * 
     */
    public List<UserTrackerType> getUserTracker() {
        if (userTracker == null) {
            userTracker = new ArrayList<UserTrackerType>();
        }
        return this.userTracker;
    }

    /**
     * Gets the value of the numberOfUserTrackers property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfUserTrackers() {
        return numberOfUserTrackers;
    }

    /**
     * Sets the value of the numberOfUserTrackers property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfUserTrackers(BigInteger value) {
        this.numberOfUserTrackers = value;
    }

}