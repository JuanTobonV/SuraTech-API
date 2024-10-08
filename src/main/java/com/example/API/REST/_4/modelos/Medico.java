package com.example.API.REST._4.modelos;

import jakarta.persistence.*;

@Entity
@Table(name = "medico")
public class Medico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String matricula;
    private String especialidad;
    private Integer salario;
    private String ips;
    private String correo;
    private String telefono;
    private String dirección;
    private Boolean estaDisponibleFindeSemana;


}
