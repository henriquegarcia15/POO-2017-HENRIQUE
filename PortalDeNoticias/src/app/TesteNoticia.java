package app;

import model.Area;
import model.Estado;
import model.Jornalista;
import model.Noticia;

public class TesteNoticia {
    public static void main(String[] args) {

        Jornalista j1 = new Jornalista("henrique@gmail.com", "1234", "Henrique Garcia");

        Noticia noticiaTeste = new Noticia(
                "Lançamento do S9",
                "Lorem ipsum dolor amet",
                j1,
                Area.TECNOLOGIA,
                Estado.CRIADA);

        j1.criarNoticia(noticiaTeste);

        System.out.println(noticiaTeste);
    }
}
