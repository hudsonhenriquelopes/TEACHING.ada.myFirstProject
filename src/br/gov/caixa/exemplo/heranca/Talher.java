package br.gov.caixa.exemplo.heranca;

public abstract class Talher {
    protected String cor;
    protected String material;
    private double tamanho;
    protected double peso;
    protected String usoPrincipal;
    protected String tipo;

    public Talher() {
    }

    public Talher(String material) {
        this.material = material;
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

    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getUsoPrincipal() {
        return usoPrincipal;
    }

    public void setUsoPrincipal(String usoPrincipal) {
        this.usoPrincipal = usoPrincipal;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
