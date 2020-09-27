package com.galaxy.rest;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.galaxy.dao.PlanetInfo;
import com.galaxy.dao.TopInfo;
import com.galaxy.entity.Astronaut;
import com.galaxy.entity.Planet;
import com.galaxy.entity.PlanetHome;
import com.galaxy.entity.VisitorLogs;
import com.galaxy.responses.GalaxyResponse;
import com.galaxy.services.AstronautService;
import com.galaxy.services.PlanetHomeService;
import com.galaxy.services.PlanetService;
import com.galaxy.services.VisitorLogsService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
/**
 * 
 * @author Felix Rafael Moreno
 * @version V1.0
 * */

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/galaxy")
@Api(value = "Users Microservices")
public class GalaxyRest {

	@Autowired
	private AstronautService astronautService;
	
	@Autowired
	private PlanetService planetService;
	
	@Autowired
	private PlanetHomeService planetHomeService;
	
	@Autowired
	private VisitorLogsService visitLogService;
	
	private final SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
	
	private GalaxyResponse galaxyResponse;
	
	private static final Logger log = LoggerFactory.getLogger(GalaxyRest.class);

	@PostMapping("/astronaut")
	@ApiOperation(value = "Create New Astronaut", notes = "Galaxy Response (http.status)" )
	public ResponseEntity<GalaxyResponse> createAstronaut(@RequestBody Astronaut astronaut) throws org.hibernate.PropertyValueException{
		log.info("----- Start [/astronaut] -----");
		boolean result = false;
		galaxyResponse = new GalaxyResponse();
		
		astronaut.setAstronautId(0);
		result = astronautService.saveAstronaut(astronaut);
		if(result) {
			log.info("Result [@PostMapping(\"/astronaut\")] = {}",result);
				galaxyResponse.setStatus(HttpStatus.OK.value());
				galaxyResponse.setMessage("Success");
				galaxyResponse.setTimeStamp(System.currentTimeMillis());
				log.info("----- End [/astronaut] OK-----");
			return new ResponseEntity<GalaxyResponse>(galaxyResponse,HttpStatus.OK);
		}
		
		log.info("Result [@PostMapping(\"/astronaut\")] = {}",result);
		galaxyResponse.setStatus(HttpStatus.BAD_REQUEST.value());
		galaxyResponse.setMessage("Bad Request");
		galaxyResponse.setTimeStamp(System.currentTimeMillis());
		log.info("----- End [@PostMapping(\"/astronaut\")] BAD_REQUEST-----");
	return new ResponseEntity<GalaxyResponse>(galaxyResponse,HttpStatus.BAD_REQUEST);
	}
	
	@GetMapping("/astronaut")
	@ApiOperation(value = "List all Astronauts", notes = "List<Astronaut> Response (http.status)" )
	public ResponseEntity<List<Astronaut>> listAstronauts(){
		log.info("----- Start [@GetMapping(\"/astronaut\")] -----");
		List<Astronaut> tempListAstronauts = new ArrayList<Astronaut>();
		tempListAstronauts = astronautService.listAstronauts();
		log.info("----- End [@GetMapping(\"/astronaut\")] OK-----");
		return new ResponseEntity<List<Astronaut>>(tempListAstronauts,HttpStatus.OK);
	}
	
	@PatchMapping("/astronaut/{toAstronaut}/{fromAstronaut}")
	@ApiOperation(value = "Visit an Astronaut", notes = "Galaxy Response (http.status)" )
	public ResponseEntity<GalaxyResponse> visitAstronaut(@PathVariable("toAstronaut") String vistToAstronaut, @PathVariable("fromAstronaut") String vistFromAustronaut) {
		log.info("----- Start [@PatchMapping(\"/astronaut/{toAstronaut}/{fromAstronaut}\"))] -----");
		galaxyResponse = new GalaxyResponse();
		Astronaut visitToAstronaut = astronautService.getAstronaut(Long.parseLong(vistToAstronaut));
		Astronaut visitFromAstronaut = astronautService.getAstronaut(Long.parseLong(vistFromAustronaut));
		
		if (visitToAstronaut != null && visitFromAstronaut != null) {
			long tempIdPlanet = planetHomeService.getPlanetIdFromAstronautHome(visitToAstronaut.getAstronautId());
			
			if(tempIdPlanet != 0) {
				Planet tempPlanet = planetService.getPlanet(tempIdPlanet);
				tempPlanet.setPlanetCountVisit(tempPlanet.getPlanetCountVisit() + 1);
				planetService.savePlanet(tempPlanet);
				
				visitToAstronaut.setAstronautCountVisit(visitToAstronaut.getAstronautCountVisit() +1);
				astronautService.saveAstronaut(visitToAstronaut);
				visitLogService.saveLog(new VisitorLogs(visitFromAstronaut.getAstronautId(), visitToAstronaut.getAstronautId(), formatter.format(new Date()).toString(),"AA"));
				
				galaxyResponse.setStatus(HttpStatus.OK.value());
				galaxyResponse.setMessage("Success");
				galaxyResponse.setTimeStamp(System.currentTimeMillis());
				log.info("----- End [@PatchMapping(\"/astronaut/{toAstronaut}/{fromAstronaut}\"))] OK-----");
			return new ResponseEntity<GalaxyResponse>(galaxyResponse,HttpStatus.OK);
				
			}
			galaxyResponse.setStatus(HttpStatus.CONFLICT.value());
			galaxyResponse.setMessage("Conflict");
			galaxyResponse.setTimeStamp(System.currentTimeMillis());
			log.info("----- End [@PatchMapping(\"/astronaut/{toAstronaut}/{fromAstronaut}\"))] CONFLICT-----");
		return new ResponseEntity<GalaxyResponse>(galaxyResponse,HttpStatus.CONFLICT);
		}
		
		galaxyResponse.setStatus(HttpStatus.BAD_REQUEST.value());
		galaxyResponse.setMessage("Bad Request");
		galaxyResponse.setTimeStamp(System.currentTimeMillis());
		log.info("----- End [@PatchMapping(\"/astronaut/{toAstronaut}/{fromAstronaut}\"))] BAD_REQUEST-----");
	return new ResponseEntity<GalaxyResponse>(galaxyResponse,HttpStatus.BAD_REQUEST);
	}
	
	@PostMapping("/planet")
	@ApiOperation(value = "Create a new Planet", notes = "Galaxy Response (http.status)" )
	public ResponseEntity<GalaxyResponse> createPlanet(@RequestBody Planet planet) {
		log.info("----- Start [@PostMapping(\"/planet\")] -----");
		galaxyResponse = new GalaxyResponse();
		boolean result = false;
		
		planet.setPlanetId(0);
		result = planetService.savePlanet(planet);
		
		if(result) {
			galaxyResponse.setStatus(HttpStatus.OK.value());
			galaxyResponse.setMessage("Success");
			galaxyResponse.setTimeStamp(System.currentTimeMillis());
			log.info("----- End [@PostMapping(\"/planet\")] OK-----");
		return new ResponseEntity<GalaxyResponse>(galaxyResponse,HttpStatus.OK);
		}
		
		galaxyResponse.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
		galaxyResponse.setMessage("Internal Server Error");
		galaxyResponse.setTimeStamp(System.currentTimeMillis());
		log.info("----- End [@PostMapping(\"/planet\")] INTERNAL_SERVER_ERROR-----");
	return new ResponseEntity<GalaxyResponse>(galaxyResponse,HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@GetMapping("/planet")
	@ApiOperation(value = "List all Planet", notes = "List<PlanetInfo> (http.status)" )
	public ResponseEntity<List<PlanetInfo>>  listPlanets(){
		log.info("----- Start [@GetMapping(\"/planet\")] -----");
		List<PlanetInfo> listPlanets = planetService.listPlanets();
		log.info("----- End [@GetMapping(\"/planet\")] OK-----");
		return new ResponseEntity<List<PlanetInfo>>(listPlanets,HttpStatus.OK);
	}
	
	@PostMapping("/planet/{astronautId}/{planetId}")
	@ApiOperation(value = "Set Astronaunt Home", notes = "Galaxy Response (http.status)" )
	public ResponseEntity<GalaxyResponse> setHome(@PathVariable("astronautId") String astronautId, @PathVariable("planetId") String planetId) {
		log.info("----- Start [@PostMapping(\"/planet/{astronautId}/{planetId}\")] -----");
		galaxyResponse = new GalaxyResponse();
		Astronaut tempAstronaut = astronautService.getAstronaut(Long.parseLong(astronautId));
		Planet tempPlanet = planetService.getPlanet(Long.parseLong(planetId));

		if(!tempAstronaut.isHasHome()) {
			tempAstronaut.setHasHome(true);
			astronautService.saveAstronaut(tempAstronaut);
			
			planetHomeService.savePlanetHome(new PlanetHome(tempPlanet.getPlanetId(), tempAstronaut.getAstronautId()));
			galaxyResponse.setStatus(HttpStatus.OK.value());
			galaxyResponse.setMessage("Success");
			galaxyResponse.setTimeStamp(System.currentTimeMillis());
			log.info("----- End [@PostMapping(\"/planet/{astronautId}/{planetId}\")] OK-----");
		return new ResponseEntity<GalaxyResponse>(galaxyResponse,HttpStatus.OK);
		}
		
		galaxyResponse.setStatus(HttpStatus.CONFLICT.value());
		galaxyResponse.setMessage("Astronaut already has a establish home");
		galaxyResponse.setTimeStamp(System.currentTimeMillis());
		log.info("----- End [@PostMapping(\"/planet/{astronautId}/{planetId}\")] CONFLICT-----");
	return new ResponseEntity<GalaxyResponse>(galaxyResponse,HttpStatus.CONFLICT);
	}
	
	@PatchMapping("/planet/{astronautId}/{planetId}")
	@ApiOperation(value = "Visit a Planet", notes = "Galaxy Response (http.status)" )
	public ResponseEntity<GalaxyResponse> visitPlanet(@PathVariable("astronautId") String astronautId, @PathVariable("planetId") String planetId) {
		log.info("----- Start [@PatchMapping(\"/planet/{astronautId}/{planetId}\")] -----");
		galaxyResponse = new GalaxyResponse();
		Astronaut tempAstronaut = astronautService.getAstronaut(Long.parseLong(astronautId));
		Planet tempPlanet = planetService.getPlanet(Long.parseLong(planetId));
		
		if(tempAstronaut != null && tempPlanet != null) {
			SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
			tempPlanet.setPlanetCountVisit(tempPlanet.getPlanetCountVisit() + 1);
			planetService.savePlanet(tempPlanet);
			visitLogService.saveLog(new VisitorLogs(tempAstronaut.getAstronautId(), tempPlanet.getPlanetId(), formatter.format(new Date()), "AP"));
			
			galaxyResponse.setStatus(HttpStatus.OK.value());
			galaxyResponse.setMessage("Success");
			galaxyResponse.setTimeStamp(System.currentTimeMillis());
			log.info("----- Start [@PatchMapping(\"/planet/{astronautId}/{planetId}\")] OK-----");
		return new ResponseEntity<GalaxyResponse>(galaxyResponse,HttpStatus.OK);
		}
		
		galaxyResponse.setStatus(HttpStatus.BAD_REQUEST.value());
		galaxyResponse.setMessage("Bad Request");
		galaxyResponse.setTimeStamp(System.currentTimeMillis());
		log.info("----- Start [@PatchMapping(\"/planet/{astronautId}/{planetId}\")] BAD_REQUEST-----");
	return new ResponseEntity<GalaxyResponse>(galaxyResponse,HttpStatus.BAD_REQUEST);
	}
	
	@GetMapping("/top")
	@ApiOperation(value = "List Top Planet and Astronaut", notes = "TopInfo (http.status)" )
	public ResponseEntity<TopInfo> topList(){
		log.info("----- Start [@GetMapping(\"/top\")] -----");
		TopInfo tempTopInfo = new TopInfo();
		tempTopInfo.setTopAstronaut(astronautService.topAstronaut());
		tempTopInfo.setTopPlanets(planetService.listTopPlanets());
		log.info("----- End [@GetMapping(\"/top\")] OK-----");
		return new ResponseEntity<TopInfo>(tempTopInfo,HttpStatus.OK);
	}
}
