package com.brendamareco.portfolio.services;

import com.brendamareco.portfolio.entities.Experience;
import com.brendamareco.portfolio.repositories.ExperienceRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class ExperienceService extends AbstractService<Experience, Long>
{
    public ExperienceService(ExperienceRepository repository)
    {
        super(repository);
    }
}
