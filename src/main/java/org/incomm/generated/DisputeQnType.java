//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.21 at 10:37:50 AM EST 
//


package org.incomm.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DisputeQnType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DisputeQnType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DISPRESP"/&gt;
 *     &lt;enumeration value="PREARB"/&gt;
 *     &lt;enumeration value="PREARBRESP"/&gt;
 *     &lt;enumeration value="PRECOMP"/&gt;
 *     &lt;enumeration value="PRECOMPRESP"/&gt;
 *     &lt;enumeration value="FILING"/&gt;
 *     &lt;enumeration value="PRECOMPRESP"/&gt;
 *     &lt;enumeration value="CONTACTMSG"/&gt;
 *     &lt;enumeration value="ACCEPTDISPUTE"/&gt;
 *     &lt;enumeration value="CHANGEDISPUTE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DisputeQnType")
@XmlEnum
public enum DisputeQnType {

    DISPRESP,
    PREARB,
    PREARBRESP,
    PRECOMP,
    PRECOMPRESP,
    FILING,
    CONTACTMSG,
    ACCEPTDISPUTE,
    CHANGEDISPUTE;

    public String value() {
        return name();
    }

    public static DisputeQnType fromValue(String v) {
        return valueOf(v);
    }

}