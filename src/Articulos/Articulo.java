package Articulos;

public class Articulo {
    private String titulo;
    private int anyoLanzamiento;
    private double precioPorDia;

    public Articulo(String titulo, int anyoLanzamiento, double precioPorDia) {
        this.titulo = titulo;
        this.anyoLanzamiento = anyoLanzamiento;
        this.precioPorDia = precioPorDia;
    }

    public Articulo() {
    }

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

    public double calcularPrecio(int numArticulos, int dias){
        return dias * this.precioPorDia * numArticulos;
    }

    @Override
    public String toString() {
        return "[Articulo] " + this.titulo + " (" + this.precioPorDia + "/día)";
    }
}
