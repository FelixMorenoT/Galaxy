package com.galaxy.services;

import com.galaxy.entity.PlanetHome;
/**
 * 
 * @author Felix Rafael Moreno
 * @version V1.0
 * */
public interface PlanetHomeService {

	public boolean savePlanetHome(PlanetHome planetHome);
	public long getPlanetIdFromAstronautHome(long astronautId);
}
