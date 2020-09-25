package com.galaxy.services.imp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.galaxy.dao.PlanetInfo;
import com.galaxy.dao.PlanetTop;
import com.galaxy.entity.Planet;
import com.galaxy.repositories.PlanetRepository;
import com.galaxy.services.PlanetService;
/**
 * 
 * @author Felix Rafael Moreno
 * @version V1.0
 * */
@Service
public class PlanetServiceImp implements PlanetService {

	@Autowired
	private PlanetRepository planetRepository;
	
	@Value("${top.entity}")
	private long limitTop;
	
	@Override
	public boolean savePlanet(Planet planet) {
		Planet tempPlanet = planetRepository.save(planet);
		
		if(tempPlanet != null)
			return true;
		
		return false;
	}

	@Override
	public Planet getPlanet(long planetId) {
		Planet tempPlanet = planetRepository.getOne(planetId);
		return tempPlanet;
	}

	@Override
	public List<PlanetInfo> listPlanets() {
		List<PlanetInfo> listPlanets = new ArrayList<PlanetInfo>();
		List<Planet> tempListPlantes = new ArrayList<Planet>();
		
		tempListPlantes = planetRepository.findAll();
		for (Planet value : tempListPlantes) {
			long tempPopulation = (planetRepository.getPlanetPopulation((value.getPlanetId()))) ;
			PlanetInfo tempPlanetInfo = new PlanetInfo(value.getPlanetName(), tempPopulation, value.getPlanetTerrain(), value.getPlanetWeather(), 
																				value.getPlanetDiameter(), value.getPlanetRotationTime(), value.getPlanetCountVisit());
			listPlanets.add(tempPlanetInfo);
		}
	
		return listPlanets;
	}

	@Override
	public List<PlanetTop> listTopPlanets() {
		try {
			List<PlanetTop> tempTop = new ArrayList<PlanetTop>();
			List<Planet> tempList = planetRepository.topPlanet();
			
			for (int i = 0; i < limitTop; i++) {
				tempTop.add(new PlanetTop(tempList.get(i).getPlanetName(), tempList.get(i).getPlanetCountVisit()));
			}
			return tempTop;
		} catch (Exception e) {
			return null;
		}
	}
}
