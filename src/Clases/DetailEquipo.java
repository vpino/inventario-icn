package Clases;

/**
 *
 * @author vpino
 */
public class DetailEquipo {
    
    private String id_equipo;
    private String ci_cliente;
    private String placa_base;
    private String procesador;
    private String memoria;
    private String hdd;
    private String fuentep;
    private String respaldo;
    private String falla;

    public DetailEquipo(String id_equipo, String ci_cliente, String placa_base, String procesador, String memoria, String hdd, String fuentep, String respaldo, String falla) {
        this.id_equipo = id_equipo;
        this.ci_cliente = ci_cliente;
        this.placa_base = placa_base;
        this.procesador = procesador;
        this.memoria = memoria;
        this.hdd = hdd;
        this.fuentep = fuentep;
        this.respaldo = respaldo;
        this.falla = falla;
    }

    public String getId_equipo() {
        return id_equipo;
    }

    public void setId_equipo(String id_equipo) {
        this.id_equipo = id_equipo;
    }

    public String getCi_cliente() {
        return ci_cliente;
    }

    public void setCi_cliente(String ci_cliente) {
        this.ci_cliente = ci_cliente;
    }

    public String getPlaca_base() {
        return placa_base;
    }

    public void setPlaca_base(String placa_base) {
        this.placa_base = placa_base;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public String getMemoria() {
        return memoria;
    }

    public void setMemoria(String memoria) {
        this.memoria = memoria;
    }

    public String getHdd() {
        return hdd;
    }

    public void setHdd(String hdd) {
        this.hdd = hdd;
    }

    public String getFuentep() {
        return fuentep;
    }

    public void setFuentep(String fuentep) {
        this.fuentep = fuentep;
    }

    public String getRespaldo() {
        return respaldo;
    }

    public void setRespaldo(String respaldo) {
        this.respaldo = respaldo;
    }

    public String getFalla() {
        return falla;
    }

    public void setFalla(String falla) {
        this.falla = falla;
    }
    
    
    
    
}
