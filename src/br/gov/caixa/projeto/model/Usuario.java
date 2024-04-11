package br.gov.caixa.projeto.model;

import br.gov.caixa.projeto.enumerador.Classificacao;
import br.gov.caixa.projeto.enumerador.Status;

import java.util.Date;

public class Usuario {
    private String id;
    private Classificacao classificacao;
    private String nome;
    private Date dataCadastro;
    private Status status;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Classificacao getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(Classificacao classificacao) {
        this.classificacao = classificacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
