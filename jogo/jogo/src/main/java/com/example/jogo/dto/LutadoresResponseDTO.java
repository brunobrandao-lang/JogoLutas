package com.example.jogo.dto;

public class LutadoresResponseDTO {
    private String nomeDeCombate;
    private String especialidades;
    private Double peso;
    private Double altura;
    private String categoria;

    public LutadoresResponseDTO() {}

    public LutadoresResponseDTO(String nomeDeCombate, String especialidades, Double altura, Double peso, String categoria) {
        this.nomeDeCombate = nomeDeCombate;
        this.especialidades = especialidades;
        this.altura = altura;
        this.peso = peso;
        this.categoria = categoria;
    }

    public String getNomeDeCombate() {
        return nomeDeCombate;
    }

    public void setNomeDeCombate(String nomeDeCombate) {
        this.nomeDeCombate = nomeDeCombate;
    }

    public String getEspecialidades() {
        return especialidades;
    }

    public void setEspecialidades(String especialidades) {
        this.especialidades = especialidades;
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