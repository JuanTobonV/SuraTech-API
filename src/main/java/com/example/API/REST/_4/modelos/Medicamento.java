package com.example.API.REST._4.modelos;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "medicamento")

public class Medicamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String presentacion;
    private Double dosis;
    private String laboratorio;
    private LocalDate fechaCaducidad;
    private String contraIndicaciones;
    private String registroINVIMA;
    private Boolean tieneCopago;
}
