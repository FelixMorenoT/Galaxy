package com.galaxy.dao;
/**
 * 
 * @author Felix Rafael Moreno
 * @version V1.0
 * */
import java.util.List;

public class TopInfo {

	private List<PlanetTop> topPlanets;
	private List<AstronautTop> topAstronaut;
	
	public List<PlanetTop> getTopPlanets() {
		return topPlanets;
	}
	public void setTopPlanets(List<PlanetTop> topPlanets) {
		this.topPlanets = topPlanets;
	}
	public List<AstronautTop> getTopAstronaut() {
		return topAstronaut;
	}
	public void setTopAstronaut(List<AstronautTop> topAstronaut) {
		this.topAstronaut = topAstronaut;
	}
	
}
