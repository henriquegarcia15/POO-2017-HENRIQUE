package app;

import model.AtualizadorDeContas;
import model.Conta;
import model.ContaCorrente;
import model.ContaPoupanca;

public class TestaAtualizadorDeContas {
    public static void main(String[] args) {

        Conta c = new ContaCorrente();
        ContaCorrente cc = new ContaCorrente();
        ContaPoupanca cp = new ContaPoupanca();

        c.deposita(1000);
        cc.deposita(1000);
        cp.deposita(1000);

        System.out.println("\nDepósito realizado.\n");

        AtualizadorDeContas adc = new AtualizadorDeContas(1);

        System.out.println("Atualizador de contas.\n");

        System.out.println("Conta normal: ");
        adc.roda(c);
        System.out.println("\nConta corrente: ");
        adc.roda(cc);
        System.out.println("\nConta poupança: ");
        adc.roda(cp);

        System.out.println("\nSaldo total: "+ adc.getSaldoTotal());
    }
}
