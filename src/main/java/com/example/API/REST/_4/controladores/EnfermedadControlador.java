package com.example.API.REST._4.controladores;

import com.example.API.REST._4.modelos.Enfermedad;
import com.example.API.REST._4.servicios.EnfermedadServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/enfermedad")
public class EnfermedadControlador {

    @Autowired
    EnfermedadServicio enfermedadServicio;

    @PostMapping
    public ResponseEntity<?> guardar(@RequestBody Enfermedad datos){
        try {
            return ResponseEntity.status(HttpStatus.OK).body(enfermedadServicio.registroEnfermedad(datos));

        }catch (Exception error){
            return  ResponseEntity.status(HttpStatus.BAD_REQUEST).body(error.getMessage());
        }
    }

    @GetMapping
    public ResponseEntity<?> buscarTodo(){
        try{
            return ResponseEntity.status(HttpStatus.OK).body(enfermedadServicio.buscarEnfermedades());
        }catch (Exception error){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(error.getMessage());
        }
    }
}
