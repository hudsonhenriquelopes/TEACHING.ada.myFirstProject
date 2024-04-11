package br.gov.caixa.exemplo;

import br.gov.caixa.projeto.model.ContaCorrente;

import java.util.HashMap;
import java.util.Map;

public class ContainerComChaves {
    public static void main(String[] args) {
        Map<String, ArrayDinamico> a = new HashMap<>();
        ArrayDinamico conteudo = a.get("");
    }

    public static void main2(String[] args) {
        Map<Integer, ContaCorrente> a = new HashMap<>();

    }
}
