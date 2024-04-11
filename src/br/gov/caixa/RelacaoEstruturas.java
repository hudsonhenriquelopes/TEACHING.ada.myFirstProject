package br.gov.caixa;

public class RelacaoEstruturas {
/*
extends OU implements OU X
----------------------------------
ClasseA [extends] ClasseB
ClasseA [implements] InterfaceA
ClasseA [X] EnumA

InterfaceA [X] ClasseA
InterfaceA [extends] InterfaceB
InterfaceA [X] EnumC

EnumA [X] ClasseA
EnumA [implements] InterfaceB
EnumB [X] EnumC
----------------------------------
 */

    static class ClasseA extends ClasseB implements InterfaceA {}

    static class ClasseB implements InterfaceA {}
    static class ClasseC {}

//    interface InterfaceA extends InterfaceB {}
    interface InterfaceA extends InterfaceB {}
    interface InterfaceB {}
    interface InterfaceC {
        void novoMetodo();
    }

    enum EnumA implements InterfaceC {
        OPCAO_A,
        OPCAO_B;

        @Override
        public void novoMetodo() {

        }
    }
    enum EnumB {}
    enum EnumC {}

    public static void main(String[] args) {
        new InterfaceC() {
            @Override
            public void novoMetodo() {

            }
        };
    }
}
