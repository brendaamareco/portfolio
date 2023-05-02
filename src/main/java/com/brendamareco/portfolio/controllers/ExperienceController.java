package com.brendamareco.portfolio.controllers;

import com.brendamareco.portfolio.entities.Experience;
import com.brendamareco.portfolio.services.ExperienceService;
import org.springframework.web.bind.annotation.*;


@RestController
@CrossOrigin(origins = "http://localhost:4200/", maxAge = 3600)
@RequestMapping("/api/experience")
public class ExperienceController extends AbstractController<Experience, Long>
{
    ExperienceController(ExperienceService experienceService) {
        super(experienceService);
    }
}
