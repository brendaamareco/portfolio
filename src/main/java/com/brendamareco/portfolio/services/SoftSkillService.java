package com.brendamareco.portfolio.services;

import com.brendamareco.portfolio.entities.SoftSkill;
import com.brendamareco.portfolio.repositories.SoftSkillRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SoftSkillService
{
    @Autowired SoftSkillRepository repository;

    public List<SoftSkill> getAll()
    {
        return this.repository.findAll();
    }
    public SoftSkill add(SoftSkill softSkill)
    {
        softSkill.setId(null);
        return this.repository.save(softSkill);
    }
}
