package br.gov.caixa.exemplo.generics;

import java.util.ArrayList;

public class ExemploGenerics {

    static abstract class ClasseA implements Impressora {
        public void imprimir() {}
        abstract void novoMetodo();
    }

    class ClasseB {}

    static class ClasseC extends ClasseA {
        @Override
        void novoMetodo() {

        }
    }

    class ClasseD {}

    class ClasseE {}

    interface Impressora {
        void imprimir();
    }

    static class ContainerClasse<E extends ClasseA, F extends Object, C> {

        // ClasseA classe1;
        E classe1;
        F classe2;

        // void fazerAcao(ClasseA classe1) {}
        void fazerAcao(E classe1) {
            classe1.novoMetodo();
        }

        public E getClasse1() {
            return classe1;
        }
    }

    public static void main(String[] args) {
        ContainerClasse<ClasseA, ClasseB, ClasseD> container = new ContainerClasse<>();
//        container.fazerAcao(new ClasseA());
        container.fazerAcao(new ClasseC());

        ArrayList listaStrings = new ArrayList<>();
        listaStrings.add(1);
        listaStrings.add("Hudson");
    }
}
