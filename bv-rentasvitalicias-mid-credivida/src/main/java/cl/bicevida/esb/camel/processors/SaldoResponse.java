package cl.bicevida.esb.camel.processors;

import cl.bicevida.linea_credito_servicios.view.ws.servicios.SaldoLineaCredito;

public class SaldoResponse {

	
	private SaldoLineaCredito saldo;

	public SaldoLineaCredito getSaldo() {
		return saldo;
	}

	public void setSaldo(SaldoLineaCredito saldo) {
		this.saldo = saldo;
	}
	
	
}
