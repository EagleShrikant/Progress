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
 * <p>Java class for ct_commonCharacteristics complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ct_commonCharacteristics">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="requestComponentGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ignorePricePlanCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ct_commonCharacteristics", propOrder = {
    "requestComponentGroup",
    "ignorePricePlanCode"
})
public class CtCommonCharacteristics {

    protected String requestComponentGroup;
    protected String ignorePricePlanCode;

    /**
     * Gets the value of the requestComponentGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestComponentGroup() {
        return requestComponentGroup;
    }

    /**
     * Sets the value of the requestComponentGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestComponentGroup(String value) {
        this.requestComponentGroup = value;
    }

    /**
     * Gets the value of the ignorePricePlanCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIgnorePricePlanCode() {
        return ignorePricePlanCode;
    }

    /**
     * Sets the value of the ignorePricePlanCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIgnorePricePlanCode(String value) {
        this.ignorePricePlanCode = value;
    }

}