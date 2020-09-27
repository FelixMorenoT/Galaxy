package com.galaxy.entity;
/**
 * 
 * @author Felix Rafael Moreno
 * @version V1.0
 * */
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Astronaut{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long astronautId;
	
	@Column(name = "astronaut_name",nullable = false)
	private String astronautName;
	
	@Column(name = "astronaut_lastname",nullable = false)
	private String astronautLastName;
	
	@Column(name = "astronaut_age",nullable = false)
	private String astronautAge;
	
	@Column(name = "astronaut_high",nullable = false)
	private String astronautHigh;
	
	@Column(name = "astronau_weight",nullable = false)
	private String astronautWeight;
	
	@Column(name = "astronaut_gender",nullable = false)
	private String astronautGender;
	
	@Column(name = "astronaut_birth",nullable = false)
	private String astronautBirth;
	
	@Column(name = "astronaut_rh",nullable = false)
	private String astronautRH;

	@Column(name = "has_home",nullable = false)
	private boolean hasHome;
	
	@Column(name = "astronaut_Count_visit")
	private long astronautCountVisit = 0;
	public Astronaut() {
		
	}

	public Astronaut(long astronautId, String astronautName, String astronautLastName, String astronautAge,
			String astronautHigh, String astronautWeight, String astronautGender, String astronautBirth,
			String astronautRH) {
		this.astronautId = astronautId;
		this.astronautName = astronautName;
		this.astronautLastName = astronautLastName;
		this.astronautAge = astronautAge;
		this.astronautHigh = astronautHigh;
		this.astronautWeight = astronautWeight;
		this.astronautGender = astronautGender;
		this.astronautBirth = astronautBirth;
		this.astronautRH = astronautRH;
	}
	
	public Astronaut(String astronautName, String astronautLastName, String astronautAge, String astronautHigh,
			String astronautWeight, String astronautGender, String astronautBirth, String astronautRH) {
		this.astronautName = astronautName;
		this.astronautLastName = astronautLastName;
		this.astronautAge = astronautAge;
		this.astronautHigh = astronautHigh;
		this.astronautWeight = astronautWeight;
		this.astronautGender = astronautGender;
		this.astronautBirth = astronautBirth;
		this.astronautRH = astronautRH;
	}

	public long getAstronautId() {
		return astronautId;
	}

	public void setAstronautId(long astronautId) {
		this.astronautId = astronautId;
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

	public String getAstronautAge() {
		return astronautAge;
	}

	public void setAstronautAge(String astronautAge) {
		this.astronautAge = astronautAge;
	}

	public String getAstronautHigh() {
		return astronautHigh;
	}

	public void setAstronautHigh(String astronautHigh) {
		this.astronautHigh = astronautHigh;
	}

	public String getAstronautWeight() {
		return astronautWeight;
	}

	public void setAstronautWeight(String astronautWeight) {
		this.astronautWeight = astronautWeight;
	}

	public String getAstronautGender() {
		return astronautGender;
	}

	public void setAstronautGender(String astronautGender) {
		this.astronautGender = astronautGender;
	}

	public String getAstronautBirth() {
		return astronautBirth;
	}

	public void setAstronautBirth(String astronautBirth) {
		this.astronautBirth = astronautBirth;
	}

	public String getAstronautRH() {
		return astronautRH;
	}

	public void setAstronautRH(String astronautRH) {
		this.astronautRH = astronautRH;
	}
	
	public boolean isHasHome() {
		return hasHome;
	}

	public void setHasHome(boolean hasHome) {
		this.hasHome = hasHome;
	}
	
	public long getAstronautCountVisit() {
		return astronautCountVisit;
	}

	public void setAstronautCountVisit(long astronautCountVisit) {
		this.astronautCountVisit = astronautCountVisit;
	}

	@Override
	public String toString() {
		return "Astronaut [id=" + astronautId + ", astronautName=" + astronautName + ", astronautLastName=" + astronautLastName
				+ ", astronautAge=" + astronautAge + ", astronautHigh=" + astronautHigh + ", astronautWeight="
				+ astronautWeight + ", astronautGender=" + astronautGender + ", astronautBirth=" + astronautBirth
				+ ", astronautRH=" + astronautRH + ", hasHome=" + hasHome + ", astronautCountVisit="
				+ astronautCountVisit + "]";
	}

}
