package com.example.jogo.service;

import com.example.jogo.dto.JogadoresRequestDTO;
import com.example.jogo.dto.JogadoresResponseDTO;
import com.example.jogo.model.JogadoresModel;
import com.example.jogo.repository.JogadoresRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JogadoresService {
    @Autowired
    private JogadoresRepository repository;

    public JogadoresResponseDTO salvarJogador(JogadoresRequestDTO dto) {
        if (repository.findByNomePlayer(dto.getNomePlayer()).isPresent()) {
            throw new RuntimeException("Nome do Player já cadastrado");
        }
        JogadoresModel novoJogador = new JogadoresModel();
        novoJogador.setNomePlayer(dto.getNomePlayer());
        novoJogador.setNivel(dto.getNivel());
        novoJogador.setVitorias(dto.getVitorias());
        novoJogador.setDerrotas(dto.getDerrotas());

        JogadoresModel salvo = repository.save(novoJogador);
        return new JogadoresResponseDTO(salvo.getNomePlayer(), salvo.getNivel(), salvo.getVitorias(), salvo.getDerrotas());
    }
    public JogadoresResponseDTO buscarPorid(Long id){
        JogadoresModel jogadores =repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Jogador não encontrado"));
        return new JogadoresResponseDTO(jogadores.getNomePlayer(), jogadores.getNivel(), jogadores.getVitorias(), jogadores.getDerrotas());
    }

    public void atualizar (Long id, JogadoresRequestDTO dto){
        JogadoresModel jogadores = repository.findById(id)
                .orElseThrow(()-> new RuntimeException("Jogador não encontrado"));
        jogadores.setNomePlayer(dto.getNomePlayer());
        jogadores.setNivel(dto.getNivel());
        jogadores.setVitorias(dto.getVitorias());
        jogadores.setDerrotas(dto.getDerrotas());
    }

    public void excluir(Long id) {
        if (!repository.existsById(id)) {
            throw new RuntimeException("Jogador não encontrado");
        }
        repository.deleteById(id);
    }
}
