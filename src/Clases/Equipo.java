package Clases;

import java.io.File;
import java.util.Date;

/**
 *
 * @author victor
 */

public class Equipo {
    
    private String id;
    private File qr;
    private Date fecha;
    private String falla;
    private File equipo;

    public Equipo(String id, File qr, Date fecha, String falla, File equipo) {
        this.id = id;
        this.qr = qr;
        this.fecha = fecha;
        this.falla = falla;
        this.equipo = equipo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public File getQr() {
        return qr;
    }

    public void setQr(File qr) {
        this.qr = qr;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getFalla() {
        return falla;
    }

    public void setFalla(String falla) {
        this.falla = falla;
    }

    public File getEquipo() {
        return equipo;
    }

    public void setEquipo(File equipo) {
        this.equipo = equipo;
    }
    
    
    
}
