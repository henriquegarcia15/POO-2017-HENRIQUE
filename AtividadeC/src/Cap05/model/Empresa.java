package Cap05.model;

public class Empresa {

    private String nome;
    private String cnpj;
    private Funcionario[] empregados;
    private int pos = 0;

    public Empresa(String nome, String cnpj) {
        this.nome = nome;
        this.cnpj = cnpj;
    }

    public void adiciona(Funcionario f){
        if (f.getDepartamento() != null){
            this.empregados[pos] = f;
            pos++;
        }
    }
}
