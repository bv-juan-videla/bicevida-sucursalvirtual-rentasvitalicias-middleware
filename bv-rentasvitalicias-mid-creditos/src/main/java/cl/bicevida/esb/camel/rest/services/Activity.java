package cl.bicevida.esb.camel.rest.services;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Activity {

    protected String plSucursal;
    @JsonProperty("Subject")
    protected String subject;
	@JsonProperty("Type")
    protected String type;
	protected String plViaContacto;
    @JsonProperty("StartTime")
    protected String startTime;	
    protected String ltProductoPoliza;
    @JsonProperty("ExternalSystemId")
    protected String externalSystemId;
    @JsonProperty("Description")
    protected String description;
    @JsonProperty("OwnerExternalSystemId")
    protected String ownerExternalSystemId;
    @JsonProperty("Activity")
    protected String activity;
    @JsonProperty("EndTime")
    protected String endTime;
    @JsonProperty("PrimaryContactExternalSystemId")
    protected String primaryContactExternalSystemId;
    @JsonProperty("ServiceRequestNumber")
    protected String serviceRequestNumber;
    @JsonProperty("Status")
    protected String status;
    protected String ltOrigenActividad;
    
	public String getPlSucursal() {
		return plSucursal;
	}
	public void setPlSucursal(String plSucursal) {
		this.plSucursal = plSucursal;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getPlViaContacto() {
		return plViaContacto;
	}
	public void setPlViaContacto(String plViaContacto) {
		this.plViaContacto = plViaContacto;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getLtProductoPoliza() {
		return ltProductoPoliza;
	}
	public void setLtProductoPoliza(String ltProductoPoliza) {
		this.ltProductoPoliza = ltProductoPoliza;
	}
	public String getExternalSystemId() {
		return externalSystemId;
	}
	public void setExternalSystemId(String externalSystemId) {
		this.externalSystemId = externalSystemId;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getOwnerExternalSystemId() {
		return ownerExternalSystemId;
	}
	public void setOwnerExternalSystemId(String ownerExternalSystemId) {
		this.ownerExternalSystemId = ownerExternalSystemId;
	}
	public String getActivity() {
		return activity;
	}
	public void setActivity(String activity) {
		this.activity = activity;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	public String getPrimaryContactExternalSystemId() {
		return primaryContactExternalSystemId;
	}
	public void setPrimaryContactExternalSystemId(String primaryContactExternalSystemId) {
		this.primaryContactExternalSystemId = primaryContactExternalSystemId;
	}
	public String getServiceRequestNumber() {
		return serviceRequestNumber;
	}
	public void setServiceRequestNumber(String serviceRequestNumber) {
		this.serviceRequestNumber = serviceRequestNumber;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getLtOrigenActividad() {
		return ltOrigenActividad;
	}
	public void setLtOrigenActividad(String ltOrigenActividad) {
		this.ltOrigenActividad = ltOrigenActividad;
	}	
    
}
