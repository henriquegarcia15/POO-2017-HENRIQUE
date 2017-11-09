package LetraD;

public class Funcionario {

    private String nome;
    private String cpf;
    private int rg;
    private String data_nascimento;
    private double salario;
    private Cargo cargo;

    public Funcionario(String nome, String cpf, int rg, String data_nascimento, double salario, Cargo cargo) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.data_nascimento = data_nascimento;
        this.salario = salario;
        this.cargo = cargo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getRg() {
        return rg;
    }

    public void setRg(int rg) {
        this.rg = rg;
    }

    public String getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(String data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }
}
