
package cl.bicevida.consultasaldoout;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para EstadoType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="EstadoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EstadoCodigo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Mensaje" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="FechaHasta" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EstadoType", propOrder = {
    "estadoCodigo",
    "mensaje",
    "fechahasta"
})
public class EstadoType {

    @XmlElement(name = "EstadoCodigo", required = true)
    protected String estadoCodigo;
    @XmlElement(name = "Mensaje", required = true)
    protected String mensaje;
    @XmlElement(name = "fechahasta", required = false)
    protected String fechahasta;

    /**
     * Obtiene el valor de la propiedad estadoCodigo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstadoCodigo() {
        return estadoCodigo;
    }

    /**
     * Define el valor de la propiedad estadoCodigo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstadoCodigo(String value) {
        this.estadoCodigo = value;
    }

    /**
     * Obtiene el valor de la propiedad mensaje.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMensaje() {
        return mensaje;
    }

    /**
     * Define el valor de la propiedad mensaje.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMensaje(String value) {
        this.mensaje = value;
    }

	public String getFechahasta() {
		return fechahasta;
	}

	public void setFechahasta(String fechahasta) {
		this.fechahasta = fechahasta;
	}
    
}
