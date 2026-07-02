package com.legaltech.legaltech.infrastructure.adapters.input.controller;

import com.legaltech.legaltech.infrastructure.persistence.DenunciaEntity;
import com.legaltech.legaltech.infrastructure.persistence.DenunciaJpaRepository;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.DeleteMapping;

@RestController
public class DenunciaController {

    private final DenunciaJpaRepository repository;

    public DenunciaController(DenunciaJpaRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/denuncias")
    public Object listar() {
        return repository.findAll();
    }

    @PostMapping("/denuncias")
    public DenunciaEntity guardar(@RequestBody DenunciaEntity denuncia) {

        System.out.println("*********** ENTRE AL POST ***********");

        System.out.println("Codigo: " + denuncia.getCodigo());
        System.out.println("Ciudadano: " + denuncia.getIdCiudadano());
        System.out.println("Tipo: " + denuncia.getIdTipoDenuncia());
        System.out.println("Titulo: " + denuncia.getTitulo());
        System.out.println("Descripcion: " + denuncia.getDescripcion());

        return repository.save(denuncia);
    }

    @GetMapping("/denuncias/{id}")
    public DenunciaEntity obtener(@PathVariable Long id) {
        return repository.findById(id).orElse(null);
    }

    @PutMapping("/denuncias/{id}")
public DenunciaEntity actualizar(@PathVariable Long id,
                                 @RequestBody DenunciaEntity datos) {

    DenunciaEntity denuncia = repository.findById(id).orElse(null);

    if (denuncia == null) {
        return null;
    }

    denuncia.setTitulo(datos.getTitulo());
    denuncia.setDescripcion(datos.getDescripcion());
    denuncia.setLugarHechos(datos.getLugarHechos());
    denuncia.setEstado(datos.getEstado());

    return repository.save(denuncia);
}
    
    @DeleteMapping("/denuncias/{id}")
    public void eliminar(@PathVariable Long id) {
        repository.deleteById(id);
    }
}