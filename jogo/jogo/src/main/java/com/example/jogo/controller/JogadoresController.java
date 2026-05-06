package com.example.jogo.controller;

import com.example.jogo.dto.JogadoresRequestDTO;
import com.example.jogo.dto.JogadoresResponseDTO;
import com.example.jogo.service.JogadoresService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/jogadores")
public class JogadoresController {
    @Autowired
    private JogadoresService service;

    @GetMapping
    public ResponseEntity<List<JogadoresResponseDTO>> listar(){
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(service.listarTodos());
    }

    @PostMapping
    public ResponseEntity<Map<String, Object>> salvar(@Valid @RequestBody JogadoresRequestDTO dto){
        service.salvarJogador(dto);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(Map.of("mensagem", "Jogador cadastrado com sucesso"));
  }

    @PutMapping("/{id}")
    public ResponseEntity<Object> atualizar(@PathVariable Long id, @RequestBody @Valid JogadoresRequestDTO dto) {
        service.atualizar(id, dto);
        return ResponseEntity.status(HttpStatus.OK)
                .body(Map.of("mensagem", "Jogador atualizado com sucesso"));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> excluir(@PathVariable Long id) {
        service.excluir(id);
        return ResponseEntity.status(HttpStatus.OK)
                .body(Map.of("mensagem", "Jogador excluído com sucesso"));
    }
}
