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
 * <p>Java class for EFLActionCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EFLActionCodeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="EFL04"/&gt;
 *     &lt;enumeration value="EFL05"/&gt;
 *     &lt;enumeration value="EFL07"/&gt;
 *     &lt;enumeration value="EFL14"/&gt;
 *     &lt;enumeration value="EFL41"/&gt;
 *     &lt;enumeration value="EFL43"/&gt;
 *     &lt;enumeration value="EFL54"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EFLActionCodeType")
@XmlEnum
public enum EFLActionCodeType {

    @XmlEnumValue("EFL04")
    EFL_04("EFL04"),
    @XmlEnumValue("EFL05")
    EFL_05("EFL05"),
    @XmlEnumValue("EFL07")
    EFL_07("EFL07"),
    @XmlEnumValue("EFL14")
    EFL_14("EFL14"),
    @XmlEnumValue("EFL41")
    EFL_41("EFL41"),
    @XmlEnumValue("EFL43")
    EFL_43("EFL43"),
    @XmlEnumValue("EFL54")
    EFL_54("EFL54");
    private final String value;

    EFLActionCodeType(String v) {
        value = v;
    }

    @JsonValue
    public String value() {
        return value;
    }

    @JsonCreator
    public static EFLActionCodeType fromValue(String v) {
        for (EFLActionCodeType c: EFLActionCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
