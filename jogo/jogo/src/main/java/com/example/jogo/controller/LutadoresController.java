package com.example.jogo.controller;

import com.example.jogo.dto.LutadoresRequestDTO;
import com.example.jogo.dto.LutadoresResponseDTO;
import com.example.jogo.service.LutadoresService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/lutadores")
public class LutadoresController {

    @Autowired
    private LutadoresService service;

    @PostMapping
    public ResponseEntity<Object> salvar(@RequestBody @Valid LutadoresRequestDTO dto) {
        service.salvarLutador(dto);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(Map.of("mensagem", "Lutador cadastrado com sucesso"));
    }

    @GetMapping
    public ResponseEntity<List<LutadoresResponseDTO>> listar() {
        return ResponseEntity.ok(service.listarTodos());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Object> atualizar(@PathVariable Long id, @RequestBody @Valid LutadoresRequestDTO dto) {
        service.atualizar(id, dto);
        return ResponseEntity.status(HttpStatus.OK)
                .body(Map.of("mensagem", "Lutador atualizado com sucesso"));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> excluir(@PathVariable Long id) {
        service.excluir(id);
        return ResponseEntity.status(HttpStatus.OK)
                .body(Map.of("mensagem", "Lutador excluído com sucesso"));
    }
}