package Exercicio06.Questao01;

public class Diarista extends Empregado {

    public double calculaSalario(){
        return super.calculaSalario() / 30;
    }
}
