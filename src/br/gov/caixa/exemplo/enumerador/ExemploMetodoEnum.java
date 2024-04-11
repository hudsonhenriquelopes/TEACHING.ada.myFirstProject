package br.gov.caixa.exemplo.enumerador;

public enum ExemploMetodoEnum implements AcaoAExecutar {
    OPCAO1 {
        public void executar(Object conta) {}
    },
    OPCAO2 {
        public void executar(Object conta) {}
    }
    ;

    @Override
    public void executar(Object conta) {

    }

    public static void main(String[] args) {
        OPCAO1.executar(null);
        OPCAO2.executar(null);
    }

}

interface AcaoAExecutar {
    void executar(Object conta);
}