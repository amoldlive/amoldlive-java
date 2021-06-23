package com.myapp.exception;

public class ExceptionDescriiptor {
	
	String timeStamp;
	String requestFailureDetails;
	String exception;

	
	public ExceptionDescriiptor(String exception, String requestFailureDetails, String timeStamp) {
		super();
		this.exception = exception;
		this.requestFailureDetails = requestFailureDetails;
		this.timeStamp = timeStamp;
	}

	public String getException() {
		return exception;
	}

	public void setException(String exception) {
		this.exception = exception;
	}

	public String getRequestFailureDetails() {
		return requestFailureDetails;
	}

	public void setRequestFailureDetails(String requestFailureDetails) {
		this.requestFailureDetails = requestFailureDetails;
	}

	public String getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(String timeStamp) {
		this.timeStamp = timeStamp;
	}

	@Override
	public String toString() {
		return "ExceptionDescriiptor [exception=" + exception + ", requestFailureDetails=" + requestFailureDetails
				+ ", timeStamp=" + timeStamp + "]";
	}

	
}
