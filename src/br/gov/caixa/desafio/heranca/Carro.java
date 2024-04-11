package br.gov.caixa.desafio.heranca;

public class Carro extends Veiculo.VeiculoMotorizadoComPortas {
    public Carro(String marca, int ano, TamanhoVeiculo tamanho) {
        super(marca, ano, tamanho);
    }

    @Override
    public void abrirPortas() {
        System.out.println("CARRO | ");
        super.abrirPortas();
    }

    public boolean abrirPortas(boolean porSensorAproximacao) {
        System.out.println("Abrir porta por sensor");
        return true;
    }

    public void abrirPortas(boolean porSensorAproximacao, boolean porBotaoChave) {
        abrirPortas();
        this.abrirPortas();
        super.abrirPortas();

        abrirPortas(porSensorAproximacao);
        System.out.println("Abrir porta por botão chave");
    }
}
