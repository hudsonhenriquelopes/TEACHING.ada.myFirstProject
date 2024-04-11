package br.gov.caixa.exemplo;

public abstract class Desconto {
    abstract double aplicar(Produto produto);
}

class DescontoAVista extends Desconto {

    @Override
    public double aplicar(Produto produto) {
        return produto.preco - 0.15;
    }
}

class DescontoAPrazo extends Desconto {

    @Override
    public double aplicar(Produto produto) {
        return produto.preco - 0.1;
    }
}

class Produto {
    double preco;
}
