package com.brendamareco.portfolio.services;

import com.brendamareco.portfolio.entities.Owner;
import com.brendamareco.portfolio.repositories.OwnerRepository;
import org.springframework.stereotype.Service;

@Service
public class OwnerService extends AbstractService<Owner, Long>
{
    public OwnerService(OwnerRepository repository)
    {
        super(repository);
    }
}
