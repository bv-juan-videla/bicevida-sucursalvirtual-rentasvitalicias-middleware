package cl.bicevida.esb.services.data;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "estado",
    "glosa",
    "cuenta"
})
public class Credivida {

    @JsonProperty("estado")
    private Integer estado;
    @JsonProperty("glosa")
    private String glosa;
    @JsonProperty("cuenta")
    private Integer cuenta;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("estado")
    public Integer getEstado() {
        return estado;
    }

    @JsonProperty("estado")
    public void setEstado(Integer estado) {
        this.estado = estado;
    }

    @JsonProperty("glosa")
    public String getGlosa() {
        return glosa;
    }

    @JsonProperty("glosa")
    public void setGlosa(String glosa) {
        this.glosa = glosa;
    }

    @JsonProperty("cuenta")
    public Integer getCuenta() {
        return cuenta;
    }

    @JsonProperty("cuenta")
    public void setCuenta(Integer cuenta) {
        this.cuenta = cuenta;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
