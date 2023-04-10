package com.brendamareco.portfolio.repositories;

import com.brendamareco.portfolio.entities.Skill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SkillRepository extends JpaRepository<Skill, Long> { }
