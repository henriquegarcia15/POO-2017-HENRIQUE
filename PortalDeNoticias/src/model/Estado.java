package model;

public enum Estado {

    CRIADA("Criada"),
    REVISAO("Pronta para revisão"),
    PUBLICADA("Publicada"),
    DESATIVADA("Desativada");

    private String descricao;

    Estado(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
