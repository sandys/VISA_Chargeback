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

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonValue;


/**
 * <p>Java class for FraudRptIndType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FraudRptIndType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Exist"/&gt;
 *     &lt;enumeration value="NotExist"/&gt;
 *     &lt;enumeration value="Unknown"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FraudRptIndType")
@XmlEnum
public enum FraudRptIndType {

    @XmlEnumValue("Exist")
    EXIST("Exist"),
    @XmlEnumValue("NotExist")
    NOT_EXIST("NotExist"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    FraudRptIndType(String v) {
        value = v;
    }
    @JsonValue
    public String value() {
        return value;
    }

    @JsonCreator
    public static FraudRptIndType fromValue(String v) {
        for (FraudRptIndType c: FraudRptIndType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
