package Clases;

/**
 *
 * @author vpino
 */
public class Cliente {
    
    private String nombres;
    private String apellidos;
    private String cedula;
    private String telefono;
    private String email;

    public Cliente(String nombres, String apellidos, String cedula, String telefono, String email) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.cedula = cedula;
        this.telefono = telefono;
        this.email = email;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
}
