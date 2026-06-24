package com.legaltech.legaltech.domain.ports.output;

import com.legaltech.legaltech.domain.model.Denuncia;

public interface DenunciaRepositoryPort {

    void guardar(Denuncia denuncia);

}