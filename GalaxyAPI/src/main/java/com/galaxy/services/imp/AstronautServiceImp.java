package com.galaxy.services.imp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.galaxy.dao.AstronautTop;
import com.galaxy.entity.Astronaut;
import com.galaxy.repositories.AstronautRepository;
import com.galaxy.services.AstronautService;
/**
 * 
 * @author Felix Rafael Moreno
 * @version V1.0
 * */
@Service
public class AstronautServiceImp implements AstronautService{

	@Autowired
	private AstronautRepository astronautRepository;
	
	@Value("${top.entity}")
	private long limitTop;
	
	@Override
	public boolean saveAstronaut(Astronaut astronaut) {
		
		Astronaut tempAstronaut = astronautRepository.save(astronaut);
		
		if(tempAstronaut != null)
			return true;
		
		return false;
	}

	@Override
	public Astronaut getAstronaut(long astronautId) {
		Astronaut tempAstronaut = astronautRepository.getOne(astronautId);
		return tempAstronaut;
	}

	@Override
	public List<Astronaut> listAstronauts() {
		return astronautRepository.findAll();
	}

	@Override
	public List<AstronautTop> topAstronaut() {
		try {
			List<AstronautTop> topList = new ArrayList<AstronautTop>();
			List<Astronaut> tempList = astronautRepository.topAstronaut();
			
			for (int i = 0; i < limitTop; i++) {
				topList.add(new AstronautTop(tempList.get(i).getAstronautName(), tempList.get(i).getAstronautLastName(),tempList.get(i).getAstronautCountVisit()));
			}
			
			return topList;
		} catch (Exception e) {
			return null;
		}
		
	}

}
