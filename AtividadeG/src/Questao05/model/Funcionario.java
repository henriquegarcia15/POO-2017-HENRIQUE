package Questao05.model;

public abstract class Funcionario {

    protected double salario;

    public abstract double getBonificacao();

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
