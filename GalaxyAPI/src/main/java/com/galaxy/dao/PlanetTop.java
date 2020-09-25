package com.galaxy.dao;

public class PlanetTop {

	private String planetName;
	private long planetVisit;
	
	public PlanetTop() {
		
	}
	
	public PlanetTop(String planetName, long planetVi) {
		this.planetName = planetName;
		this.planetVisit = planetVi;
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

	public void setPlanetVi(long planetVi) {
		this.planetVisit = planetVi;
	}
	
	
}
