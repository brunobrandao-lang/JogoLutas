package com.example.jogo.repository;

import com.example.jogo.model.CenariosModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CenarioRepository extends JpaRepository<CenariosModel, Long> {
}
