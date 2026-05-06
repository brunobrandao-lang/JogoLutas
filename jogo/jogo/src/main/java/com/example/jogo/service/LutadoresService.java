package com.example.jogo.service;

import com.example.jogo.dto.LutadoresRequestDTO;
import com.example.jogo.dto.LutadoresResponseDTO;
import com.example.jogo.model.LutadoresModel;
import com.example.jogo.repository.LutadoresRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LutadoresService {
    @Autowired
    private LutadoresRepository repository;

    public LutadoresResponseDTO salvarLutador(LutadoresRequestDTO dto){
        if (repository.findByNomeDeCombate(dto.getNomeDeCombate()).isPresent()){
            throw new RuntimeException(("Nome de Combate já cadastrado, tente outro"));
        }
        LutadoresModel novoLutador = new LutadoresModel();
        novoLutador.setNome(dto.getNomeDeCombate());
        novoLutador.setEspecialidades(dto.getEspecialidades());
        novoLutador.setAltura(dto.getAltura());
        novoLutador.setPeso(dto.getPeso());
        novoLutador.setCategoria(dto.getCategoria());

        LutadoresModel salvo = repository.save(novoLutador);
        return new LutadoresResponseDTO(salvo.getNome(), salvo.getAltura(), salvo.getPeso(), salvo.getEspecialidades(), salvo.getCategoria());
    }
}
