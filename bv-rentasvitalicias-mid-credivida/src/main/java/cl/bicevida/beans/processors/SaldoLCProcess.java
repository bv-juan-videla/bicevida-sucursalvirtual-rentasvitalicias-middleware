package cl.bicevida.beans.processors;

import java.io.IOException;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import cl.bicevida.linea_credito_servicios.view.ws.servicios.BVSaldoLCR;
import cl.bicevida.esb.camel.processors.SaldoResponse;
import cl.bicevida.esb.services.data.Credivida;
import cl.bicevida.esb.services.expose.data.Fde;

public class SaldoLCProcess implements Processor{	
    //@SuppressWarnings("unused")
	//private SaldoLineaCredito saldoLineaCredito; 
    private String estadoCodigo;
    private String mensaje;

	Logger logger = LoggerFactory.getLogger(SaldoLCProcess.class);

	@Override
	public void process(Exchange ex) throws Exception {
	//public Fde obtenersaldos(Exchange ex) throws Exception {
		logger.info("[obtenersaldosFDE]Inicio...");
		
		estadoCodigo ="";

		Credivida vida = ex.getIn().getBody(Credivida.class);
		
		System.out.print("Cuenta JSON:");
		System.out.println(vida.getCuenta());
		
		String numeroCuenta= Integer.toString(vida.getCuenta());
        Fde saldoCred = new Fde();
		
		try {
			//if (ex != null) {
				String url = ex.getContext().resolvePropertyPlaceholders("{{url.endpoint.saldoLC}}");
				
				String rut = ex.getIn().getHeader("rut",String.class);
				logger.info("rutCliente: " + rut);
				SaldoResponse p = new SaldoResponse();
				//GetUrlPDFResponse outD = new GetUrlPDFResponse();
				//SaldoLineaCredito outD = new SaldoLineaCredito();
				

				BVSaldoLCR saldo = createCXFClient5(url);
				// PlanillaCajaWS cliente = CreateCxfClient.createCXFClient(url);
				 p.setSaldo(saldo.saldoLCR(numeroCuenta));
				//outD.setReturn(saldo.saldoLCR(numeroCuenta));
				//ex.getOut().setBody(p);
				
		        System.out.print("Monto Autorizado:");
		        System.out.println(p.getSaldo().getMontoAutorizado());
		        System.out.print("Monto Disponible:");
		        System.out.println(p.getSaldo().getMontoDisponible());
		        
		        //saldoCred.setEstado("0");
		        //saldoCred.setMensaje("OK");
		        saldoCred.setEstado(p.getSaldo().getEstado().getCodigo());
		        saldoCred.setMensaje(p.getSaldo().getEstado().getMensaje());		        
		        saldoCred.setMontoAutorizado(p.getSaldo().getMontoAutorizado());
		        saldoCred.setMontoDisponible(p.getSaldo().getMontoDisponible());
		        saldoCred.setMontoUtilizado(p.getSaldo().getMontoUtilizado());				
				ex.getOut().setBody(saldoCred);
		        //return saldoCred;
			//}
		} catch (Exception e) {
			//throw new WebApplicationException(e);
	        saldoCred.setEstado("1000");
	        saldoCred.setMensaje("Error de conexion con el ws tucana linea credito FDE");		        
	        saldoCred.setMontoAutorizado("0");
	        saldoCred.setMontoDisponible("0");
	        saldoCred.setMontoUtilizado("0");				
			ex.getOut().setBody(saldoCred);			
			System.out.println("<<< Error de ws >>>");
		}		
		
		//ex.getOut().setBody(saldoCred);


		logger.info("[obtenersaldosFDE]Fin...");
		//return saldoCred;
	}

	public static BVSaldoLCR createCXFClient5(String url) throws IOException{
		
//		obtengo el endpoint correspondiente al servicio del sam desde el archivo properties
		JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
		factory.setServiceClass(BVSaldoLCR.class);
		factory.setAddress(url);
		return (BVSaldoLCR)factory.create();		
	} 	
}
