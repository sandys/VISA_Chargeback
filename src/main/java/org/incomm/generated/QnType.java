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
 * <p>Java class for QnType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="QnType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Chargeback"/&gt;
 *     &lt;enumeration value="Representment"/&gt;
 *     &lt;enumeration value="PreArb"/&gt;
 *     &lt;enumeration value="PreArbResp"/&gt;
 *     &lt;enumeration value="PreComp"/&gt;
 *     &lt;enumeration value="PreCompResp"/&gt;
 *     &lt;enumeration value="ChargebackFinancial"/&gt;
 *     &lt;enumeration value="RepresentmentFinancial"/&gt;
 *     &lt;enumeration value="Arbitration"/&gt;
 *     &lt;enumeration value="Compliance"/&gt;
 *     &lt;enumeration value="FilingResp"/&gt;
 *     &lt;enumeration value="GoodFaith"/&gt;
 *     &lt;enumeration value="GoodFaithResp"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "QnType")
@XmlEnum
public enum QnType {

    @XmlEnumValue("Chargeback")
    CHARGEBACK("Chargeback"),
    @XmlEnumValue("Representment")
    REPRESENTMENT("Representment"),
    @XmlEnumValue("PreArb")
    PRE_ARB("PreArb"),
    @XmlEnumValue("PreArbResp")
    PRE_ARB_RESP("PreArbResp"),
    @XmlEnumValue("PreComp")
    PRE_COMP("PreComp"),
    @XmlEnumValue("PreCompResp")
    PRE_COMP_RESP("PreCompResp"),
    @XmlEnumValue("ChargebackFinancial")
    CHARGEBACK_FINANCIAL("ChargebackFinancial"),
    @XmlEnumValue("RepresentmentFinancial")
    REPRESENTMENT_FINANCIAL("RepresentmentFinancial"),
    @XmlEnumValue("Arbitration")
    ARBITRATION("Arbitration"),
    @XmlEnumValue("Compliance")
    COMPLIANCE("Compliance"),
    @XmlEnumValue("FilingResp")
    FILING_RESP("FilingResp"),
    @XmlEnumValue("GoodFaith")
    GOOD_FAITH("GoodFaith"),
    @XmlEnumValue("GoodFaithResp")
    GOOD_FAITH_RESP("GoodFaithResp");
    private final String value;

    QnType(String v) {
        value = v;
    }

    @JsonValue
    public String value() {
        return value;
    }

    @JsonCreator
    public static QnType fromValue(String v) {
        for (QnType c: QnType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
