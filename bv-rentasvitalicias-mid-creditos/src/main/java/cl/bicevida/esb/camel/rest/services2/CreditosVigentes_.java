package cl.bicevida.esb.camel.rest.services2;

//import java.io.Serializable;
//import java.util.List;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import cl.bicevida.beans.creditosvigentes.CreditosVigentes;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"credvigente"
})

public class CreditosVigentes_ {
	
	@JsonProperty("credvigente")
	private CreditosVigentes credvigente;

	@JsonProperty("credvigente")
	public CreditosVigentes getCredvigente() {
		return credvigente;
	}

	@JsonProperty("credvigente")
	public void setCredvigente(CreditosVigentes credvigente) {
		this.credvigente = credvigente;
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
