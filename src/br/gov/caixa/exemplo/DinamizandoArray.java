package br.gov.caixa.exemplo;

public class DinamizandoArray {

    public static void main(String[] args) {
        aumentarManualmente();

        aumentarComArrayCopy();
    }

    public static void aumentarManualmente() {
        System.out.println("Aumentar tamanho manualmente (novo array, populando cada posição do novo vetor)");
        int[] original = {1, 2, 3};
        int[] novo = new int[5];

        for (int i = 0; i < novo.length; i++) {
            novo[i] = original[i];
        }

        System.out.println(novo[0] + " | " + novo[1] + " | " + novo[2] + " | " + novo[3] + " | " + novo[4]);
    }

    public static void aumentarComArrayCopy() {
        System.out.println("Aumentar tamanho usando o método arraycopy (novo array, com System.arraycopy(...))");
        String[] original = {
                "Valor 51", "Valor 28", "Valor 63", "Valor 48", "Valor 75",
                "Valor 76", "Valor 97", "Valor 87", "Valor 19", "Valor 10"
        };
        String[] novo = new String[original.length];

        System.arraycopy(original, 0, novo, 0, original.length);

        System.out.println(String.join(" | ", novo));
    }

}
