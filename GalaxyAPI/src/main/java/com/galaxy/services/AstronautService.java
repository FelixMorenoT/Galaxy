package com.galaxy.services;

import java.util.List;

import com.galaxy.dao.AstronautTop;
import com.galaxy.entity.Astronaut;

public interface AstronautService {

	public boolean saveAstronaut(Astronaut astronaut);
	public Astronaut getAstronaut(long astronautId);
	public List<Astronaut> listAstronauts();
	public List<AstronautTop> topAstronaut();
}
