package Questao04.model;

public class Quadrado extends FiguraGeometrica{

    private double lado;

    @Override
    public double calcularArea() {
        return Math.pow(getLado(), 2);
    }

    @Override
    public double calcularPerimetro() {
        return getLado()*4;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
}
