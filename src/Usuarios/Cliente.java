package Usuarios;
import Articulos.Articulo;

//creamos la clase "Cliente" que usa "extends porque hereda de la clase "Usuario"
public class Cliente extends Usuario{
    //creamos los atributos de la clase "Cliente"
    private Articulo articulo;
    private int numSocio;

    //creamos dos constructores, uno completo y otro vacío
    public Cliente(String nombreUsuario, String contraseya, int id, int anyoNacimiento, Articulo articulo, int numSocio) {
        super(nombreUsuario, contraseya, id, anyoNacimiento);
        this.articulo = articulo;
        this.numSocio = numSocio;
    }

    public Cliente() {
    }

    //creamos los getters y setters
    public Articulo getArticulo() {
        return articulo;
    }

    public void setArticulo(Articulo articulo) {
        this.articulo = articulo;
    }

    public int getNumSocio() {
        return numSocio;
    }

    public void setNumSocio(int numSocio) {
        this.numSocio = numSocio;
    }

    //creamos el metodo calcularPrecio de tipo double porque devolverá el precio total para un número de artículos
    // utilizamos getArticulo() y el metodo calcularPrecio para introducir los parámetros numArticulos y dias
    public double calcularPrecio(int numArticulos, int dias){
        return getArticulo().calcularPrecio(numArticulos, dias);
    }

    //finalmente, creamos el toString
    @Override
    public String toString() {
        return "Cliente " + this.getNombreUsuario() + " (" + this.getId() + ")";
    }
}
