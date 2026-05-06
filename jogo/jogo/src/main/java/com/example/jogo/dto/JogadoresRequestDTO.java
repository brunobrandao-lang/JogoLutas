package com.example.jogo.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class JogadoresRequestDTO {
    @NotBlank(message = "O nome do player é obrigatório")
    @Size(max = 200, message = "O nome deve ter no máximo 100 caracteres")
    private String nomePlayer;

    @NotNull(message = "Informe o nível do player")
    @Size(min = 1, max = 100, message = "O nível começa do nível 1 e vai até o nível 100")
    private Double nivel;

    @NotNull(message = "Informe a quantidade de vitórias")
    private Double vitorias;

    @NotNull(message = "Informe a quantidade de derrotas")
    private Double derrotas;

    public JogadoresRequestDTO() {
    }

    public JogadoresRequestDTO(String nomePlayer, Double nivel, Double vitorias, Double derrotas) {
        this.nomePlayer = nomePlayer;
        this.nivel = nivel;
        this.vitorias = vitorias;
        this.derrotas = derrotas;
    }

    public @NotBlank(message = "O nome do player é obrigatório") @Size(max = 200, message = "O nome deve ter no máximo 100 caracteres") String getNomePlayer() {
        return nomePlayer;
    }

    public void setNomePlayer(@NotBlank(message = "O nome do player é obrigatório") @Size(max = 200, message = "O nome deve ter no máximo 100 caracteres") String nomePlayer) {
        this.nomePlayer = nomePlayer;
    }

    public @NotBlank(message = "Informe o nível do player") @Size(min = 1, max = 100, message = "O nível começa do nível 1 e vai até o nível 100") Double getNivel() {
        return nivel;
    }

    public void setNivel(@NotBlank(message = "Informe o nível do player") @Size(min = 1, max = 100, message = "O nível começa do nível 1 e vai até o nível 100") Double nivel) {
        this.nivel = nivel;
    }

    public @NotBlank(message = "Informe a quantidade de vitórias") Double getVitorias() {
        return vitorias;
    }

    public void setVitorias(@NotBlank(message = "Informe a quantidade de vitórias") Double vitorias) {
        this.vitorias = vitorias;
    }

    public @NotBlank(message = "Informe a quantidade de derrotas") Double getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(@NotBlank(message = "Informe a quantidade de derrotas") Double derrotas) {
        this.derrotas = derrotas;
    }
}
