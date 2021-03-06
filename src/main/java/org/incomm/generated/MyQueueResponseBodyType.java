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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MyQueueResponseBodyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MyQueueResponseBodyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.visa.com/ROLSI}ResponseBodyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.visa.com/ROLSI}MyQueueResponseGroup"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MyQueueResponseBodyType", propOrder = {
    "queueType",
    "pageInfo",
    "queue"
})
public class MyQueueResponseBodyType
    extends ResponseBodyType
{

    @XmlElement(name = "QueueType")
    @XmlSchemaType(name = "string")
    protected QueueTypeType queueType;
    @XmlElement(name = "PageInfo")
    protected PageInfoType pageInfo;
    @XmlElement(name = "Queue")
    protected QueueItemType queue;

    /**
     * Gets the value of the queueType property.
     * 
     * @return
     *     possible object is
     *     {@link QueueTypeType }
     *     
     */
    public QueueTypeType getQueueType() {
        return queueType;
    }

    /**
     * Sets the value of the queueType property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueueTypeType }
     *     
     */
    public void setQueueType(QueueTypeType value) {
        this.queueType = value;
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

    /**
     * Gets the value of the queue property.
     * 
     * @return
     *     possible object is
     *     {@link QueueItemType }
     *     
     */
    public QueueItemType getQueue() {
        return queue;
    }

    /**
     * Sets the value of the queue property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueueItemType }
     *     
     */
    public void setQueue(QueueItemType value) {
        this.queue = value;
    }

}
