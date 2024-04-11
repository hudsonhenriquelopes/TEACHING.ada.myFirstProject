package br.gov.caixa.exemplo.generics;

import br.gov.caixa.desafio.heranca.Carro;
import br.gov.caixa.desafio.heranca.TamanhoVeiculo;
import br.gov.caixa.desafio.heranca.Veiculo;

import java.util.List;

public class VagaGaragem<T extends Veiculo> {

    T item;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}

class UsoGaragem {
    public static void main(String[] args) {
        VagaGaragem<Veiculo.Moto> vagaMoto = new VagaGaragem();
        vagaMoto.setItem(new Veiculo.Moto(null, 0, null, 1000));
        Veiculo.Moto moto = vagaMoto.getItem();
        moto.getCilindradas();

        VagaGaragem<Carro> vagaCarro = new VagaGaragem<>();
        vagaCarro.setItem(new Carro(null, 0, null));
        Carro carro = vagaCarro.getItem();
        carro.abrirPortas(false);

    }
}

class CarroGrande extends Carro {
    public CarroGrande(String marca, int ano, TamanhoVeiculo tamanho) {
        super(marca, ano, tamanho);
    }

    void montarBancosExtras() {
    }
}

class CarroPequeno extends Carro {
    public CarroPequeno(String marca, int ano, TamanhoVeiculo tamanho) {
        super(marca, ano, tamanho);
    }
}

class SideCar extends Veiculo.Moto {

    public SideCar(String marca, int ano, TamanhoVeiculo tamanho, double cilindradas) {
        super(marca, ano, tamanho, cilindradas);
    }
}

class Garagem<C extends Carro, M extends Veiculo.Moto> {

    List<C> vagasCarros;
    List<M> vagasMotos;

    <V extends Veiculo, L extends List<V>> L retirarTodosVeiculos() {
        return null;
    }
}

class UsoGaragem2 {
    public static void main(String[] args) {
        Garagem<Carro, Veiculo.Moto> garagemCarrosEMotos = new Garagem();
        garagemCarrosEMotos.vagasCarros.add(new CarroGrande(null, 0, null));
        garagemCarrosEMotos.vagasCarros.add(new CarroPequeno(null, 0, null));
        garagemCarrosEMotos.vagasCarros.add(new Carro(null, 0, null));

        Garagem<CarroGrande, Veiculo.Moto> garagemCarrosGrandesEMotos = new Garagem();
        garagemCarrosGrandesEMotos.vagasCarros.get(0).montarBancosExtras();

        garagemCarrosGrandesEMotos.vagasMotos.add(new Veiculo.Moto(null, 0, null, 0));
        garagemCarrosGrandesEMotos.vagasMotos.add(new SideCar(null, 0, null, 0));
    }
}