package com.legaltech.legaltech.infrastructure.adapters.input.controller;

import com.legaltech.legaltech.infrastructure.persistence.EstadoDenunciaEntity;
import com.legaltech.legaltech.infrastructure.persistence.EstadoDenunciaJpaRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EstadoDenunciaController {

    private final EstadoDenunciaJpaRepository repository;

    public EstadoDenunciaController(EstadoDenunciaJpaRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/estados")
    public List<EstadoDenunciaEntity> listar() {
        return repository.findAll();
    }
}