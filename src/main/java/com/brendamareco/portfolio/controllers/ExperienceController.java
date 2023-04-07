package com.brendamareco.portfolio.controllers;

import com.brendamareco.portfolio.repositories.ExperienceRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200/")
public class ExperienceController
{
    private final String ROOT_URL = "/api/";
    private ExperienceRepository experienceRepository;

    public ExperienceController(ExperienceRepository experienceRepository) {
        this.experienceRepository = experienceRepository;
    }
}
