package com.example.API.REST._4.modelos;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.List;

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

    //Una relación es un nuevo atributo
    @OneToMany(mappedBy = "medico")
    @JsonManagedReference //Sirve para generar el json entre las entidades y soluciona un bug de que Java entra en un bucle pidiendo info
    private List<Paciente> pacientes; //List es un arraylist más generico

    public Medico() {
    }

    public Medico(Long id, String nombre, String matricula, String especialidad, Integer salario, String ips, String correo, String telefono, String direccion, Boolean estadisponiblefindesemana) {
        this.id = id;
        this.nombre = nombre;
        this.matricula = matricula;
        this.especialidad = especialidad;
        this.salario = salario;
        this.ips = ips;
        this.correo = correo;
        this.telefono = telefono;
        this.direccion = direccion;
        this.estadisponiblefindesemana = estadisponiblefindesemana;
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

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public Integer getSalario() {
        return salario;
    }

    public void setSalario(Integer salario) {
        this.salario = salario;
    }

    public String getIps() {
        return ips;
    }

    public void setIps(String ips) {
        this.ips = ips;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Boolean getEstadisponiblefindesemana() {
        return estadisponiblefindesemana;
    }

    public void setEstadisponiblefindesemana(Boolean estadisponiblefindesemana) {
        this.estadisponiblefindesemana = estadisponiblefindesemana;
    }
}
