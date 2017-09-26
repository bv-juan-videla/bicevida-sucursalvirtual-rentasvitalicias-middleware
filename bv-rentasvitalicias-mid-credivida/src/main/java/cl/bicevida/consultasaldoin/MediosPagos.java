
package cl.bicevida.consultasaldoin;

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
 *         &lt;element name="ConsultaSaldo" type="{http://www.bicevida.cl/ConsultaSaldoIn}ConsultaSaldoType"/&gt;
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
    "consultaSaldo"
})
@XmlRootElement(name = "MediosPagos")
public class MediosPagos {

    @XmlElement(name = "ConsultaSaldo", required = true)
    protected ConsultaSaldoType consultaSaldo;

    /**
     * Obtiene el valor de la propiedad consultaSaldo.
     * 
     * @return
     *     possible object is
     *     {@link ConsultaSaldoType }
     *     
     */
    public ConsultaSaldoType getConsultaSaldo() {
        return consultaSaldo;
    }

    /**
     * Define el valor de la propiedad consultaSaldo.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsultaSaldoType }
     *     
     */
    public void setConsultaSaldo(ConsultaSaldoType value) {
        this.consultaSaldo = value;
    }

}
