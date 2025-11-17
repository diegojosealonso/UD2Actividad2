package Usuarios;
import Articulos.Articulo;
import Usuarios.Cliente;

public class Administrador extends Usuario{
    public enum rol{JEFE, VENDEDOR}
    private rol rol;

    public Administrador(String nombreUsuario, String contraseya, int id, int anyoNacimiento, rol rol) {
        super(nombreUsuario, contraseya, id, anyoNacimiento);
        this.rol = rol;
    }

    public Administrador() {
    }

    public rol getRol() {
        return rol;
    }

    public void setRol(rol rol) {
        this.rol = rol;
    }

    public void asignarArticulo(Cliente cliente, Articulo articulo){
        cliente.setArticulo(articulo);
    }

    public void retirarArticulo(Cliente cliente){
        cliente.setArticulo(null);
    }

    @Override
    public String toString() {
        return "Administrador " + this.getNombreUsuario() + " (" + this.getId() +")";
    }
}
