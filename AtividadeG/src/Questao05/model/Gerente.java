package Questao05.model;

public class Gerente extends Funcionario {

    private double salario;

    @Override
    public double getBonificacao() {
        return this.salario * 1.4 + 1000;
    }

    @Override
    public double getSalario() {
        return salario;
    }

    @Override
    public void setSalario(double salario) {
        this.salario = salario;
    }
}
