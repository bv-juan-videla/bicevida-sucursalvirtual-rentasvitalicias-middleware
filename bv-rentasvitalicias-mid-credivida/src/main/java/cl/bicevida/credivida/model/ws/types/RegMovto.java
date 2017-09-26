
package cl.bicevida.credivida.model.ws.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para RegMovto complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="RegMovto"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="diamesano" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="corr" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="giro" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="glosa" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="anomesdia" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="abono" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="saldo" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegMovto", propOrder = {
    "diamesano",
    "corr",
    "giro",
    "glosa",
    "anomesdia",
    "abono",
    "saldo"
})
public class RegMovto {

    @XmlElement(required = true, nillable = true)
    protected String diamesano;
    protected int corr;
    protected int giro;
    @XmlElement(required = true, nillable = true)
    protected String glosa;
    @XmlElement(required = true, nillable = true)
    protected String anomesdia;
    protected int abono;
    protected int saldo;

    /**
     * Obtiene el valor de la propiedad diamesano.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiamesano() {
        return diamesano;
    }

    /**
     * Define el valor de la propiedad diamesano.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiamesano(String value) {
        this.diamesano = value;
    }

    /**
     * Obtiene el valor de la propiedad corr.
     * 
     */
    public int getCorr() {
        return corr;
    }

    /**
     * Define el valor de la propiedad corr.
     * 
     */
    public void setCorr(int value) {
        this.corr = value;
    }

    /**
     * Obtiene el valor de la propiedad giro.
     * 
     */
    public int getGiro() {
        return giro;
    }

    /**
     * Define el valor de la propiedad giro.
     * 
     */
    public void setGiro(int value) {
        this.giro = value;
    }

    /**
     * Obtiene el valor de la propiedad glosa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGlosa() {
        return glosa;
    }

    /**
     * Define el valor de la propiedad glosa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGlosa(String value) {
        this.glosa = value;
    }

    /**
     * Obtiene el valor de la propiedad anomesdia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnomesdia() {
        return anomesdia;
    }

    /**
     * Define el valor de la propiedad anomesdia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnomesdia(String value) {
        this.anomesdia = value;
    }

    /**
     * Obtiene el valor de la propiedad abono.
     * 
     */
    public int getAbono() {
        return abono;
    }

    /**
     * Define el valor de la propiedad abono.
     * 
     */
    public void setAbono(int value) {
        this.abono = value;
    }

    /**
     * Obtiene el valor de la propiedad saldo.
     * 
     */
    public int getSaldo() {
        return saldo;
    }

    /**
     * Define el valor de la propiedad saldo.
     * 
     */
    public void setSaldo(int value) {
        this.saldo = value;
    }

}
