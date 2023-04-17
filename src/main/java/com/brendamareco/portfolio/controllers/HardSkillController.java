package com.brendamareco.portfolio.controllers;

import com.brendamareco.portfolio.entities.HardSkill;
import com.brendamareco.portfolio.services.HardSkillService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200/")
@RequestMapping("/api/hard-skills")
public class HardSkillController extends AbstractController<HardSkill, Long>
{
    HardSkillController(HardSkillService service) { super(service); }
}
