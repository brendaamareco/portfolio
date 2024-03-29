package com.brendamareco.portfolio.repositories;

import com.brendamareco.portfolio.entities.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> { }
