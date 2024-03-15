package br.gov.caixa.exemplo;

import java.util.ArrayList;

public class AplicacaoArrayList {

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


        ArrayList lista = new ArrayList<>();
        lista.add("Hudson");
        lista.add("Raphael");
        lista.add("Eduardo");
        lista.add("Antonio");
        lista.add("Thiago");
        lista.add("Marcio");
        lista.add(1);


//        System.out.println(lista.contains("HudsonHenriqueLopes"));
        System.out.println(lista.get(2));
        System.out.println(lista.get(5));
        System.out.println(lista.size());
    }
}
