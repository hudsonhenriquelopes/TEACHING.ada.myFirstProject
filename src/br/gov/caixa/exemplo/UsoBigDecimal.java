package br.gov.caixa.exemplo;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class UsoBigDecimal {
    public static void main(String[] args) {
        double d1 = 0.1;
        double d2 = 0.2;
        System.out.println(d1 + d2);

        BigDecimal v1 = new BigDecimal("0.1");
        BigDecimal v2 = new BigDecimal("0.1");

        System.out.println(v1.doubleValue() + v2.doubleValue());
        System.out.println(v1.add(v2));

        System.out.println(v1.compareTo(v2) == 0);
        String[] a = {""};
    }
}
