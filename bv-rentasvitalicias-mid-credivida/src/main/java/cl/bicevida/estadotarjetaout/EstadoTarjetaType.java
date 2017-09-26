
package cl.bicevida.estadotarjetaout;

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
 *         &lt;element name="NumeroCuenta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NumeroTarjeta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EstadoTarjeta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ApellidoPaterno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ApellidoMaterno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Direccion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Comuna" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Ciudad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EstadoCivil" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FechaNacimiento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Fono" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Genero" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SectorEconomico" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FechaApertura" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FechaCierre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MotivoCierre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "EstadoTarjetaType", propOrder = {
    "numeroCuenta",
    "numeroTarjeta",
    "estadoTarjeta",
    "nombre",
    "apellidoPaterno",
    "apellidoMaterno",
    "direccion",
    "comuna",
    "ciudad",
    "estadoCivil",
    "fechaNacimiento",
    "fono",
    "genero",
    "sectorEconomico",
    "fechaApertura",
    "fechaCierre",
    "motivoCierre",
    "montoDisponibleLineaCredito"
})
public class EstadoTarjetaType {

    @XmlElement(name = "NumeroCuenta")
    protected String numeroCuenta;
    @XmlElement(name = "NumeroTarjeta")
    protected String numeroTarjeta;
    @XmlElement(name = "EstadoTarjeta")
    protected String estadoTarjeta;
    @XmlElement(name = "Nombre")
    protected String nombre;
    @XmlElement(name = "ApellidoPaterno")
    protected String apellidoPaterno;
    @XmlElement(name = "ApellidoMaterno")
    protected String apellidoMaterno;
    @XmlElement(name = "Direccion")
    protected String direccion;
    @XmlElement(name = "Comuna")
    protected String comuna;
    @XmlElement(name = "Ciudad")
    protected String ciudad;
    @XmlElement(name = "EstadoCivil")
    protected String estadoCivil;
    @XmlElement(name = "FechaNacimiento")
    protected String fechaNacimiento;
    @XmlElement(name = "Fono")
    protected String fono;
    @XmlElement(name = "Genero")
    protected String genero;
    @XmlElement(name = "SectorEconomico")
    protected String sectorEconomico;
    @XmlElement(name = "FechaApertura")
    protected String fechaApertura;
    @XmlElement(name = "FechaCierre")
    protected String fechaCierre;
    @XmlElement(name = "MotivoCierre")
    protected String motivoCierre;
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
     * Obtiene el valor de la propiedad numeroTarjeta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    /**
     * Define el valor de la propiedad numeroTarjeta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroTarjeta(String value) {
        this.numeroTarjeta = value;
    }

    /**
     * Obtiene el valor de la propiedad estadoTarjeta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstadoTarjeta() {
        return estadoTarjeta;
    }

    /**
     * Define el valor de la propiedad estadoTarjeta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstadoTarjeta(String value) {
        this.estadoTarjeta = value;
    }

    /**
     * Obtiene el valor de la propiedad nombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Define el valor de la propiedad nombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombre(String value) {
        this.nombre = value;
    }

    /**
     * Obtiene el valor de la propiedad apellidoPaterno.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    /**
     * Define el valor de la propiedad apellidoPaterno.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApellidoPaterno(String value) {
        this.apellidoPaterno = value;
    }

    /**
     * Obtiene el valor de la propiedad apellidoMaterno.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    /**
     * Define el valor de la propiedad apellidoMaterno.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApellidoMaterno(String value) {
        this.apellidoMaterno = value;
    }

    /**
     * Obtiene el valor de la propiedad direccion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Define el valor de la propiedad direccion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDireccion(String value) {
        this.direccion = value;
    }

    /**
     * Obtiene el valor de la propiedad comuna.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComuna() {
        return comuna;
    }

    /**
     * Define el valor de la propiedad comuna.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComuna(String value) {
        this.comuna = value;
    }

    /**
     * Obtiene el valor de la propiedad ciudad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCiudad() {
        return ciudad;
    }

    /**
     * Define el valor de la propiedad ciudad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCiudad(String value) {
        this.ciudad = value;
    }

    /**
     * Obtiene el valor de la propiedad estadoCivil.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstadoCivil() {
        return estadoCivil;
    }

    /**
     * Define el valor de la propiedad estadoCivil.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstadoCivil(String value) {
        this.estadoCivil = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaNacimiento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * Define el valor de la propiedad fechaNacimiento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaNacimiento(String value) {
        this.fechaNacimiento = value;
    }

    /**
     * Obtiene el valor de la propiedad fono.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFono() {
        return fono;
    }

    /**
     * Define el valor de la propiedad fono.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFono(String value) {
        this.fono = value;
    }

    /**
     * Obtiene el valor de la propiedad genero.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGenero() {
        return genero;
    }

    /**
     * Define el valor de la propiedad genero.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGenero(String value) {
        this.genero = value;
    }

    /**
     * Obtiene el valor de la propiedad sectorEconomico.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSectorEconomico() {
        return sectorEconomico;
    }

    /**
     * Define el valor de la propiedad sectorEconomico.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSectorEconomico(String value) {
        this.sectorEconomico = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaApertura.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaApertura() {
        return fechaApertura;
    }

    /**
     * Define el valor de la propiedad fechaApertura.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaApertura(String value) {
        this.fechaApertura = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaCierre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaCierre() {
        return fechaCierre;
    }

    /**
     * Define el valor de la propiedad fechaCierre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaCierre(String value) {
        this.fechaCierre = value;
    }

    /**
     * Obtiene el valor de la propiedad motivoCierre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotivoCierre() {
        return motivoCierre;
    }

    /**
     * Define el valor de la propiedad motivoCierre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotivoCierre(String value) {
        this.motivoCierre = value;
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
