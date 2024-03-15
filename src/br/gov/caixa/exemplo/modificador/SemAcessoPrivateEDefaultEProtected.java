package br.gov.caixa.exemplo.modificador;

import br.gov.caixa.exemplo.modificador.mesmopacote.AtribEModificadores;

public class SemAcessoPrivateEDefaultEProtected {
    public SemAcessoPrivateEDefaultEProtected() {
        AtribEModificadores verificador = new AtribEModificadores();
        verificador.atributoModifPublic = null;
//        verificador.atributoModifProtected = null; // Está em outro pacote
//        verificador.atributoModifDefault = null; // Não está no mesmo pacote
//        verificador.atributoModifPrivate = null; // Só é acessível em ClasseAtribEModificadores.java
    }
}
