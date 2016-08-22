package com.example.jafs.entity;

public class Error {
	private String exception;
	private String possibleCause;
	private String possibleResolution;

	public Error(String exception, String possibleCause, String possibleResolution) {
		super();
		this.exception = exception;
		this.possibleCause = possibleCause;
		this.possibleResolution = possibleResolution;
	}
	
	public String getException() {
		return exception;
	}
	public void setException(String exception) {
		this.exception = exception;
	}
	public String getPossibleCause() {
		return possibleCause;
	}
	public void setPossibleCause(String possibleCause) {
		this.possibleCause = possibleCause;
	}
	public String getPossibleResolution() {
		return possibleResolution;
	}
	public void setPossibleResolution(String possibleResolution) {
		this.possibleResolution = possibleResolution;
	}
}
