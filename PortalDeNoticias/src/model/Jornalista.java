package model;

public class Jornalista extends Usuario {

    private String nome;
    private Noticia noticia;

    public Jornalista(String email, String senha, String nome) {
        super(email, senha);
        this.nome = nome;
    }

    public Noticia criarNoticia(Noticia noticia){
        return noticia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        String s = "" + getNome();

        return s;
    }
}
