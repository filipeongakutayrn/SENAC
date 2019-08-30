package br.senac.rn.questao2;

public class Quadrado {

    Double lado = 0.0;

    void mudaLado(Double novoLado) {
        lado = novoLado;
    }

    Double mostraLado() {
        return lado;
    }

    Double calculaArea() {
        return lado * lado;
    }

}
