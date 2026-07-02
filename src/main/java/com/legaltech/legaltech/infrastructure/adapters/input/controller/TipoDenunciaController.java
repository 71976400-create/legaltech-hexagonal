package com.legaltech.legaltech.infrastructure.adapters.input.controller;

import com.legaltech.legaltech.infrastructure.persistence.TipoDenunciaEntity;
import com.legaltech.legaltech.infrastructure.persistence.TipoDenunciaJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tipos-denuncia")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class TipoDenunciaController {

    private final TipoDenunciaJpaRepository repository;

    @GetMapping
    public List<TipoDenunciaEntity> listar() {
        return repository.findAll();
    }
}