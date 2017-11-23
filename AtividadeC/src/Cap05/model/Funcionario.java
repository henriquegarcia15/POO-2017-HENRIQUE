package Cap05.model;

public class Funcionario {
    private String nome;
    private String departamento;
    private double salario;
    private Data dataDeEntrada;
    private String rg;

    public Funcionario(String nome, String departamento, double salario, Data dataDeEntrada, String rg) {
        this.nome = nome;
        this.departamento = departamento;
        this.salario = salario;
        this.dataDeEntrada = dataDeEntrada;
        this.rg = rg;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Data getDataDeEntrada() {
        return dataDeEntrada;
    }

    public void setDataDeEntrada(Data dataDeEntrada) {
        this.dataDeEntrada = dataDeEntrada;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public void recebeAumento(double aumento){
        this.salario += aumento;
    }

    public double calculaGanhoAnual(){
        return this.salario * 12;
    }

    @Override
    public String toString(){
        String s = "\n------- FUNCIONÁRIOS -------\n";
        s += "Nome: "+ this.getNome() +"\n";
        s += "Departamento: "+ this.getDepartamento() +"\n";
        s += "Salário: R$ "+ this.getSalario() +"\n";
        s += "Data de Entrada: "+ this.getDataDeEntrada() +"\n";
        s += "RG: "+ this.getRg() +"\n";

        return s;
    }
}
