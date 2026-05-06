package com.example.jogo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "table_player")
public class JogadoresModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true, length = 100)
    private String nomePlayer;

    @Column(nullable = false)
    private Double nivel;

    @Column(nullable = false)
    private Double vitorias;

    @Column(nullable = false)
    private Double derrotas;

    public JogadoresModel() {
    }

    public JogadoresModel(Long id, String nomePlayer, Double nivel, Double vitorias, Double derrotas) {
        this.id = id;
        this.nomePlayer = nomePlayer;
        this.nivel = nivel;
        this.vitorias = vitorias;
        this.derrotas = derrotas;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
