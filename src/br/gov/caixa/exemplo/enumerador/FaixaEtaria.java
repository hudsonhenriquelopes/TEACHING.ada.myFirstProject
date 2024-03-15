package br.gov.caixa.exemplo.enumerador;

public enum FaixaEtaria {
    CRIANCA(0, 12, "Criança"), // 0-12
    ADOLESCENTE(13, 17, "Adolescente"), // 13-17
    ADULTO(18, 60, "Adulto"), // 18-60
    IDOSO(61, 120, "Idoso"), // 61-120
    INVALIDO(-1, -1, "Opção inválida")
    ;

    int idadeInicial;
    int idadeFinal;
    String descricao;

    FaixaEtaria(int idadeInicial, int idadeFinal, String descricao){
        this.idadeInicial = idadeInicial;
        this.idadeFinal = idadeFinal;
        this.descricao = descricao;
    }

    public static void main(String[] args) {
        FaixaEtaria[] faixas = FaixaEtaria.values();
        // for (tipo nomeVariavel : conjunto_array_coleção)
        for (FaixaEtaria faixaEtaria : faixas) {
            faixaEtaria.name();
            FaixaEtaria fE = valueOf("CRIANCA"); // Eu já que é o FaixaEtaria.CRIANCA


            // ENUMERADOR: descricao (idadeInicial-idadeFinal)
            System.out.printf("%s: %s (%d-%d)%n", faixaEtaria, faixaEtaria.descricao, faixaEtaria.idadeInicial, faixaEtaria.idadeFinal);
        }
    }
}
