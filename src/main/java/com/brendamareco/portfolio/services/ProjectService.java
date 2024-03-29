package com.brendamareco.portfolio.services;

import com.brendamareco.portfolio.entities.Project;
import com.brendamareco.portfolio.repositories.ProjectRepository;
import org.springframework.stereotype.Service;

@Service
public class ProjectService extends AbstractService<Project, Long>
{
    public ProjectService(ProjectRepository repository)
    {
        super(repository);
    }
}
