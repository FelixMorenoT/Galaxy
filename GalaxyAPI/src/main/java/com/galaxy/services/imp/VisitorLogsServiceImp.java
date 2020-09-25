package com.galaxy.services.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.galaxy.entity.VisitorLogs;
import com.galaxy.repositories.VisitorLogsRepository;
import com.galaxy.services.VisitorLogsService;
/**
 * 
 * @author Felix Rafael Moreno
 * @version V1.0
 * */
@Service
public class VisitorLogsServiceImp implements VisitorLogsService {

	@Autowired
	private VisitorLogsRepository visitLogRepository;
	
	@Override
	public boolean saveLog(VisitorLogs visit) {
		VisitorLogs tempVisit = visitLogRepository.save(visit);
		
		if(tempVisit != null)
			return true;
		
		return false;
	}

}
