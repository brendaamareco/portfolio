package com.brendamareco.portfolio.controllers;

import com.brendamareco.portfolio.entities.Owner;
import com.brendamareco.portfolio.services.OwnerService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:4200/")
public class OwnerController
{
    private final String ROOT_URL = "/api/owner";
    @Autowired private OwnerService ownerService;

    @GetMapping(ROOT_URL)
    public Owner get()
    {
        return ownerService.getAll().get(0);
    }

    @PutMapping(ROOT_URL)
    public ResponseEntity<Owner> update(@RequestBody @Valid Owner owner)
    {
        return ResponseEntity.ok(this.ownerService.update(owner));
    }
}
