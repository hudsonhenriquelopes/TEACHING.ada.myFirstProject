package br.gov.caixa.desafio.interfaces;

public class DesafioInterface {
    abstract class Moto extends VeiculoImpl implements VeiculoMotor {
        int velocidadeMaxima;
    }

    abstract class Caminhao extends VeiculoImpl implements VeiculoPorta {
        int qtdPortas;
        int velocidadeMaxima;
    }

    abstract class Carro extends VeiculoPortaImpl implements VeiculoPorta {
        int qtdPortas;
        int velocidadeMaxima;
    }

    abstract class VeiculoImpl implements Veiculo {
        String cor;
        String marca;
        String nome;
        int tamanho;
        int ano;
        int qtdPneus;
        int qtdPassageiros;
    }

    class Bicicleta extends VeiculoImpl {
        public void pedalar() {}
        public void freiar() {}
    }

    interface VeiculoNaoMotorizado {}

    interface VeiculoPorta extends VeiculoMotor {
        void abrirPorta();
    }

    abstract class VeiculoPortaImpl implements VeiculoPorta {
        int qtdPortas;
    }

    interface VeiculoMotor {
        void ligar();
        void acelerar();
        void desligar();
        void abastecer();
    }

    interface Veiculo {
        void freiar();
    }
}

class ExemploBancoDados {
    interface BancoDados {
        void conectar();
        void desconectar();
    }

    class MySql implements BancoDados {
        @Override
        public void conectar() {}

        @Override
        public void desconectar() {}
    }

    class Oracle implements BancoDados {
        @Override
        public void conectar() {}

        @Override
        public void desconectar() {}
    }
}
