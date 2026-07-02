package com.legaltech.legaltech.infrastructure.persistence;

import jakarta.persistence.*;

@Entity
@Table(name = "Ciudadano")
public class CiudadanoEntity {

    @Id
    @Column(name = "idCiudadano")
    private Integer id;

    private String nombres;

    private String apellidos;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
}