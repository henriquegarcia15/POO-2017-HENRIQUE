package Questao05.app;

import Questao05.model.Diretor;
import Questao05.model.Gerente;

import javax.swing.*;

public class TestaFuncionario {
    public static void main(String[] args) {

        Gerente gerente = new Gerente();
        gerente.setSalario(100);

        JOptionPane.showMessageDialog(null, "Salário do Gerente: " + gerente.getSalario());
        JOptionPane.showMessageDialog(null, "Bonificação do Gerente: " + gerente.getBonificacao());

        Diretor diretor = new Diretor();
        diretor.setSalario(200);

        JOptionPane.showMessageDialog(null, "Salário do Diretor: " + gerente.getSalario());
        JOptionPane.showMessageDialog(null, "Bonificação do Diretor: " + gerente.getBonificacao());
    }
}
