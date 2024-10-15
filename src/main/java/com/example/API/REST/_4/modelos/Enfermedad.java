package com.example.API.REST._4.modelos;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

@Entity
@Table(name = "enfermedad")

public class Enfermedad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String sintomas;
    private String clasificacion;
    private String grado;
    private Double probabilidadVivir;

    public Enfermedad() {
    }

    @ManyToOne
    @JoinColumn(name = "fk_paciente", referencedColumnName = "id")
    @JsonBackReference
    private Paciente paciente;

    public Enfermedad(Long id, String nombre, String sintomas, String clasificacion, String grado, Double probabilidadVivir) {
        this.id = id;
        this.nombre = nombre;
        this.sintomas = sintomas;
        this.clasificacion = clasificacion;
        this.grado = grado;
        this.probabilidadVivir = probabilidadVivir;
    }

}
