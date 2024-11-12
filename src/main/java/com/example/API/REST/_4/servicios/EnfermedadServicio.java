package com.example.API.REST._4.servicios;

import com.example.API.REST._4.modelos.Enfermedad;
import com.example.API.REST._4.repositorios.IRepositorioEnfermedad;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EnfermedadServicio {
    @Autowired
    IRepositorioEnfermedad repositorioEnfermedad;

    public Enfermedad registroEnfermedad(Enfermedad datosEnfermedad) throws Exception{
        try{
            return repositorioEnfermedad.save(datosEnfermedad);
        }catch (Exception error){
            throw new Exception(error.getMessage());

        }
    }
}
