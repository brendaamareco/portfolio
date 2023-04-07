package com.brendamareco.portfolio.repositories;

import com.brendamareco.portfolio.entities.Experience;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExperienceRepository extends JpaRepository<Experience, Long> { }
