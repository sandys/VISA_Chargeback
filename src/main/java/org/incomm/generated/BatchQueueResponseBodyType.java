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
 * <p>Java class for BatchQueueResponseBodyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BatchQueueResponseBodyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.visa.com/ROLSI}ResponseBodyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element name="GetBatchQueueResponse" type="{http://www.visa.com/ROLSI}GetBatchQueueResponseType"/&gt;
 *           &lt;element name="MarkBatchQueueItemAsReadResponse" type="{http://www.visa.com/ROLSI}MarkBatchQueueItemAsReadResponseType"/&gt;
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
@XmlType(name = "BatchQueueResponseBodyType", propOrder = {
    "getBatchQueueResponse",
    "markBatchQueueItemAsReadResponse"
})
public class BatchQueueResponseBodyType
    extends ResponseBodyType
{

    @XmlElement(name = "GetBatchQueueResponse")
    protected GetBatchQueueResponseType getBatchQueueResponse;
    @XmlElement(name = "MarkBatchQueueItemAsReadResponse")
    protected MarkBatchQueueItemAsReadResponseType markBatchQueueItemAsReadResponse;

    /**
     * Gets the value of the getBatchQueueResponse property.
     * 
     * @return
     *     possible object is
     *     {@link GetBatchQueueResponseType }
     *     
     */
    public GetBatchQueueResponseType getGetBatchQueueResponse() {
        return getBatchQueueResponse;
    }

    /**
     * Sets the value of the getBatchQueueResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetBatchQueueResponseType }
     *     
     */
    public void setGetBatchQueueResponse(GetBatchQueueResponseType value) {
        this.getBatchQueueResponse = value;
    }

    /**
     * Gets the value of the markBatchQueueItemAsReadResponse property.
     * 
     * @return
     *     possible object is
     *     {@link MarkBatchQueueItemAsReadResponseType }
     *     
     */
    public MarkBatchQueueItemAsReadResponseType getMarkBatchQueueItemAsReadResponse() {
        return markBatchQueueItemAsReadResponse;
    }

    /**
     * Sets the value of the markBatchQueueItemAsReadResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarkBatchQueueItemAsReadResponseType }
     *     
     */
    public void setMarkBatchQueueItemAsReadResponse(MarkBatchQueueItemAsReadResponseType value) {
        this.markBatchQueueItemAsReadResponse = value;
    }

}
