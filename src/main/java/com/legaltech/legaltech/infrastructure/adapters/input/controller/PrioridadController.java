package com.legaltech.legaltech.infrastructure.adapters.input.controller;

import com.legaltech.legaltech.infrastructure.persistence.PrioridadEntity;
import com.legaltech.legaltech.infrastructure.persistence.PrioridadJpaRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PrioridadController {

    private final PrioridadJpaRepository repository;

    public PrioridadController(PrioridadJpaRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/prioridades")
    public List<PrioridadEntity> listar() {
        return repository.findAll();
    }
}