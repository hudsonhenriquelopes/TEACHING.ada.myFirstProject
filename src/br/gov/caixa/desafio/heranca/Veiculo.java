package br.gov.caixa.desafio.heranca;

public abstract class Veiculo {

    private Cor cor;
    private TamanhoVeiculo tamanho;
    private String marca;
    private int ano;
    private int qtdPneus;
    private int qtdPassageiros;
    private String nome;
    private double velocidadeMaxima;

    public Veiculo(String marca, int ano, TamanhoVeiculo tamanho) {
        this.marca = marca;
        this.ano = ano;
        this.tamanho = tamanho;
    }

    public Cor getCor() {
        return cor;
    }

    public void setCor(Cor cor) {
        this.cor = cor;
    }

    public TamanhoVeiculo getTamanho() {
        return tamanho;
    }

    public void setTamanho(TamanhoVeiculo tamanho) {
        this.tamanho = tamanho;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getQtdPneus() {
        return qtdPneus;
    }

    public void setQtdPneus(int qtdPneus) {
        this.qtdPneus = qtdPneus;
    }

    public int getQtdPassageiros() {
        return qtdPassageiros;
    }

    public void setQtdPassageiros(int qtdPassageiros) {
        this.qtdPassageiros = qtdPassageiros;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public void andar() {
    }

    public void acelerar() {
    }

    public void freiar() {
    }

    public static abstract class VeiculoMotorizado extends Veiculo {
        public VeiculoMotorizado(String marca, int ano, TamanhoVeiculo tamanho) {
            super(marca, ano, tamanho);
        }

        public void ligar() {
        }

        public void desligar() {
        }

        public void abastecer() {
        }
    }

    public static abstract class VeiculoMotorizadoComPortas extends VeiculoMotorizado {
        private int qtdPortas;

        public VeiculoMotorizadoComPortas(String marca, int ano, TamanhoVeiculo tamanho) {
            super(marca, ano, tamanho);
        }

        //    _getters & _setters
        public void abrirPortas() {
            System.out.println("Abrir porta da maneira padrão");
        }

        public final void limparParabrisas() {
            System.out.println("Limpar parabrisas");
        }
    }

    public final class Moto extends VeiculoMotorizado {
        public Moto(String marca, int ano, TamanhoVeiculo tamanho) {
            super(marca, ano, tamanho);
        }
    }

    public static final class Caminhao extends VeiculoMotorizadoComPortas {
        public Caminhao(String marca, int ano, TamanhoVeiculo tamanho) {
            super(marca, ano, tamanho);
        }

        @Override
        public void abrirPortas() {
            System.out.println("Abrir porta do caminhão");
        }
    }

}
