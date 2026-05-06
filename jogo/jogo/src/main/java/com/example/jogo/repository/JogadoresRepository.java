package com.example.jogo.repository;

import com.example.jogo.model.JogadoresModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface JogadoresRepository extends JpaRepository<JogadoresModel, Long> {
    Optional<JogadoresModel> findByNomePlayer(String nomePlayer);
}
