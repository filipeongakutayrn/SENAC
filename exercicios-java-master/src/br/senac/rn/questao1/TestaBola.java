package br.senac.rn.questao1;

public class TestaBola {

    public static void main(String[] args) {

        Bola bolaFutebol = new Bola();

        System.out.println(bolaFutebol.mostraCor());

        bolaFutebol.cor = "azul";
        bolaFutebol.circunferencia = 0.5;
        bolaFutebol.material = "couro";

        System.out.println(bolaFutebol.mostraCor());

        bolaFutebol.trocaCor("vermelho");

        System.out.println(bolaFutebol.mostraCor());

    }

}
