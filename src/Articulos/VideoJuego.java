package Articulos;

public class VideoJuego extends Articulo {
    private String director;
    private String plataformas;
    private int pegi;

    public VideoJuego(String titulo, int anyoLanzamiento, double precioPorDia, String director, String plataformas, int pegi) {
        super(titulo, anyoLanzamiento, precioPorDia);
        this.director = director;
        this.plataformas = plataformas;
        this.pegi = pegi;
    }

    public VideoJuego() {
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getPlataformas() {
        return plataformas;
    }

    public void setPlataformas(String plataformas) {
        this.plataformas = plataformas;
    }

    public int getPegi() {
        return pegi;
    }

    public void setPegi(int pegi) {
        this.pegi = pegi;
    }

    public boolean paraAdultos(){
        return this.pegi >= 18;
    }

    public boolean esApto(int edad) {
        return edad >= this.pegi;
    }

    @Override
    public String toString() {
        return "[Videojuego] " + this.getTitulo() + ", de " + this.director + " (" + this.getPrecioPorDia() + "/día)";
    }
}
