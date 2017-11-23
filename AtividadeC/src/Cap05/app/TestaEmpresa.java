package Cap05.app;

import Cap05.model.Data;
import Cap05.model.Empresa;
import Cap05.model.Funcionario;

public class TestaEmpresa {
    public static void main(String[] args) {

        Empresa empresa = new Empresa();

        Data dataF1 = new Data(23,3,2017);
        Funcionario f1 = new Funcionario(
                "Henrique",
                "Informática",
                740.00,
                dataF1,
                "3.530.868"
        );

        Data dataF2 = new Data(25,9,2017);
        Funcionario f2 = new Funcionario(
                "Silva",
                "Administração",
                940.00,
                dataF2,
                "3.530.868"
        );

        Data dataF3 = new Data(13,10,2017);
        Funcionario f3 = new Funcionario(
                "Garcia",
                "Contabilidade",
                840.00,
                dataF3,
                "3.530.868"
        );
    }
}
