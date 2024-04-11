package br.gov.caixa.exemplo.solid.calculadora;

public class OperacaoMultiplicacao extends OperacaoImpl {

    public static int multiplicar(int valor1, int valor2) {
        return valor1 * valor2;
    }

    @Override
    public int executar(int valor1, int valor2) {
        return multiplicar(valor1, valor2);
    }
}
