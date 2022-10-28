package guia.poo.entidades;

public class Libro {

    public String ISBN;

    public String Titulo;

    public String Autor;

    public int NumeroPag;

    public Libro() {

    }

    public Libro(String Titulo, String Autor, int NumeroPag, String ISBN) {

        this.Titulo = Titulo;
        this.Autor = Autor;
        this.NumeroPag = NumeroPag;
        this.ISBN = ISBN;

    }

    @Override
    public String toString() {
        return "Libro{" + "ISBN= " + ISBN + ", Titulo= " + Titulo + ", Autor= " + Autor + ", NumeroPag= " + NumeroPag + '}';
    }

}
