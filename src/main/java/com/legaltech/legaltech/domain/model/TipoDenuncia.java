package com.legaltech.legaltech.domain.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "TipoDenuncia")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TipoDenuncia {

    @Id
    @Column(name = "IdTipoDenuncia")
    private Integer id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "estado")
    private Boolean estado;

}