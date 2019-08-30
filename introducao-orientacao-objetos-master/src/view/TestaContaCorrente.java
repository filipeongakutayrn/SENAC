package view;

import model.ContaCorrente;

public class TestaContaCorrente {

    public static void main(String[] args) {

        ContaCorrente contaFlavio = new ContaCorrente();

        contaFlavio.setTitular("Flavio Araujo");
        contaFlavio.setAgencia("1234-8");
        contaFlavio.setNumero("4564-4");

        contaFlavio.deposita(800.0);

        System.out.println(contaFlavio);

        ContaCorrente contaCaio = new ContaCorrente();

        contaCaio.setTitular("Caio");
        contaCaio.setNumero("4568-7");
        contaCaio.setAgencia("1478-3");
        contaCaio.setLimite(500.0);

        contaCaio.deposita(1000.0);

        System.out.println(contaCaio);

        contaCaio.transfere(contaFlavio, 1200.0);

        System.out.println(contaFlavio);

        System.out.println(contaCaio);


    }

}
