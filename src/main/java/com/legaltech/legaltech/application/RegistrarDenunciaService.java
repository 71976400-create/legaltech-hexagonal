package com.legaltech.legaltech.application;

import org.springframework.stereotype.Service;

import com.legaltech.legaltech.domain.model.Denuncia;
import com.legaltech.legaltech.domain.ports.input.RegistrarDenunciaUseCase;
import com.legaltech.legaltech.domain.ports.output.DenunciaRepositoryPort;

@Service
public class RegistrarDenunciaService
        implements RegistrarDenunciaUseCase {

    private final DenunciaRepositoryPort repository;

    public RegistrarDenunciaService(
            DenunciaRepositoryPort repository) {

        this.repository = repository;
    }

    @Override
    public void registrar(Denuncia denuncia) {

        repository.guardar(denuncia);

    }
}