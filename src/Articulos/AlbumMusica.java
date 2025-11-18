package Articulos;

//creamos la clase "AlbumMusica", que usa "extends" porque hereda de la clase "Articulo"
public class AlbumMusica extends Articulo{
    //creamos los atributos de la clase "AlbumMusica"
    private String autor;
    private int numCanciones;
    private boolean single;

    //creamos un constructor completo y otro vacío
    public AlbumMusica(String titulo, int anyoLanzamiento, double precioPorDia, String autor, int numCanciones, boolean single) {
        super(titulo, anyoLanzamiento, precioPorDia);
        this.autor = autor;
        this.numCanciones = numCanciones;
        this.single = single;
    }

    public AlbumMusica() {
    }

    // creamos los getters y los setters
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumCanciones() {
        return numCanciones;
    }

    public void setNumCanciones(int numCanciones) {
        this.numCanciones = numCanciones;
    }

    public boolean isSingle() {
        return single;
    }

    public void setSingle(boolean single) {
        this.single = single;
    }

    //creamos el metodo getDuracionTotal, con el parámetro duracionMedia de tipo double
    //para devolver la duración total del album, multiplicamos la duración media de las canciones por el número de las mismas
    public double getDuracionTotal(double duracionMedia){
        return duracionMedia * numCanciones;
    }

    //finalmente, creamos el toString
    @Override
    public String toString() {
        return "[Álbum] " + this.getTitulo() + ", de " + this.autor + " (" + this.getPrecioPorDia() + "/día)";
    }
}
