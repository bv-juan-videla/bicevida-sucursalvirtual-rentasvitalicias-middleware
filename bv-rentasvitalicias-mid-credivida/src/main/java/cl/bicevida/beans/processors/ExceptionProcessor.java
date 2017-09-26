package cl.bicevida.beans.processors;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.http.common.HttpOperationFailedException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import cl.bicevida.beans.processors.OutException;;

public class ExceptionProcessor implements Processor {
	
	Logger logger = LoggerFactory.getLogger(ExceptionProcessor.class);
	@Override
	public void process(Exchange ex) throws Exception {
		Exception causa = ex.getProperty(Exchange.EXCEPTION_CAUGHT, Exception.class);
		OutException out = new OutException();
		if(causa instanceof HttpOperationFailedException){
			HttpOperationFailedException c= (HttpOperationFailedException) causa;
			
			out.setError(c.getMessage());
			out.setStatusCode(c.getStatusCode());
			out.setStatusText(c.getStatusText());
			ex.getOut().setBody(out);
			logger.info("Body HttpOperationFailedException: " + ex.getOut().getBody());
		}
		else if(causa instanceof WebApplicationException){
			WebApplicationException c= (WebApplicationException) causa;
			out.setError(c.getMessage());
			out.setStatusCode(c.getResponse().getStatus());
			if(c.getCause()!= null){
				out.setStatusText(c.getCause().getMessage());	
			}else{
				out.setStatusText(c.getLocalizedMessage());
			}
			ex.getOut().setBody(out);
			logger.info("Body WebApplicationException: " + ex.getOut().getBody());
		}else{
			out.setError(causa.getMessage());
			out.setStatusCode(Response.Status.INTERNAL_SERVER_ERROR.getStatusCode());//codigo erroneo 
			out.setStatusText(Response.Status.INTERNAL_SERVER_ERROR.toString());
			ex.getOut().setBody(out);	
			logger.info("Body Exception: " + ex.getOut().getBody());
		}
		
	}

}
