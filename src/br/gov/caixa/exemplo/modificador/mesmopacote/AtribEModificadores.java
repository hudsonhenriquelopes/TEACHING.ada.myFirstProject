package br.gov.caixa.exemplo.modificador.mesmopacote;

public class AtribEModificadores {

    public Object atributoModifPublic; // Acessível a todos
    protected Object atributoModifProtected; // Acessível ao mesmo pacote, ou herdeiras em outros pacotes
    Object atributoModifDefault; // Só é acessível no mesmo pacote
    private Object atributoModifPrivate; // Só é acessível pela própria classe

    public AtribEModificadores() {
        this.atributoModifPrivate = null;
    }
}
