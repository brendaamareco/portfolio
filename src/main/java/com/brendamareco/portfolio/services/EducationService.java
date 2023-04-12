package com.brendamareco.portfolio.services;

import com.brendamareco.portfolio.entities.Education;
import com.brendamareco.portfolio.repositories.EducationRepository;
import org.springframework.stereotype.Service;

@Service
public class EducationService extends AbstractService<Education, Long>
{
    public EducationService(EducationRepository repository)
    {
        super(repository);
    }
}
