package com.example.API.REST._4.servicios;

import com.example.API.REST._4.modelos.SignoVital;
import com.example.API.REST._4.repositorios.IRepositorioSignoVital;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SignoVitalServicio {
    @Autowired
    IRepositorioSignoVital repositorioSignoVital;

    public SignoVital registrarSignoVital(SignoVital datosSignoVital) throws Exception{

        try {
            return repositorioSignoVital.save(datosSignoVital);
        }catch (Exception error){
            throw new Exception(error.getMessage());
        }
    }

    public List<SignoVital> buscarSignosVitales() throws Exception {
        try {
            return repositorioSignoVital.findAll();
        }catch (Exception error){
            throw new Exception(error.getMessage());
        }
    }
}
