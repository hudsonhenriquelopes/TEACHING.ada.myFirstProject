package br.gov.caixa.exemplo.modificador;

import br.gov.caixa.exemplo.modificador.mesmopacote.AtribEModificadores;

// Tem acesso aos atributos e métodos protected por ser filha.
public final class SemAcessoPrivateEDefault extends AtribEModificadores {

    public SemAcessoPrivateEDefault() {
        this.atributoModifPublic = null;
        this.atributoModifProtected = null;
//        this.atributoModifDefault = null; // Não está no mesmo pacote
//        verificador.atributoModifPrivate = null; // Só é acessível em ClasseAtribEModificadores.java
    }
}
