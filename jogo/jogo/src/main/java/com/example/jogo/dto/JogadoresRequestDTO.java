package com.example.jogo.dto;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class JogadoresRequestDTO {

    @NotBlank(message = "O nome do player é obrigatório")
    @Size(max = 200, message = "O nome deve ter no máximo 200 caracteres")
    private String nomePlayer;

    @NotNull(message = "Informe o nível do player")
    @Min(value = 1, message = "O nível mínimo é 1")
    @Max(value = 100, message = "O nível máximo é 100")
    private Double nivel;

    @NotNull(message = "Informe a quantidade de vitórias")
    @Min(value = 0, message = "A quantidade de vitórias não pode ser negativa")
    private Double vitorias;

    @NotNull(message = "Informe a quantidade de derrotas")
    @Min(value = 0, message = "A quantidade de derrotas não pode ser negativa")
    private Double derrotas;

    public JogadoresRequestDTO() {
    }

    public JogadoresRequestDTO(String nomePlayer, Double nivel, Double vitorias, Double derrotas) {
        this.nomePlayer = nomePlayer;
        this.nivel = nivel;
        this.vitorias = vitorias;
        this.derrotas = derrotas;
    }

    // Getters e Setters limpos (as validações ficam nos atributos acima)
    public String getNomePlayer() {
        return nomePlayer;
    }

    public void setNomePlayer(String nomePlayer) {
        this.nomePlayer = nomePlayer;
    }

    public Double getNivel() {
        return nivel;
    }

    public void setNivel(Double nivel) {
        this.nivel = nivel;
    }

    public Double getVitorias() {
        return vitorias;
    }

    public void setVitorias(Double vitorias) {
        this.vitorias = vitorias;
    }

    public Double getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(Double derrotas) {
        this.derrotas = derrotas;
    }
}