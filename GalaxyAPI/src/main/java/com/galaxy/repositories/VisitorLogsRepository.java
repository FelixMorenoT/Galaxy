package com.galaxy.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.galaxy.entity.VisitorLogs;
/**
 * 
 * @author Felix Rafael Moreno
 * @version V1.0
 * */
public interface VisitorLogsRepository extends JpaRepository<VisitorLogs, Long> {

}
