package Cap06.model;

public class Funcionario {

    private String nome;
    private double salario;
    private String rg;
    private int indicador = 1;

    public Funcionario() {

    }

    public Funcionario(String nome, double salario, String rg) {
        this.nome = nome;
        this.salario = salario;
        this.rg = rg;
    }

    public int getIndicador() {
        return indicador++;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getRg() {
        return rg;
    }

    public double getGanhoAnual(){
        return this.salario * 12;
    }

    @Override
    public String toString(){
        String s = "\n------- FUNCIONÁRIOS -------\n";
        s += "Nome: "+ this.getNome() +"\n";
        s += "Salário: R$ "+ this.getSalario() +"\n";
        s += "RG: "+ this.getRg() +"\n";

        return s;
    }
}
