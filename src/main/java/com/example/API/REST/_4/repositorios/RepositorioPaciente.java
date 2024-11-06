package com.example.API.REST._4.repositorios;

import com.example.API.REST._4.modelos.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioPaciente extends JpaRepository<Paciente, Long> {
    
}
