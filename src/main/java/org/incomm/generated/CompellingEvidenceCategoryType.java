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
 * <p>Java class for CompellingEvidenceCategoryType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CompellingEvidenceCategoryType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CE00"/&gt;
 *     &lt;enumeration value="CE01"/&gt;
 *     &lt;enumeration value="CE02"/&gt;
 *     &lt;enumeration value="CE03"/&gt;
 *     &lt;enumeration value="CE04"/&gt;
 *     &lt;enumeration value="CE05"/&gt;
 *     &lt;enumeration value="CE06"/&gt;
 *     &lt;enumeration value="CE07"/&gt;
 *     &lt;enumeration value="CE08"/&gt;
 *     &lt;enumeration value="CE09"/&gt;
 *     &lt;enumeration value="CE10"/&gt;
 *     &lt;enumeration value="CE11"/&gt;
 *     &lt;enumeration value="CE12"/&gt;
 *     &lt;enumeration value="CE13"/&gt;
 *     &lt;enumeration value="CE14"/&gt;
 *     &lt;enumeration value="CE15"/&gt;
 *     &lt;enumeration value="CE16"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CompellingEvidenceCategoryType")
@XmlEnum
public enum CompellingEvidenceCategoryType {

    @XmlEnumValue("CE00")
    CE_00("CE00"),
    @XmlEnumValue("CE01")
    CE_01("CE01"),
    @XmlEnumValue("CE02")
    CE_02("CE02"),
    @XmlEnumValue("CE03")
    CE_03("CE03"),
    @XmlEnumValue("CE04")
    CE_04("CE04"),
    @XmlEnumValue("CE05")
    CE_05("CE05"),
    @XmlEnumValue("CE06")
    CE_06("CE06"),
    @XmlEnumValue("CE07")
    CE_07("CE07"),
    @XmlEnumValue("CE08")
    CE_08("CE08"),
    @XmlEnumValue("CE09")
    CE_09("CE09"),
    @XmlEnumValue("CE10")
    CE_10("CE10"),
    @XmlEnumValue("CE11")
    CE_11("CE11"),
    @XmlEnumValue("CE12")
    CE_12("CE12"),
    @XmlEnumValue("CE13")
    CE_13("CE13"),
    @XmlEnumValue("CE14")
    CE_14("CE14"),
    @XmlEnumValue("CE15")
    CE_15("CE15"),
    @XmlEnumValue("CE16")
    CE_16("CE16");
    private final String value;

    CompellingEvidenceCategoryType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CompellingEvidenceCategoryType fromValue(String v) {
        for (CompellingEvidenceCategoryType c: CompellingEvidenceCategoryType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
