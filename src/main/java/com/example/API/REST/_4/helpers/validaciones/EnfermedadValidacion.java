package com.example.API.REST._4.helpers.validaciones;

import com.example.API.REST._4.modelos.Enfermedad;

public class EnfermedadValidacion {

    private Enfermedad objetoEnfermedad = new Enfermedad();

    public Boolean validarNombre(String nombre){
        if (nombre.length() <= 100){
            return true;
        }
        else {
            return false;
        }
    }

    public Boolean validarSintomas(String sintoma){
        if (sintoma.length() <= 50){
            return true;
        }
        else {
            return false;
        }
    }

    public Boolean validarClasificacion(String clasificacion){
        if (clasificacion.length() <= 50){
            return true;
        }
        else {
            return false;
        }
    }
    public Boolean clasificarGrado(String grado){
        if (grado.length() <= 50){
            return true;
        }
        else {
            return false;
        }
    }
}
