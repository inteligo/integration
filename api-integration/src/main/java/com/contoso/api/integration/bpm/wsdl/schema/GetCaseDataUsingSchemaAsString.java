//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.08.08 at 05:34:55 PM COT 
//


package com.contoso.api.integration.bpm.wsdl.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="idCase" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="idWorkItem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sxsd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "idCase",
    "idWorkItem",
    "sxsd"
})
@XmlRootElement(name = "getCaseDataUsingSchemaAsString")
public class GetCaseDataUsingSchemaAsString {

    protected String idCase;
    protected String idWorkItem;
    protected String sxsd;

    /**
     * Gets the value of the idCase property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdCase() {
        return idCase;
    }

    /**
     * Sets the value of the idCase property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdCase(String value) {
        this.idCase = value;
    }

    /**
     * Gets the value of the idWorkItem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdWorkItem() {
        return idWorkItem;
    }

    /**
     * Sets the value of the idWorkItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdWorkItem(String value) {
        this.idWorkItem = value;
    }

    /**
     * Gets the value of the sxsd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSxsd() {
        return sxsd;
    }

    /**
     * Sets the value of the sxsd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSxsd(String value) {
        this.sxsd = value;
    }

}
