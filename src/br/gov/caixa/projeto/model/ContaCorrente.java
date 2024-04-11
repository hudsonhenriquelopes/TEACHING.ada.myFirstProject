package br.gov.caixa.projeto.model;

public class ContaCorrente extends AbstractConta {
    public void investir(double valor) {
        this.saldo += valor;
    }
}
