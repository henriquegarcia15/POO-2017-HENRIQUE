package com.henrique.calculamdia.model;

/**
 * Created by enriq on 14/03/2018.
 */

public class Bimestre {

    private double nota01;
    private double nota02;
    private int peso01;
    private int peso02;
    private double mediaPonderada;

    public Bimestre(double nota01, double nota02, int peso01, int peso02, double mediaPonderada) {
        this.nota01 = nota01;
        this.nota02 = nota02;
        this.peso01 = peso01;
        this.peso02 = peso02;
        this.mediaPonderada = mediaPonderada;
    }

    public double calcularMedia(double nota01, int peso01, double nota02, int peso02){
        return this.mediaPonderada = ((nota01 * peso01) + (nota02 * peso02))/(peso01 + peso02);
    }

    public String situacao(double mediaPonderada){
        if (mediaPonderada < 4){
            return "Sinto muito, você ficou reprovado";
        } else if (mediaPonderada > 6.9){
            return "Parabéns você aprovado com média";
        } else {
            return "Sinto muito, você ficou de prova final";
        }
    }


    public double getNota01() {
        return nota01;
    }

    public void setNota01(double nota01) {
        this.nota01 = nota01;
    }

    public double getNota02() {
        return nota02;
    }

    public void setNota02(double nota02) {
        this.nota02 = nota02;
    }

    public double getMediaPonderada() {
        return mediaPonderada;
    }

    public void setMediaPonderada(double mediaPonderada) {
        this.mediaPonderada = mediaPonderada;
    }
}
