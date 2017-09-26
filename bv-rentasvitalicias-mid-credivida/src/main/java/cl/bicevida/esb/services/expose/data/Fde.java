package cl.bicevida.esb.services.expose.data;

public class Fde {
	
    //protected cl.bicevida.linea_credito_servicios.view.ws.servicios.EstadoConsultaSaldo estado;
    protected java.lang.String estado;
    protected java.lang.String mensaje;
    protected java.lang.String montoAutorizado;
    protected java.lang.String montoUtilizado;
    protected java.lang.String montoDisponible;
    
    public Fde() {
    }
      
    public java.lang.String getEstado() {
		return estado;
	}

	public void setEstado(java.lang.String estado) {
		this.estado = estado;
	}

	public java.lang.String getMensaje() {
		return mensaje;
	}

	public void setMensaje(java.lang.String mensaje) {
		this.mensaje = mensaje;
	}

	public java.lang.String getMontoAutorizado() {
        return montoAutorizado;
    }
    
    public void setMontoAutorizado(java.lang.String montoAutorizado) {
        this.montoAutorizado = montoAutorizado;
    }
    
    public java.lang.String getMontoUtilizado() {
        return montoUtilizado;
    }
    
    public void setMontoUtilizado(java.lang.String montoUtilizado) {
        this.montoUtilizado = montoUtilizado;
    }
    
    public java.lang.String getMontoDisponible() {
        return montoDisponible;
    }
    
    public void setMontoDisponible(java.lang.String montoDisponible) {
        this.montoDisponible = montoDisponible;
    }

}
