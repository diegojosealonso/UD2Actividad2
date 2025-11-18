package Articulos;

//creamos la clase "Película" y utilizamos extends porque hereda de la clase "Artículo"
public class Pelicula extends Articulo{
    //describimos los atributos de la clase "Película"
    private String director;
    private int duracion;

    //creamos un constructor completo y otro vacío
    public Pelicula(String titulo, int anyoLanzamiento, double precioPorDia, String director, int duracion) {
        super(titulo, anyoLanzamiento, precioPorDia);
        this.director = director;
        this.duracion = duracion;
    }

    public Pelicula() {
    }

    //creamos los getters y los setters
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

    //creamos el metodo getDuracionHorasYMinutos, que muestra por consola la duración de la película en horas y minutos
    public void getDuracionHorasYMinutos(){
        //para calcular la duración en horas dividimos la duración, que viene dada en minutos, entre 60
        int horas = (int) this.duracion / 60;
        //para calcular los minutos usamos "%" para indicar que es el resto de dividir la duración entre 60
        int minutos = (int) this.duracion%60;
        //hacemos un System.out.println porque el metodo muestra por pantalla los datos calculados
        System.out.println(horas + " horas y " + minutos + " minutos");
    }

    //creamos otro metodo que devuelve la duración en segundos
    public int getDuracionSegundos(){
        //para ello, utilizamos return, para devolver la multiplicación de la duración por 60
        return (int)(this.duracion*60);
    }

    //finalmente, creamos el toString
    @Override
    public String toString() {
        return "[Película] " + this.getTitulo() + ", de " + this.director + " (" + this.getPrecioPorDia() + "/día)";
    }
}
