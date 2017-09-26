package cl.bicevida.beans.creditosvigentes;

//import java.io.Serializable;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"idcredito",
"fecha_otorgamiento",
"total_credito",
"cuotas_pagadas",
"monto_cuota",
"termino_credito"
})

//public class CreditosVigentes implements Serializable {
public class CreditosVigentes {
	// private static final long serialVersionUID = 1L;

	@JsonProperty("idcredito")
	private int idcredito;
	@JsonProperty("fecha_otorgamiento")
    private Date fecha_otorgamiento;
	@JsonProperty("total_credito")
    private int total_credito;
	@JsonProperty("cuotas_pagadas")
    private String cuotas_pagadas;
	@JsonProperty("monto_cuota")
    private int monto_cuota;
	@JsonProperty("termino_credito")
    private Date termino_credito;
	
	@JsonProperty("idcredito")	
	public int getIdcredito() {
		return idcredito;
	}
	@JsonProperty("idcredito")	
	public void setIdcredito(int idcredito) {
		this.idcredito = idcredito;
	}
	@JsonProperty("fecha_otorgamiento")	
	public Date getFecha_otorgamiento() {
		return fecha_otorgamiento;
	}
	@JsonProperty("fecha_otorgamiento")	
	public void setFecha_otorgamiento(Date fecha_otorgamiento) {
		this.fecha_otorgamiento = fecha_otorgamiento;
	}
	@JsonProperty("total_credito")	
	public int getTotal_credito() {
		return total_credito;
	}
	@JsonProperty("total_credito")	
	public void setTotal_credito(int total_credito) {
		this.total_credito = total_credito;
	}
	@JsonProperty("cuotas_pagadas")	
	public String getCuotas_pagadas() {
		return cuotas_pagadas;
	}
	@JsonProperty("cuotas_pagadas")	
	public void setCuotas_pagadas(String cuotas_pagadas) {
		this.cuotas_pagadas = cuotas_pagadas;
	}
	@JsonProperty("monto_cuota")	
	public int getMonto_cuota() {
		return monto_cuota;
	}
	@JsonProperty("monto_cuota")	
	public void setMonto_cuota(int monto_cuota) {
		this.monto_cuota = monto_cuota;
	}
	@JsonProperty("termino_credito")	
	public Date getTermino_credito() {
		return termino_credito;
	}
	@JsonProperty("termino_credito")	
	public void setTermino_credito(Date termino_credito) {
		this.termino_credito = termino_credito;
	}
    


    /*private String rut;
    private String usuario;
    private String sucursal;
    private int pagare;
    private Date fecha_pagare;
    private int monto_solicitado;
    private int plazo;
    private double tasa;
    private int proyeccion;
    private int gastos_notariales;
    private int impuestos;
    private String estado_i;
    private int monto_repactado;
    private String via_pago;
    private String producto; */
    
    
}
