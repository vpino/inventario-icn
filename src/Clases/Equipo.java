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
    private File pictureOut;
    private File pictureInside;

    public Equipo(String id, File qr, Date fecha, File pictureOut, File pictureInside) {
        this.id = id;
        this.qr = qr;
        this.fecha = fecha;
        this.pictureOut = pictureOut;
        this.pictureInside = pictureInside;
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

    public File getPictureOut() {
        return pictureOut;
    }

    public void setPictureOut(File pictureOut) {
        this.pictureOut = pictureOut;
    }

    public File getPictureInside() {
        return pictureInside;
    }

    public void setPictureInside(File pictureInside) {
        this.pictureInside = pictureInside;
    }
    
    
}
