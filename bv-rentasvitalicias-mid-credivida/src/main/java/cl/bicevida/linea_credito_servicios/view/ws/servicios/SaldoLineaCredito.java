
package cl.bicevida.linea_credito_servicios.view.ws.servicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para SaldoLineaCredito complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SaldoLineaCredito"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="estado" type="{http://servicios.ws.view.linea_credito_servicios.bicevida.cl/}EstadoConsultaSaldo"/&gt;
 *         &lt;element name="montoAutorizado" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="montoUtilizado" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="montoDisponible" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SaldoLineaCredito", propOrder = {
    "estado",
    "montoAutorizado",
    "montoUtilizado",
    "montoDisponible"
})
public class SaldoLineaCredito {

    @XmlElement(required = true, nillable = true)
    protected EstadoConsultaSaldo estado;
    @XmlElement(required = true, nillable = true)
    protected String montoAutorizado;
    @XmlElement(required = true, nillable = true)
    protected String montoUtilizado;
    @XmlElement(required = true, nillable = true)
    protected String montoDisponible;

    /**
     * Obtiene el valor de la propiedad estado.
     * 
     * @return
     *     possible object is
     *     {@link EstadoConsultaSaldo }
     *     
     */
    public EstadoConsultaSaldo getEstado() {
        return estado;
    }

    /**
     * Define el valor de la propiedad estado.
     * 
     * @param value
     *     allowed object is
     *     {@link EstadoConsultaSaldo }
     *     
     */
    public void setEstado(EstadoConsultaSaldo value) {
        this.estado = value;
    }

    /**
     * Obtiene el valor de la propiedad montoAutorizado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMontoAutorizado() {
        return montoAutorizado;
    }

    /**
     * Define el valor de la propiedad montoAutorizado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMontoAutorizado(String value) {
        this.montoAutorizado = value;
    }

    /**
     * Obtiene el valor de la propiedad montoUtilizado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMontoUtilizado() {
        return montoUtilizado;
    }

    /**
     * Define el valor de la propiedad montoUtilizado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMontoUtilizado(String value) {
        this.montoUtilizado = value;
    }

    /**
     * Obtiene el valor de la propiedad montoDisponible.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMontoDisponible() {
        return montoDisponible;
    }

    /**
     * Define el valor de la propiedad montoDisponible.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMontoDisponible(String value) {
        this.montoDisponible = value;
    }

}
