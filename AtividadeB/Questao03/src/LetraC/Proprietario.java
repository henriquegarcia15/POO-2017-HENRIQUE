package LetraC;

public class Proprietario {

    private String nome;
    private int cpf;
    private double idade;

    public Proprietario(String nome, int cpf, double idade) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public double getIdade() {
        return idade;
    }

    public void setIdade(double idade) {
        this.idade = idade;
    }
}
