package com.example.jogo.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class LutadoresRequestDTO {
    @NotBlank(message = "O nome de combate é obrigatório")
    @Size(max = 100, min = 2, message = "O nome de combate deve ter entre 2 a 100 caracteres")
    private String nomeDeCombate;

    @NotBlank(message = "Informe as especialidades do lutador")
    @Size(max = 300, message = "No máximo 300 caracteres")
    private String especialidades;

    @NotBlank(message = "O peso do lutador é obrigatório")
    @Size(min = 2, max = 2, message = "O peso deve conter no mínimo e no máximo 2 caracteres exemplo: 81")
    private Double peso;

    @NotBlank(message = "A altura do lutador é obrigatório")
    @Size(min = 2, max = 4, message = "A altura Do lutador deve ser como o exemplo: (1.83)")
    private Double altura;

    @NotBlank(message = "Informe a categoria do lutador")
    private String categoria;

    public LutadoresRequestDTO() {
    }

    public LutadoresRequestDTO(String nomeDeCombate, String especialidades, Double peso, Double altura, String categoria) {
        this.nomeDeCombate = nomeDeCombate;
        this.especialidades = especialidades;
        this.peso = peso;
        this.altura = altura;
        this.categoria = categoria;
    }

    public @NotBlank(message = "O nome de combate é obrigatório") @Size(max = 100, min = 2, message = "O nome de combate deve ter entre 2 a 100 caracteres") String getNomeDeCombate() {
        return nomeDeCombate;
    }

    public void setNomeDeCombate(@NotBlank(message = "O nome de combate é obrigatório") @Size(max = 100, min = 2, message = "O nome de combate deve ter entre 2 a 100 caracteres") String nomeDeCombate) {
        this.nomeDeCombate = nomeDeCombate;
    }

    public @NotBlank(message = "Informe as especialidades do lutador") @Size(max = 300, message = "No máximo 300 caracteres") String getEspecialidades() {
        return especialidades;
    }

    public void setEspecialidades(@NotBlank(message = "Informe as especialidades do lutador") @Size(max = 300, message = "No máximo 300 caracteres") String especialidades) {
        this.especialidades = especialidades;
    }

    public @NotBlank(message = "O peso do lutador é obrigatório") @Size(min = 2, max = 2, message = "O peso deve conter no mínimo e no máximo 2 caracteres exemplo: 81") Double getPeso() {
        return peso;
    }

    public void setPeso(@NotBlank(message = "O peso do lutador é obrigatório") @Size(min = 2, max = 2, message = "O peso deve conter no mínimo e no máximo 2 caracteres exemplo: 81") Double peso) {
        this.peso = peso;
    }

    public @NotBlank(message = "A altura do lutador é obrigatório") @Size(min = 2, max = 4, message = "A altura Do lutador deve ser como o exemplo: (1.83)") Double getAltura() {
        return altura;
    }

    public void setAltura(@NotBlank(message = "A altura do lutador é obrigatório") @Size(min = 2, max = 4, message = "A altura Do lutador deve ser como o exemplo: (1.83)") Double altura) {
        this.altura = altura;
    }

    public @NotBlank(message = "Informe a categoria do lutador") String getCategoria() {
        return categoria;
    }

    public void setCategoria(@NotBlank(message = "Informe a categoria do lutador") String categoria) {
        this.categoria = categoria;
    }
}
