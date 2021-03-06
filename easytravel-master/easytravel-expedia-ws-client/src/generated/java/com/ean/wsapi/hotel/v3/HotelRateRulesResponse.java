
package com.ean.wsapi.hotel.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para HotelRateRulesResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="HotelRateRulesResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://v3.hotel.wsapi.ean.com/}BaseResponse">
 *       &lt;sequence>
 *         &lt;element name="ratePlanText" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nativeCurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="guaranteeMethods" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="depositText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cancellationPolicy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="miscellaneous" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="extraChargeRollawayAdult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="extraChargeRollawayChild" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="extraChargeCrib" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="extraChargeAdult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="roomDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="roomRate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="totalRoomRate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RateChangeInfos" type="{http://v3.hotel.wsapi.ean.com/}RateChangeInfos" minOccurs="0"/>
 *         &lt;element name="RateRulesFreeFlows" type="{http://v3.hotel.wsapi.ean.com/}RateRulesFreeFlows" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HotelRateRulesResponse", propOrder = {
    "ratePlanText",
    "nativeCurrencyCode",
    "guaranteeMethods",
    "depositText",
    "cancellationPolicy",
    "miscellaneous",
    "extraChargeRollawayAdult",
    "extraChargeRollawayChild",
    "extraChargeCrib",
    "extraChargeAdult",
    "roomDescription",
    "roomRate",
    "totalRoomRate",
    "rateChangeInfos",
    "rateRulesFreeFlows"
})
public class HotelRateRulesResponse
    extends BaseResponse
{

    @XmlElement(required = true)
    protected String ratePlanText;
    protected String nativeCurrencyCode;
    protected String guaranteeMethods;
    protected String depositText;
    protected String cancellationPolicy;
    protected String miscellaneous;
    protected String extraChargeRollawayAdult;
    protected String extraChargeRollawayChild;
    protected String extraChargeCrib;
    protected String extraChargeAdult;
    protected String roomDescription;
    protected String roomRate;
    protected String totalRoomRate;
    @XmlElement(name = "RateChangeInfos")
    protected RateChangeInfos rateChangeInfos;
    @XmlElement(name = "RateRulesFreeFlows")
    protected RateRulesFreeFlows rateRulesFreeFlows;

    /**
     * Obtiene el valor de la propiedad ratePlanText.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRatePlanText() {
        return ratePlanText;
    }

    /**
     * Define el valor de la propiedad ratePlanText.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRatePlanText(String value) {
        this.ratePlanText = value;
    }

    /**
     * Obtiene el valor de la propiedad nativeCurrencyCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNativeCurrencyCode() {
        return nativeCurrencyCode;
    }

    /**
     * Define el valor de la propiedad nativeCurrencyCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNativeCurrencyCode(String value) {
        this.nativeCurrencyCode = value;
    }

    /**
     * Obtiene el valor de la propiedad guaranteeMethods.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuaranteeMethods() {
        return guaranteeMethods;
    }

    /**
     * Define el valor de la propiedad guaranteeMethods.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuaranteeMethods(String value) {
        this.guaranteeMethods = value;
    }

    /**
     * Obtiene el valor de la propiedad depositText.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepositText() {
        return depositText;
    }

    /**
     * Define el valor de la propiedad depositText.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepositText(String value) {
        this.depositText = value;
    }

    /**
     * Obtiene el valor de la propiedad cancellationPolicy.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCancellationPolicy() {
        return cancellationPolicy;
    }

    /**
     * Define el valor de la propiedad cancellationPolicy.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCancellationPolicy(String value) {
        this.cancellationPolicy = value;
    }

    /**
     * Obtiene el valor de la propiedad miscellaneous.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiscellaneous() {
        return miscellaneous;
    }

    /**
     * Define el valor de la propiedad miscellaneous.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiscellaneous(String value) {
        this.miscellaneous = value;
    }

    /**
     * Obtiene el valor de la propiedad extraChargeRollawayAdult.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtraChargeRollawayAdult() {
        return extraChargeRollawayAdult;
    }

    /**
     * Define el valor de la propiedad extraChargeRollawayAdult.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtraChargeRollawayAdult(String value) {
        this.extraChargeRollawayAdult = value;
    }

    /**
     * Obtiene el valor de la propiedad extraChargeRollawayChild.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtraChargeRollawayChild() {
        return extraChargeRollawayChild;
    }

    /**
     * Define el valor de la propiedad extraChargeRollawayChild.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtraChargeRollawayChild(String value) {
        this.extraChargeRollawayChild = value;
    }

    /**
     * Obtiene el valor de la propiedad extraChargeCrib.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtraChargeCrib() {
        return extraChargeCrib;
    }

    /**
     * Define el valor de la propiedad extraChargeCrib.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtraChargeCrib(String value) {
        this.extraChargeCrib = value;
    }

    /**
     * Obtiene el valor de la propiedad extraChargeAdult.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtraChargeAdult() {
        return extraChargeAdult;
    }

    /**
     * Define el valor de la propiedad extraChargeAdult.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtraChargeAdult(String value) {
        this.extraChargeAdult = value;
    }

    /**
     * Obtiene el valor de la propiedad roomDescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomDescription() {
        return roomDescription;
    }

    /**
     * Define el valor de la propiedad roomDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomDescription(String value) {
        this.roomDescription = value;
    }

    /**
     * Obtiene el valor de la propiedad roomRate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomRate() {
        return roomRate;
    }

    /**
     * Define el valor de la propiedad roomRate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomRate(String value) {
        this.roomRate = value;
    }

    /**
     * Obtiene el valor de la propiedad totalRoomRate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalRoomRate() {
        return totalRoomRate;
    }

    /**
     * Define el valor de la propiedad totalRoomRate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalRoomRate(String value) {
        this.totalRoomRate = value;
    }

    /**
     * Obtiene el valor de la propiedad rateChangeInfos.
     * 
     * @return
     *     possible object is
     *     {@link RateChangeInfos }
     *     
     */
    public RateChangeInfos getRateChangeInfos() {
        return rateChangeInfos;
    }

    /**
     * Define el valor de la propiedad rateChangeInfos.
     * 
     * @param value
     *     allowed object is
     *     {@link RateChangeInfos }
     *     
     */
    public void setRateChangeInfos(RateChangeInfos value) {
        this.rateChangeInfos = value;
    }

    /**
     * Obtiene el valor de la propiedad rateRulesFreeFlows.
     * 
     * @return
     *     possible object is
     *     {@link RateRulesFreeFlows }
     *     
     */
    public RateRulesFreeFlows getRateRulesFreeFlows() {
        return rateRulesFreeFlows;
    }

    /**
     * Define el valor de la propiedad rateRulesFreeFlows.
     * 
     * @param value
     *     allowed object is
     *     {@link RateRulesFreeFlows }
     *     
     */
    public void setRateRulesFreeFlows(RateRulesFreeFlows value) {
        this.rateRulesFreeFlows = value;
    }

}
