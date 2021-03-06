//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.02.13 at 11:38:26 AM EST 
//


package org.incomm.generated;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * @definition: Container for all the information about an item.
 * 
 * <p>Java class for ItemDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItemDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ItemDescription" type="{http://www.visa.com/ROLSI}ItemDescriptionType" minOccurs="0"/&gt;
 *         &lt;element name="ArtistOrSeller" type="{http://www.visa.com/ROLSI}ArtistOrSellerType" minOccurs="0"/&gt;
 *         &lt;element name="ItemType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Quantity" type="{http://www.visa.com/ROLSI}QuantityType" minOccurs="0"/&gt;
 *         &lt;element name="Price" type="{http://www.visa.com/ROLSI}MerchantAmountType" minOccurs="0"/&gt;
 *         &lt;element name="ShippingInfo" type="{http://www.visa.com/ROLSI}ShippingInfoType" minOccurs="0"/&gt;
 *         &lt;element name="MoreInfo" type="{http://www.visa.com/ROLSI}MoreInfoType" minOccurs="0"/&gt;
 *         &lt;element name="CreditReimbursementSequenceNumber" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemDetailsType", propOrder = {
    "itemDescription",
    "artistOrSeller",
    "itemType",
    "quantity",
    "price",
    "shippingInfo",
    "moreInfo",
    "creditReimbursementSequenceNumber"
})
public class ItemDetailsType {

    @XmlElement(name = "ItemDescription")
    protected String itemDescription;
    @XmlElement(name = "ArtistOrSeller")
    protected String artistOrSeller;
    @XmlElement(name = "ItemType")
    protected String itemType;
    @XmlElement(name = "Quantity")
    protected BigDecimal quantity;
    @XmlElement(name = "Price")
    protected MerchantAmountType price;
    @XmlElement(name = "ShippingInfo")
    protected ShippingInfoType shippingInfo;
    @XmlElement(name = "MoreInfo")
    protected MoreInfoType moreInfo;
    @XmlElement(name = "CreditReimbursementSequenceNumber")
    protected BigInteger creditReimbursementSequenceNumber;

    /**
     * Gets the value of the itemDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemDescription() {
        return itemDescription;
    }

    /**
     * Sets the value of the itemDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemDescription(String value) {
        this.itemDescription = value;
    }

    /**
     * Gets the value of the artistOrSeller property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArtistOrSeller() {
        return artistOrSeller;
    }

    /**
     * Sets the value of the artistOrSeller property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArtistOrSeller(String value) {
        this.artistOrSeller = value;
    }

    /**
     * Gets the value of the itemType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemType() {
        return itemType;
    }

    /**
     * Sets the value of the itemType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemType(String value) {
        this.itemType = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQuantity(BigDecimal value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the price property.
     * 
     * @return
     *     possible object is
     *     {@link MerchantAmountType }
     *     
     */
    public MerchantAmountType getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     * @param value
     *     allowed object is
     *     {@link MerchantAmountType }
     *     
     */
    public void setPrice(MerchantAmountType value) {
        this.price = value;
    }

    /**
     * Gets the value of the shippingInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ShippingInfoType }
     *     
     */
    public ShippingInfoType getShippingInfo() {
        return shippingInfo;
    }

    /**
     * Sets the value of the shippingInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShippingInfoType }
     *     
     */
    public void setShippingInfo(ShippingInfoType value) {
        this.shippingInfo = value;
    }

    /**
     * Gets the value of the moreInfo property.
     * 
     * @return
     *     possible object is
     *     {@link MoreInfoType }
     *     
     */
    public MoreInfoType getMoreInfo() {
        return moreInfo;
    }

    /**
     * Sets the value of the moreInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link MoreInfoType }
     *     
     */
    public void setMoreInfo(MoreInfoType value) {
        this.moreInfo = value;
    }

    /**
     * Gets the value of the creditReimbursementSequenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCreditReimbursementSequenceNumber() {
        return creditReimbursementSequenceNumber;
    }

    /**
     * Sets the value of the creditReimbursementSequenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCreditReimbursementSequenceNumber(BigInteger value) {
        this.creditReimbursementSequenceNumber = value;
    }

}
