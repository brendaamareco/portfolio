package com.brendamareco.portfolio.services;

import com.brendamareco.portfolio.entities.SoftSkill;
import com.brendamareco.portfolio.interfaces.AbstractService;
import com.brendamareco.portfolio.repositories.SoftSkillRepository;
import org.springframework.stereotype.Service;

@Service
public class SoftSkillService extends AbstractService<SoftSkill, Long, SoftSkillRepository>
{ }
