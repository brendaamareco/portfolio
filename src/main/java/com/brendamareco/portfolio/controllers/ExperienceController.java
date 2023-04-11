package com.brendamareco.portfolio.controllers;

import com.brendamareco.portfolio.entities.Experience;
import com.brendamareco.portfolio.services.ExperienceService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200/")
public class ExperienceController
{
    private final String ROOT_URL = "/api/experience";
    @Autowired private ExperienceService experienceService;

    @GetMapping(ROOT_URL)
    public List<Experience> getAll()
    {
        return this.experienceService.getAll();
    }

    @PostMapping(ROOT_URL)
    public ResponseEntity<Experience> add(@RequestBody @Valid Experience experience)
    {
        return ResponseEntity.ok(this.experienceService.add(experience));
    }

    @PutMapping(ROOT_URL)
    public ResponseEntity<Experience> update(@RequestBody @Valid Experience experience)
    {
        return ResponseEntity.ok(this.experienceService.update(experience));
    }

    @DeleteMapping(ROOT_URL + "/{experienceId}")
    public ResponseEntity<Experience> delete(@PathVariable Long experienceId)
    {
        this.experienceService.deleteById(experienceId);
        return ResponseEntity.noContent().build();
    }
}
