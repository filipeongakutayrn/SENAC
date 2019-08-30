package br.senac.rn.questao2;

public class TestaQuadrado {

    public static void main(String[] args) {

        Quadrado quadrado = new Quadrado();

        quadrado.lado = 5.0;

        System.out.println("Lado: " + quadrado.mostraLado());

        System.out.println("Área: " + quadrado.calculaArea());

        quadrado.mudaLado(10.0);

        System.out.println("Lado: " + quadrado.mostraLado());

        System.out.println("Área: " + quadrado.calculaArea());

    }

}
