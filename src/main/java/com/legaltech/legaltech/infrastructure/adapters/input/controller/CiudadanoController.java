package com.legaltech.legaltech.infrastructure.adapters.input.controller;

import com.legaltech.legaltech.infrastructure.persistence.CiudadanoEntity;
import com.legaltech.legaltech.infrastructure.persistence.CiudadanoJpaRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CiudadanoController {

    private final CiudadanoJpaRepository repository;

    public CiudadanoController(CiudadanoJpaRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/ciudadanos")
    public List<CiudadanoEntity> listar() {
        return repository.findAll();
    }
}