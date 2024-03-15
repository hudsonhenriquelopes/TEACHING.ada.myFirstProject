package br.gov.caixa.desafio.heranca;

public enum TamanhoVeiculo {
    PEQUENO(100.0, 0.0, 0.0),
    MEDIO(200.0, 0.0, 0.0),
    GRANDE(300.0, 0.0, 0.0),
    ;

    private double alturaMaximaCm;
    private double larguraMaximaCm;
    private double comprimentoMaximoCm;

//        TamanhoVeiculo() {}

    TamanhoVeiculo(double alturaMaximaCm, double larguraMaximaCm, double comprimentoMaximoCm) {
        this.alturaMaximaCm = alturaMaximaCm;
        this.larguraMaximaCm = larguraMaximaCm;
        this.comprimentoMaximoCm = comprimentoMaximoCm;
    }

    public double getAlturaMaximaCm() {
        return alturaMaximaCm;
    }

    public double getLarguraMaximaCm() {
        return larguraMaximaCm;
    }

    public double getComprimentoMaximoCm() {
        return comprimentoMaximoCm;
    }

    public static TamanhoVeiculo classificarPorAltura(double alturaVeiculo) {
        if (alturaVeiculo <= PEQUENO.alturaMaximaCm) {
            return PEQUENO;
        } else if (alturaVeiculo <= MEDIO.alturaMaximaCm) {
            return MEDIO;
        }
        return GRANDE;
        // percorrer opcoes de tamanho, e definir um condicao para cada
    }
}
