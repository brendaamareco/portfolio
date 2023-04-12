package com.brendamareco.portfolio.controllers;

import com.brendamareco.portfolio.interfaces.IEntity;
import com.brendamareco.portfolio.services.AbstractService;
import jakarta.validation.Valid;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public abstract class AbstractController<T extends IEntity<ID>,ID>
{
    private AbstractService<T, ID, ? extends JpaRepository<T,ID>> service;

    AbstractController(AbstractService<T, ID, ? extends JpaRepository<T,ID>> service)
    {
        this.service = service;
    }

    @GetMapping("")
    public List<T> getAll()
    {
        return this.service.getAll();
    }

    @PostMapping("")
    public ResponseEntity<T> add(@RequestBody @Valid T entity)
    {
        return ResponseEntity.ok(this.service.add(entity));
    }

    @PutMapping("")
    public ResponseEntity<T> update(@RequestBody @Valid T entity)
    {
        return ResponseEntity.ok(this.service.update(entity));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<T> delete(@PathVariable ID id)
    {
        this.service.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
