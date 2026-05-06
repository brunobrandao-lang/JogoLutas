package com.example.jogo.service;

import com.example.jogo.dto.LutadoresRequestDTO;
import com.example.jogo.dto.LutadoresResponseDTO;
import com.example.jogo.model.LutadoresModel;
import com.example.jogo.repository.LutadoresRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class LutadoresService {
    @Autowired
    private LutadoresRepository repository;

    public LutadoresResponseDTO salvarLutador(LutadoresRequestDTO dto){
        if (repository.findByNomeDeCombate(dto.getNomeDeCombate()).isPresent()){
            throw new RuntimeException("Nome de combate já cadastrado");
        }
        LutadoresModel novoLutador = new LutadoresModel();

        // CORREÇÃO: Usando os nomes exatos do seu Model
        novoLutador.setNomeDeCombate(dto.getNomeDeCombate());
        novoLutador.setPeso(dto.getPeso());
        novoLutador.setAltura(dto.getAltura());
        novoLutador.setCategoria(dto.getCategoria());
        novoLutador.setEspecialidades(dto.getEspecialidades());

        LutadoresModel salvo = repository.save(novoLutador);

        // Ordem: Nome, Especialidades, Altura, Peso, Categoria
        return new LutadoresResponseDTO(
                salvo.getNomeDeCombate(),
                salvo.getEspecialidades(),
                salvo.getAltura(),
                salvo.getPeso(),
                salvo.getCategoria()
        );
    }

    public List<LutadoresResponseDTO> listarTodos(){
        return repository.findAll().stream()
                .map(lutador -> new LutadoresResponseDTO(
                        lutador.getNomeDeCombate(),
                        lutador.getEspecialidades(),
                        lutador.getAltura(),
                        lutador.getPeso(),
                        lutador.getCategoria()))
                .collect(Collectors.toList());
    }

    public void atualizar(Long id, LutadoresRequestDTO dto){
        LutadoresModel lutadorExistente = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Lutador não encontrado"));

        // Atualizando com dados do DTO
        lutadorExistente.setNomeDeCombate(dto.getNomeDeCombate());
        lutadorExistente.setPeso(dto.getPeso());
        lutadorExistente.setAltura(dto.getAltura());
        lutadorExistente.setCategoria(dto.getCategoria());
        lutadorExistente.setEspecialidades(dto.getEspecialidades());

        repository.save(lutadorExistente);
    }

    public void excluir(Long id) {
        if (!repository.existsById(id)) {
            throw new RuntimeException("Lutador não encontrado");
        }
        repository.deleteById(id);
    }
}