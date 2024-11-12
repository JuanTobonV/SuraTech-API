package com.example.API.REST._4.servicios;

import com.example.API.REST._4.modelos.Medicamento;
import com.example.API.REST._4.repositorios.IRepositorioMedicamento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MedicamentoServicio {
    @Autowired
    IRepositorioMedicamento repositorioMedicamento;

    public Medicamento registrarMedicamento(Medicamento datosMedicamentos) throws Exception {

        try {

            return repositorioMedicamento.save(datosMedicamentos);

        }catch (Exception error){

            throw new Exception(error.getMessage());
        }
    }
}
