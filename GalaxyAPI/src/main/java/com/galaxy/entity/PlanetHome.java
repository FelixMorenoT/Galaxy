package com.galaxy.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PlanetHome {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "planet_homeid")
	private long planetHomeId;
	
	@Column(name = "planet_id")
	private long planetId;
	
	@Column(name = "astronaut_id")
	private long astronautId;
	
	public PlanetHome() {
		
	}

	public PlanetHome(long planetId, long astronautId) {
		this.planetId = planetId;
		this.astronautId = astronautId;
	}

	public long getPlanetId() {
		return planetId;
	}

	public void setPlanetId(long planetId) {
		this.planetId = planetId;
	}

	public long getAstronautId() {
		return astronautId;
	}

	public void setAstronautId(long astronautId) {
		this.astronautId = astronautId;
	}

	@Override
	public String toString() {
		return "PlanetHome [planetHomeId=" + planetHomeId + ", planetId=" + planetId + ", astronautId=" + astronautId
				+ "]";
	}
}
