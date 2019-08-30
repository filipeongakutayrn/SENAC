package br.senac.rn.questao1;

public class Bola {

    String cor = "branco";
    Double circunferencia = 0.0;
    String material = "plastico";

    void trocaCor(String novaCor) {
        cor = novaCor;
    }

    String mostraCor() {
        return cor;
    }

}
