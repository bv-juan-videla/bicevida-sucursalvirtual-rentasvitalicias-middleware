package cl.bicevida.beans.processors;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.oracle.xmlns.bv_consultasaldo.BVConsultaSaldo;
import com.oracle.xmlns.bv_estadotarjeta.BVEstadoTarjeta;
import cl.bicevida.estadotarjetain.EstadoTarjetaType;
import cl.bicevida.consultasaldoout.ConsultaSaldoType;
import cl.bicevida.consultasaldoout.EstadoType;
import cl.bicevida.credivida.model.ws.WSCartolasCRV;
import cl.bicevida.esb.services.data.Credivida;

public class SaldoProcessor implements Processor{

	Logger logger = LoggerFactory.getLogger(SaldoProcessor.class);
	private cl.bicevida.consultasaldoout.MediosPagos mediosOut;
	
	@Override
	public void process(Exchange ex) throws Exception {
		logger.info("[obtenerCartolasUnificadas]Inicio...");
		
		Credivida vida = ex.getIn().getBody(Credivida.class);
		
		System.out.print("Cuenta JSON:");
		System.out.println(vida.getCuenta());
		
		String numeroCuenta= Integer.toString(vida.getCuenta());
		
		String url = ex.getContext().resolvePropertyPlaceholders("{{url.endpoint.tarjeta}}");
		
		String rut = ex.getIn().getHeader("rut",String.class);
		logger.info("rutCliente: " + rut);
		
		logger.info("dvCliente: " + calculaRut(rut));
		
		String rutDv = String.format("%09d",Integer.parseInt(rut))+calculaRut(rut);
		
		EstadoTarjetaType estaIn = new EstadoTarjetaType();
		
		estaIn.setRutEmpresa("0966564105");
		estaIn.setRutTitular(rutDv);
		estaIn.setCanal("INT");
		estaIn.setUsuario(rutDv);
		
		cl.bicevida.estadotarjetain.MediosPagos mediosIn = new cl.bicevida.estadotarjetain.MediosPagos();
		 
		mediosIn.setEstadoTarjeta(estaIn);
		
		cl.bicevida.estadotarjetaout.MediosPagos outD = new cl.bicevida.estadotarjetaout.MediosPagos();
		
		BVEstadoTarjeta estadoResponse = createCXFClient2(url);
		outD = estadoResponse.process(mediosIn);
		
		System.out.print("Estado Codigo:");
		System.out.println(outD.getEstado().getEstadoCodigo());
		System.out.print("numero cuenta:");
		System.out.println(numeroCuenta);
		System.out.print("num.cuenta banco:");
		System.out.println(outD.getEstadoTarjeta().getNumeroCuenta());
		
		if (outD.getEstado().getEstadoCodigo().equals("0") ){
			System.out.println("<<< Codigo estado OK >>>>");
			
			if (outD.getEstadoTarjeta().getNumeroCuenta().equals(numeroCuenta) ){
				System.out.println("<<< num. cuenta iguales >>>>");
				//numero de cuenta credivida igual a numero de cuenta de banco activa
				String url2 = ex.getContext().resolvePropertyPlaceholders("{{url.endpoint.saldo}}");
				
				cl.bicevida.consultasaldoin.ConsultaSaldoType consultaIn = new cl.bicevida.consultasaldoin.ConsultaSaldoType();
				consultaIn.setRutEmpresa("0966564105");
				consultaIn.setNumeroCuenta(numeroCuenta);
				consultaIn.setCanal("INT");
				consultaIn.setUsuario(rutDv);
				
				cl.bicevida.consultasaldoin.MediosPagos mediosCIn = new cl.bicevida.consultasaldoin.MediosPagos();
				mediosCIn.setConsultaSaldo(consultaIn);
				
				cl.bicevida.consultasaldoout.MediosPagos mediosOut = new cl.bicevida.consultasaldoout.MediosPagos();
				
				BVConsultaSaldo saldoResponse = createCXFClient3(url2);
				
				mediosOut = saldoResponse.process(mediosCIn);
				
				//actualDia.setFechaActual(getFechaActual());
				
				//mediosOut.getEstado().setFechahasta(getFechaActual());
				mediosOut.getConsultaSaldo().setFechahasta(getFechaActual());
				
				ex.getOut().setBody(mediosOut);
			}else{
				mediosOut = new cl.bicevida.consultasaldoout.MediosPagos();
				//mediosOut = null;
				EstadoType estadoCod = new EstadoType();
				estadoCod.setEstadoCodigo("1001");
				estadoCod.setMensaje("Error Número de cuenta distintas");
				//estadoCod.setFechahasta(getFechaActual());
				
				ConsultaSaldoType consultaOut = new cl.bicevida.consultasaldoout.ConsultaSaldoType();
				//mediosOut.getConsultaSaldo().setFechahasta(getFechaActual());
				consultaOut.setFechahasta(getFechaActual());
				mediosOut.setEstado(estadoCod);
				mediosOut.setConsultaSaldo(consultaOut);
				
				ex.getOut().setBody(mediosOut);
			}
			
		}else{
			//error de estado de tarjeta
			//ex.getOut().setBody(outD);
			mediosOut = new cl.bicevida.consultasaldoout.MediosPagos();
			//mediosOut = null;
			
			EstadoType estadoCod = new EstadoType();
			estadoCod.setEstadoCodigo("1000");
			estadoCod.setMensaje("Error general Estado Tarjeta");
			//estadoCod.setFechahasta(getFechaActual());

			ConsultaSaldoType consultaOut = new cl.bicevida.consultasaldoout.ConsultaSaldoType();
			//mediosOut.getConsultaSaldo().setFechahasta(getFechaActual());
			consultaOut.setFechahasta(getFechaActual());
			mediosOut.setEstado(estadoCod);
			mediosOut.setConsultaSaldo(consultaOut);
			
			ex.getOut().setBody(mediosOut);
		}
		
	}
	
	public static BVEstadoTarjeta createCXFClient2(String url) throws IOException{		
		JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
		factory.setServiceClass(BVEstadoTarjeta.class);
		factory.setAddress(url);
		return (BVEstadoTarjeta)factory.create();		
	} 

	public static BVConsultaSaldo createCXFClient3(String url) throws IOException{		
		JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
		factory.setServiceClass(BVConsultaSaldo.class);
		factory.setAddress(url);
		return (BVConsultaSaldo)factory.create();		
	} 

	public static WSCartolasCRV createCXFClient4(String url) throws IOException{		
		JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
		factory.setServiceClass(WSCartolasCRV.class);
		factory.setAddress(url);
		return (WSCartolasCRV)factory.create();		
	} 
	
	public static String calculaRut(String rut) {
		String dv="";
		try {
			rut = rut.toUpperCase();
			rut = rut.replace(".", "");
			rut = rut.replace("-", "");
			int rutAux = Integer.parseInt(rut); 

			int m = 0, s = 1;
			for (; rutAux != 0; rutAux /= 10) {
				s = (s + rutAux % 10 * (9 - m++ % 6)) % 11;
			}
			
			dv = Character.toString((char) (s != 0 ? s + 47 : 75));
			
		} catch (java.lang.NumberFormatException e) {
		} catch (Exception e) {
		}
		return dv;
	}

    //Metodo usado para obtener la fecha actual
    //@return Retorna un <b>STRING</b> con la fecha actual formato "dd-MM-yyyy"
    public static String getFechaActual() {
        Date ahora = new Date();
        SimpleDateFormat formateador = new SimpleDateFormat("dd-MM-yyyy");
        return formateador.format(ahora);
    }
  //Metodo usado para obtener mes y año de la fecha actual
    public static String getMesAnoActual() {
        Date ahora = new Date();
        SimpleDateFormat formateador = new SimpleDateFormat ( "MMaaaa" );
        return formateador.format (ahora);
    }
    
}
