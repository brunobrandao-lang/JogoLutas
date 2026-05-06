package com.example.jogo.dto;

import jakarta.validation.constraints.*;

public class LutadoresRequestDTO {
    @NotBlank(message = "O nome de combate é obrigatório")
    @Size(max = 100, min = 2, message = "O nome de combate deve ter entre 2 a 100 caracteres")
    private String nomeDeCombate;

    @NotBlank(message = "Informe as especialidades do lutador")
    @Size(max = 300, message = "No máximo 300 caracteres")
    private String especialidades;

    @NotNull(message = "O peso é obrigatório")
    @Min(value = 10, message = "O peso mínimo é 10kg")
    private Double peso;

    @NotNull(message = "A altura é obrigatória")
    @DecimalMin(value = "0.50", message = "A altura mínima é 0.50m")
    private Double altura;

    @NotBlank(message = "Informe a categoria do lutador")
    private String categoria;

    // Construtor, Getters e Setters devem ser mantidos sem anotações repetidas nos parâmetros
    public LutadoresRequestDTO() {}

    public String getNomeDeCombate() { return nomeDeCombate; }
    public void setNomeDeCombate(String nomeDeCombate) { this.nomeDeCombate = nomeDeCombate; }

    public String getEspecialidades() { return especialidades; }
    public void setEspecialidades(String especialidades) { this.especialidades = especialidades; }

    public Double getPeso() { return peso; }
    public void setPeso(Double peso) { this.peso = peso; }

    public Double getAltura() { return altura; }
    public void setAltura(Double altura) { this.altura = altura; }

    public String getCategoria() { return categoria; }
    public void setCategoria(String categoria) { this.categoria = categoria; }
}