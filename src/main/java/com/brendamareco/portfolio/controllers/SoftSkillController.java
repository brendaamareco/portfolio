package com.brendamareco.portfolio.controllers;

import com.brendamareco.portfolio.entities.SoftSkill;
import com.brendamareco.portfolio.repositories.SoftSkillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200/")
public class SoftSkillController
{
    @Autowired
    private SoftSkillRepository softSkillRepository;
    private final String ROOT_URL = "/api/";

    @GetMapping(ROOT_URL + "soft-skills")
    public List<SoftSkill> getAll()
    {
        return this.softSkillRepository.findAll();
    }
}
