package Questao04.app;

import Questao04.model.FiguraGeometrica;
import Questao04.model.Quadrado;
import Questao04.model.Triangulo;
import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;

public class TesteFiguraGeometrica {
    public static void main(String[] args) {

        Quadrado quadrado = new Quadrado();
        quadrado.setLado(5);

        JOptionPane.showMessageDialog(null, "Área do Quadrado: " + quadrado.calcularArea());
        JOptionPane.showMessageDialog(null, "Perímetro do Quadrado: " + quadrado.calcularPerimetro());

        Triangulo trianguloEquilatero = new Triangulo();
        trianguloEquilatero.setAltura(2);
        trianguloEquilatero.setBase(3);

        JOptionPane.showMessageDialog(null,"Área do Triângulo: " + trianguloEquilatero.calcularArea());
        JOptionPane.showMessageDialog(null,"Perímetro do Triângulo: " + trianguloEquilatero.calcularPerimetro());
    }
}
