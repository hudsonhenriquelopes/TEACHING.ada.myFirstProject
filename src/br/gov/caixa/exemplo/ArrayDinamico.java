package br.gov.caixa.exemplo;

public class ArrayDinamico {

    private String array[];
    private static final String TEXTO_PADRAO = "Texto padrão";

    // modificador nomeDaClasse(parametros?) {}
    public ArrayDinamico(int length) {
        this.array = new String[length];

        // for (iniciarVariavelContador; condicao; incrementarVariavel) { }
        for (int i = 0; i < this.array.length; i++) {
            this.array[i] = TEXTO_PADRAO;
        }
    }

    public int getLength() {
        return this.array.length;
    }

    public void adicionar(String novoItem) {
        String[] novoArray = new String[getLength() + 1];

        // System.arraycopy(array, 0, novoArray, 0, getLength());
        for (int i = 0; i < array.length; i++) {
            novoArray[i] = array[i];
        }

        // getLength(); // está se referindo ao this.array.length

        // String[] arrayOrig = { "Texto", "Texto", "Texto" } //// length = 3 /// posições: 0,1,2
        // String[] arrayNovo = { "Texto", "Texto", "Texto", null } //// length = 4 /// posições: 0,1,2,3

        novoArray[getLength()] = novoItem; // nesse momento, o getLength() retorna this.array.length
        this.array = novoArray;

        // getLength(); // está se referindo ao novoArray.length que se tornou o this.array.length
    }

    public boolean contemTexto(String texto) {
        for (String s : this.array) {
            if (s.equals(texto)) {
                return true;
            }
        }

        return false;
    }

    public void imprimirValores() {
        for (String s : this.array) {
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        ArrayDinamico arrayDinamico = new ArrayDinamico(2);
        arrayDinamico.imprimirValores();

        System.out.println("------------------------");

        arrayDinamico.adicionar("Novo valor");
        arrayDinamico.imprimirValores();

        System.out.println("Contém o valor? " + arrayDinamico.contemTexto("Novo valor"));

        System.out.println("Novo valor" == "Novo valor");
        System.out.println("Novo valor".equals("novo valor"));
        System.out.println("Novo valor".equalsIgnoreCase("Novo valor"));
    }
}
