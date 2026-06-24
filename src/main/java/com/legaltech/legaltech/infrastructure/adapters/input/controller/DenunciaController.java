package com.legaltech.legaltech.infrastructure.adapters.input.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.legaltech.legaltech.domain.model.Denuncia;
import com.legaltech.legaltech.domain.ports.input.RegistrarDenunciaUseCase;

@RestController
@RequestMapping("/api/denuncias")
@CrossOrigin("*")
public class DenunciaController {

    private final RegistrarDenunciaUseCase useCase;

    public DenunciaController(
            RegistrarDenunciaUseCase useCase) {

        this.useCase = useCase;
    }

    @PostMapping
    public ResponseEntity<String> registrar(
            @RequestBody Denuncia denuncia) {

        useCase.registrar(denuncia);

        return ResponseEntity.ok(
                "Denuncia registrada correctamente");
    }
}