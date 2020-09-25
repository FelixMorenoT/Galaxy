package com.galaxy.services.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.galaxy.entity.PlanetHome;
import com.galaxy.repositories.PlanetHomeRepository;
import com.galaxy.services.PlanetHomeService;
/**
 * 
 * @author Felix Rafael Moreno
 * @version V1.0
 * */
@Service
public class PlanetHomeServiceImp implements PlanetHomeService {

	@Autowired
	private PlanetHomeRepository planetHomeRepository;
	
	@Override
	public boolean savePlanetHome(PlanetHome planetHome) {
		PlanetHome tempPlanetHome = planetHomeRepository.save(planetHome);
		
		if (tempPlanetHome != null) 
			return true;
	
		return false;
	}
}
