
package cl.bicevida.credivida.model.ws.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.oracle.webservices.internal.literal.List;


/**
 * <p>Clase Java para CartolaOut complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CartolaOut"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="mensaje" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="mov" type="{http://www.oracle.com/webservices/internal/literal}list"/&gt;
 *         &lt;element name="estado" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CartolaOut", propOrder = {
    "mensaje",
    "mov",
    "estado"
})
public class CartolaOut {

    @XmlElement(required = true, nillable = true)
    protected String mensaje;
    @XmlElement(required = true, nillable = true)
    protected List mov;
    protected int estado;

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

    /**
     * Obtiene el valor de la propiedad mov.
     * 
     * @return
     *     possible object is
     *     {@link List }
     *     
     */
    public List getMov() {
        return mov;
    }

    /**
     * Define el valor de la propiedad mov.
     * 
     * @param value
     *     allowed object is
     *     {@link List }
     *     
     */
    public void setMov(List value) {
        this.mov = value;
    }

    /**
     * Obtiene el valor de la propiedad estado.
     * 
     */
    public int getEstado() {
        return estado;
    }

    /**
     * Define el valor de la propiedad estado.
     * 
     */
    public void setEstado(int value) {
        this.estado = value;
    }

}
