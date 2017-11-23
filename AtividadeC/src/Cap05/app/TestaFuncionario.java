package Cap05.app;

import Cap05.model.Data;
import Cap05.model.Funcionario;

import javax.swing.*;

public class TestaFuncionario {
    public static void main(String[] args) {

        Data dataF1 = new Data(23,03,2017);
        Funcionario f1 = new Funcionario(
                "Henrique",
                "Informática",
                740.00,
                dataF1,
                "3.530.868"
        );

        Data dataF2 = new Data(20,04,2017);
        Funcionario f2 = new Funcionario(
                "Garcia",
                "TI",
                1740.00,
                dataF2,
                "4.635.836"
        );

        JOptionPane.showMessageDialog(null,f1);
        JOptionPane.showMessageDialog(null,f2);
    }
}
