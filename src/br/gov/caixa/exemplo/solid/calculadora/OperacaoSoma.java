package br.gov.caixa.exemplo.solid.calculadora;

public class OperacaoSoma extends OperacaoImpl {

    @Override
    public int executar(int valor1, int valor2) {
        return valor1 + valor2;
    }
}
