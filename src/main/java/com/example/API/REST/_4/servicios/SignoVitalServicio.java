package com.example.API.REST._4.servicios;

import com.example.API.REST._4.modelos.SignoVital;
import com.example.API.REST._4.repositorios.IRepositorioSignoVital;
import org.springframework.beans.factory.annotation.Autowired;

public class SignoVitalServicio {
    @Autowired
    IRepositorioSignoVital repositorioSignoVital;

    public SignoVital registrarSignoVital(SignoVital datosSignoVital){
        return null;
    }
}
