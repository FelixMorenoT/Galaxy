package com.galaxy.dao;

public class PlanetInfo {
	
	private String planetName;
	private long planetPopulation;
	private String planetTerrain;
	private String planetWeather;
	private String planetDiameter;
	private String planetRotationTime;
	private long planetVisit;
	
	public PlanetInfo() {
		
	}
	
	public PlanetInfo(String planetName, long planetPopulation, String planetTerrain, String planetWeather,
			String planetDiameter, String planetRotationTime, long planetVisit) {
		this.planetName = planetName;
		this.planetPopulation = planetPopulation;
		this.planetTerrain = planetTerrain;
		this.planetWeather = planetWeather;
		this.planetDiameter = planetDiameter;
		this.planetRotationTime = planetRotationTime;
		this.planetVisit = planetVisit;
	}



	public String getPlanetName() {
		return planetName;
	}

	public void setPlanetName(String planetName) {
		this.planetName = planetName;
	}

	public long getPlanetPopulation() {
		return planetPopulation;
	}

	public void setPlanetPopulation(long planetPopulation) {
		this.planetPopulation = planetPopulation;
	}

	public String getPlanetTerrain() {
		return planetTerrain;
	}

	public void setPlanetTerrain(String planetTerrain) {
		this.planetTerrain = planetTerrain;
	}

	public String getPlanetWeather() {
		return planetWeather;
	}

	public void setPlanetWeather(String planetWeather) {
		this.planetWeather = planetWeather;
	}

	public String getPlanetDiameter() {
		return planetDiameter;
	}

	public void setPlanetDiameter(String planetDiameter) {
		this.planetDiameter = planetDiameter;
	}

	public String getPlanetRotationTime() {
		return planetRotationTime;
	}

	public void setPlanetRotationTime(String planetRotationTime) {
		this.planetRotationTime = planetRotationTime;
	}

	public long getPlanetVisit() {
		return planetVisit;
	}

	public void setPlanetVisit(long planetVisit) {
		this.planetVisit = planetVisit;
	}

	@Override
	public String toString() {
		return "PlanetInfo [planetName=" + planetName + ", planetPopulation=" + planetPopulation + ", planetTerrain="
				+ planetTerrain + ", planetWeather=" + planetWeather + ", planetDiameter=" + planetDiameter
				+ ", planetRotationTime=" + planetRotationTime + ", planetVisit=" + planetVisit + "]";
	}
}