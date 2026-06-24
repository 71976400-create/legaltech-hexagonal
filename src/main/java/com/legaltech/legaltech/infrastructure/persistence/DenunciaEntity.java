package com.legaltech.legaltech.infrastructure.persistence;

import jakarta.persistence.*;

@Entity
@Table(name = "denuncias")
public class DenunciaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String ciudadano;

    @Column(length = 5000)
    private String descripcion;

    private String delito;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCiudadano() {
        return ciudadano;
    }

    public void setCiudadano(String ciudadano) {
        this.ciudadano = ciudadano;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDelito() {
        return delito;
    }

    public void setDelito(String delito) {
        this.delito = delito;
    }
}