package com.brendamareco.portfolio.services;

import com.brendamareco.portfolio.entities.Language;
import com.brendamareco.portfolio.repositories.LanguageRepository;
import org.springframework.stereotype.Service;

@Service
public class LanguageService extends AbstractService<Language, Long>
{
    public LanguageService(LanguageRepository repository) { super(repository); }
}
