package LetraA;

public class Montadora {

    private String nome_montadora;
    private String endereco;
    private double receita_montadora;

    public Montadora(String nome_montadora, String endereco) {
        this.nome_montadora = nome_montadora;
        this.endereco = endereco;
    }

    public double receita(double preco_veiculo_vendido){
        this.receita_montadora += preco_veiculo_vendido;
        return receita_montadora;
    }

    public String getNome_montadora() {
        return nome_montadora;
    }

    public void setNome_montadora(String nome_montadora) {
        this.nome_montadora = nome_montadora;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
