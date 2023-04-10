package com.brendamareco.portfolio.controllers;

import com.brendamareco.portfolio.entities.Skill;
import com.brendamareco.portfolio.repositories.SkillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200/")
public class SkillController
{
    @Autowired
    private SkillRepository skillRepository;
    private final String ROOT_URL = "/api/";

    @GetMapping(ROOT_URL + "skill")
    public List<Skill> getAll()
    {
        return this.skillRepository.findAll();
    }
}
