package cl.bicevida.beans.creditosvigentes;

import java.io.Serializable;
import java.util.Date;

public class CreditosVigentesFull implements Serializable {
	private static final long serialVersionUID = 1L;

    private int idcredito;
    private String rut;
    private String usuario;
    private String sucursal;
    private int pagare;
    private Date fecha_pagare;
    private Date fecha_otorgamiento;
    private int monto_solicitado;
    private int plazo;
    private double tasa;
    private int monto_cuota;
    private int proyeccion;
    private int gastos_notariales;
    private int impuestos;
    private int total_credito;
    private String estado_i;
    private int monto_repactado;
    private String via_pago;
    private String producto;
    private Date termino_credito;
    private String cuotas_pagadas;
    
	public int getIdcredito() {
		return idcredito;
	}
	public void setIdcredito(int idcredito) {
		this.idcredito = idcredito;
	}
	public String getRut() {
		return rut;
	}
	public void setRut(String rut) {
		this.rut = rut;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getSucursal() {
		return sucursal;
	}
	public void setSucursal(String sucursal) {
		this.sucursal = sucursal;
	}
	public int getPagare() {
		return pagare;
	}
	public void setPagare(int pagare) {
		this.pagare = pagare;
	}
	public Date getFecha_pagare() {
		return fecha_pagare;
	}
	public void setFecha_pagare(Date fecha_pagare) {
		this.fecha_pagare = fecha_pagare;
	}
	public Date getFecha_otorgamiento() {
		return fecha_otorgamiento;
	}
	public void setFecha_otorgamiento(Date fecha_otorgamiento) {
		this.fecha_otorgamiento = fecha_otorgamiento;
	}
	public int getMonto_solicitado() {
		return monto_solicitado;
	}
	public void setMonto_solicitado(int monto_solicitado) {
		this.monto_solicitado = monto_solicitado;
	}
	public int getPlazo() {
		return plazo;
	}
	public void setPlazo(int plazo) {
		this.plazo = plazo;
	}
	public double getTasa() {
		return tasa;
	}
	public void setTasa(double tasa) {
		this.tasa = tasa;
	}
	public int getMonto_cuota() {
		return monto_cuota;
	}
	public void setMonto_cuota(int monto_cuota) {
		this.monto_cuota = monto_cuota;
	}
	public int getProyeccion() {
		return proyeccion;
	}
	public void setProyeccion(int proyeccion) {
		this.proyeccion = proyeccion;
	}
	public int getGastos_notariales() {
		return gastos_notariales;
	}
	public void setGastos_notariales(int gastos_notariales) {
		this.gastos_notariales = gastos_notariales;
	}
	public int getImpuestos() {
		return impuestos;
	}
	public void setImpuestos(int impuestos) {
		this.impuestos = impuestos;
	}
	public int getTotal_credito() {
		return total_credito;
	}
	public void setTotal_credito(int total_credito) {
		this.total_credito = total_credito;
	}
	public String getEstado_i() {
		return estado_i;
	}
	public void setEstado_i(String estado_i) {
		this.estado_i = estado_i;
	}
	public int getMonto_repactado() {
		return monto_repactado;
	}
	public void setMonto_repactado(int monto_repactado) {
		this.monto_repactado = monto_repactado;
	}
	public String getVia_pago() {
		return via_pago;
	}
	public void setVia_pago(String via_pago) {
		this.via_pago = via_pago;
	}
	public String getProducto() {
		return producto;
	}
	public void setProducto(String producto) {
		this.producto = producto;
	}
	public Date getTermino_credito() {
		return termino_credito;
	}
	public void setTermino_credito(Date termino_credito) {
		this.termino_credito = termino_credito;
	}
	public String getCuotas_pagadas() {
		return cuotas_pagadas;
	}
	public void setCuotas_pagadas(String cuotas_pagadas) {
		this.cuotas_pagadas = cuotas_pagadas;
	}
	
}
