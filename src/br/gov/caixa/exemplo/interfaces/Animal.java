package br.gov.caixa.exemplo.interfaces;

public class Animal {
}

interface AnimalVoador {
    void voar();
}

interface AnimalTerrestre {
    void andar();
}

interface AnimalFelino extends AnimalTerrestre {
    void miar();
}

interface AnimalAquatico {
    void nadar();
}

class Passaro extends Animal implements AnimalVoador {
    @Override
    public void voar() {
        System.out.println("Voe passarinho.");
    }
}

class Gato extends Animal implements AnimalFelino {
    @Override
    public void miar() {
    }
    @Override
    public void andar() {
    }
}

class Peixe extends Animal implements AnimalAquatico {
    public void nadar() {
    }
}

interface AnimalBica {
    void bicar();
}

interface Ave {
}

class Pinguim extends Animal implements AnimalBica, AnimalTerrestre, AnimalAquatico {
//    @Override
    public void andar() {

    }

//    @Override
    public void nadar() {

    }

//    @Override
    public void bicar() {

    }
}

class Canarinho implements Ave, AnimalVoador, AnimalBica {

    @Override
    public void voar() {

    }

    @Override
    public void bicar() {

    }
}

abstract class AbstractPato extends Animal implements AnimalTerrestre, AnimalAquatico, AnimalVoador {
    abstract void outroMetodo();
}

class Pato extends AbstractPato {
    @Override
    public void voar() {

    }

    @Override
    public void andar() {

    }

    @Override
    public void nadar() {

    }

    @Override
    void outroMetodo() {

    }
}