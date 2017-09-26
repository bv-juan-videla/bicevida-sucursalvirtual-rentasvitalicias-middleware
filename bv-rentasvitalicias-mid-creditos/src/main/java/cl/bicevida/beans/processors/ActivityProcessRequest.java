package cl.bicevida.beans.processors;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import cl.bicevida.esb.camel.rest.services2.Activity;
//import cl.bicevida.esb.camel.rest.services2.CreditosVigentes;

public class ActivityProcessRequest implements Processor {

	Logger logger = LoggerFactory.getLogger(ActivityProcessRequest.class); 
	
	@Override
	public void process(Exchange exchange) throws Exception {
		// TODO Auto-generated method stub
		logger.info("ActivityProcessRequest...");
		
		Date curDate = new Date();
		SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy");
		String fecha = format.format(curDate);
		
		// rescata datos objeto Activity
		//CreditosVigentes datosCliente = exchange.getIn().getBody(CreditosVigentes.class);
		
        // create input activity
		Activity activity = new Activity();
		
		/* data a mandar comentada */
		//int idCre = datosCliente.getIdcredito(); //+"-"+datosCliente.getDv();
		//int rut = datosCliente.getIdcredito();
		
		activity.setPlSucursal("Sucursal Virtual");
		activity.setSubject("Obtiene Creditos Vigentes");
		activity.setType("Otros");
		activity.setPlViaContacto("Web");
		//activity.setStartTime("07/18/2017");
		activity.setStartTime(""+fecha+"");
		activity.setLtProductoPoliza("");
		activity.setExternalSystemId("");
		activity.setDescription("Ejecutivo:  - OBTIENE DATOS CREDITOS");
		// campo ejecutivo - comentado a modo de pruebas - sin rut queda "Sistema Integracion"
		//activity.setOwnerExternalSystemId("14456489-8");
		activity.setOwnerExternalSystemId("");
		activity.setActivity("Tarea");
		activity.setEndTime("");
		activity.setPrimaryContactExternalSystemId("");
		//activity.setPrimaryContactExternalSystemId(""+ rut +"");
		activity.setServiceRequestNumber("");
		activity.setStatus("Completed");
		activity.setLtOrigenActividad("SIC");
        
        
        // return object
        //exchange.getOut().setBody(activity);
        //exchange.getOut().setHeaders(exchange.getIn().getHeaders());
		
	}

}
