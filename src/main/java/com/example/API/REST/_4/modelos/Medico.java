package com.example.API.REST._4.modelos;

import jakarta.persistence.*;

@Entity
@Table(name = "medico")
public class Medico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre; //50 CARACTERES Y SOLO LETRAS
    private String matricula; //20 CARACTERES
    private String especialidad; //50 CARACTERES
    private Integer salario; //NO PUEDE SER NEGATIVO //MINIMO 8000000 //MAXIMO 30000000
    private String ips; //50 CARACTERES
    private String correo; //FORMATO @SURA.COM.CO
    private String telefono; //10 CARACTERES
    private String direccion; //100 CARACTERES
    private Boolean estadisponiblefindesemana;


}
