package br.senac.rn.questao4;

public class Pessoa {

    private String nome;
    private Integer idade;
    private Double peso;
    private Double altura;

    public Pessoa(String nome, Integer idade, Double peso, Double altura) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    }

    public void envelhecer(Integer qtdAnos) {
        Integer idadeComAcrescimo = idade + qtdAnos;
        if (idadeComAcrescimo <= 21) {
            for (int i = 0; i < qtdAnos; i++) {
                crescer(0.5);
            }
        } else {
            Integer auxiliar = 21 - idade;
            for (int i = 0; i < auxiliar; i++) {
                crescer(0.5);
            }
        }
        idade += qtdAnos;
    }

    public void engordar(Double qtdAcrescida) {
        peso += qtdAcrescida;
    }

    public void emagrecer(Double qtdDecrescida) {
        peso -= qtdDecrescida;
    }

    public void crescer(Double qtdAltura) {
        altura += qtdAltura;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", peso=" + peso +
                ", altura=" + altura +
                '}';
    }

}
