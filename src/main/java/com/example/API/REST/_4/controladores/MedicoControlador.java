package com.example.API.REST._4.controladores;

import com.example.API.REST._4.modelos.Medico;
import com.example.API.REST._4.servicios.MedicoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/medico")
public class MedicoControlador {

    @Autowired
    MedicoServicio medicoServicio;

    @PostMapping
    public ResponseEntity<?> guardar(@RequestBody Medico datos){
        try {
            return ResponseEntity.status(HttpStatus.OK).body(medicoServicio.registrarMedico(datos));

        }catch (Exception error){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(error.getMessage());
        }
    };
}
