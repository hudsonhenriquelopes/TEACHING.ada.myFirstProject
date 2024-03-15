package br.gov.caixa.desafio;

public class DesafioArrayWrapperTryCatch {
    /**
     * - Construir um método executarDesafio(...)
     * - Este método deve possuir um parâmetro como array de String.
     * - A cada 4 valores do array de String, encontra-se as seguintes informações
     * -- [0] Deve imprimir?
     * -- [1] Mensagem padrão a ser impressa
     * -- [2] e [3] Valores inteiros a serem somados
     * <p>
     * Entrada:
     * <p>
     * {
     * "true", "Imprimindo soma inteiros... ", "10", "15",
     * "false", "Não imprimindo... ", "7.3", "7.1",
     * "true", "Imprimindo soma inteiros... ", "7.3", "7.1"
     * }
     * <p>
     * Saída (impressão no console):
     * <p>
     * ~ Imprimindo soma inteiros... 25
     * ~ Soma ignorada: não imprimir
     * ~ Erro ao converter para inteiro:
     * For input string: "7.3"
     **/

    public static void main(String[] args) {
        String[] textos = {"true", "Imprimindo soma inteiros... ", "10", "15", "falso", "Não imprimindo... ", "7.3", "7.1", "true", "Imprimindo soma inteiros... ", "7.3", "7.1"};
        executarDesafio(textos);

//        executarDesafioComVarargs("true", "Imprimindo soma inteiros... ", "10", "15", "falso", "Não imprimindo... ", "7.3", "7.1", "true", "Imprimindo soma inteiros... ", "7.3", "7.1");
    }

    public static void executarDesafio(String[] textos) {

        boolean imprimir;
        // for (iniciar contador; condicao; incremento) {}
        // contador = 0 >>>> 0, 1, 2, 3
        // contador = 4 >>>> + 0 = 4, + 1 = 5, 2, 3
        for (int contador = 0; contador < textos.length; contador += 4) {
            boolean deveImprimir = "true".equals(textos[contador + 0]); // "true"

            if (deveImprimir) {
                try {
                    String mensagemPadrao = textos[contador + 1]; // "Imprimindo soma inteiros... "

                    int valor1 = Integer.parseInt(textos[contador + 2]); // "10"
                    int valor2 = Integer.parseInt(textos[contador + 3]); // "15"
                    int soma = valor1 + valor2;

                    System.out.println("~ " + mensagemPadrao + soma);
                } catch (NumberFormatException e) {
                    System.out.println("~ Erro ao converter para inteiro:\n" + e.getMessage());
                }
            } else {
                System.out.println("~ Soma ignorada: não imprimir");
            }

        }
    }

    public static void executarDesafioComVarargs(String... textos) {
        executarDesafio(textos);
    }
}
