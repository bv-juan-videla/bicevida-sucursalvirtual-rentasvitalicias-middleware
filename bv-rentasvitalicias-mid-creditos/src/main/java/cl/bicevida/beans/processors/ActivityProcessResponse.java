package cl.bicevida.beans.processors;

import java.util.Properties;
import java.io.IOException;
import java.io.InputStream;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;

import cl.bicevida.esb.camel.rest.services2.CreditosVigentes_;

public class ActivityProcessResponse implements Processor {
	//Logger logger = LoggerFactory.getLogger(ActivityProcessResponse.class); 	

	@Override
	public void process(Exchange exchange) throws Exception {
		// TODO Auto-generated method stub
		//logger.info("ActivityProcessResponse...");
		
		CreditosVigentes_  datosCliente = (CreditosVigentes_) exchange.getIn().getBody();
				
		//CreditosVigentes_  credVig = new CreditosVigentes_();
		
		//credVig.getCredvigente().setIdcredito(datosCliente.getCredvigente().getIdcredito());
		//credVig.getCredvigente().setFecha_otorgamiento(datosCliente.getCredvigente().getFecha_otorgamiento());
		//credVig.setIdcredito(datosCliente.getCredvigente().getIdcredito());
		//credVig.setFecha_otorgamiento(datosCliente.getCredvigente().getFecha_otorgamiento());
		//credVig.setTotal_credito(datosCliente.getTotal_credito());
		//credVig.setMonto_cuota(datosCliente.getMonto_cuota());
		//credVig.setCuotas_pagadas(datosCliente.getCuotas_pagadas());
		//credVig.setTermino_credito(datosCliente.getTermino_credito()); 
		
		//String example = exchange.getIn().getBody(String.class);
		
		
		System.out.print("idcredito:");
		//System.out.println(datosCliente.getCredvigente().getIdcredito());
		System.out.print("fecha otorgamiento:");
		//System.out.println(datosCliente.getCredvigente().getFecha_otorgamiento());
		
	   	exchange.getOut().setBody(datosCliente);		
	}
	
	/**
	 * Obtiene un property del archivo
	 * de propiedades psado por parametro
	 * @param propertyFile
	 * @param propertyName
	 * @return
	 */
	private String getProperty(String propertyFile, String propertyName){
		
		Properties prop = new Properties();
    	InputStream input = null;
    	
    	try {
    		
    		input = getClass().getClassLoader().getResourceAsStream(propertyFile);
			prop.load(input);
			
			return prop.getProperty(propertyName);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
    	
		return null;
	}
		
}
