package com.example.jafs.entity;

/**
 * The entity class for defining the end point data which we will receive 
 * from the front end.
 * @author pulgupta
 * @version 1.0.0.0
 */
public class Endpoint {
	
	private String endpointUrl;
	private String jsonBody;
	private String fileName;
	
	public Endpoint(){
		super();
	}
	
	public Endpoint(String endpointUrl, String jsonBody) {
		this.endpointUrl = endpointUrl;
		this.jsonBody = jsonBody;
	}
	
	public String getEndpointUrl() {
		return endpointUrl;
	}
	public void setEndpointUrl(String endpointUrl) {
		this.endpointUrl = endpointUrl;
	}
	public String getJsonBody() {
		return jsonBody;
	}
	public void setJsonBody(String jsonBody) {
		this.jsonBody = jsonBody;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	@Override
	public String toString() {
		return "Endpoint [endpointUrl=" + endpointUrl + ", jsonBody=" + jsonBody + ", fileName=" + fileName + "]";
	}
	
}
