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
 * <p>Java class for MerchantRefuseAdviseIndType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MerchantRefuseAdviseIndType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="MRRA"/&gt;
 *     &lt;enumeration value="MRRM"/&gt;
 *     &lt;enumeration value="MICNRM"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MerchantRefuseAdviseIndType")
@XmlEnum
public enum MerchantRefuseAdviseIndType {

    MRRA,
    MRRM,
    MICNRM;

    public String value() {
        return name();
    }

    public static MerchantRefuseAdviseIndType fromValue(String v) {
        return valueOf(v);
    }

}
