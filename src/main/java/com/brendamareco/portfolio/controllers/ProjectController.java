package com.brendamareco.portfolio.controllers;

import com.brendamareco.portfolio.entities.Project;
import com.brendamareco.portfolio.repositories.ProjectRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200/")
@RestController
public class ProjectController
{
    private ProjectRepository projectRepository;

    public ProjectController(ProjectRepository projectRepository)
    {
        this.projectRepository = projectRepository;
    }

    @GetMapping("/api/projects")
    public List<Project> getAll()
    {
        return this.projectRepository.findAll();
    }

}
