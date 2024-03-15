package br.gov.caixa.exemplo;

import java.text.DecimalFormat;

public class ArredondamentoDecimal {

    public static void main(String[] args) {
        double valorFinal = 100.564632467989;

        System.out.println("Formatado manual: " + ((double) Math.round(valorFinal * 10000) / 10000.0));

        DecimalFormat formatter = new DecimalFormat("#.####");
        String valorFinalFormatado = formatter.format(valorFinal);
        System.out.println("Formatado com DecimalFormat: " + valorFinalFormatado);
        System.out.printf("Formatado com printf: %.4f", valorFinal);
    }
}
