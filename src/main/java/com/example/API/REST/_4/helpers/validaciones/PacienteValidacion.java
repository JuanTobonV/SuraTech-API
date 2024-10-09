package com.example.API.REST._4.helpers.validaciones;

import com.example.API.REST._4.modelos.Paciente;

import java.time.LocalDate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PacienteValidacion {

    private Paciente pacienteUno = new Paciente();

    public  Boolean validarNombre(String nombre){

        String expresionRegularNombre = "^[a-zA-Z\\s]+$";

        Pattern patronNombre = Pattern.compile(expresionRegularNombre);


        Matcher coincidenciaNombre = patronNombre.matcher(nombre);

        if (coincidenciaNombre.find()) {

            return true;
        }
        else {
           return false;
        }

    };

    public  Boolean validarFechaNacimiento(LocalDate fecha){
        return fecha.getYear() <= 2024 && fecha.getYear() >= 1920;
    };


    public  Boolean validarCiudad(String ciudad){

        String expresionRegularCiudad = "^[a-zA-Z\\s]+$";

        Pattern patronCiudad = Pattern.compile(expresionRegularCiudad);


        Matcher coincidenciaCiudad = patronCiudad.matcher(ciudad);

        if (coincidenciaCiudad.find()) {

            return true;
        }
        else {
            return false;
        }
    };

    public  Boolean validarCorreo(String correo){
        String expresionRegularCorreo =  "^[a-zA-Z0-9._%+-]+@sura\\.com$";

        Pattern patronCiudad = Pattern.compile(expresionRegularCorreo);


        Matcher coincidenciaCorreo = patronCiudad.matcher(correo);

        if (coincidenciaCorreo.find()) {

            return true;
        }
        else {
            return false;
        }
    };

    public  Boolean validarTelefono(String telefono){
        if (telefono.length() != 10){
            return false;
        }
        else{
            return true;
        }
    };

    public Boolean validarGrupoIngreso(String grupoIngreso){
        if (grupoIngreso.equalsIgnoreCase("A") || grupoIngreso.equalsIgnoreCase("B") || grupoIngreso.equalsIgnoreCase("C")){
            return true;
        }
        else{
            return false;
        }
    }
    public  Boolean validarFechaAfiliacion(LocalDate fechaAfiliacion){
        if(fechaAfiliacion.getYear() <=2024 && fechaAfiliacion.getYear()>= 1995){
            return true;
        }
        else {
            return false;
        }

    }
}
