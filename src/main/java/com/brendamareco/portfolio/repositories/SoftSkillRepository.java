package com.brendamareco.portfolio.repositories;

import com.brendamareco.portfolio.entities.SoftSkill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SoftSkillRepository extends JpaRepository<SoftSkill, Long> { }
