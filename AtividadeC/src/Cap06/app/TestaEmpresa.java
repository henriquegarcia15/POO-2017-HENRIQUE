package Cap06.app;

import Cap06.model.Empresa;
import Cap06.model.Funcionario;

import javax.swing.*;

public class TestaEmpresa {
    public static void main(String[] args) {

        Empresa empresa = new Empresa("Walmart", "123456",3);

        for (int i = 0; i < 3; i++) {
            Funcionario f = new Funcionario();
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