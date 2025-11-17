package Usuarios;
import Articulos.Articulo;

public class Cliente extends Usuario{
    private Articulo articulo;
    private int numSocio;

    public Cliente(String nombreUsuario, String contraseya, int id, int anyoNacimiento, Articulo articulo, int numSocio) {
        super(nombreUsuario, contraseya, id, anyoNacimiento);
        this.articulo = articulo;
        this.numSocio = numSocio;
    }

    public Cliente() {
    }

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

    public double calcularPrecio(int numArticulos, int dias){
        return getArticulo().calcularPrecio(numArticulos, dias);
    }

    @Override
    public String toString() {
        return "Cliente " + this.getNombreUsuario() + " (" + this.getId() + ")";
    }
}
