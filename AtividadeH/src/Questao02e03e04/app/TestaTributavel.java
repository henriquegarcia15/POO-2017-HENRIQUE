package Questao02e03e04.app;

import Questao02e03e04.model.ContaCorrente;
import Questao02e03e04.model.Tributavel;

public class TestaTributavel {
    public static void main(String[] args) {

        ContaCorrente cc = new ContaCorrente();
        cc.depositar(250);
        System.out.println(cc.calculaTributos());

        // teste de polimorfismo
        Tributavel t = cc;
        System.out.println(t.calculaTributos());
    }
}





