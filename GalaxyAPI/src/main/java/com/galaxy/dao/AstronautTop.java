package com.galaxy.dao;

public class AstronautTop {

	private String astronautName;
	private String astronautLastName;
	private long astronautVisit;
	
	public AstronautTop() {
		
	}

	public AstronautTop(String astronautName, String astronautLastName, long astronautVisit) {
		this.astronautName = astronautName;
		this.astronautLastName = astronautLastName;
		this.astronautVisit = astronautVisit;
	}

	public String getAstronautName() {
		return astronautName;
	}

	public void setAstronautName(String astronautName) {
		this.astronautName = astronautName;
	}

	public String getAstronautLastName() {
		return astronautLastName;
	}

	public void setAstronautLastName(String astronautLastName) {
		this.astronautLastName = astronautLastName;
	}

	public long getAstronautVisit() {
		return astronautVisit;
	}

	public void setAstronautVisit(long astronautVisit) {
		this.astronautVisit = astronautVisit;
	}
}
