//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.02.13 at 11:38:26 AM EST 
//


package org.incomm.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DCType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DCType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AUTH"/&gt;
 *     &lt;enumeration value="FR"/&gt;
 *     &lt;enumeration value="PE"/&gt;
 *     &lt;enumeration value="CSMR"/&gt;
 *     &lt;enumeration value="PC"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DCType")
@XmlEnum
public enum DCType {

    AUTH,
    FR,
    PE,
    CSMR,
    PC;

    public String value() {
        return name();
    }

    public static DCType fromValue(String v) {
        return valueOf(v);
    }

}