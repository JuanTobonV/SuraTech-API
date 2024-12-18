package com.example.API.REST._4.servicios;

import com.example.API.REST._4.modelos.Medico;
import com.example.API.REST._4.repositorios.IRepositorioMedico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicoServicio {
    @Autowired
    IRepositorioMedico repositorioMedico;

    public Medico registrarMedico(Medico datosMedico) throws Exception{
        try{
            return repositorioMedico.save(datosMedico);
        }catch (Exception error){
            throw new Exception(error.getMessage());
        }
    }

    public List<Medico> buscarMedicos() throws Exception {
        try {
            return repositorioMedico.findAll();
        } catch (Exception error){
            throw new Exception(error.getMessage());
        }
    }
}
