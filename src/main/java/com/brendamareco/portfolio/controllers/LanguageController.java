package com.brendamareco.portfolio.controllers;

import com.brendamareco.portfolio.entities.Language;
import com.brendamareco.portfolio.services.LanguageService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/language")
public class LanguageController extends AbstractController<Language, Long>
{
    LanguageController(LanguageService service) {
        super(service);
    }
}
