package com.brendamareco.portfolio.controllers;

import com.brendamareco.portfolio.entities.Education;
import com.brendamareco.portfolio.services.EducationService;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:4200/", maxAge = 3600, allowedHeaders = "*")
@RequestMapping("/api/education")
public class EducationController extends AbstractController<Education, Long>
{
    EducationController(EducationService educationService) {
        super(educationService);
    }
}
