package com.brendamareco.portfolio.controllers;

import com.brendamareco.portfolio.entities.Experience;
import com.brendamareco.portfolio.repositories.ExperienceRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200/")
public class ExperienceController
{
    private final String ROOT_URL = "/api/";
    private ExperienceRepository experienceRepository;

    public ExperienceController(ExperienceRepository experienceRepository) {
        this.experienceRepository = experienceRepository;
    }

    @GetMapping(ROOT_URL + "experience")
    public List<Experience> getAll()
    {
        return this.experienceRepository.findAll();
    }
}
