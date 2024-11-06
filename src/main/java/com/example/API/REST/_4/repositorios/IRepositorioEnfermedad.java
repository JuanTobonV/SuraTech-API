package com.example.API.REST._4.repositorios;

import com.example.API.REST._4.modelos.Enfermedad;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRepositorioEnfermedad extends JpaRepository<Enfermedad,Long> {
}
