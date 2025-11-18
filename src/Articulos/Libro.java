package Articulos;

//creamos la clase "Libro" que usa "extends" porque hereda de la clase "Artículo"
public class Libro extends Articulo{
    //describimos los atributos de la clase "Libro"
    private String autor;
    private int numPaginas;
    public enum Genero{MISTERIO, TERROR, ACCION, HISTORIA, FANTASIA}
    private Genero genero;

    //creamos dos constructores, uno completo y otro vacío
    public Libro(String titulo, int anyoLanzamiento, double precioPorDia, String autor, int numPaginas, Genero genero) {
        super(titulo, anyoLanzamiento, precioPorDia);
        this.autor = autor;
        this.numPaginas = numPaginas;
        this.genero = genero;
    }

    public Libro() {
    }

    //creamos un tercer constructor pero introduciendo el valor 100 para numPaginas manualmente
    public Libro(String titulo, int anyoLanzamiento, double precioPorDia, String autor, Genero genero) {
        super(titulo, anyoLanzamiento, precioPorDia);
        this.autor = autor;
        this.numPaginas = 100;
        this.genero = genero;
    }

    //creamos los getters y setters
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

    // creamos el metodo esLargo de tipo boolean porque devolverá true si el atributo numPaginas es mayor o igual que 200 y false si es menor
    public boolean esLargo(){
        return numPaginas>=200;
    }

    //finalmente, creamos el toString
    @Override
    public String toString() {
        return "[Libro] " + this.getTitulo() + ", de " + this.autor + " (" + this.getPrecioPorDia() + "/día)";
    }
}
