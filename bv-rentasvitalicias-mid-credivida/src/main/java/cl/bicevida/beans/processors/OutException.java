package cl.bicevida.beans.processors;

public class OutException {
	
	private String error;
	private Integer statusCode;
	private String statusText;
	
	public OutException() {
		// TODO Auto-generated constructor stub
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public Integer getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(Integer statusCode) {
		this.statusCode = statusCode;
	}

	public String getStatusText() {
		return statusText;
	}

	public void setStatusText(String statusText) {
		this.statusText = statusText;
	}

}
