package com.brendamareco.portfolio.controllers;

import com.brendamareco.portfolio.entities.Project;
import com.brendamareco.portfolio.repositories.ProjectRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/api/projects")
    public ResponseEntity<Project> add(@RequestBody Project project)
    {
        boolean invalidId = project.getId() != null;

        if ( invalidId || this.invalidProject(project) )
            return ResponseEntity.badRequest().build();
        else
            return ResponseEntity.ok(this.projectRepository.save(project));
    }

    @PutMapping("/api/projects")
    public ResponseEntity<Project> update(@RequestBody Project project)
    {
        boolean invalidId = project.getId() == null;
        boolean existentProject = this.projectRepository.existsById(project.getId());

        if ( !existentProject)
            return ResponseEntity.notFound().build();
        if ( invalidId || this.invalidProject(project) )
            return ResponseEntity.badRequest().build();
        else
            return ResponseEntity.ok(this.projectRepository.save(project));
    }


    private boolean invalidProject(Project project)
    {
        boolean invalidTitle = project.getTitle() == null
                || project.getTitle().length() > 32;

        return invalidTitle;
    }
}
