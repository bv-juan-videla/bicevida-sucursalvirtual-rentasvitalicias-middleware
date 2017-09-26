
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
 *         &lt;element name="result" type="{http://ws.model.credivida.bicevida.cl/types/}CartolaOut"/&gt;
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
    "result"
})
@XmlRootElement(name = "getCartolaUnificadaResponseElement")
public class GetCartolaUnificadaResponseElement {

    @XmlElement(required = true, nillable = true)
    protected CartolaOut result;

    /**
     * Obtiene el valor de la propiedad result.
     * 
     * @return
     *     possible object is
     *     {@link CartolaOut }
     *     
     */
    public CartolaOut getResult() {
        return result;
    }

    /**
     * Define el valor de la propiedad result.
     * 
     * @param value
     *     allowed object is
     *     {@link CartolaOut }
     *     
     */
    public void setResult(CartolaOut value) {
        this.result = value;
    }

}
