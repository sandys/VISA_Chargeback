//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.02.13 at 11:38:26 AM EST 
//


package org.incomm.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RegionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RegionType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="US"/&gt;
 *     &lt;enumeration value="AP"/&gt;
 *     &lt;enumeration value="CEMEA"/&gt;
 *     &lt;enumeration value="Canada"/&gt;
 *     &lt;enumeration value="Europe"/&gt;
 *     &lt;enumeration value="LAC"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RegionType")
@XmlEnum
public enum RegionType {

    US("US"),
    AP("AP"),
    CEMEA("CEMEA"),
    @XmlEnumValue("Canada")
    CANADA("Canada"),
    @XmlEnumValue("Europe")
    EUROPE("Europe"),
    LAC("LAC");
    private final String value;

    RegionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RegionType fromValue(String v) {
        for (RegionType c: RegionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
