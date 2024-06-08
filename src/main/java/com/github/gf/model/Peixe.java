package com.github.gf.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.math.BigDecimal;

@Entity
@Table(name = "peixes")
public class Peixe extends AbstractEntity<Long> {

    @Column(nullable = false, unique = true)
    private String nome;

    @Column(nullable = false)
    private String descricao;

    @Column(nullable = false, columnDefinition = "NUMERIC(15,2)")
    private BigDecimal peso;

    @Column(nullable = false)
    private String dataCatalogacao;

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
}
