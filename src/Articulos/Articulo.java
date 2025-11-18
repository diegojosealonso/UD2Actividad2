package Articulos;

//creamos la clase "Artículo"
public class Articulo {
    //describimos los atributos de la clase "Artículo"
    private String titulo;
    private int anyoLanzamiento;
    private double precioPorDia;

    //creamos los construcotres, primero uno completo y luego otro vacío
    public Articulo(String titulo, int anyoLanzamiento, double precioPorDia) {
        this.titulo = titulo;
        this.anyoLanzamiento = anyoLanzamiento;
        this.precioPorDia = precioPorDia;
    }

    public Articulo() {
    }

    //a continuación, creamos todos los getters y setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnyoLanzamiento() {
        return anyoLanzamiento;
    }

    public void setAnyoLanzamiento(int anyoLanzamiento) {
        this.anyoLanzamiento = anyoLanzamiento;
    }

    public double getPrecioPorDia() {
        return precioPorDia;
    }

    public void setPrecioPorDia(double precioPorDia) {
        this.precioPorDia = precioPorDia;
    }

    //creamos un metodo de tipo double porque devuelve el precio total dados un número de artículos y un número de días
    // para ello, multiplicamos ambos parámetros por el precioPorDia
    public double calcularPrecio(int numArticulos, int dias){
        return dias * this.precioPorDia * numArticulos;
    }
    //finalmente, creamos el toString
    @Override
    public String toString() {
        return "[Articulo] " + this.titulo + " (" + this.precioPorDia + "/día)";
    }
}
