package Exercicio06.Questao06.model;

public class Funcionario extends Pessoa {

    private int matricula;
    private double salario;

    public double getSalarioPrimeiraParcela(){
        return this.salario * 0.06;
    }

    public double getSalarioSegundaParcela(){
        return this.salario * 0.04;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario > 0)
            this.salario = salario;
    }
}
