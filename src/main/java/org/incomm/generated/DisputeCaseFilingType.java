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
 * <p>Java class for DisputeCaseFilingType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DisputeCaseFilingType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Arbitration"/&gt;
 *     &lt;enumeration value="Compliance"/&gt;
 *     &lt;enumeration value="FilingResponse"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DisputeCaseFilingType")
@XmlEnum
public enum DisputeCaseFilingType {

    @XmlEnumValue("Arbitration")
    ARBITRATION("Arbitration"),
    @XmlEnumValue("Compliance")
    COMPLIANCE("Compliance"),
    @XmlEnumValue("FilingResponse")
    FILING_RESPONSE("FilingResponse");
    private final String value;

    DisputeCaseFilingType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DisputeCaseFilingType fromValue(String v) {
        for (DisputeCaseFilingType c: DisputeCaseFilingType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
