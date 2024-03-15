package br.gov.caixa.exemplo.heranca.talher;

import br.gov.caixa.exemplo.heranca.Talher;

public class Garfo extends Talher {
    private int pontas;

    void usar() {}

    public Garfo() {
        super();
    }

    public Garfo(String material) {
        super(material);
    }

    public Garfo(double tamanho, String cor, String material, int pontas, double peso) {
        this(material);
        this.cor = cor;
        this.pontas = pontas;
        this.peso = peso;
        this.setTamanho(tamanho);
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
