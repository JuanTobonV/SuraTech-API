package com.example.API.REST._4.modelos;

import com.fasterxml.jackson.annotation.JsonBackReference;
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

    @ManyToOne
    @JoinColumn(name = "fk_paciente", referencedColumnName = "id")
    @JsonBackReference
    private Paciente paciente;

    public Medicamento() {
    }

    public Medicamento(Long id, String nombre, String presentacion, Double dosis, String laboratorio, LocalDate fechaCaducidad, String contraIndicaciones, String registroINVIMA, Boolean tieneCopago) {
        this.id = id;
        this.nombre = nombre;
        this.presentacion = presentacion;
        this.dosis = dosis;
        this.laboratorio = laboratorio;
        this.fechaCaducidad = fechaCaducidad;
        this.contraIndicaciones = contraIndicaciones;
        this.registroINVIMA = registroINVIMA;
        this.tieneCopago = tieneCopago;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPresentacion() {
        return presentacion;
    }

    public void setPresentacion(String presentacion) {
        this.presentacion = presentacion;
    }

    public Double getDosis() {
        return dosis;
    }

    public void setDosis(Double dosis) {
        this.dosis = dosis;
    }

    public String getLaboratorio() {
        return laboratorio;
    }

    public void setLaboratorio(String laboratorio) {
        this.laboratorio = laboratorio;
    }

    public LocalDate getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(LocalDate fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public String getContraIndicaciones() {
        return contraIndicaciones;
    }

    public void setContraIndicaciones(String contraIndicaciones) {
        this.contraIndicaciones = contraIndicaciones;
    }

    public String getRegistroINVIMA() {
        return registroINVIMA;
    }

    public void setRegistroINVIMA(String registroINVIMA) {
        this.registroINVIMA = registroINVIMA;
    }

    public Boolean getTieneCopago() {
        return tieneCopago;
    }

    public void setTieneCopago(Boolean tieneCopago) {
        this.tieneCopago = tieneCopago;
    }
}
