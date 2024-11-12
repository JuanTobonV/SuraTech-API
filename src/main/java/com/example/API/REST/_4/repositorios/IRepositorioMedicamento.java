package com.example.API.REST._4.repositorios;

import com.example.API.REST._4.modelos.Medicamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRepositorioMedicamento extends JpaRepository<Medicamento,Long> {
}
