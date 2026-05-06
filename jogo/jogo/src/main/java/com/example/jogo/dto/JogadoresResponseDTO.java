package com.example.jogo.dto;

public class JogadoresResponseDTO {
    private String nomePlayer;
    private Double nivel;
    private Double vitorias;
    private Double derrotas;

    public JogadoresResponseDTO() {
    }

    public JogadoresResponseDTO(String nomePlayer, Double nivel, Double vitorias, Double derrotas) {
        this.nomePlayer = nomePlayer;
        this.nivel = nivel;
        this.vitorias = vitorias;
        this.derrotas = derrotas;
    }

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
