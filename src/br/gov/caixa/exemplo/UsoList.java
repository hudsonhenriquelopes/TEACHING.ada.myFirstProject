package br.gov.caixa.exemplo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class UsoList {
    public static void main(String[] args) {
        List[] arrayDeListas = new List[] {
                new LinkedList<>(),
                new ArrayList<>()
        };
        for (List lista : arrayDeListas) {
            lista.add(lista.getClass().getName());
        }

        metodoRestringeGenerics(new LinkedList<>());

        System.out.println(arrayDeListas[0].get(0) + " // " + arrayDeListas[1].get(0));
    }

    public static <T extends List> void metodoRestringeGenerics(T lista) {

    }
}
