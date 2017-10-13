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
    "numfde"
})

public class ObtieneNroFde {

    @JsonProperty("estado")
    private Integer estado;
    @JsonProperty("glosa")
    private String glosa;
    @JsonProperty("numfde")
    private Integer numfde;
    
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

    @JsonProperty("numfde")
    public Integer getNumfde() {
        return numfde;
    }

    @JsonProperty("numfde")
    public void setNumfde(Integer numfde) {
        this.numfde = numfde;
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
