package Questao02e03e04.app;

import Questao02e03e04.model.ContaCorrente;
import Questao02e03e04.model.GerenciadorDeImpostoDeRenda;
import Questao02e03e04.model.SeguroDeVida;

public class TestaGerenciador {
    public static void main(String[] args) {

        // Questão 03

        GerenciadorDeImpostoDeRenda gerenciador = new GerenciadorDeImpostoDeRenda();

        SeguroDeVida sv = new SeguroDeVida();
        gerenciador.adiciona(sv);

        ContaCorrente cc = new ContaCorrente();
        cc.depositar(1000);
        gerenciador.adiciona(cc);

        System.out.println(gerenciador.getTotal());

        System.out.printf("O saldo é: %.2f ", cc.getSaldo());
    }
}
