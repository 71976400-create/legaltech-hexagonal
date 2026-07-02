package com.legaltech.legaltech.infrastructure.persistence;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "Denuncia", schema = "dbo")
public class DenunciaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idDenuncia")
    private Long id;

    @Column(name = "codigo")
    private String codigo;

    @Column(name = "idCiudadano")
    private Long idCiudadano;

    @Column(name = "idTipoDenuncia")
    private Long idTipoDenuncia;

    @Column(name = "idPrioridad")
    private Long idPrioridad;

    @Column(name = "idEstadoDenuncia")
    private Long idEstadoDenuncia;

    @Column(name = "titulo")
    private String titulo;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "lugarHechos")
    private String lugarHechos;

    @Column(name = "referencia")
    private String referencia;

    @Column(name = "fechaHechos")
    private LocalDateTime fechaHechos;

    @Column(name = "fechaRegistro")
    private LocalDateTime fechaRegistro;

    @Column(name = "latitud")
    private Double latitud;

    @Column(name = "longitud")
    private Double longitud;

    @Column(name = "estado")
    private Boolean estado;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Long getIdCiudadano() {
        return idCiudadano;
    }

    public void setIdCiudadano(Long idCiudadano) {
        this.idCiudadano = idCiudadano;
    }

    public Long getIdTipoDenuncia() {
        return idTipoDenuncia;
    }

    public void setIdTipoDenuncia(Long idTipoDenuncia) {
        this.idTipoDenuncia = idTipoDenuncia;
    }

    public Long getIdPrioridad() {
        return idPrioridad;
    }

    public void setIdPrioridad(Long idPrioridad) {
        this.idPrioridad = idPrioridad;
    }

    public Long getIdEstadoDenuncia() {
        return idEstadoDenuncia;
    }

    public void setIdEstadoDenuncia(Long idEstadoDenuncia) {
        this.idEstadoDenuncia = idEstadoDenuncia;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getLugarHechos() {
        return lugarHechos;
    }

    public void setLugarHechos(String lugarHechos) {
        this.lugarHechos = lugarHechos;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public LocalDateTime getFechaHechos() {
        return fechaHechos;
    }

    public void setFechaHechos(LocalDateTime fechaHechos) {
        this.fechaHechos = fechaHechos;
    }

    public LocalDateTime getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(LocalDateTime fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public Double getLatitud() {
        return latitud;
    }

    public void setLatitud(Double latitud) {
        this.latitud = latitud;
    }

    public Double getLongitud() {
        return longitud;
    }

    public void setLongitud(Double longitud) {
        this.longitud = longitud;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
}