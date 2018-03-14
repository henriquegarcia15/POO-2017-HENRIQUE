package model;

public class Editor extends Usuario {

    private String nome;

    public Editor(String email, String senha, String nome) {
        super(email, senha);
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
