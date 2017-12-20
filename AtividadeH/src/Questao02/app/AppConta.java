package Questao02.app;

import Questao02.model.*;

public class AppConta {

    public static void main(String[] args) {

        Conta conta;
        conta = new ContaPoupanca(new Pessoa("Rogerio da Silva"));
        conta.depositar(1500);

        ContaCorrente contaCorrente = new ContaUniversitaria(new Pessoa("Joao Silva"));
        contaCorrente.depositar(12000);
        contaCorrente.sacar(1000);

        ContaPoupanca contaPoupanca = new ContaPoupanca(new Pessoa("Marieta"));
        contaCorrente.transferir(3000, contaPoupanca);

        System.out.println(conta.obterSituacao());
        System.out.println(contaCorrente.obterSituacao());
        System.out.println(contaPoupanca.obterSituacao());
    }
}





