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
 * <p>Java class for DispCancellationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DispCancellationType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="R0"/&gt;
 *     &lt;enumeration value="R1A"/&gt;
 *     &lt;enumeration value="R1B"/&gt;
 *     &lt;enumeration value="R3"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DispCancellationType")
@XmlEnum
public enum DispCancellationType {

    @XmlEnumValue("R0")
    R_0("R0"),
    @XmlEnumValue("R1A")
    R_1_A("R1A"),
    @XmlEnumValue("R1B")
    R_1_B("R1B"),
    @XmlEnumValue("R3")
    R_3("R3");
    private final String value;

    DispCancellationType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DispCancellationType fromValue(String v) {
        for (DispCancellationType c: DispCancellationType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
