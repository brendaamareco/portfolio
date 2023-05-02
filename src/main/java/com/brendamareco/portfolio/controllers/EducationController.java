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

    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping(value = "/myEndpoint", method = RequestMethod.OPTIONS)
    public void handlePreflightRequest(HttpServletResponse response) {
        response.setHeader("Access-Control-Allow-Origin", "http://localhost:4200");
        response.setHeader("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE");
        response.setHeader("Access-Control-Allow-Headers", "Authorization, Content-Type");
        response.setHeader("Access-Control-Max-Age", "3600");
    }
}
