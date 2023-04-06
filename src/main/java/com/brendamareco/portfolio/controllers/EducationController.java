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
        {
            this.educationRepository.save(education);
            return ResponseEntity.ok(education);
        }
    }

    @PutMapping(ROOT_URL + "education")
    public ResponseEntity<Education> update(@RequestBody Education education)
    {
        boolean validId = education.getId() != null;

        if ( !validId || !this.validEducation(education) )
            return ResponseEntity.badRequest().build();

        if ( !this.educationRepository.existsById(education.getId()))
            return ResponseEntity.notFound().build();

        else
        {
            this.educationRepository.save(education);
            return ResponseEntity.ok(education);
        }
    }

    private boolean validEducation(Education education)
    {
        return  education.getInstitution() != null
                && education.getTitle() != null
                && education.getStartDate() != null
                && education.getEndDate() != null;
    }
}
