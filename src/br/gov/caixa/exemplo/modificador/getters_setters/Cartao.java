package br.gov.caixa.exemplo.modificador.getters_setters;

public class Cartao {

    /* default */ String numeracao;
    protected String validade;
    private String senha;
    private int id;
    private boolean temValidade;

    public Cartao() {}

    public Cartao(String senha, boolean temValidade) {
        this.senha = senha;
        this.temValidade = temValidade;
    }

    // modificador tipoRetorno nomeMetodo(parametros) {}
    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getSenha() {
        return senha;
    }

    public int getId() {
        return id;
    }

    public boolean isTemValidade() {
        return temValidade;
    }
}
