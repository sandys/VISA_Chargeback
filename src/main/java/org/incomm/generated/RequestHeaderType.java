//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.02.13 at 11:38:26 AM EST 
//


package org.incomm.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RequestHeaderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RequestHeaderType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.visa.com/ROLSI}RequestType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.visa.com/ROLSI}User" minOccurs="0"/&gt;
 *         &lt;element name="MemberRole" type="{http://www.visa.com/ROLSI}MemberRoleType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestHeaderType", propOrder = {
    "user",
    "memberRole"
})
public class RequestHeaderType
    extends RequestType
{

    @XmlElement(name = "User")
    protected UserType user;
    @XmlElement(name = "MemberRole")
    @XmlSchemaType(name = "string")
    protected MemberRoleType memberRole;

    /**
     * The actual VROL UserID for the request.
     * 
     * @return
     *     possible object is
     *     {@link UserType }
     *     
     */
    public UserType getUser() {
        return user;
    }

    /**
     * Sets the value of the user property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserType }
     *     
     */
    public void setUser(UserType value) {
        this.user = value;
    }

    /**
     * Gets the value of the memberRole property.
     * 
     * @return
     *     possible object is
     *     {@link MemberRoleType }
     *     
     */
    public MemberRoleType getMemberRole() {
        return memberRole;
    }

    /**
     * Sets the value of the memberRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link MemberRoleType }
     *     
     */
    public void setMemberRole(MemberRoleType value) {
        this.memberRole = value;
    }

}
