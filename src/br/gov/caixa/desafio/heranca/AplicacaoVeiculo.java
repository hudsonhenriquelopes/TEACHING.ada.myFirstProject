package br.gov.caixa.desafio.heranca;

public class AplicacaoVeiculo {

    public static void main(String[] args) {

        Carro carro = new Carro("Hyundai", 2003, TamanhoVeiculo.GRANDE);
        carro.abrirPortas(); // Abrir porta do carro
        carro.abrirPortas(true);
        carro.abrirPortas(true, true);

        Veiculo.Caminhao caminhao = new Veiculo.Caminhao("Volvo", 2003, TamanhoVeiculo.GRANDE);
        caminhao.abrirPortas(); // Abrir porta do caminhão




//        TamanhoVeiculo.classifiqueTamanho(20);

//        double alturaCm = 50;
//        new Bicicleta("Caloi", 1985, TamanhoVeiculo.classificarPorAltura(alturaCm));
//        Veiculo.TamanhoVeiculo.PEQUENO.
    }
}
