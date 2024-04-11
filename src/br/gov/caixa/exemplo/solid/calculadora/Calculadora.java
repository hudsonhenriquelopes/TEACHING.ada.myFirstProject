package br.gov.caixa.exemplo.solid.calculadora;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        ParametrosOperacao params = LeituraParametros.solicitar();

        int resultado = params.getEnumOperacao().getOperacao().executar(params.getValor1(), params.getValor2());

        System.out.println("O resultado é " + resultado);
    }

    enum EnumOperacao {
        SOMA("+", new OperacaoSoma()),
        SUBTRACAO("-", new OperacaoSubtracao()),
        MULTIPLICACAO("*", new OperacaoMultiplicacao()),
        DIVISAO("/", new OperacaoDivisao());

        String simbolo;
        Operacao operacao;

        EnumOperacao(String simbolo, Operacao operacao) {
            this.simbolo = simbolo;
            this.operacao = operacao;
        }

        static EnumOperacao buscarPorSimbolo(String simbolo) {
            for (EnumOperacao operacao : values()) {
                if (operacao.simbolo.equalsIgnoreCase(simbolo)) {
                    return operacao;
                }
            }
            return null;
        }

        public Operacao getOperacao() {
            return operacao;
        }
    }

    static class LeituraParametros {
        public static ParametrosOperacao solicitar() {
            ParametrosOperacao parametros = new ParametrosOperacao();

            Scanner scanner = new Scanner(System.in);
            solicitarValores(scanner, parametros);
            solicitarOperacao(scanner, parametros);

            return parametros;
        }

        private static void solicitarValores(Scanner scanner, ParametrosOperacao parametrosOperacao) {
            System.out.println("Primeiro valor: ");
            parametrosOperacao.setValor1(scanner.nextInt());

            System.out.println("Segundo valor: ");
            parametrosOperacao.setValor2(scanner.nextInt());
        }

        private static void solicitarOperacao(Scanner scanner, ParametrosOperacao parametrosOperacao) {
            System.out.println("Escolha uma das opções: + - * /");
            EnumOperacao operacao = EnumOperacao.buscarPorSimbolo(scanner.next());
            parametrosOperacao.setEnumOperacao(operacao);
        }
    }

}

class ParametrosOperacao {
    private int valor1;
    private int valor2;
    private Calculadora.EnumOperacao enumOperacao;

    public int getValor1() {
        return valor1;
    }

    public void setValor1(int valor1) {
        this.valor1 = valor1;
    }

    public int getValor2() {
        return valor2;
    }

    public void setValor2(int valor2) {
        this.valor2 = valor2;
    }

    public Calculadora.EnumOperacao getEnumOperacao() {
        return enumOperacao;
    }

    public void setEnumOperacao(Calculadora.EnumOperacao enumOperacao) {
        this.enumOperacao = enumOperacao;
    }
}
