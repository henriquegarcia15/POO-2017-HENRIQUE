package LetraA;

public class Veiculo {

    private String nome;
    private double preco;
    private double ano;
    private double numero_chassi;
    private Montadora montadora;

    public Veiculo(String nome, double preco, double ano, double numero_chassi, Montadora montadora) {
        this.nome = nome;
        this.preco = preco;
        this.ano = ano;
        this.numero_chassi = numero_chassi;
        this.montadora = montadora;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getAno() {
        return ano;
    }

    public void setAno(double ano) {
        this.ano = ano;
    }

    public double getNumero_chassi() {
        return numero_chassi;
    }

    public void setNumero_chassi(double numero_chassi) {
        this.numero_chassi = numero_chassi;
    }
}
