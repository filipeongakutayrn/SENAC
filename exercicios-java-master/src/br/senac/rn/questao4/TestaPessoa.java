package br.senac.rn.questao4;

public class TestaPessoa {

    public static void main(String[] args) {

        Pessoa joao = new Pessoa("João", 5, 15.0, 110.0);

        System.out.println(joao);

        joao.envelhecer(10);

        System.out.println(joao);

        joao.envelhecer(10);

        System.out.println(joao);

        joao.envelhecer(10);

        System.out.println(joao);

        joao.engordar(30.0);

        System.out.println(joao);

    }

}
