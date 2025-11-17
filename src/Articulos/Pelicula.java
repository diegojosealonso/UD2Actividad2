package Articulos;

public class Pelicula extends Articulo{
    private String director;
    private int duracion;

    public Pelicula(String titulo, int anyoLanzamiento, double precioPorDia, String director, int duracion) {
        super(titulo, anyoLanzamiento, precioPorDia);
        this.director = director;
        this.duracion = duracion;
    }

    public Pelicula() {
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public void getDuracionHorasYMinutos(){
        int horas = (int) this.duracion / 60;
        int minutos = (int) this.duracion%60;
        System.out.println(horas + " horas y " + minutos + " minutos");
    }

    public int getDuracionSegundos(){
        return (int)(this.duracion*60);
    }


    @Override
    public String toString() {
        return "[Película] " + this.getTitulo() + ", de " + this.director + " (" + this.getPrecioPorDia() + "/día)";
    }
}
