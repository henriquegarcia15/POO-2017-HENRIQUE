package Cap05.app;

import Cap05.model.Data;
import Cap05.model.Empresa;
import Cap05.model.Funcionario;

import javax.swing.*;

public class TestaEmpresa {
    public static void main(String[] args) {

        Empresa empresa = new Empresa("Walmart","123456");

        for (int i = 0; i < 3; i++) {
            Data dataF1 = new Data(23,3,2017);
            Funcionario f = new Funcionario(
                    "Henrique",
                    "Informática",
                    740.00 + i * 100,
                    dataF1,
                    "3.530.868"
            );
            empresa.adiciona(f);

            /*
            Data dataF2 = new Data(25,9,2017);
            Funcionario f2 = new Funcionario(
                    "Silva",
                    "Administração",
                    940.00,
                    dataF2,
                    "3.530.868"
            );
            empresa.adiciona(f2);


            Data dataF3 = new Data(13,10,2017);
            Funcionario f3 = new Funcionario(
                    "Garcia",
                    "Contabilidade",
                    840.00,
                    dataF3,
                    "3.530.868"
            );
            empresa.adiciona(f3);
            */
        }

        JOptionPane.showMessageDialog(null,empresa);
    }
}