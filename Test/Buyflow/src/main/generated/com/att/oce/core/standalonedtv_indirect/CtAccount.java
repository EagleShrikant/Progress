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
 * <p>Java class for ct_account complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ct_account">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="billingDeliveryPreference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountSubCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cpni" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="accountSubType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="billingDetail" type="{http://www.att.com/oce/core/StandAloneDTV_INDIRECT}ct_billingDetail" minOccurs="0"/>
 *         &lt;element name="passCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gigaPower" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ct_account", propOrder = {
    "billingDeliveryPreference",
    "accountSubCategory",
    "accountCategory",
    "cpni",
    "accountSubType",
    "accountType",
    "billingDetail",
    "passCode",
    "gigaPower"
})
public class CtAccount {

    protected String billingDeliveryPreference;
    protected String accountSubCategory;
    protected String accountCategory;
    protected Boolean cpni;
    protected String accountSubType;
    protected String accountType;
    protected CtBillingDetail billingDetail;
    protected String passCode;
    protected String gigaPower;

    /**
     * Gets the value of the billingDeliveryPreference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingDeliveryPreference() {
        return billingDeliveryPreference;
    }

    /**
     * Sets the value of the billingDeliveryPreference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingDeliveryPreference(String value) {
        this.billingDeliveryPreference = value;
    }

    /**
     * Gets the value of the accountSubCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountSubCategory() {
        return accountSubCategory;
    }

    /**
     * Sets the value of the accountSubCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountSubCategory(String value) {
        this.accountSubCategory = value;
    }

    /**
     * Gets the value of the accountCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountCategory() {
        return accountCategory;
    }

    /**
     * Sets the value of the accountCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountCategory(String value) {
        this.accountCategory = value;
    }

    /**
     * Gets the value of the cpni property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCpni() {
        return cpni;
    }

    /**
     * Sets the value of the cpni property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCpni(Boolean value) {
        this.cpni = value;
    }

    /**
     * Gets the value of the accountSubType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountSubType() {
        return accountSubType;
    }

    /**
     * Sets the value of the accountSubType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountSubType(String value) {
        this.accountSubType = value;
    }

    /**
     * Gets the value of the accountType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountType() {
        return accountType;
    }

    /**
     * Sets the value of the accountType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountType(String value) {
        this.accountType = value;
    }

    /**
     * Gets the value of the billingDetail property.
     * 
     * @return
     *     possible object is
     *     {@link CtBillingDetail }
     *     
     */
    public CtBillingDetail getBillingDetail() {
        return billingDetail;
    }

    /**
     * Sets the value of the billingDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtBillingDetail }
     *     
     */
    public void setBillingDetail(CtBillingDetail value) {
        this.billingDetail = value;
    }

    /**
     * Gets the value of the passCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassCode() {
        return passCode;
    }

    /**
     * Sets the value of the passCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassCode(String value) {
        this.passCode = value;
    }

    /**
     * Gets the value of the gigaPower property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGigaPower() {
        return gigaPower;
    }

    /**
     * Sets the value of the gigaPower property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGigaPower(String value) {
        this.gigaPower = value;
    }

}