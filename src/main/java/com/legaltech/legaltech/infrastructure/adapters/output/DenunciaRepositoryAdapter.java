package com.legaltech.legaltech.infrastructure.adapters.output;

import org.springframework.stereotype.Component;

import com.legaltech.legaltech.domain.model.Denuncia;
import com.legaltech.legaltech.domain.ports.output.DenunciaRepositoryPort;

@Component
public class DenunciaRepositoryAdapter
        implements DenunciaRepositoryPort {

    @Override
    public void guardar(Denuncia denuncia) {
        System.out.println("Denuncia guardada: "
                + denuncia.getDescripcion());
    }
}