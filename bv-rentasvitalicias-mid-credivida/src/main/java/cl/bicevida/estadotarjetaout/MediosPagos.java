
package cl.bicevida.estadotarjetaout;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Estado" type="{http://www.bicevida.cl/EstadoTarjetaOut}EstadoType"/&gt;
 *         &lt;element name="EstadoTarjeta" type="{http://www.bicevida.cl/EstadoTarjetaOut}EstadoTarjetaType" minOccurs="0"/&gt;
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
    "estado",
    "estadoTarjeta"
})
@XmlRootElement(name = "MediosPagos")
public class MediosPagos {

    @XmlElement(name = "Estado", required = true)
    protected EstadoType estado;
    @XmlElement(name = "EstadoTarjeta")
    protected EstadoTarjetaType estadoTarjeta;

    /**
     * Obtiene el valor de la propiedad estado.
     * 
     * @return
     *     possible object is
     *     {@link EstadoType }
     *     
     */
    public EstadoType getEstado() {
        return estado;
    }

    /**
     * Define el valor de la propiedad estado.
     * 
     * @param value
     *     allowed object is
     *     {@link EstadoType }
     *     
     */
    public void setEstado(EstadoType value) {
        this.estado = value;
    }

    /**
     * Obtiene el valor de la propiedad estadoTarjeta.
     * 
     * @return
     *     possible object is
     *     {@link EstadoTarjetaType }
     *     
     */
    public EstadoTarjetaType getEstadoTarjeta() {
        return estadoTarjeta;
    }

    /**
     * Define el valor de la propiedad estadoTarjeta.
     * 
     * @param value
     *     allowed object is
     *     {@link EstadoTarjetaType }
     *     
     */
    public void setEstadoTarjeta(EstadoTarjetaType value) {
        this.estadoTarjeta = value;
    }

}
