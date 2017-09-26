package cl.bicevida.beans.processors;

import java.io.IOException;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import cl.bicevida.credivida.model.ws.WSCartolasCRV;
//import cl.bicevida.credivida.model.ws.types.CartolaOut;
import cl.bicevida.credivida.model.ws.types.GetCartolaUnificadaElement;
import cl.bicevida.credivida.model.ws.types.GetCartolaUnificadaResponseElement;
import cl.bicevida.esb.services.data.Credivida;
//import cl.bicevida.util.CreateCxfClient;

public class CartolaProcessor implements Processor{

	Logger logger = LoggerFactory.getLogger(CartolaProcessor.class);
	
	@Override
	public void process(Exchange ex) throws Exception {
		logger.info("[obtenerCartolasUnificadas]Inicio...");
		
		Credivida vida = ex.getIn().getBody(Credivida.class);
		
		System.out.print("Cuenta JSON:");
		System.out.println(vida.getCuenta());
		
		String numeroCuenta= Integer.toString(vida.getCuenta());
		
		// CartolaOut cartolaCred = new CartolaOut();

		//try {
			//if (ex != null) {
				String url = ex.getContext().resolvePropertyPlaceholders("{{url.endpoint.cartola}}");
				
				String rut = ex.getIn().getHeader("rut",String.class);
				logger.info("rutCliente: " + rut);
				String periodo = ex.getIn().getHeader("periodo",String.class);
				logger.info("periodo: " + periodo);				
				
				// parametros de busqueda
				GetCartolaUnificadaElement buscaCartola = new GetCartolaUnificadaElement();
				buscaCartola.setVcta(numeroCuenta);
				buscaCartola.setVperiodo(periodo);
				buscaCartola.setVrut(rut);
				buscaCartola.setVuser(rut);
				
				GetCartolaUnificadaResponseElement outD = new GetCartolaUnificadaResponseElement();
				//CartolaOut outD = new CartolaOut(); 
				
				//WSCartolasCRV cartolaResponse = CreateCxfClient.createCXFClient(url);
				WSCartolasCRV cartolaResponse = createCXFClient2(url);
				outD = cartolaResponse.getCartolaUnificada(buscaCartola);
				
				//outD = cartolaResponse.getCartolaUnificada(buscaCartola); 
				//ex.getOut().setBody(p);
				ex.getOut().setBody(outD);
		
	}
	
	public static WSCartolasCRV createCXFClient2(String url) throws IOException{
		
		JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
		factory.setServiceClass(WSCartolasCRV.class);
		factory.setAddress(url);
		return (WSCartolasCRV)factory.create();		
	} 

}
