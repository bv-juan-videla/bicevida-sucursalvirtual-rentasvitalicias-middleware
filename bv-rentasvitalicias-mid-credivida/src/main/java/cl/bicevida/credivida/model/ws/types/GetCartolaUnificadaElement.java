
package cl.bicevida.credivida.model.ws.types;

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
 *         &lt;element name="vperiodo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="vcta" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="vuser" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="vrut" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "vperiodo",
    "vcta",
    "vuser",
    "vrut"
})
@XmlRootElement(name = "getCartolaUnificadaElement")
public class GetCartolaUnificadaElement {

    @XmlElement(required = true, nillable = true)
    protected String vperiodo;
    @XmlElement(required = true, nillable = true)
    protected String vcta;
    @XmlElement(required = true, nillable = true)
    protected String vuser;
    @XmlElement(required = true, nillable = true)
    protected String vrut;

    /**
     * Obtiene el valor de la propiedad vperiodo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVperiodo() {
        return vperiodo;
    }

    /**
     * Define el valor de la propiedad vperiodo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVperiodo(String value) {
        this.vperiodo = value;
    }

    /**
     * Obtiene el valor de la propiedad vcta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVcta() {
        return vcta;
    }

    /**
     * Define el valor de la propiedad vcta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVcta(String value) {
        this.vcta = value;
    }

    /**
     * Obtiene el valor de la propiedad vuser.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVuser() {
        return vuser;
    }

    /**
     * Define el valor de la propiedad vuser.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVuser(String value) {
        this.vuser = value;
    }

    /**
     * Obtiene el valor de la propiedad vrut.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVrut() {
        return vrut;
    }

    /**
     * Define el valor de la propiedad vrut.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVrut(String value) {
        this.vrut = value;
    }

}
