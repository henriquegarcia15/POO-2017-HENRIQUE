package model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class Noticia {

    private String titulo;
    private String corpo;
    private Jornalista autor;
    private Area area;
    private Estado estado;

    public Noticia(String titulo, String corpo, Jornalista autor, Area area, Estado estado) {
        this.titulo = titulo;
        this.corpo = corpo;
        this.autor = autor;
        this.area = area;
        this.estado = estado;
    }

    public void alterarEstado(Estado novoEstado){
        this.estado = novoEstado;

        // pegar data e hora da mudança de estado
        LocalDateTime dataHora = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter
                .ofLocalizedDateTime(FormatStyle.SHORT)
                .withLocale(new Locale("pt", "br"));
        dataHora.format(formatter); // 14/03/2018 10:30
    }

    @Override
    public String toString() {
        String s = "\n-------------------------------------------";
        s += "\nTítulo: " + getTitulo();
        s += "\nCorpo: " + getCorpo();
        s += "\nAutor: " + getAutor();
        s += "\nArea: " + getArea();
        s += "\nEstado: " + getEstado();
        s += "\n-------------------------------------------\n";

        return s;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCorpo() {
        return corpo;
    }

    public void setCorpo(String corpo) {
        this.corpo = corpo;
    }

    public Jornalista getAutor() {
        return autor;
    }

    public void setAutor(Jornalista autor) {
        this.autor = autor;
    }

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
}
