package com.example.API.REST._4.modelos;

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


}
