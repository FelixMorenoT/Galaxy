package com.galaxy.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "planet")
public class Planet {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "planet_id")
	private long planetId;
	
	@Column(name = "planet_name", nullable = false)
	private String planetName;
	
	@Column(name = "planet_rotationtime", nullable = false)
	private String planetRotationTime;
	
	@Column(name = "planet_diameter", nullable = false)
	private String planetDiameter;
	
	@Column(name = "planet_weather", nullable = false)
	private String planetWeather;
	
	@Column(name = "planet_terrain", nullable = false)
	private String planetTerrain;
	
	@Column(name = "planet_count_visit")
	private long planetCountVisit = 0;
	
	public Planet() {
		
	}

	public Planet(long planetId, String planetName, String planetRotationTime, String planetDiameter,
			String planetWeather, String planetTerrain) {
		this.planetId = planetId;
		this.planetName = planetName;
		this.planetRotationTime = planetRotationTime;
		this.planetDiameter = planetDiameter;
		this.planetWeather = planetWeather;
		this.planetTerrain = planetTerrain;
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

	public String getPlanetRotationTime() {
		return planetRotationTime;
	}

	public void setPlanetRotationTime(String planetRotationTime) {
		this.planetRotationTime = planetRotationTime;
	}

	public String getPlanetDiameter() {
		return planetDiameter;
	}

	public void setPlanetDiameter(String planetDiameter) {
		this.planetDiameter = planetDiameter;
	}

	public String getPlanetWeather() {
		return planetWeather;
	}

	public void setPlanetWeather(String planetWeather) {
		this.planetWeather = planetWeather;
	}

	public String getPlanetTerrain() {
		return planetTerrain;
	}

	public void setPlanetTerrain(String planetTerrain) {
		this.planetTerrain = planetTerrain;
	}

	public Long getPlanetCountVisit() {
		return planetCountVisit;
	}

	public void setPlanetCountVisit(Long planetCountVisit) {
		this.planetCountVisit = planetCountVisit;
	}

	@Override
	public String toString() {
		return "Planet [planetId=" + planetId + ", planetName=" + planetName + ", planetRotationTime="
				+ planetRotationTime + ", planetDiameter=" + planetDiameter + ", planetWeather=" + planetWeather
				+ ", planetTerrain=" + planetTerrain + ", planetCountVisit=" + planetCountVisit + "]";
	}

}
