package Articulos;

//creamos la clase "VideoJuego" que usa "extends" porque hereda de la clase "Artículo"
public class VideoJuego extends Articulo {
    //creamos los atributos de la clase "VideoJuego"
    private String director;
    private String plataformas;
    private int pegi;

    //creamos dos constructores, uno completo y otro vacío
    public VideoJuego(String titulo, int anyoLanzamiento, double precioPorDia, String director, String plataformas, int pegi) {
        super(titulo, anyoLanzamiento, precioPorDia);
        this.director = director;
        this.plataformas = plataformas;
        this.pegi = pegi;
    }

    public VideoJuego() {
    }

    //creamos los getters y los setters
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

    //creamos el metodo paraAdultos de tipo boolean porque devuelve true si el pegi es mayor o igual a 18 y false si es menor
    public boolean paraAdultos(){
        return this.pegi >= 18;
    }

    //creamos otro metodo de tipo boolean porque devolverá true si la edad, un parámetro que introducimos, es mayor o igual al pegi y false si es menor
    public boolean esApto(int edad) {
        return edad >= this.pegi;
    }

    //finalmente, creamos el toString
    @Override
    public String toString() {
        return "[Videojuego] " + this.getTitulo() + ", de " + this.director + " (" + this.getPrecioPorDia() + "/día)";
    }
}
