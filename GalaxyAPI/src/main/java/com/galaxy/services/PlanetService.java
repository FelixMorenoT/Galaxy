package com.galaxy.services;

import java.util.List;

import com.galaxy.dao.PlanetInfo;
import com.galaxy.dao.PlanetTop;
import com.galaxy.entity.Planet;

public interface PlanetService {

	public boolean savePlanet(Planet planet);
	public Planet getPlanet(long planetId);
	public List<PlanetInfo> listPlanets();
	public List<PlanetTop> listTopPlanets();
	
}
