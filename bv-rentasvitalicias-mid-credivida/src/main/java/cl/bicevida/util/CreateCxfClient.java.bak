package cl.bicevida.util;

import java.io.IOException;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

import cl.bicevida.credivida.model.ws.WSCartolasCRV;

public class CreateCxfClient {
	

	public static WSCartolasCRV createCXFClient(String url) throws IOException{
		
//		obtengo el endpoint correspondiente al servicio del sam desde el archivo properties
		//String url2 = GetProperties.obtieneValorProperties("url.endpoint.cartola");	
		
		JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
		factory.setServiceClass(WSCartolasCRV.class);
		factory.setAddress(url);
		return (WSCartolasCRV)factory.create();		
	} 
	

}
