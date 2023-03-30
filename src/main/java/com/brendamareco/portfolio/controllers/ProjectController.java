package com.brendamareco.portfolio.controllers;

import com.brendamareco.portfolio.repositories.ProjectRepository;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProjectController
{
    private ProjectRepository projectRepository;

    public ProjectController(ProjectRepository projectRepository)
    {
        this.projectRepository = projectRepository;
    }


}
