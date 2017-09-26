package cl.bicevida.esb.camel.aggregators;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.processor.aggregate.AggregationStrategy;
import org.apache.log4j.Logger;

import cl.bicevida.beans.creditosvigentes.CreditosVigentes;
import cl.bicevida.esb.camel.rest.services.CreditosVigentesServices;

//public class CreditosAggregator implements AggregationStrategy {
public class CreditosAggregator implements Processor {
	
	Logger logger = Logger.getLogger(CreditosAggregator.class);
	
	Integer i = 0;

	@Override
	//public Exchange aggregate(Exchange oldex, Exchange newex) {
	public void process(Exchange oldex) throws Exception {
		
		CreditosVigentes creditosResponse = null;
		
		i++;
		logger.info("count de aggregator " + i);
		
		//if(oldex == null){
			
			logger.info("Primera llamada del aggregator");
			//oldex = oldex.copy();				
			creditosResponse = new CreditosVigentes();			
			oldex.getIn().setBody(creditosResponse);		
		//}
		
		creditosResponse = oldex.getIn().getBody(CreditosVigentes.class);
		
		Object o = oldex.getIn().getBody();
		
		logger.info("objeto -> " + o.getClass().getName());
		
		//if(o instanceof cl.bicevida.esb.services.data.Cliente){
			logger.info("Objecto Cliente llega a aggregator");
			cl.bicevida.beans.creditosvigentes.CreditosVigentes cl = (cl.bicevida.beans.creditosvigentes.CreditosVigentes)o;
			
			
			creditosResponse.setIdcredito(cl.getIdcredito());
			creditosResponse.setFecha_otorgamiento(cl.getFecha_otorgamiento());
			creditosResponse.setTotal_credito(cl.getTotal_credito());
			creditosResponse.setCuotas_pagadas(cl.getCuotas_pagadas());
			creditosResponse.setMonto_cuota(cl.getMonto_cuota());
			creditosResponse.setTermino_credito(cl.getTermino_credito());			
		//}
		
		
		//oldex.getIn().setBody(clienteResponse);				
		oldex.getOut().setBody(creditosResponse);				
		
		//return oldex;
	}	
	

}
