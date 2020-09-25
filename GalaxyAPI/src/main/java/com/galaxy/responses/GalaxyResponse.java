package com.galaxy.responses;
/**
 * 
 * @author Felix Rafael Moreno
 * @version V1.0
 * */
public class GalaxyResponse {

	private int status;
	private String message;
	private long timeStamp;
	
	public GalaxyResponse() {
		
	}
	
	public GalaxyResponse(int status, String message, long timeStamp) {
		this.status = status;
		this.message = message;
		this.timeStamp = timeStamp;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public long getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(long timeStamp) {
		this.timeStamp = timeStamp;
	}
}
