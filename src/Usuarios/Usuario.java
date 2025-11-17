package Usuarios;

public class Usuario {
    private String nombreUsuario;
    private String contraseya;
    private int id;
    private int anyoNacimiento;

    public Usuario(String nombreUsuario, String contraseya, int id, int anyoNacimiento) {
        this.nombreUsuario = nombreUsuario;
        this.contraseya = contraseya;
        this.id = id;
        this.anyoNacimiento = anyoNacimiento;
    }

    public Usuario() {
    }

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

    public boolean esAdulto() {
        return 2025 - this.anyoNacimiento >= 18;
    }

    public boolean contrasenyaSegura() {
        return this.contraseya.length() >= 10;
    }

    @Override
    public String toString() {
        return this.nombreUsuario + " (" + this.id + ")";
    }
}
