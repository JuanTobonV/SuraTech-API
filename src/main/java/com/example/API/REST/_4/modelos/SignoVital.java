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

}
