package br.gov.caixa.exemplo.heranca.talher;

import br.gov.caixa.exemplo.heranca.Talher;

public class Faca extends Talher {
    boolean afiada;

    public Faca() {}

    public Faca(String material) {
        this.material = material;
    }

    void usar() {}

    public boolean isAfiada() {
        return afiada;
    }

    public void setAfiada(boolean afiada) {
        this.afiada = afiada;
    }
}
