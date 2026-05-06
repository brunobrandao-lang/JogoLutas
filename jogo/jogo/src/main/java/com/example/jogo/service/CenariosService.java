package com.example.jogo.service;

import com.example.jogo.dto.CenariosRequestDTO;
import com.example.jogo.dto.CenariosResponseDTO;
import com.example.jogo.model.CenariosModel;
import com.example.jogo.repository.CenarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CenariosService {

    @Autowired
    private CenarioRepository repository;

    // Criar novo cenário
    public CenariosResponseDTO salvarCenario(CenariosRequestDTO dto) {
        CenariosModel model = new CenariosModel();
        model.setNomeCenario(dto.getNomeCenario());
        model.setModalidade(dto.getModalidade());
        model.setPeriodo(dto.getPeriodo());
        model.setTipoLocal(dto.getTipoLocal());

        CenariosModel salvo = repository.save(model);

        return new CenariosResponseDTO(
                salvo.getPeriodo(),
                salvo.getNomeCenario(),
                salvo.getModalidade(),
                salvo.getTipoLocal()
        );
    }

    // Listar todos os cenários
    public List<CenariosResponseDTO> listarTodos() {
        return repository.findAll().stream()
                .map(cenario -> new CenariosResponseDTO(
                        cenario.getPeriodo(),
                        cenario.getNomeCenario(),
                        cenario.getModalidade(),
                        cenario.getTipoLocal()))
                .collect(Collectors.toList());
    }

    // Buscar por ID (útil para o Controller futuramente)
    public CenariosResponseDTO buscarPorId(Long id) {
        CenariosModel cenario = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Cenário não encontrado!"));

        return new CenariosResponseDTO(
                cenario.getPeriodo(),
                cenario.getNomeCenario(),
                cenario.getModalidade(),
                cenario.getTipoLocal()
        );
    }
}