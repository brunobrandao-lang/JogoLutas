package com.example.jogo.controller;

import com.example.jogo.dto.CenariosRequestDTO;
import com.example.jogo.dto.CenariosResponseDTO;
import com.example.jogo.service.CenariosService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/cenarios")
public class CenariosController {

    @Autowired
    private CenariosService service;

    @PostMapping
    public ResponseEntity<Object> salvar(@RequestBody @Valid CenariosRequestDTO dto) {
        service.salvarCenario(dto);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(Map.of("mensagem", "Cenário cadastrado com sucesso"));
    }

    @GetMapping
    public ResponseEntity<List<CenariosResponseDTO>> listar() {
        return ResponseEntity.ok(service.listarTodos());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Object> atualizar(@PathVariable Long id, @RequestBody @Valid CenariosRequestDTO dto) {
        service.atualizar(id, dto);
        return ResponseEntity.status(HttpStatus.OK)
                .body(Map.of("mensagem", "Cenário atualizado com sucesso"));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> excluir(@PathVariable Long id) {
        service.excluir(id);
        return ResponseEntity.status(HttpStatus.OK)
                .body(Map.of("mensagem", "Cenário excluído com sucesso"));
    }
}