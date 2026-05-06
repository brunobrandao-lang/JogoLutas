package com.example.jogo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "table_lutadores")
public class LutadoresModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    private String nomeDeCombate;

    @Column(nullable = false, length = 300)
    private String especialidades;

    @Column(nullable = false)
    private Double peso;

    @Column(nullable = false)
    private Double altura;

    @Column(nullable = false)
    private String categoria;

    public LutadoresModel() {
    }

    public LutadoresModel(Long id, String nomeDeCombate, String especialidades, Double peso, Double altura, String categoria) {
        this.id = id;
        this.nomeDeCombate = nomeDeCombate;
        this.especialidades = especialidades;
        this.peso = peso;
        this.altura = altura;
        this.categoria = categoria;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nomeDeCombate;
    }

    public void setNome(String nome) {
        this.nomeDeCombate = nome;
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
