package com.example.API.REST._4.modelos;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "pacientes")
public class Paciente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre; // No debe tener más de cuarenta caracteres
    private LocalDate anioNacimiento; //No debe de ser mayor a 2024 ni menor a 1920
    private String ciudad;
    private String correo;
    private String telefono; //Debe tener 10 digitos
    private String ips;
    private Boolean tienePoliza;
    private String grupoIngresos; // Solo sirve si es A, B o C
    private LocalDate fechaAfilacion; //entre el 1995 al 2024

    @ManyToOne
    @JoinColumn(name= "fk_medico", referencedColumnName = "id") //Sirve para generar la foreign key
    @JsonBackReference
    private Medico medico;


    @OneToMany(mappedBy = "paciente")
    @JsonManagedReference
    private List<SignoVital> signoVital;

    @OneToMany(mappedBy = "paciente")
    @JsonManagedReference
    private List<Enfermedad> enfermedad;

    @OneToMany(mappedBy = "paciente")
    @JsonManagedReference
    private List<Medicamento> medicamento;


    public Paciente() {
    }

    public Paciente(Long id, String nombre, LocalDate anioNacimiento, String ciudad, String correo, String telefono, String ips, Boolean tienePoliza, String grupoIngresos, LocalDate fechaAfilacion) {
        this.id = id;
        this.nombre = nombre;
        this.anioNacimiento = anioNacimiento;
        this.ciudad = ciudad;
        this.correo = correo;
        this.telefono = telefono;
        this.ips = ips;
        this.tienePoliza = tienePoliza;
        this.grupoIngresos = grupoIngresos;
        this.fechaAfilacion = fechaAfilacion;
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

    public LocalDate getAnioNacimiento() {
        return anioNacimiento;
    }

    public void setAnioNacimiento(LocalDate anioNacimiento) {
        this.anioNacimiento = anioNacimiento;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
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

    public String getIps() {
        return ips;
    }

    public void setIps(String ips) {
        this.ips = ips;
    }

    public Boolean getTienePoliza() {
        return tienePoliza;
    }

    public void setTienePoliza(Boolean tienePoliza) {
        this.tienePoliza = tienePoliza;
    }

    public String getGrupoIngresos() {
        return grupoIngresos;
    }

    public void setGrupoIngresos(String grupoIngresos) {
        this.grupoIngresos = grupoIngresos;
    }

    public LocalDate getFechaAfilacion() {
        return fechaAfilacion;
    }

    public void setFechaAfilacion(LocalDate fechaAfilacion) {
        this.fechaAfilacion = fechaAfilacion;
    }
}
