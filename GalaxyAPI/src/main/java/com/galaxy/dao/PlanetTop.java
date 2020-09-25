package com.galaxy.dao;
/**
 * 
 * @author Felix Rafael Moreno
 * @version V1.0
 * */
public class PlanetTop {

	private String planetName;
	private long planetVisit;
	
	public PlanetTop() {
		
	}
	
	/**
	 * Returns an Planet Top Object
	 * 
	 * @param planetName Referred to Planet Name
	 * @param planetVisit Referred to how many times the Planet has been visited
	 * */
	public PlanetTop(String planetName, long planetVisit) {
		this.planetName = planetName;
		this.planetVisit = planetVisit;
	}

	public String getPlanetName() {
		return planetName;
	}

	public void setPlanetName(String planetName) {
		this.planetName = planetName;
	}

	public long getPlanetVisit() {
		return planetVisit;
	}

	public void setPlanetVi(long planetVisit) {
		this.planetVisit = planetVisit;
	}
	
	
}
