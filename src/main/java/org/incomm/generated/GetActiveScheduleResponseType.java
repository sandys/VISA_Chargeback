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
 * <p>Java class for GetActiveScheduleResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetActiveScheduleResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ReportScheduleList" type="{http://www.visa.com/ROLSI}ReportScheduleListType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetActiveScheduleResponseType", propOrder = {
    "reportScheduleList"
})
public class GetActiveScheduleResponseType {

    @XmlElement(name = "ReportScheduleList")
    protected ReportScheduleListType reportScheduleList;

    /**
     * Gets the value of the reportScheduleList property.
     * 
     * @return
     *     possible object is
     *     {@link ReportScheduleListType }
     *     
     */
    public ReportScheduleListType getReportScheduleList() {
        return reportScheduleList;
    }

    /**
     * Sets the value of the reportScheduleList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportScheduleListType }
     *     
     */
    public void setReportScheduleList(ReportScheduleListType value) {
        this.reportScheduleList = value;
    }

}
