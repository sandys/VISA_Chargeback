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
 * <p>Java class for DisputeFilingItemTypeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DisputeFilingItemTypeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Arbitration"/&gt;
 *     &lt;enumeration value="Compliance"/&gt;
 *     &lt;enumeration value="FilingResponse"/&gt;
 *     &lt;enumeration value="AcknowledgementLetter"/&gt;
 *     &lt;enumeration value="RejectionLetter"/&gt;
 *     &lt;enumeration value="DecisionLetter"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DisputeFilingItemTypeType")
@XmlEnum
public enum DisputeFilingItemTypeType {

    @XmlEnumValue("Arbitration")
    ARBITRATION("Arbitration"),
    @XmlEnumValue("Compliance")
    COMPLIANCE("Compliance"),
    @XmlEnumValue("FilingResponse")
    FILING_RESPONSE("FilingResponse"),
    @XmlEnumValue("AcknowledgementLetter")
    ACKNOWLEDGEMENT_LETTER("AcknowledgementLetter"),
    @XmlEnumValue("RejectionLetter")
    REJECTION_LETTER("RejectionLetter"),
    @XmlEnumValue("DecisionLetter")
    DECISION_LETTER("DecisionLetter");
    private final String value;

    DisputeFilingItemTypeType(String v) {
        value = v;
    }

    @JsonValue
    public String value() {
        return value;
    }

    @JsonCreator
    public static DisputeFilingItemTypeType fromValue(String v) {
        for (DisputeFilingItemTypeType c: DisputeFilingItemTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
