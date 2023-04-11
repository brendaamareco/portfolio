package com.brendamareco.portfolio.services;

import com.brendamareco.portfolio.entities.Project;
import com.brendamareco.portfolio.interfaces.DefaultService;
import com.brendamareco.portfolio.repositories.ProjectRepository;
import org.springframework.stereotype.Service;

@Service
public class ProjectService extends DefaultService<Project, Long, ProjectRepository> { }
