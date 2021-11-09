//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.02.13 at 11:38:26 AM EST 
//


package org.incomm.generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HyperSearchResponseBodyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HyperSearchResponseBodyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.visa.com/ROLSI}ResponseBodyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.visa.com/ROLSI}HyperSearchResponseGroup"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HyperSearchResponseBodyType", propOrder = {
    "_case",
    "pageInfo"
})
public class HyperSearchResponseBodyType
    extends ResponseBodyType
{

    @XmlElement(name = "Case", required = true)
    protected List<HyperSearchCaseResponseType> _case;
    @XmlElement(name = "PageInfo")
    protected PageInfoType pageInfo;

    /**
     * Gets the value of the case property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the case property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCase().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HyperSearchCaseResponseType }
     * 
     * 
     */
    public List<HyperSearchCaseResponseType> getCase() {
        if (_case == null) {
            _case = new ArrayList<HyperSearchCaseResponseType>();
        }
        return this._case;
    }

    /**
     * Gets the value of the pageInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PageInfoType }
     *     
     */
    public PageInfoType getPageInfo() {
        return pageInfo;
    }

    /**
     * Sets the value of the pageInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PageInfoType }
     *     
     */
    public void setPageInfo(PageInfoType value) {
        this.pageInfo = value;
    }

}