package com.example.API.REST._4.servicios;

import com.example.API.REST._4.modelos.Medico;
import com.example.API.REST._4.repositorios.IRepositorioMedico;
import org.springframework.beans.factory.annotation.Autowired;

public class MedicoServicio {
    @Autowired
    IRepositorioMedico repositorioMedico;

    public Medico registrarMedico(Medico datosMedico){
        return null;
    }
}
