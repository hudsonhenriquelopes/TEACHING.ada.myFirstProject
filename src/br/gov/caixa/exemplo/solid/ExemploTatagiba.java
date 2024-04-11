package br.gov.caixa.exemplo.solid;

public class ExemploTatagiba {
    public static void main(String[] args) {
        ITatagiba iTatagiba = new ITatagibaImpl();
//        iTatagiba.metodo(new TatagibaFilho1());
//        iTatagiba.metodo(new TatagibaFilho2());
    }
}

abstract class TatagibaPai {}

interface ITatagibaMarcacao1 {}
interface ITatagibaMarcacao2 {}

class TatagibaFilho1 extends TatagibaPai implements ITatagibaMarcacao1 {}

class TatagibaFilho2 extends TatagibaPai implements ITatagibaMarcacao2 {}

interface ITatagiba {
    void cortar(TatagibaPai tatagibaPai);
}

class ITatagibaImpl implements ITatagiba {

    @Override
    public void cortar(TatagibaPai tatagibaPai) {
    }
}
