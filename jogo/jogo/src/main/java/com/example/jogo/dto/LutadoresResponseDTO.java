package com.example.jogo.dto;

public class LutadoresResponseDTO {
    private String nomeDeCombate;
    private Double peso;
    private Double altura;
    private String categoria;

    public LutadoresResponseDTO() {
    }

    public LutadoresResponseDTO(String nomeDeCombate, Double peso, Double altura, String categoria) {
        this.nomeDeCombate = nomeDeCombate;
        this.peso = peso;
        this.altura = altura;
        this.categoria = categoria;
    }

    public String getNomeDeCombate() {
        return nomeDeCombate;
    }

    public void setNomeDeCombate(String nomeDeCombate) {
        this.nomeDeCombate = nomeDeCombate;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
