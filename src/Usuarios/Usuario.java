package Usuarios;

//creamos la clase "Usuario"
public class Usuario {
    //creamos los atributos de la clase "Usuario"
    private String nombreUsuario;
    private String contraseya;
    private int id;
    private int anyoNacimiento;

    //creamos dos atributos, uno completo y otro vacío
    public Usuario(String nombreUsuario, String contraseya, int id, int anyoNacimiento) {
        this.nombreUsuario = nombreUsuario;
        this.contraseya = contraseya;
        this.id = id;
        this.anyoNacimiento = anyoNacimiento;
    }

    public Usuario() {
    }

    //creamos los getters y los setters
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContraseya() {
        return contraseya;
    }

    public void setContraseya(String contraseya) {
        this.contraseya = contraseya;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAnyoNacimiento() {
        return anyoNacimiento;
    }

    public void setAnyoNacimiento(int anyoNacimiento) {
        this.anyoNacimiento = anyoNacimiento;
    }

    //creamos el metodo esAdulto de tipo boolean porque devolverá true si, al restarle a 2025 (año actual de referencia), la edad del usuario es mayor o igual a 18 y false si es menor
    public boolean esAdulto() {
        return 2025 - this.anyoNacimiento >= 18;
    }

    //creamos el metodo contrasenyaSegura de tipo boolean porque devolverá true si la contraseña tiene 10 o más caracteres y false si tiene menos
    //para ello, utilizamos la propiedad .lenght
    public boolean contrasenyaSegura() {
        return this.contraseya.length() >= 10;
    }

    //finalmente, creamos el toString
    @Override
    public String toString() {
        return this.nombreUsuario + " (" + this.id + ")";
    }
}
