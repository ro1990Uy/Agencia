
package com.uy.agenciaWsClient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para alta_tiket complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="alta_tiket">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="agencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="matricula" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fecha_venta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="inicio_est" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="minutos" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "alta_tiket", propOrder = {
    "agencia",
    "matricula",
    "fechaVenta",
    "inicioEst",
    "minutos"
})
public class AltaTiket {

    protected String agencia;
    protected String matricula;
    @XmlElement(name = "fecha_venta")
    protected String fechaVenta;
    @XmlElement(name = "inicio_est")
    protected String inicioEst;
    protected int minutos;

    /**
     * Obtiene el valor de la propiedad agencia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgencia() {
        return agencia;
    }

    /**
     * Define el valor de la propiedad agencia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgencia(String value) {
        this.agencia = value;
    }

    /**
     * Obtiene el valor de la propiedad matricula.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * Define el valor de la propiedad matricula.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatricula(String value) {
        this.matricula = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaVenta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaVenta() {
        return fechaVenta;
    }

    /**
     * Define el valor de la propiedad fechaVenta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaVenta(String value) {
        this.fechaVenta = value;
    }

    /**
     * Obtiene el valor de la propiedad inicioEst.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInicioEst() {
        return inicioEst;
    }

    /**
     * Define el valor de la propiedad inicioEst.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInicioEst(String value) {
        this.inicioEst = value;
    }

    /**
     * Obtiene el valor de la propiedad minutos.
     * 
     */
    public int getMinutos() {
        return minutos;
    }

    /**
     * Define el valor de la propiedad minutos.
     * 
     */
    public void setMinutos(int value) {
        this.minutos = value;
    }

}
