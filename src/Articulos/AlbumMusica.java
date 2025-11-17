package Articulos;

public class AlbumMusica extends Articulo{
    private String autor;
    private int numCanciones;
    private boolean single;

    public AlbumMusica(String titulo, int anyoLanzamiento, double precioPorDia, String autor, int numCanciones, boolean single) {
        super(titulo, anyoLanzamiento, precioPorDia);
        this.autor = autor;
        this.numCanciones = numCanciones;
        this.single = single;
    }

    public AlbumMusica() {
    }

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

    public double getDuracionTotal(double duracionMedia){
        return duracionMedia * numCanciones;
    }

    @Override
    public String toString() {
        return "[Álbum] " + this.getTitulo() + ", de " + this.autor + " (" + this.getPrecioPorDia() + "/día)";
    }
}
