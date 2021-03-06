//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.03.02 at 07:26:17 PM CET 
//


package com.armandorv.easytravel.googletimewsclient.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="raw_offset" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="dst_offset" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="time_zone_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="time_zone_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "status",
    "rawOffset",
    "dstOffset",
    "timeZoneId",
    "timeZoneName"
})
@XmlRootElement(name = "TimeZoneResponse")
public class TimeZoneResponse {

    @XmlElement(required = true)
    protected String status;
    @XmlElement(name = "raw_offset")
    protected float rawOffset;
    @XmlElement(name = "dst_offset")
    protected float dstOffset;
    @XmlElement(name = "time_zone_id", required = true)
    protected String timeZoneId;
    @XmlElement(name = "time_zone_name", required = true)
    protected String timeZoneName;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the rawOffset property.
     * 
     */
    public float getRawOffset() {
        return rawOffset;
    }

    /**
     * Sets the value of the rawOffset property.
     * 
     */
    public void setRawOffset(float value) {
        this.rawOffset = value;
    }

    /**
     * Gets the value of the dstOffset property.
     * 
     */
    public float getDstOffset() {
        return dstOffset;
    }

    /**
     * Sets the value of the dstOffset property.
     * 
     */
    public void setDstOffset(float value) {
        this.dstOffset = value;
    }

    /**
     * Gets the value of the timeZoneId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeZoneId() {
        return timeZoneId;
    }

    /**
     * Sets the value of the timeZoneId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeZoneId(String value) {
        this.timeZoneId = value;
    }

    /**
     * Gets the value of the timeZoneName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeZoneName() {
        return timeZoneName;
    }

    /**
     * Sets the value of the timeZoneName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeZoneName(String value) {
        this.timeZoneName = value;
    }

}
