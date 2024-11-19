package com.example.API.REST._4.modelos;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "signo_vital")
public class SignoVital {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String valor;
    private LocalDate fechaMededida;

    @ManyToOne
    @JoinColumn(name="fk_paciente", referencedColumnName = "id")
    @JsonBackReference
    private Paciente paciente;

    public SignoVital(Long id, String nombre, String valor, LocalDate fechaMededida, Paciente paciente) {
        this.id = id;
        this.nombre = nombre;
        this.valor = valor;
        this.fechaMededida = fechaMededida;
        this.paciente = paciente;
    }

    public SignoVital() {
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

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public LocalDate getFechaMededida() {
        return fechaMededida;
    }

    public void setFechaMededida(LocalDate fechaMededida) {
        this.fechaMededida = fechaMededida;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
}
