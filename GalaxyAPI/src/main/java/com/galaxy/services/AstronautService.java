package com.galaxy.services;

import java.util.List;

import com.galaxy.dao.AstronautTop;
import com.galaxy.entity.Astronaut;
/**
 * 
 * @author Felix Rafael Moreno
 * @version V1.0
 * */
public interface AstronautService {

	public boolean saveAstronaut(Astronaut astronaut);
	public Astronaut getAstronaut(long astronautId);
	public List<Astronaut> listAstronauts();
	public List<AstronautTop> topAstronaut();
}
