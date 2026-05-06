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

    public void atualizar(Long id, CenariosRequestDTO dto) {
        CenariosModel cenario = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Cenário não encontrado com o ID: " + id));

        cenario.setNomeCenario(dto.getNomeCenario());
        cenario.setModalidade(dto.getModalidade());
        cenario.setPeriodo(dto.getPeriodo());
        cenario.setTipoLocal(dto.getTipoLocal());

        repository.save(cenario);
    }

    public void excluir(Long id) {
        if (!repository.existsById(id)) {
            throw new RuntimeException("Cenário não encontrado para exclusão!");
        }
        repository.deleteById(id);

    }
}