package com.example.jogo.repository;

import com.example.jogo.model.LutadoresModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface LutadoresRepository extends JpaRepository<LutadoresModel, Long> {
    Optional<LutadoresModel> findByNomeDeCombate(String nomeDeCombate);
}
