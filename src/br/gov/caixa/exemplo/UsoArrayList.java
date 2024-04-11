package br.gov.caixa.exemplo;

import java.util.ArrayList;
import java.util.List;

public class UsoArrayList {

    public static void main(String[] args) {
        ArrayDinamico arrayDinamico = new ArrayDinamico(2);
//        arrayDinamico.imprimirValores();

//        System.out.println("------------------------");

        arrayDinamico.adicionar("Novo valor");
//        arrayDinamico.imprimirValores();

//        System.out.println("Contém o valor? " + arrayDinamico.contemTexto("Novo valor"));

//        System.out.println("Novo valor" == "Novo valor");
//        System.out.println("Novo valor".equals("novo valor"));
//        System.out.println("Novo valor".equalsIgnoreCase("Novo valor"));

        List<Integer> lista = new ArrayList<>();
//        lista.add("Hudson");
//        lista.add("Raphael");
//        lista.add("Eduardo");
//        lista.add("Antonio");
//        lista.add("Thiago");
//        lista.add("Marcio");
        lista.add(1);
        lista.add(20);
        lista.add(1546);
        lista.add(897879);
//        lista.add(true);
//        lista.add(false);

//        System.out.println(lista.contains("HudsonHenriqueLopes"));
        int valor = (int) lista.get(2);
        System.out.println(lista.get(5));
        System.out.println(lista.size());
    }
}
