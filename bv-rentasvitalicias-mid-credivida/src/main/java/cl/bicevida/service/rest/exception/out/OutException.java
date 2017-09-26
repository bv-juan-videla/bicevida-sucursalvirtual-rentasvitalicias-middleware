package cl.bicevida.service.rest.exception.out;

import java.io.Serializable;

public class OutException implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	/**
	 * Codigo de la excepcion.
	 */
	private int statusCode;
	
	/**
	 * descripcion del codigo.
	 */
	private String statusText;
	
	/**
	 * Mensaje de error.
	 */
	private String mensaje;
	
	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	public String getStatusText() {
		return statusText;
	}
	public void setStatusText(String statusText) {
		this.statusText = statusText;
	}
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	@Override
	public String toString() {
		return "OutException [statusCode=" + statusCode + ", statusText=" + statusText + ", mensaje=" + mensaje + "]";
	}
}
