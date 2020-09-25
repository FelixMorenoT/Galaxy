package com.galaxy.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.galaxy.entity.VisitorLogs;

public interface VisitorLogsRepository extends JpaRepository<VisitorLogs, Long> {

}
