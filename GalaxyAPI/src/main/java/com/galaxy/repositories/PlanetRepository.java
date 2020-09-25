package com.galaxy.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.galaxy.entity.Planet;

@Repository
public interface PlanetRepository extends JpaRepository<Planet, Long> {

	@Query(value="SELECT COUNT(p2.planetId) AS POPULATION FROM Planet as p1 inner join PlanetHome p2 on p1.planetId=p2.planetId where p2.planetId=:idP")
	long getPlanetPopulation(@Param("idP") long planetId);   
	
	@Query(value="SELECT P FROM Planet P ORDER BY planetCountVisit DESC")
	List<Planet> topPlanet();
	
}
