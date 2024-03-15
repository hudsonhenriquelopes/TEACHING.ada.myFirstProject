package br.gov.caixa.exemplo;

import java.util.Objects;

public class MinhaAgenda {

    static class Contato {
        String nome;
        String sobrenome;
        String telefone;
        String email;

        public Contato(String nome, String sobrenome, String telefone, String email) {
            this.nome = nome;
            this.sobrenome = sobrenome;
            this.telefone = telefone;
            this.email = email;
        }

        @Override
        public boolean equals(Object object) {
            Contato contatoAComparar = (Contato) object;
            return this.nome.equals(contatoAComparar.nome);
        }

        @Override
        public String toString() {
            return "Contato{" +
                    "nome='" + nome + '\'' +
                    ", sobrenome='" + sobrenome + '\'' +
                    ", telefone='" + telefone + '\'' +
                    ", email='" + email + '\'' +
                    '}';
        }
    }

    public static void main(String[] args) {
        Contato contato1 = new Contato("Hudson","Henrique Lopes", "00 00 00000000", null);
        Contato contato2 = new Contato("Raphael", "", null, null);
        Contato contato3 = new Contato("hudson","henrique lopes", "123456789", null);

        System.out.println(contato1.toString());


    }
}
