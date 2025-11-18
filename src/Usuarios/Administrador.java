package Usuarios;
import Articulos.Articulo;
import Usuarios.Cliente;

//creamos la clase "Administrador" que usa "extends" porque hereda de Usuario
public class Administrador extends Usuario{
    //creamos los atributos de la clase "Administrador"
    public enum rol{JEFE, VENDEDOR}
    private rol rol;

    //creamos dos constructores, uno completo y otro vacío
    public Administrador(String nombreUsuario, String contraseya, int id, int anyoNacimiento, rol rol) {
        super(nombreUsuario, contraseya, id, anyoNacimiento);
        this.rol = rol;
    }

    public Administrador() {
    }

    //creamos los getters y los setters
    public rol getRol() {
        return rol;
    }

    public void setRol(rol rol) {
        this.rol = rol;
    }

    //creamos el metodo asignarArticulo que utiliza .setArticulo para asignarle a un cliente un artículo, ambos son parámetros que introducimos
    public void asignarArticulo(Cliente cliente, Articulo articulo){
        cliente.setArticulo(articulo);
    }

    //de igual forma, utilizados .setArticulo en el metodo retirarArticulo e indicamos null para eloiminar el artículo del usuario
    public void retirarArticulo(Cliente cliente){
        cliente.setArticulo(null);
    }

    //
    @Override
    public String toString() {
        return "Administrador " + this.getNombreUsuario() + " (" + this.getId() +")";
    }
}
