package com.example.jogo.dto;

public class CenariosResponseDTO {
    private String nomeCenario;
    private String modalidade;
    private String periodo;
    private String tipoLocal;

    public CenariosResponseDTO() {
    }

    public CenariosResponseDTO(String periodo, String nomeCenario, String modalidade, String tipoLocal) {
        this.periodo = periodo;
        this.nomeCenario = nomeCenario;
        this.modalidade = modalidade;
        this.tipoLocal = tipoLocal;
    }

    public String getNomeCenario() {
        return nomeCenario;
    }

    public void setNomeCenario(String nomeCenario) {
        this.nomeCenario = nomeCenario;
    }

    public String getModalidade() {
        return modalidade;
    }

    public void setModalidade(String modalidade) {
        this.modalidade = modalidade;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public String getTipoLocal() {
        return tipoLocal;
    }

    public void setTipoLocal(String tipoLocal) {
        this.tipoLocal = tipoLocal;
    }
}
