package br.gov.caixa.projeto.model;

import br.gov.caixa.projeto.enumerador.Acao;

import java.util.Date;

public class HistoricoAcao {
    private Date data;
    private Acao tipo;
    private double valorPretendido;
    private double valorReal;
    private String idUsuarioOrigem;
    private String idUsuarioDestino;
    private String observacao;

}
