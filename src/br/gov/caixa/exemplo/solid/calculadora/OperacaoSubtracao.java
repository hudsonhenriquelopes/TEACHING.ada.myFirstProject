package br.gov.caixa.exemplo.solid.calculadora;

public class OperacaoSubtracao extends OperacaoImpl {

    @Override
    public int executar(int valor1, int valor2) {
        return valor1 - valor2;
    }

    public static void main(String[] args) {
        double d1 = 0.1;
        double d2 = 0.2;
        System.out.println(d1 + d2);
    }
}
