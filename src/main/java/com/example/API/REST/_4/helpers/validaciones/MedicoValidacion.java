package com.example.API.REST._4.helpers.validaciones;

import com.example.API.REST._4.modelos.Medico;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MedicoValidacion {

    private Medico objetoMedico = new Medico();

    // 50 CARACTERES Y SOLO LETRAS
    public Boolean validarNombreMedico(String nombre){
        String expresionRegularNombre = "^[a-zA-Z]+$";

        Pattern patronNombre = Pattern.compile(expresionRegularNombre);

        Matcher coincidenciaNombre = patronNombre.matcher(nombre);

        if (coincidenciaNombre.find() && nombre.length() <= 50){
            return true;
        }
        else {
            return false;
        }
    }

    public Boolean validarMatricula(String matricula){
        if(matricula.length() <= 20){
            return true;
        }
        else {
            return false;
        }
    }

    public Boolean validarEspecialidad(String especialidad){
        if (especialidad.length() <= 50){
            return true;
        }
        else {
            return false;
        }
    }

    public Boolean validarSalario(Integer salario){
        if ((salario > 0) && (8000000 <= salario) && (salario <= 30000000)){
            return true;
        }
        else {
            return false;
        }
    }

    public Boolean validarIps(String ips){
        if (ips.length() <= 50){
            return true;
        }
        else{
            return false;
        }
    }

    public Boolean validarCorreo(String correo){
        String regexCorreo = "@sura\\.com\\.co";

        Pattern patronRegex = Pattern.compile(regexCorreo);

        Matcher coincidenciaCorreo = patronRegex.matcher(correo);

        if (coincidenciaCorreo.find()){
            return true;
        }
        else {
            return false;
        }
    }

    public Boolean validarNumber(String telefono){
        if (telefono.length() != 10){
            return false;
        }
        else {
            return true;
        }

    }

    public Boolean validarDirección(String direccion){
        if (direccion.length() <= 100){
            return true;
        }
        else {
            return false;
        }
    }

}
