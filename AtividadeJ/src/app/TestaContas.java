package app;

import model.Conta;
import model.ContaCorrente;
import model.ContaPoupanca;

public class TestaContas {
    public static void main(String[] args) {

//        Conta c = new ContaCorrente();
        Conta cc = new ContaCorrente();
        cc.deposita(100);

        Conta cp = new ContaPoupanca();
        cp.deposita(100);

//
//        c.deposita(1000);
//        cc.deposita(1000);
//        cp.deposita(1000);
//
//        c.atualiza(0.01);
//        cc.atualiza(0.01);
//        cp.atualiza(0.01);
//
//        System.out.println(c.getSaldo());
//        System.out.println(cc.getSaldo());
//        System.out.println(cp.getSaldo());

//        try {
//            cc.saca(100);
//        } catch (IllegalArgumentException e) {
//            System.out.println(e.getMessage());
//        }


        cc.saca(50);
        System.out.println("consegui sacar da corrente");

        cp.saca(50);
        System.out.println("consegui sacar da poupança");

    }
}
