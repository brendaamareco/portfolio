package com.brendamareco.portfolio.controllers;

import com.brendamareco.portfolio.entities.Owner;
import com.brendamareco.portfolio.repositories.OwnerRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:4200/")
public class OwnerController {

    private OwnerRepository repository;

    public OwnerController(OwnerRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/api/owner")
    public Owner find()
    {
        return repository.findAll().get(0);
    }

    @PutMapping("/api/owner")
    public ResponseEntity<Owner> update(@RequestBody Owner owner)
    {
        if (!repository.existsById(owner.getId()))
            return ResponseEntity.notFound().build();
        else
            return ResponseEntity.ok(repository.save(owner));
    }

}
