package cl.bicevida.esb.camel.rest.services2;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/*** Ejemplo Representacion REST DSL a CXFRS
 * 
        <rest path="/sucursalvirtual/rentasvitalicias/creditos">
            <get outType="java.lang.String" produces="application/json" uri="/{rut}">
                <to uri="direct:obtenerDatosCliente2"/>
            </get>
            <put outType="java.lang.String" produces="application/json" uri="/">
                <param description="The user to update or create"
                    name="body" type="body"/>
                <!--to uri="direct:actualizarDatosCliente"/-->
                <!-- JMS ActiveMQ -->
                <to id="procesarActualizaciones" uri="activemq:queue:actualizarDatosCliente"/>
            </put>
        </rest>
 *  ***/

@Path("/")
@Produces({MediaType.APPLICATION_JSON})
@Consumes({MediaType.APPLICATION_JSON})
public class CreditosVigentesService { 

	@GET
    @Path("/vigentes/{rut}")
    public Response obtenerDatosCliente2(@PathParam("rut") String rut) {
        return null;
	}
	 
	@PUT
    @Path("/vigentes/")
    public Response actualizarDatosCliente(CreditosVigentes_ datosCliente) {
        return null;
	}
	
}
