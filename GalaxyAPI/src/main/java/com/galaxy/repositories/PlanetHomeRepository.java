package com.galaxy.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.galaxy.entity.PlanetHome;
/**
 * 
 * @author Felix Rafael Moreno
 * @version V1.0
 * */
public interface PlanetHomeRepository extends JpaRepository<PlanetHome, Long> {

	@Query(value = "SELECT planetId FROM PlanetHome WHERE astronautId=:astronautID")
	long getPlanetHomeFromAstronaut(@Param("astronautID") long aId);
}
