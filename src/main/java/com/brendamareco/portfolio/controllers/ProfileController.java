package com.brendamareco.portfolio.controllers;

import com.brendamareco.portfolio.entities.Profile;
import com.brendamareco.portfolio.repositories.ProfileRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProfileController {

    private ProfileRepository repository;

    public ProfileController(ProfileRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/profiles/{id}")
    public ResponseEntity<Profile> findById(@PathVariable Long id)
    {
        return repository.findById(id)
                .map(profile -> ResponseEntity.ok(profile))
                .orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("/profiles")
    public ResponseEntity<Profile> update(@RequestBody Profile profile)
    {
        if (profile == null)
            return ResponseEntity.badRequest().build();
        if (!repository.existsById(profile.getId()))
            return ResponseEntity.notFound().build();
        else
            return ResponseEntity.ok(repository.save(profile));
    }


}
