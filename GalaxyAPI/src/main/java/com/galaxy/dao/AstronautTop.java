package com.galaxy.dao;
/**
 * 
 * @author Felix Rafael Moreno
 * @version V1.0
 * */
public class AstronautTop {

	private String astronautName;
	private String astronautLastName;
	private long astronautVisit;
	
	public AstronautTop() {
		
	}

	/**
	 * Returns an AstronautTop Object
	 * 
	 * @param astronautName Referred to Astronaut First Name
	 * @param astronautLastName Referred to Astronaut Last Name
	 * @param astronautVisit Referred to how many visits the Astronaut have had
	 * */
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
