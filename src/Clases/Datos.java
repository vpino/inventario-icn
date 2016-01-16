package Clases;

/**
 *
 * @author Victor Pino
 */
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Datos {

    private Connection con;

    public Datos() {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost/icn";
            con = DriverManager.getConnection(url, "root", "");
        } catch (Exception ex) {
            Logger.getLogger(Datos.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public Connection getCon() {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost/icn";
            con = DriverManager.getConnection(url, "root", "11");
            return con;
        } catch (Exception ex) {
            Logger.getLogger(Datos.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public ResultSet validarUsuario(String usuario, String clave) {
        try {
            /* Definimos la consulta en la base datos
             select 1 significa que si hay registro devuelve 1 si no 0 */
            String sql = "SELECT * FROM usuarios "
                    + "WHERE nom_usuario = '" + usuario + "'"
                    + "AND clave = '" + clave + "'";

            con.setAutoCommit(false);

            /* Creamos el statement para poder enviarle la sentencia sql */
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);

            con.commit();

            return rs;

        } catch (SQLException ex) {
            Logger.getLogger(Datos.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

    }

    /* Funcion para insertar un usuario a la base de datos la cual recibe
     como parametro un OBJETO de la clase Usuario */
    public boolean agregarUsuario(Usuario usuario) {
        try {
            /* Definimos el codigo sql que queremos ejecutar. En este caso es un
             insert a la tabla usuarios */
            String sql = "INSERT INTO usuarios (nom_usuario, clave, imagen) VALUES(?,?,?)";

            con.setAutoCommit(false);

            /* El PreparedStatement cree un cuadro donde se puede insertar codigo
             sql, el statement se podria decir que es el cuadro en blanco que
             te da el phpmyadmin para insertar codigo sql. */
            PreparedStatement ps = con.prepareStatement(sql);

            FileInputStream binario = new FileInputStream(usuario.getRuta());

            ps.setString(1, usuario.getUsuario());
            ps.setString(2, usuario.getClave());
            ps.setBinaryStream(3, binario, (int) usuario.getRuta().length());

            /* Una vez creado el statement el cuadrito mandamos a ejecutar el 
             codigo sql que definimos en la variable sql. */
            ps.executeUpdate();

            con.commit();

            return true;

        } catch (Exception ex) {
            Logger.getLogger(Datos.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    /* Funcion para insertar un equipo a la base de datos la cual recibe
     como parametro un OBJETO de la clase Equipo */
    public boolean agregarEquipo(Equipo equipo) {
        try {
            /* Definimos el codigo sql que queremos ejecutar. En este caso es un
             insert a la tabla usuarios */
            String sql = "INSERT INTO equipos (id_equipo, equipo_qr, fecha, falla, equipo)"
                    + " VALUES(?,?,?,?,?)";

            con.setAutoCommit(false);

            /* El PreparedStatement cree un cuadro donde se puede insertar codigo
             sql, el statement se podria decir que es el cuadro en blanco que
             te da el phpmyadmin para insertar codigo sql. */
            PreparedStatement ps = con.prepareStatement(sql);

            FileInputStream qr = new FileInputStream(equipo.getQr());

            FileInputStream equi = new FileInputStream(equipo.getEquipo());

            ps.setString(1, equipo.getId());
            ps.setBinaryStream(2, qr, (int) equipo.getQr().length());
            ps.setString(3, Utilidades.formateDate(equipo.getFecha()));
            ps.setString(4, equipo.getFalla());
            ps.setBinaryStream(5, equi, (int) equipo.getEquipo().length());

            /* Una vez creado el statement el cuadrito mandamos a ejecutar el 
             codigo sql que definimos en la variable sql. */
            ps.executeUpdate();

            con.commit();

            return true;

        } catch (Exception ex) {
            Logger.getLogger(Datos.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public boolean modificarProveedor(int id, String nombre, String telefono,
            String descripcion) {

        try {
            String sql = "UPDATE proveedor SET  "
                    + " nom_prove = '" + nombre + "', "
                    + " tele_prove = '" + telefono + "', "
                    + " direcc_prove = '" + descripcion + "' "
                    + " WHERE id_proveedor = " + id + " ";

            Statement st = con.createStatement();
            st.executeUpdate(sql);

            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Datos.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public boolean modificarUsuario(String usuario, String clave) {

        try {
            String sql = "UPDATE usuarios SET  "
                    + " clave = '" + clave + "'"
                    + " WHERE usuario = '" + usuario + "' ";

            Statement st = con.createStatement();
            st.executeUpdate(sql);

            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Datos.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public boolean eliminarUsuario(String usuario) {

        try {
            String sql = "DELETE FROM usuarios WHERE usuario = '" + usuario + "' ";

            Statement st = con.createStatement();
            st.executeUpdate(sql);

            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Datos.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public int getIdUsuario() {
        try {
            String sql = "SELECT MAX(id_usuario) AS num FROM usuarios";

            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {
                return rs.getInt("num") + 1;
            } else {
                return 0;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Datos.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }

    public ResultSet getEquipos() {

        try {
            String sql = "SELECT * FROM equipos ";

            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            return rs;
        } catch (SQLException ex) {
            Logger.getLogger(Datos.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    public ResultSet getEquipo(int id) {

        try {
            String sql = "SELECT * FROM equipos "
                    + " WHERE id = " + id + "";
                    
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            return rs;
        } catch (SQLException ex) {
            Logger.getLogger(Datos.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    public ResultSet getEquipos(int pagIni, int pagFinal) {

        try {
            String sql = "SELECT * FROM equipos "
                    + " WHERE id >= " + pagIni + ""
                    + " AND id <= " + pagFinal + "";

            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            return rs;
        } catch (SQLException ex) {
            Logger.getLogger(Datos.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public ResultSet getEquipos(int pagIni, int pagFinal, String busqueda) {

        try {
            String sql = "SELECT * FROM equipos "
                    + " WHERE id >= " + pagIni + ""
                    + " AND id <= " + pagFinal + ""
                    + " AND id_equipo LIKE '%" + busqueda + "%'";

            Statement st = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);
            
            ResultSet rs = st.executeQuery(sql);
            return rs;
        } catch (SQLException ex) {
            Logger.getLogger(Datos.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public ResultSet getUsuarios() {

        try {
            String sql = "SELECT * FROM usuarios";

            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            return rs;
        } catch (SQLException ex) {
            Logger.getLogger(Datos.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public ResultSet getUsuariosLimit() {

        try {
            String sql = "SELECT * FROM usuarios limit 3";

            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            return rs;
        } catch (SQLException ex) {
            Logger.getLogger(Datos.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public ResultSet getUsuariosNom(String nombre) {

        try {
            String sql = "SELECT * FROM usuarios "
                    + "WHERE usuario LIKE  '%" + nombre + "%'";

            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            return rs;

        } catch (SQLException ex) {
            Logger.getLogger(Datos.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public boolean getClaveUsuario(String clave) {

        try {
            String sql = "SELECT * FROM usuarios "
                    + "WHERE clave =  '" + clave + "'";

            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            return rs.next();

        } catch (SQLException ex) {
            Logger.getLogger(Datos.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    /* Funcion que sirve para validar si un proyecto ya esta registrado.
     - La funcion recibe como parametro un String el cual corresponde
     al nombre del proyecto.
     - La funcion retorna true si el nombre del proyecto se encuentra y
     si no false.
     */
    public boolean getProyecto(String nombre) {

        try {
            String sql = "SELECT * FROM proyecto "
                    + "WHERE nom_pro = '" + nombre + "'";

            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            return rs.next();

        } catch (SQLException ex) {
            Logger.getLogger(Datos.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public int getNumFac() {
        try {
            String sql = "SELECT MAX(id_factura) AS num FROM factura";

            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {
                return rs.getInt("num") + 1;
            } else {
                return 0;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Datos.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }

    public ResultSet getFacturas(String sql) {
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);

            return rs;
        } catch (SQLException ex) {
            Logger.getLogger(Datos.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

    }

    public ResultSet getFacturasReporte() {
        try {
            String sql = "SELECT factura.id_factura AS factura, factura.n_factura, "
                    + "factura.fecha_fac AS fecha, "
                    + "factura.fecha_carga AS carga, "
                    + "proveedor.rif_cedula, "
                    + "proveedor.nom_prove, "
                    + "CONCAT( proveedor.rif_cedula, '-', proveedor.nom_prove) AS proveedor, "
                    + "CONCAT( personal.nom_per, ' ', personal.ape_per) AS empleado, "
                    + "servicio.nom_servi AS servicio, "
                    + "status.nom_sta AS status, "
                    + "factura.descri_fac AS descripcion, "
                    + "factura.monto AS monto "
                    + "FROM factura "
                    + "INNER JOIN proveedor ON factura.id_proveedor = proveedor.id_proveedor "
                    + "INNER JOIN personal ON factura.id_personal = personal.id_personal "
                    + "INNER JOIN servicio ON factura.id_servicio = servicio.id_servicio "
                    + "INNER JOIN status ON factura.id_status = status.id_status ";

            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);

            return rs;
        } catch (SQLException ex) {
            Logger.getLogger(Datos.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

    }

    public String getMontoTotal() {
        try {
            String sql = "SELECT factura.id_factura AS factura, factura.n_factura, "
                    + "factura.fecha_fac AS fecha, "
                    + "factura.fecha_carga AS carga, "
                    + "CONCAT( proveedor.rif_cedula, '-', proveedor.nom_prove) AS proveedor, "
                    + "CONCAT( personal.nom_per, ' ', personal.ape_per) AS empleado, "
                    + "servicio.nom_servi AS servicio, "
                    + "status.nom_sta AS status, "
                    + "factura.descri_fac AS descripcion, "
                    + "factura.monto AS monto, "
                    + "SUM(factura.monto) as total "
                    + "FROM factura "
                    + "INNER JOIN proveedor ON factura.id_proveedor = proveedor.id_proveedor "
                    + "INNER JOIN personal ON factura.id_personal = personal.id_personal "
                    + "INNER JOIN servicio ON factura.id_servicio = servicio.id_servicio "
                    + "INNER JOIN status ON factura.id_status = status.id_status ";

            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {

                return rs.getString("total");

            }
            return null;
        } catch (SQLException ex) {
            Logger.getLogger(Datos.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

    }

}
