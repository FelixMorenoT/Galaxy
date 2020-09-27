package com.galaxy.dao;

/**
 * 
 * @author Felix Rafael Moreno
 * @version V1.0
 * */
public class PlanetInfo {
	
	private long planetId;
	private String planetName;
	private long planetPopulation;
	private String planetTerrain;
	private String planetWeather;
	private String planetDiameter;
	private String planetRotationTime;
	private long planetVisit;
	
	public PlanetInfo() {
		
	}
	
	/**
	 * Returns an Planet Info Object
	 * 
	 * @param planetId
	 * @param planetName Referred to Planet Name
	 * @param planetPopulation Referred to Planet population
	 * @param planetTerrain Referred to Planet terrain 
	 * @param planetWeather Referred to Planet Weather
	 * @param planetDiameter Referred to Planet Diameter
	 * @param planetRotationTime Referred to Planet rotation time
	 * @param planetVisit Referred to how many Astronaut has been in the Planet
	 * */
	public PlanetInfo(long planetId, String planetName, long planetPopulation, String planetTerrain,
			String planetWeather, String planetDiameter, String planetRotationTime, long planetVisit) {
		this.planetId = planetId;
		this.planetName = planetName;
		this.planetPopulation = planetPopulation;
		this.planetTerrain = planetTerrain;
		this.planetWeather = planetWeather;
		this.planetDiameter = planetDiameter;
		this.planetRotationTime = planetRotationTime;
		this.planetVisit = planetVisit;
	}

	public long getPlanetId() {
		return planetId;
	}

	public void setPlanetId(long planetId) {
		this.planetId = planetId;
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