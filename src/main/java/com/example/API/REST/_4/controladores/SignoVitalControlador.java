package com.example.API.REST._4.controladores;

import com.example.API.REST._4.modelos.Paciente;
import com.example.API.REST._4.modelos.SignoVital;
import com.example.API.REST._4.servicios.SignoVitalServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
@RequestMapping("/api/signoVital")
public class SignoVitalControlador {

    @Autowired
    SignoVitalServicio signoVitalServicio;

    @PostMapping
    public ResponseEntity<?> guardar(@RequestBody SignoVital datos){
        try {
            return ResponseEntity.status(HttpStatus.OK).body(signoVitalServicio.registrarSignoVital(datos));
        }catch (Exception error){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(error.getMessage());
        }
    }

    @GetMapping
    public ResponseEntity<?> buscarTodo(){
        try {
            return ResponseEntity.status(HttpStatus.OK).body(signoVitalServicio.buscarSignosVitales());
        }catch (Exception error){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(error.getMessage());
        }
    }
}
