package cl.bicevida.beans.aggregators;

import org.apache.camel.Exchange;
import org.apache.camel.processor.aggregate.AggregationStrategy;

//import cl.bicevida.esb.camel.rest.services2.CreditosVigentes;

public class ActualizaBDPAg implements AggregationStrategy {

	@Override
	public Exchange aggregate(Exchange oldEx, Exchange newEx) {
		// TODO Auto-generated method stub
		
		if(oldEx == null){
			return newEx;
		}
		
		/*if(oldEx.getIn().getBody() instanceof DatosCliente){
			DatosCliente datosCliente = new DatosCliente();
			datosCliente = oldEx.getIn().getBody(DatosCliente.class);
		
			oldEx.getOut().setBody(datosCliente);
		}*/
		
		oldEx.getIn().setHeaders(newEx.getIn().getHeaders());
		return oldEx;
	}

}
