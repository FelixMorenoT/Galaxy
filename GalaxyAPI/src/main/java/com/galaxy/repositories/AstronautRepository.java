package com.galaxy.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.galaxy.entity.Astronaut;

@Repository
public interface AstronautRepository extends JpaRepository<Astronaut, Long> {

	@Query(value = "SELECT A FROM Astronaut A ORDER BY astronautCountVisit DESC")
	List<Astronaut> topAstronaut();
}
