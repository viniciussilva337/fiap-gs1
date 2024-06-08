package com.github.gf.controller.dto;

import com.github.gf.model.Peixe;

import java.math.BigDecimal;

public class FormPeixe {

    private Long id;

    private String nome;

    private String descricao;

    private BigDecimal peso;

    private String dataCatalogacao;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public BigDecimal getPeso() {
        return peso;
    }

    public void setPeso(BigDecimal peso) {
        this.peso = peso;
    }

    public String getDataCatalogacao() {
        return dataCatalogacao;
    }

    public void setDataCatalogacao(String dataCatalogacao) {
        this.dataCatalogacao = dataCatalogacao;
    }

    public FormPeixe toForm(Peixe peixe) {
        this.id = peixe.getId();
        this.nome = peixe.getNome();
        this.descricao = peixe.getDescricao();
        this.peso = peixe.getPeso();
        this.dataCatalogacao = peixe.getDataCatalogacao();
        return this;
    }

    public Peixe toModel() {
        Peixe peixe = new Peixe();
        peixe.setId(this.getId());
        peixe.setNome(this.getNome());
        peixe.setDescricao(this.getDescricao());
        peixe.setPeso(this.getPeso());
        peixe.setDataCatalogacao(this.getDataCatalogacao());
        return peixe;
    }
}
