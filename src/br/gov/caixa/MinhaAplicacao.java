package br.gov.caixa;

import br.gov.caixa.exemplo.enumerador.FaixaEtaria;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class MinhaAplicacao {

    public static void main(String[] args) {
        executarDesafioResolucao("true", "Imprimindo soma inteiros... ", "10", "15",
                "falso", "Não imprimindo... ", "7.3", "7.1", /// Aqui 4 Strings
                "true", "Imprimindo soma inteiros... ", "7.3", "7.1" /// Aqui 4 Strings);
        );
    }

    public static void exemploMatriz() {
        String[][] matriz = {
                {
                        "true", // 1.1
                        "Imprimindo soma inteiros... ", // 1.2
                        "10", // 1.3
                        "15" // 1.4
                }, // 0
                {"falso", "Não imprimindo... ", "7.3", "7.1"}, // 1
                {"true", "Imprimindo soma inteiros... ", "7.3", "7.1"} // 2
        };
        for (int i = 0; i < matriz.length; i++) {
            String[] arrayInterno = matriz[i];

            for (int j = 0; j < arrayInterno.length; j++) {
                String valorInterno = arrayInterno[j];
                System.out.println("arrayInterno " + i + " /// " +valorInterno);
            }
        }
    }

    public static void exemploArray() {
        // tipo [] nomeVariavel;
        // tipo nomeVariavel [];
        int nomeVariavel[] = new int[5];
        int nomeVariavel2[] = {1,2,3};

        char meuNomeArray[] = {'M', 'e', 'u', ' ', 'n', 'o', 'm', 'e'};
        char meuArray[] = Arrays.copyOfRange(meuNomeArray, 0, 2);
        System.out.println("Meu nome".charAt(3));
    }

    public static void exemploRepeticoes() {

//        for (int contador = 5; contador > 0; contador--) {
//            System.out.println("Imprime " + contador);
//        }

//        int saldo = 0;
//        while (saldo > 9580) {
//            System.out.println("Faz um pix pros alunos");
//            saldo--;
//        }

        int saldo = 0;
        do {
            System.out.println("Faz um pix pros alunos");
            saldo--;
        } while (saldo > 9580);
    }

    public static void exemplosData() {
        // https://docs.oracle.com/en/database/oracle/oracle-database/21/adjsn/iso-8601-date-time-and-duration-support.html#GUID-20DC09A8-98DF-4473-8077-913D490A969C

        Date data = new Date();
        System.out.println(data);

        LocalDate localDate = LocalDate.of(2024, Month.JANUARY, 1);
        System.out.println(localDate);

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM");
        System.out.println(formatter.format(data));

        System.out.printf("%tD %td %tm %ty %th %tH %tM %tS", data, data, data, data, data, data, data, data);
        // D - Data
        // d - Dia
        // m - Mês
        // y - Ano
        // h - sigla do mês
        // H - Hora
        // M - Minuto
        // S - Segundo
    }


    static void executarDesafioResolucao(String... array) {
        for (int i = 0; i < array.length; i += 4) {
            if (Boolean.parseBoolean(array[i + 0])) {
                try {
                    int soma = Integer.parseInt(array[i + 2]) + Integer.parseInt(array[i + 3]);
                    System.out.println("~ " + array[i + 1] + soma);
                } catch (NumberFormatException e) {
                    System.out.println("~ Erro ao converter para inteiro: \n" + e.getMessage());
                }
            } else {
                System.out.println("~ " + "Soma ignorada: não imprimir");
            }
        }
    }

    // Modificador | visibilidade
    /// Tipo de retorno
    //// nome do método
    ///// (argumentos | parâmetros)
    ////// { bloco de código }
    public static void main3(String[] args) {
        // Ler valores digitados na tela de console (entradas no sistema)
        Scanner scanner = new Scanner(System.in);

        // Assumir o valor digitado como String
        String valor = scanner.next();

        // Assumir o valor digitado como double
        double valorDouble = scanner.nextDouble();

        // Assumir o valor digitado como int
        int valorInt = scanner.nextInt();

        // Imprimir o texto, nesse caso com formatação
        // e pulando linhas com \n
        System.out.printf("\n\n\nO sistema leu %s", valor);

        if (true) {
            // Em métodos com retorno void, podemos abandonar o restante do código desta maneira
            return;
        }

        int idade = 70;

        // Declaração de variável
        FaixaEtaria faixaEtaria;

        // Controle de fluxo usando IF-ELSEIF-ELSE
        if (idade < 14) { // SE
            faixaEtaria = FaixaEtaria.CRIANCA;
        } else if (idade < 18) {
            faixaEtaria = FaixaEtaria.ADOLESCENTE;
        } else if (idade < 65) {
            faixaEtaria = FaixaEtaria.ADULTO;
        } else {
            faixaEtaria = FaixaEtaria.IDOSO;
        }

        System.out.println(faixaEtaria);

        // Controle de fluxo usando SWITCH
        switch (faixaEtaria) {
            case IDOSO:
                System.out.println("Pode se aposentar");
                break;
            default:
                System.out.println("Precisa trabalhar bastante ainda");
        }
    }


    public static int add(int value1, int value2) { // ADIÇÃO
        return value1 + value2;
    }

    public static int sub(int value1, int value2) { // SUBTRAÇÃO
        return value1 - value2;
    }

    public static int div(int value1, int value2) { // DIVISÃO
        return (int) value1 / value2;
    }

    public static int mult(int value1, int value2) { // MULTIPLICAÇÃO
        return value1 * value2;
    }
}
