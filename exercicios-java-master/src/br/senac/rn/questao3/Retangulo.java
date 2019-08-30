package br.senac.rn.questao3;

public class Retangulo {

    Double base = 0.0;
    Double altura = 0.0;

    public Retangulo() {}

    public Retangulo(Double base, Double altura) {
        this.base = base;
        this.altura = altura;
    }

    void trocaAltura(Double novaAltura) {
        altura = novaAltura;
    }

    void trocaBase(Double novaBase) {
        base = novaBase;
    }

    Double mostraAltura() {
        return altura;
    }

    Double mostraBase() {
        return base;
    }

    Double calculaArea() {
        return base * altura;
    }

    Double calculaPerimetro() {
        return (base + altura) * 2;
    }

}
