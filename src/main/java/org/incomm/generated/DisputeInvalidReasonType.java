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
 * <p>Java class for DisputeInvalidReasonType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DisputeInvalidReasonType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="IDRP1"/&gt;
 *     &lt;enumeration value="IDRP2"/&gt;
 *     &lt;enumeration value="IDRP3"/&gt;
 *     &lt;enumeration value="IDRP4"/&gt;
 *     &lt;enumeration value="IDRC1"/&gt;
 *     &lt;enumeration value="IDRC2"/&gt;
 *     &lt;enumeration value="IDRC3"/&gt;
 *     &lt;enumeration value="IDRC4"/&gt;
 *     &lt;enumeration value="IDRC5"/&gt;
 *     &lt;enumeration value="IDRC6"/&gt;
 *     &lt;enumeration value="IDRC7"/&gt;
 *     &lt;enumeration value="IDRC8"/&gt;
 *     &lt;enumeration value="IDRC9"/&gt;
 *     &lt;enumeration value="IDRC10"/&gt;
 *     &lt;enumeration value="IDRC11"/&gt;
 *     &lt;enumeration value="IDRC12"/&gt;
 *     &lt;enumeration value="IDRC13"/&gt;
 *     &lt;enumeration value="IDRC14"/&gt;
 *     &lt;enumeration value="IDRC15"/&gt;
 *     &lt;enumeration value="IDRC16"/&gt;
 *     &lt;enumeration value="IDRC17"/&gt;
 *     &lt;enumeration value="IDRC18"/&gt;
 *     &lt;enumeration value="IDRC19"/&gt;
 *     &lt;enumeration value="IDRC20"/&gt;
 *     &lt;enumeration value="IDRC21"/&gt;
 *     &lt;enumeration value="IDRC22"/&gt;
 *     &lt;enumeration value="IDRC23"/&gt;
 *     &lt;enumeration value="IDRC24"/&gt;
 *     &lt;enumeration value="IDRC25"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DisputeInvalidReasonType")
@XmlEnum
public enum DisputeInvalidReasonType {

    @XmlEnumValue("IDRP1")
    IDRP_1("IDRP1"),
    @XmlEnumValue("IDRP2")
    IDRP_2("IDRP2"),
    @XmlEnumValue("IDRP3")
    IDRP_3("IDRP3"),
    @XmlEnumValue("IDRP4")
    IDRP_4("IDRP4"),
    @XmlEnumValue("IDRC1")
    IDRC_1("IDRC1"),
    @XmlEnumValue("IDRC2")
    IDRC_2("IDRC2"),
    @XmlEnumValue("IDRC3")
    IDRC_3("IDRC3"),
    @XmlEnumValue("IDRC4")
    IDRC_4("IDRC4"),
    @XmlEnumValue("IDRC5")
    IDRC_5("IDRC5"),
    @XmlEnumValue("IDRC6")
    IDRC_6("IDRC6"),
    @XmlEnumValue("IDRC7")
    IDRC_7("IDRC7"),
    @XmlEnumValue("IDRC8")
    IDRC_8("IDRC8"),
    @XmlEnumValue("IDRC9")
    IDRC_9("IDRC9"),
    @XmlEnumValue("IDRC10")
    IDRC_10("IDRC10"),
    @XmlEnumValue("IDRC11")
    IDRC_11("IDRC11"),
    @XmlEnumValue("IDRC12")
    IDRC_12("IDRC12"),
    @XmlEnumValue("IDRC13")
    IDRC_13("IDRC13"),
    @XmlEnumValue("IDRC14")
    IDRC_14("IDRC14"),
    @XmlEnumValue("IDRC15")
    IDRC_15("IDRC15"),
    @XmlEnumValue("IDRC16")
    IDRC_16("IDRC16"),
    @XmlEnumValue("IDRC17")
    IDRC_17("IDRC17"),
    @XmlEnumValue("IDRC18")
    IDRC_18("IDRC18"),
    @XmlEnumValue("IDRC19")
    IDRC_19("IDRC19"),
    @XmlEnumValue("IDRC20")
    IDRC_20("IDRC20"),
    @XmlEnumValue("IDRC21")
    IDRC_21("IDRC21"),
    @XmlEnumValue("IDRC22")
    IDRC_22("IDRC22"),
    @XmlEnumValue("IDRC23")
    IDRC_23("IDRC23"),
    @XmlEnumValue("IDRC24")
    IDRC_24("IDRC24"),
    @XmlEnumValue("IDRC25")
    IDRC_25("IDRC25");
    private final String value;

    DisputeInvalidReasonType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DisputeInvalidReasonType fromValue(String v) {
        for (DisputeInvalidReasonType c: DisputeInvalidReasonType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
