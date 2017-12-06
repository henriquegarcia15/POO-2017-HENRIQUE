package Exercicio06.Questao03.app;

import Exercicio06.Questao03.model.Animal;
import Exercicio06.Questao03.model.Bovino;

public class TestaAnimais {
    public static void main(String[] args) {

        // Questão 04 - a) o problema é que está sendo requerido o nome de uma especie
        //                 e não a quantidade

        Animal a = new Bovino();
        a.setEspecie();
    }
}
