package br.gov.caixa.exemplo.modificador.mesmopacote;

public class SemAcessoPrivate {
    public SemAcessoPrivate() {
        AtribEModificadores verificador = new AtribEModificadores();
        verificador.atributoModifPublic = null;
        verificador.atributoModifProtected = null;
        verificador.atributoModifDefault = null;
//        verificador.atributoModifPrivate = null; // Só é acessível em ClasseAtribEModificadores.java
    }
}
