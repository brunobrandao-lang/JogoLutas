package com.example.jogo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "table_cenarios")
public class CenariosModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    private String nomeCenario;

    @Column(nullable = false, length = 100)
    private String modalidade;

    @Column(nullable = false)
    private String periodo;

    @Column(nullable = false)
    private String tipoLocal;

    public CenariosModel() {
    }

    public CenariosModel(Long id, String nomeCenario, String modalidade, String periodo, String tipoLocal) {
        this.id = id;
        this.nomeCenario = nomeCenario;
        this.modalidade = modalidade;
        this.periodo = periodo;
        this.tipoLocal = tipoLocal;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
