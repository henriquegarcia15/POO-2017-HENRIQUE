package Questao02e03e04.model;

// Questão 03

public class GerenciadorDeImpostoDeRenda {

    private double total;

    public void adiciona(Tributavel t){
        System.out.println("Adicionando tributável: " + t);

        this.total += t.calculaTributos();
    }

    public double getTotal() {
        return total;
    }
}
