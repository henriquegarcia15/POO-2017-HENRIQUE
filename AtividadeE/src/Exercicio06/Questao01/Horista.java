package Exercicio06.Questao01;

public class Horista extends Diarista{

    public double calculaSalario(){
        return super.calculaSalario() / 24;
    }
}
