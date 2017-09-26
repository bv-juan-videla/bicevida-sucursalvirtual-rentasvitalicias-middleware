
package cl.bicevida.estadotarjetain;

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
 *         &lt;element name="EstadoTarjeta" type="{http://www.bicevida.cl/EstadoTarjetaIn}EstadoTarjetaType"/&gt;
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
    "estadoTarjeta"
})
@XmlRootElement(name = "MediosPagos")
public class MediosPagos {

    @XmlElement(name = "EstadoTarjeta", required = true)
    protected EstadoTarjetaType estadoTarjeta;

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
