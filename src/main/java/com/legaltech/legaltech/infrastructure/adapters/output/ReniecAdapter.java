package com.legaltech.legaltech.infrastructure.adapters.output;

import org.springframework.stereotype.Component;
import com.legaltech.legaltech.domain.ports.output.ReniecPort;

@Component
public class ReniecAdapter implements ReniecPort {

    @Override
    public boolean validarDni(String dni) {

        return true;
    }
}