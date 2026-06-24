package com.legaltech.legaltech.infrastructure.adapters.output;

import org.springframework.stereotype.Component;
import com.legaltech.legaltech.domain.ports.output.IAPort;

@Component
public class IAAdapter implements IAPort {

    @Override
    public String clasificar(String descripcion) {

        return "Delito General";
    }
}