//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.02.13 at 11:38:26 AM EST 
//


package org.incomm.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FraudTypeCategoryType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FraudTypeCategoryType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NRI"/&gt;
 *     &lt;enumeration value="CONV"/&gt;
 *     &lt;enumeration value="CARDTXN"/&gt;
 *     &lt;enumeration value="POSCHECK"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FraudTypeCategoryType")
@XmlEnum
public enum FraudTypeCategoryType {

    NRI,
    CONV,
    CARDTXN,
    POSCHECK;

    public String value() {
        return name();
    }

    public static FraudTypeCategoryType fromValue(String v) {
        return valueOf(v);
    }

}
