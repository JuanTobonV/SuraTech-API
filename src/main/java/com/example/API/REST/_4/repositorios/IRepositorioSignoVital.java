package com.example.API.REST._4.repositorios;

import com.example.API.REST._4.modelos.SignoVital;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRepositorioSignoVital extends JpaRepository<SignoVital,Long> {
}
