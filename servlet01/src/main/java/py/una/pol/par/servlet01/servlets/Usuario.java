package py.una.pol.par.servlet01.servlets;

public class Usuario {
    private String ci;
    private String nombre;
    private String apellido;
    private String telefono;

    public Usuario(String ci, String nombre, String apellido, String telefono) {
        this.ci = ci;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
    }

    public String getCi() {
        return ci;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getTelefono() {
        return telefono;
    }
}
