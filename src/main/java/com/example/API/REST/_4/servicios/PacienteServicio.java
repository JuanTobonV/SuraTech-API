package com.example.API.REST._4.servicios;

import com.example.API.REST._4.modelos.Paciente;
import com.example.API.REST._4.repositorios.RepositorioPaciente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PacienteServicio {

    // Para usar un servicio, debo llamar al repositorio
    // Esto se llama inyectar una dependencia

    @Autowired
    RepositorioPaciente repositorioPaciente;

    //Listo las operaciones que voy a realizar en BD

    //Registrar un paciente

    public Paciente registrarPaciente(Paciente datosPaciente) throws Exception{

        try{

            //Guardar en la base de datos los datos del paciente

            return repositorioPaciente.save(datosPaciente);

        }catch (Exception error){

            throw new Exception(error.getMessage());

        }
    }
    //Buscar los pacientes

    //Buscar un paciente por ID
}
