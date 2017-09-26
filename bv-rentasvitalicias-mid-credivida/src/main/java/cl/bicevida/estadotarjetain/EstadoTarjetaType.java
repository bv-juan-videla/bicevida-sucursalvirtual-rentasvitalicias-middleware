
package cl.bicevida.estadotarjetain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para EstadoTarjetaType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="EstadoTarjetaType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RutEmpresa" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="RutTitular" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Canal" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Usuario" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EstadoTarjetaType", propOrder = {
    "rutEmpresa",
    "rutTitular",
    "canal",
    "usuario"
})
public class EstadoTarjetaType {

    @XmlElement(name = "RutEmpresa", required = true)
    protected String rutEmpresa;
    @XmlElement(name = "RutTitular", required = true)
    protected String rutTitular;
    @XmlElement(name = "Canal", required = true)
    protected String canal;
    @XmlElement(name = "Usuario", required = true)
    protected String usuario;

    /**
     * Obtiene el valor de la propiedad rutEmpresa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRutEmpresa() {
        return rutEmpresa;
    }

    /**
     * Define el valor de la propiedad rutEmpresa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRutEmpresa(String value) {
        this.rutEmpresa = value;
    }

    /**
     * Obtiene el valor de la propiedad rutTitular.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRutTitular() {
        return rutTitular;
    }

    /**
     * Define el valor de la propiedad rutTitular.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRutTitular(String value) {
        this.rutTitular = value;
    }

    /**
     * Obtiene el valor de la propiedad canal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCanal() {
        return canal;
    }

    /**
     * Define el valor de la propiedad canal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCanal(String value) {
        this.canal = value;
    }

    /**
     * Obtiene el valor de la propiedad usuario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * Define el valor de la propiedad usuario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsuario(String value) {
        this.usuario = value;
    }

}
