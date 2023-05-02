package com.brendamareco.portfolio.controllers;

import com.brendamareco.portfolio.entities.SoftSkill;
import com.brendamareco.portfolio.services.SoftSkillService;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:4200/", maxAge = 3600)
@RequestMapping("/api/soft-skills")
public class SoftSkillController extends AbstractController<SoftSkill, Long>
{
    public SoftSkillController(SoftSkillService softSkillService) {
        super(softSkillService);
    }
}
