/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import Clases.Datos;
import Clases.Utilidades;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.sql.Blob;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author victor
 */
public class frmDiagnostico extends javax.swing.JFrame {

    public frmDiagnostico() {
        initComponents();
    }

    /* Definimos los titulos que llevara la tabla*/
    public String titulos[] = {"ID", "Codigo Qr", "Equipo", "Fecha"};

    public String usuario;

    Datos datos = new Datos();

    /* Definimos una tabla modelo y sobreeescribimos el metodo isCellEditable
     para que las columnas y filas de la tabla no se puedan editar*/
    DefaultTableModel tablaModelo = new DefaultTableModel(null, titulos) {
        @Override
        public boolean isCellEditable(int row, int col) {
            return false;
        }

        @Override
        public Class<?> getColumnClass(int columnIndex) {
            Class<?> clazz = Object.class;
            Object aux = getValueAt(0, columnIndex);
            if (aux != null) {
                clazz = aux.getClass();
            }

            return clazz;
        }

    };

    /* Funcion para llenar la tabla cuando abre el formulario */
    public void llenarTabla() {

        try {

            /* Llamos a la funcion getEquipos la cual nos devuelve todos 
             los proyectos registrados en la base de datos. 
             - Los datos recibidos lo guardamos en el objeto ResulSet para luego
             llenar la tabla con los registros.
             */
            ResultSet rs = datos.getEquipos(1, 3);

            /* Hacemos un while que mientras en rs hallan datos el ira agregando
             filas a la tabla. */
            while (rs.next()) {

                /* Me traigo el binario tipo blob*/
                Blob blob = rs.getBlob("equipo_qr");

                /* Lo guardo en un array de tipo byte para poderlo convertir a imagen*/
                byte[] data = blob.getBytes(1, (int) blob.length());
                BufferedImage imgQr = null;

                /* Con ImageIO.read lee los binario y me retorna la imagen o un
                BufferedImage */
                Image img = ImageIO.read(new ByteArrayInputStream(data));

                ImageIcon imagenQr = new ImageIcon(img.getScaledInstance(125,
                        125, Image.SCALE_DEFAULT));

                ImageIcon icon = new ImageIcon(imagenQr.getImage());

                /* Me traigo el binario tipo blob*/
                blob = rs.getBlob("equipo");

                /* Lo guardo en un array de tipo byte para poderlo convertir a imagen*/
                data = blob.getBytes(1, (int) blob.length());

                BufferedImage imgEqui = null;

                /* Con ImageIO.read lee los binario y me retorna la imagen o un
                BufferedImage */
                imgEqui = ImageIO.read(new ByteArrayInputStream(data));

                ImageIcon imagenEqui = new ImageIcon(imgEqui.getScaledInstance(125,
                        125, Image.SCALE_DEFAULT));

                /* Instaciamos un array de Objeto, el cual nos servira
                 para guardar las filas de la tabla. */
                Object[] registros
                        = {
                            rs.getString("id"),
                            imagenQr,
                            imagenEqui,
                            rs.getString("fecha")
                        };

                tablaModelo.addRow(registros);

            }

            tablaDiagnostico.setRowHeight(150);
            tablaDiagnostico.setModel(tablaModelo);
        } catch (Exception ex) {
            Logger.getLogger(frmDiagnostico.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    /* Funcion para llenar la tabla cuando se busque un equipo en especifico
     por el nombre */
    public void llenarTabla(int pagIni, String busqueda) {

        try {
            /* Limpiamos la tabla */
            tablaModelo.setRowCount(0);

            /* Llamos a la funcion getEquipos la cual nos devuelve todos
            los equipos relacionados con el nombre a buscar en la base de datos.
            
            - Los datos recibidos lo guardamos en el objeto ResulSet para luego
            llenar la tabla con los registros.
            
             */
            int pagFinal = pagIni + 10;

            ResultSet rs = datos.getEquipos(pagIni, pagFinal, busqueda);

            /* Llamos a la funcion getEquipos la cual nos devuelve todos
            los proyectos registrados en la base de datos.
            - Los datos recibidos lo guardamos en el objeto ResulSet para luego
            llenar la tabla con los registros.
             */
 /* Hacemos un while que mientras en rs hallan datos el ira agregando
            filas a la tabla. */
            while (rs.next()) {

                /* Me traigo el binario tipo blob*/
                Blob blob = rs.getBlob("equipo_qr");

                /* Lo guardo en un array de tipo byte para poderlo convertir a imagen*/
                byte[] data = blob.getBytes(1, (int) blob.length());
                BufferedImage imgQr = null;

                /* Con ImageIO.read lee los binario y me retorna la imagen o un
                BufferedImage */
                imgQr = ImageIO.read(new ByteArrayInputStream(data));

                ImageIcon imagenQr = new ImageIcon(imgQr.getScaledInstance(125,
                        125, Image.SCALE_DEFAULT));

                /* Me traigo el binario tipo blob*/
                blob = rs.getBlob("equipo");

                /* Lo guardo en un array de tipo byte para poderlo convertir a imagen*/
                data = blob.getBytes(1, (int) blob.length());

                BufferedImage imgEqui = null;

                /* Con ImageIO.read lee los binario y me retorna la imagen o un
                BufferedImage */
                imgEqui = ImageIO.read(new ByteArrayInputStream(data));

                ImageIcon imagenEqui = new ImageIcon(imgEqui.getScaledInstance(150,
                        150, Image.SCALE_DEFAULT));

                /* Instaciamos un array de Objeto, el cual nos servira
                para guardar las filas de la tabla. */
                Object[] registros
                        = {
                            rs.getString("id"),
                            imagenQr,
                            imagenEqui,
                            rs.getString("fecha")
                        };

                tablaModelo.addRow(registros);
            }
        } catch (Exception ex) {
            Logger.getLogger(frmDiagnostico.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    /* Funcion para llenar la tabla cuando abre el formulario */
    public void llenarTabla(int pagIni, int pagFinal) {

        try {

            /* Limpiamos la tabla */
            tablaModelo.setRowCount(0);

            /* Llamos a la funcion getEquipos la cual nos devuelve todos 
             los proyectos registrados en la base de datos. 
             - Los datos recibidos lo guardamos en el objeto ResulSet para luego
             llenar la tabla con los registros.
             */
            ResultSet rs = datos.getEquipos(pagIni, pagFinal);

            rs.last();
            int cantFilas = rs.getRow();
            rs.beforeFirst();

            /* Hacemos un while que mientras en rs hallan datos el ira agregando
             filas a la tabla. */
            while (rs.next()) {

                /* Me traigo el binario tipo blob*/
                Blob blob = rs.getBlob("equipo_qr");

                /* Lo guardo en un array de tipo byte para poderlo convertir a imagen*/
                byte[] data = blob.getBytes(1, (int) blob.length());
                BufferedImage imgQr = null;

                /* Con ImageIO.read lee los binario y me retorna la imagen o un
                BufferedImage */
                Image img = ImageIO.read(new ByteArrayInputStream(data));

                ImageIcon imagenQr = new ImageIcon(img.getScaledInstance(150,
                        150, Image.SCALE_DEFAULT));

                ImageIcon icon = new ImageIcon(imagenQr.getImage());

                /* Me traigo el binario tipo blob*/
                blob = rs.getBlob("equipo");

                /* Lo guardo en un array de tipo byte para poderlo convertir a imagen*/
                data = blob.getBytes(1, (int) blob.length());

                BufferedImage imgEqui = null;

                /* Con ImageIO.read lee los binario y me retorna la imagen o un
                BufferedImage */
                imgEqui = ImageIO.read(new ByteArrayInputStream(data));

                ImageIcon imagenEqui = new ImageIcon(imgEqui.getScaledInstance(125,
                        125, Image.SCALE_DEFAULT));

                /* Instaciamos un array de Objeto, el cual nos servira
                 para guardar las filas de la tabla. */
                Object[] registros
                        = {
                            rs.getString("id"),
                            imagenQr,
                            imagenEqui,
                            rs.getString("fecha")
                        };

                tablaModelo.addRow(registros);

            }

            tablaDiagnostico.setRowHeight(150);
            tablaDiagnostico.setModel(tablaModelo);
        } catch (Exception ex) {
            Logger.getLogger(frmDiagnostico.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new org.edisoncor.gui.panel.Panel();
        labelMetric7 = new org.edisoncor.gui.label.LabelMetric();
        txtBuscar = new org.edisoncor.gui.textField.TextFieldRoundIcon();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaDiagnostico = new javax.swing.JTable();
        labelMetric4 = new org.edisoncor.gui.label.LabelMetric();
        btnAnterior = new org.edisoncor.gui.button.ButtonAction();
        btnSiguiente = new org.edisoncor.gui.button.ButtonAction();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        labelMetric7.setText("Diagnosticar");
        labelMetric7.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        txtBuscar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });

        tablaDiagnostico.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tablaDiagnostico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaDiagnosticoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaDiagnostico);

        labelMetric4.setText("Buscar:");
        labelMetric4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        btnAnterior.setText("Anterior");
        btnAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnteriorActionPerformed(evt);
            }
        });

        btnSiguiente.setText("Siguiente");
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelMetric7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(314, 314, 314))
            .addGroup(panel1Layout.createSequentialGroup()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 666, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(labelMetric4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(235, 235, 235)
                        .addComponent(btnAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(btnSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(labelMetric7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelMetric4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased

        if (Utilidades.objectToInt(tablaDiagnostico.getValueAt(0, 0)) > 0 ){
        /* Cuando el usuario digite en el campo txt Buscar y tabulee
        llenamos la tabla con la busqueda */
        llenarTabla(
                Utilidades.objectToInt(tablaDiagnostico.getValueAt(0, 0)),
                txtBuscar.getText()
        );
        
        } else {
            
            llenarTabla();
        }
        

    }//GEN-LAST:event_txtBuscarKeyReleased

    private void tablaDiagnosticoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaDiagnosticoMouseClicked

        /* Variable que contendra el ID de la fila seleccionada */
        int s = 0, id = 0;
        
        /* Validamos que hallan seleccionado */
        if (s < 0) {
            JOptionPane.showMessageDialog(this, "Debe seleccionar un equipo");
            return;
        }

        /* Guardamos el ID de dla fila selecciona en la variable s*/
        s = tablaDiagnostico.getSelectedRow();

        /* Guardamos el id del equipo seleccionado, con el metodo getValueAt
        El cual nos devuelve un objeto, el cual convertimos a int, con la funcion
        objetoToInt que nos da la Clase Utilidades */
        id = Utilidades.objectToInt(tablaDiagnostico.getValueAt(s, 0));
        
        frmEvaluacion evaluacion = new frmEvaluacion();
        dispose();
        
        evaluacion.setID(id);
        evaluacion.setVisible(true);
        evaluacion.setLocationRelativeTo(null);
        
        
        
       

    }//GEN-LAST:event_tablaDiagnosticoMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        llenarTabla();
    }//GEN-LAST:event_formWindowOpened

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed

        try {
            int inicio = 0, fin = 0, lastRow = 0;

            lastRow = tablaDiagnostico.getRowCount();
            lastRow = lastRow - 1;
            if (lastRow >= 0) {

                inicio = Utilidades.objectToInt(tablaDiagnostico.getValueAt(lastRow, 0));
                fin = inicio + 3;

                ResultSet rs = datos.getEquipos();
                rs.last();

                int cantFilas = rs.getRow();

                System.out.println("can = " + cantFilas + " inicio= " + inicio + " fin = " + fin);

                if (fin >= cantFilas) {

                    llenarTabla(inicio, cantFilas);
                }

                if (inicio >= cantFilas) {

                    return;
                }

            }

        } catch (SQLException ex) {
            Logger.getLogger(frmDiagnostico.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnSiguienteActionPerformed

    private void btnAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnteriorActionPerformed

        try {
            int inicio = 0, fin = 0, lastRow =0;

            lastRow = tablaDiagnostico.getRowCount();
            lastRow = lastRow - 1;
           
            if (lastRow >= 0) {
                
                fin = Utilidades.objectToInt(tablaDiagnostico.getValueAt(0, 0));

                inicio = fin - 3;

                ResultSet rs = datos.getEquipos();

                int cantFilas = rs.getRow() + 1;

                System.out.println(cantFilas);

                if (inicio >= cantFilas) {
                    llenarTabla(inicio, fin);
                } else {
                    llenarTabla(cantFilas, fin);
                }

            }

        } catch (SQLException ex) {
            Logger.getLogger(frmDiagnostico.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnAnteriorActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmDiagnostico.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmDiagnostico.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmDiagnostico.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmDiagnostico.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmDiagnostico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.edisoncor.gui.button.ButtonAction btnAnterior;
    private org.edisoncor.gui.button.ButtonAction btnSiguiente;
    private javax.swing.JScrollPane jScrollPane1;
    private org.edisoncor.gui.label.LabelMetric labelMetric4;
    private org.edisoncor.gui.label.LabelMetric labelMetric7;
    private org.edisoncor.gui.panel.Panel panel1;
    private javax.swing.JTable tablaDiagnostico;
    private org.edisoncor.gui.textField.TextFieldRoundIcon txtBuscar;
    // End of variables declaration//GEN-END:variables
}
