package br.gov.caixa.exemplo.generics;

public class ExemploGenericsFiltroComposto {
    public static void main(String[] args) {
        new UsoGenerics<Filha1>();
    }
}

abstract class Pai {

}

interface A {}

interface B {}

class UsoGenerics<T extends Pai & A & B> {
    T executar() {
        return null;
    }
}

class Filha1 extends Pai implements A, B {
}
class Filha2 {}

