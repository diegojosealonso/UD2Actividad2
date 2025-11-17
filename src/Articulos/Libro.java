package Articulos;

public class Libro extends Articulo{
    private String autor;
    private int numPaginas;
    public enum Genero{MISTERIO, TERROR, ACCION, HISTORIA, FANTASIA}
    private Genero genero;

    public Libro(String titulo, int anyoLanzamiento, double precioPorDia, String autor, int numPaginas, Genero genero) {
        super(titulo, anyoLanzamiento, precioPorDia);
        this.autor = autor;
        this.numPaginas = numPaginas;
        this.genero = genero;
    }

    public Libro() {
    }

    public Libro(String titulo, int anyoLanzamiento, double precioPorDia, String autor, Genero genero) {
        super(titulo, anyoLanzamiento, precioPorDia);
        this.autor = autor;
        this.numPaginas = 100;
        this.genero = genero;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public boolean esLargo(){
        return numPaginas>=200;
    }

    @Override
    public String toString() {
        return "[Libro] " + this.getTitulo() + ", de " + this.autor + " (" + this.getPrecioPorDia() + "/día)";
    }
}
