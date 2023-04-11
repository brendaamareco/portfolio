package com.brendamareco.portfolio.controllers;

import com.brendamareco.portfolio.entities.Education;
import com.brendamareco.portfolio.services.EducationService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200/")
public class EducationController
{
    private final String ROOT_URL = "/api/education";
    @Autowired private EducationService educationService;

    @GetMapping(ROOT_URL)
    public List<Education> getEducationList()
    {
        return this.educationService.getAll();
    }

    @PostMapping(ROOT_URL)
    public ResponseEntity<Education> add(@RequestBody @Valid Education education)
    {
        return ResponseEntity.ok(this.educationService.add(education));
    }

    @PutMapping(ROOT_URL)
    public ResponseEntity<Education> update(@RequestBody @Valid Education education)
    {
        return ResponseEntity.ok(this.educationService.update(education));
    }

    @DeleteMapping(ROOT_URL + "/{educationId}")
    public ResponseEntity<Education> delete(@PathVariable Long educationId)
    {
       this.educationService.deleteById(educationId);
       return ResponseEntity.noContent().build();
    }

}
