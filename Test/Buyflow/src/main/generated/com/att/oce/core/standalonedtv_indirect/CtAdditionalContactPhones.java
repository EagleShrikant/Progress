//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.09 at 03:49:52 PM IST 
//


package com.att.oce.core.standalonedtv_indirect;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ct_additionalContactPhones complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ct_additionalContactPhones">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="phoneNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="contactPhoneType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="consentDetails" type="{http://www.att.com/oce/core/StandAloneDTV_INDIRECT}ct_consentDetail" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ct_additionalContactPhones", propOrder = {
    "phoneNumber",
    "contactPhoneType",
    "consentDetails"
})
public class CtAdditionalContactPhones {

    protected Integer phoneNumber;
    protected String contactPhoneType;
    protected CtConsentDetail consentDetails;

    /**
     * Gets the value of the phoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets the value of the phoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPhoneNumber(Integer value) {
        this.phoneNumber = value;
    }

    /**
     * Gets the value of the contactPhoneType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactPhoneType() {
        return contactPhoneType;
    }

    /**
     * Sets the value of the contactPhoneType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactPhoneType(String value) {
        this.contactPhoneType = value;
    }

    /**
     * Gets the value of the consentDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CtConsentDetail }
     *     
     */
    public CtConsentDetail getConsentDetails() {
        return consentDetails;
    }

    /**
     * Sets the value of the consentDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtConsentDetail }
     *     
     */
    public void setConsentDetails(CtConsentDetail value) {
        this.consentDetails = value;
    }

}
