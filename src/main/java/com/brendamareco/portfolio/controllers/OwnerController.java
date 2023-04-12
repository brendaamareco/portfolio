package com.brendamareco.portfolio.controllers;

import com.brendamareco.portfolio.entities.Owner;
import com.brendamareco.portfolio.services.OwnerService;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:4200/")
@RequestMapping("/api/owner")
public class OwnerController extends AbstractController<Owner, Long>
{
    public OwnerController(OwnerService ownerService) {
        super(ownerService);
    }
}
