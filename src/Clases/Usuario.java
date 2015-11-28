
package Clases;

import java.io.File;

/**
 *
 * @author victor
 */
public class Usuario {
    
    private String usuario;
    private String clave;
    private File ruta;

    public Usuario(String usuario, String clave, File ruta) {
        this.usuario = usuario;
        this.clave = clave;
        this.ruta = ruta;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public File getRuta() {
        return ruta;
    }

    public void setRuta(File ruta) {
        this.ruta = ruta;
    }

   


  
    
    
}
