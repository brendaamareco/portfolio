package com.brendamareco.portfolio.controllers;

import com.brendamareco.portfolio.entities.Project;
import com.brendamareco.portfolio.services.ProjectService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/projects")
public class ProjectController extends AbstractController<Project, Long>
{
    public ProjectController(ProjectService projectService) {
        super(projectService);
    }

}
