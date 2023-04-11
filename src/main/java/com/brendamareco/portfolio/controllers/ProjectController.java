package com.brendamareco.portfolio.controllers;

import com.brendamareco.portfolio.entities.Project;
import com.brendamareco.portfolio.services.ProjectService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200/")
@RestController
public class ProjectController
{
    private final String ROOT_URL = "/api/projects";
    @Autowired private ProjectService projectService;

    @GetMapping(ROOT_URL)
    public List<Project> getAll()
    {
        return this.projectService.getAll();
    }

    @PostMapping(ROOT_URL)
    public ResponseEntity<Project> add(@RequestBody @Valid Project project)
    {
        return ResponseEntity.ok(this.projectService.add(project));
    }

    @PutMapping(ROOT_URL)
    public ResponseEntity<Project> update(@RequestBody @Valid Project project)
    {
        return ResponseEntity.ok(this.projectService.update(project));
    }

    @DeleteMapping(ROOT_URL + "/{projectId}")
    public ResponseEntity<Project> delete(@PathVariable Long projectId)
    {
        this.projectService.deleteById(projectId);
        return ResponseEntity.noContent().build();
    }

}
