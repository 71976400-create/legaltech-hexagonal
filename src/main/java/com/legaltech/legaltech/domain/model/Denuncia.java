package com.legaltech.legaltech.domain.model;

public class Denuncia {

    private Long id;
    private String ciudadano;
    private String descripcion;
    private String delito;

    public Denuncia() {
    }

    public Denuncia(Long id,
                     String ciudadano,
                     String descripcion,
                     String delito) {

        this.id = id;
        this.ciudadano = ciudadano;
        this.descripcion = descripcion;
        this.delito = delito;
    }

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