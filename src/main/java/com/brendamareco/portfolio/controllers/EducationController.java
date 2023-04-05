package com.brendamareco.portfolio.controllers;

import com.brendamareco.portfolio.entities.Education;
import com.brendamareco.portfolio.repositories.EducationRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200/")
public class EducationController
{
    private final String ROOT_URL = "/api/";
    private EducationRepository educationRepository;

    public EducationController(EducationRepository educationRepository) {
        this.educationRepository = educationRepository;
    }
    @GetMapping(ROOT_URL + "education")
    public List<Education> getEducationList()
    {
        return this.educationRepository.findAll();
    }

    @PostMapping(ROOT_URL + "education")
    public ResponseEntity<Education> add(@RequestBody Education education)
    {
        boolean validId = education.getId() == null;

        if ( !validId || !this.validEducation(education) )
            return ResponseEntity.badRequest().build();
        else
            return ResponseEntity.ok(education);
    }

    private boolean validEducation(Education education)
    {
        return education.getTitle() != null
                && education.getStartDate() != null
                && education.getEndDate() != null;
    }
}
