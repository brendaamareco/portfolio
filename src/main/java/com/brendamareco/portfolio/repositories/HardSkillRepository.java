package com.brendamareco.portfolio.repositories;

import com.brendamareco.portfolio.entities.HardSkill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HardSkillRepository extends JpaRepository<HardSkill, Long> { }
