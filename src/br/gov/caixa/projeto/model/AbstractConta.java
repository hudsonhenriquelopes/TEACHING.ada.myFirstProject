package br.gov.caixa.projeto.model;

import br.gov.caixa.projeto.enumerador.Status;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public abstract class AbstractConta implements Conta {
    protected Long id;
    protected double saldo;
    protected List<HistoricoAcao> historicoAcoes = new ArrayList<>();
    protected Date dataAtualizacao;
    protected Status status;
    protected String idUsuario;

    public void realizarSaque(double valor) {}
    public void realizarDeposito(double valor) {}
    public void realizarTransferencia(double valor, Long idContaDestino) {}
    public double consultarSaldo() {
        return this.saldo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public List<HistoricoAcao> getHistoricoAcoes() {
        return historicoAcoes;
    }

    public void setHistoricoAcoes(List<HistoricoAcao> historicoAcoes) {
        this.historicoAcoes = historicoAcoes;
    }

    public Date getDataAtualizacao() {
        return dataAtualizacao;
    }

    public void setDataAtualizacao(Date dataAtualizacao) {
        this.dataAtualizacao = dataAtualizacao;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }
}
interface Conta {
    void realizarSaque(double valor);
    void realizarDeposito(double valor);
    void realizarTransferencia(double valor, Long idContaDestino);
    double consultarSaldo();
}
