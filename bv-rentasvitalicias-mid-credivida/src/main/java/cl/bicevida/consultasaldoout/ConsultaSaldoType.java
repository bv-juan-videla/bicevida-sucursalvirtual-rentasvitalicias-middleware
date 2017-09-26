
package cl.bicevida.consultasaldoout;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ConsultaSaldoType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ConsultaSaldoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NumeroCuenta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NombreTitular" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RetencionDia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RetencionMasDias" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SaldoDisponible" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SaldoContable" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MontoDisponibleLineaCredito" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsultaSaldoType", propOrder = {
    "numeroCuenta",
    "nombreTitular",
    "retencionDia",
    "retencionMasDias",
    "saldoDisponible",
    "saldoContable",
    "montoDisponibleLineaCredito"
})
public class ConsultaSaldoType {

    @XmlElement(name = "NumeroCuenta")
    protected String numeroCuenta;
    @XmlElement(name = "NombreTitular")
    protected String nombreTitular;
    @XmlElement(name = "RetencionDia")
    protected String retencionDia;
    @XmlElement(name = "RetencionMasDias")
    protected String retencionMasDias;
    @XmlElement(name = "SaldoDisponible")
    protected String saldoDisponible;
    @XmlElement(name = "SaldoContable")
    protected String saldoContable;
    @XmlElement(name = "MontoDisponibleLineaCredito")
    protected String montoDisponibleLineaCredito;

    /**
     * Obtiene el valor de la propiedad numeroCuenta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    /**
     * Define el valor de la propiedad numeroCuenta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroCuenta(String value) {
        this.numeroCuenta = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreTitular.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreTitular() {
        return nombreTitular;
    }

    /**
     * Define el valor de la propiedad nombreTitular.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreTitular(String value) {
        this.nombreTitular = value;
    }

    /**
     * Obtiene el valor de la propiedad retencionDia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRetencionDia() {
        return retencionDia;
    }

    /**
     * Define el valor de la propiedad retencionDia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRetencionDia(String value) {
        this.retencionDia = value;
    }

    /**
     * Obtiene el valor de la propiedad retencionMasDias.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRetencionMasDias() {
        return retencionMasDias;
    }

    /**
     * Define el valor de la propiedad retencionMasDias.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRetencionMasDias(String value) {
        this.retencionMasDias = value;
    }

    /**
     * Obtiene el valor de la propiedad saldoDisponible.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaldoDisponible() {
        return saldoDisponible;
    }

    /**
     * Define el valor de la propiedad saldoDisponible.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSaldoDisponible(String value) {
        this.saldoDisponible = value;
    }

    /**
     * Obtiene el valor de la propiedad saldoContable.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaldoContable() {
        return saldoContable;
    }

    /**
     * Define el valor de la propiedad saldoContable.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSaldoContable(String value) {
        this.saldoContable = value;
    }

    /**
     * Obtiene el valor de la propiedad montoDisponibleLineaCredito.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMontoDisponibleLineaCredito() {
        return montoDisponibleLineaCredito;
    }

    /**
     * Define el valor de la propiedad montoDisponibleLineaCredito.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMontoDisponibleLineaCredito(String value) {
        this.montoDisponibleLineaCredito = value;
    }

}
