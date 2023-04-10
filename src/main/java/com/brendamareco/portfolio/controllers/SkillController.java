package com.brendamareco.portfolio.controllers;

import com.brendamareco.portfolio.repositories.SkillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200/")
public class SkillController
{
    @Autowired
    private SkillRepository skillRepository;
}
