package model;

public enum Area {

    ECONOMIA("Economia"),
    POLÍTICA("Política"),
    ESPORTE("Esporte"),
    ENTRETENIMENTO("Entretenimento"),
    TECNOLOGIA("Tecnologia");

    private String descricao;

    Area(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
