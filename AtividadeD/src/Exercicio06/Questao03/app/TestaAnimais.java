package Exercicio06.Questao03.app;

import Exercicio06.Questao03.model.Animal;
import Exercicio06.Questao03.model.Bovino;
import Exercicio06.Questao03.model.Peixe;

public class TestaAnimais {
    public static void main(String[] args) {

        // Questão 04 - a) o problema é que Animal não herda de Bovino
        //                 por isso que acontece o erro.
        //
        //                 Animal a = new Bovino();
        //                 a.setProducaoLeite(5);

        // Solução
        Bovino a = new Bovino();
        a.setProducaoLeite(5);

        // Questão 04 - b) não é possível devido à incompatibilidade de tipos
        //                 Peixe p = new Animal();

        //Solução
        Peixe p = (Peixe) new Animal();
    }
}
