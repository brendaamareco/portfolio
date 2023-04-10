package com.brendamareco.portfolio.controllers;

import com.brendamareco.portfolio.entities.Experience;
import com.brendamareco.portfolio.repositories.ExperienceRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping(ROOT_URL + "experience")
    public ResponseEntity<Experience> add(@RequestBody Experience experience)
    {
        boolean validId = experience.getId() == null;

        if (!validId || !validExperience(experience))
            return ResponseEntity.badRequest().build();

        else
        {
            this.experienceRepository.save(experience);
            return ResponseEntity.ok(experience);
        }
    }

    @PutMapping(ROOT_URL + "experience")
    public ResponseEntity<Experience> update(@RequestBody Experience experience)
    {
        boolean validId = experience.getId() != null;

        if (!validId || !validExperience(experience))
            return ResponseEntity.badRequest().build();

        if (!this.experienceRepository.existsById(experience.getId()))
            return ResponseEntity.notFound().build();

        else
        {
            this.experienceRepository.save(experience);
            return ResponseEntity.ok(experience);
        }
    }

    @DeleteMapping(ROOT_URL + "experience/{experienceId}")
    public ResponseEntity<Experience> delete(@PathVariable Long experienceId)
    {
        boolean validId = experienceId != null;

        if (!validId)
            return ResponseEntity.badRequest().build();

        if (!this.experienceRepository.existsById(experienceId))
            return ResponseEntity.notFound().build();

        else
        {
            this.experienceRepository.deleteById(experienceId);
            return ResponseEntity.noContent().build();
        }
    }

    private boolean validExperience(Experience experience)
    {
        return experience.getCompanyName() != null
                && experience.getTitle() != null
                && experience.getStartDate() != null
                && experience.getEndDate() != null;
    }
}
