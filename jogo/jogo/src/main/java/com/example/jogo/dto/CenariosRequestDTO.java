package com.example.jogo.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class CenariosRequestDTO {
    @NotBlank(message = "Informe o Cénario")
    @Size(max = 100, message = "O cénario deve conter no máximo 100 caracteres")
    private String nomeCenario;

    @NotBlank(message = "Informe a modalidade")
    @Size(max = 100, message = "A modalidade deve conter no máximo 100 caracteres")
    private String modalidade;

    @NotBlank(message = "Informe o periodo da luta, exemplo: (Dia ou Noite)")
    private String periodo;

    @NotBlank(message = "Informe o tipo de local da luta, exemplo: (Rua, ringue...)")
    private String tipoLocal;

    public CenariosRequestDTO() {
    }

    public CenariosRequestDTO(String nomeCenario, String modalidade, String periodo, String tipoLocal) {
        this.nomeCenario = nomeCenario;
        this.modalidade = modalidade;
        this.periodo = periodo;
        this.tipoLocal = tipoLocal;
    }

    public @NotBlank(message = "Informe o Cénario") @Size(max = 100, message = "O cénario deve conter no máximo 100 caracteres") String getNomeCenario() {
        return nomeCenario;
    }

    public void setNomeCenario(@NotBlank(message = "Informe o Cénario") @Size(max = 100, message = "O cénario deve conter no máximo 100 caracteres") String nomeCenario) {
        this.nomeCenario = nomeCenario;
    }

    public @NotBlank(message = "Informe a modalidade") @Size(max = 100, message = "A modalidade deve conter no máximo 100 caracteres") String getModalidade() {
        return modalidade;
    }

    public void setModalidade(@NotBlank(message = "Informe a modalidade") @Size(max = 100, message = "A modalidade deve conter no máximo 100 caracteres") String modalidade) {
        this.modalidade = modalidade;
    }

    public @NotBlank(message = "Informe o periodo da luta, exemplo: (Dia ou Noite)") String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(@NotBlank(message = "Informe o periodo da luta, exemplo: (Dia ou Noite)") String periodo) {
        this.periodo = periodo;
    }

    public @NotBlank(message = "Informe o tipo de local da luta, exemplo: (Rua, ringue...)") String getTipoLocal() {
        return tipoLocal;
    }

    public void setTipoLocal(@NotBlank(message = "Informe o tipo de local da luta, exemplo: (Rua, ringue...)") String tipoLocal) {
        this.tipoLocal = tipoLocal;
    }
}
