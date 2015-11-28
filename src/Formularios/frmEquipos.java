package Formularios;

import Clases.Datos;
import Clases.Equipo;
import Clases.Qr;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author victor
 */
public class frmEquipos extends javax.swing.JFrame {

    private static String ruta;
    private static StringBuffer data;
    private static String RUTA_QR = System.getProperty("user.dir") + "/src/Imagenes/qr.gif";

    public frmEquipos() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new org.edisoncor.gui.panel.Panel();
        labelMetric2 = new org.edisoncor.gui.label.LabelMetric();
        labelMetric3 = new org.edisoncor.gui.label.LabelMetric();
        labelMetric4 = new org.edisoncor.gui.label.LabelMetric();
        labelMetric5 = new org.edisoncor.gui.label.LabelMetric();
        labelQR = new javax.swing.JLabel();
        txtSerial = new org.edisoncor.gui.textField.TextFieldRoundIcon();
        labelMetric6 = new org.edisoncor.gui.label.LabelMetric();
        labelPreview = new javax.swing.JLabel();
        labelMetric7 = new org.edisoncor.gui.label.LabelMetric();
        dchFecha = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaFalla = new javax.swing.JTextArea();
        btnRegistrar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        labelMetric8 = new org.edisoncor.gui.label.LabelMetric();
        txtImagen = new org.edisoncor.gui.textField.TextFieldRoundIcon();
        btnAbrirImagen = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registro de Equipos");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        labelMetric2.setText("Fecha:");

        labelMetric3.setText("Codigo QR:");

        labelMetric4.setText("Serial:");

        labelMetric5.setText("Falla:");

        labelQR.setForeground(new java.awt.Color(255, 255, 255));
        labelQR.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelQR.setText("Codigo QR");

        labelMetric6.setText("Imagen:");

        labelPreview.setForeground(new java.awt.Color(255, 255, 255));
        labelPreview.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelPreview.setText("Imagen Preview");

        labelMetric7.setText("Gestion de Equipos");
        labelMetric7.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        areaFalla.setColumns(20);
        areaFalla.setRows(5);
        jScrollPane1.setViewportView(areaFalla);

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        labelMetric8.setText("Imagen:");

        btnAbrirImagen.setText("Abrir");
        btnAbrirImagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbrirImagenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelMetric4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelMetric3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(labelQR, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSerial, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelMetric2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelMetric5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(dchFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                        .addComponent(labelMetric7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(231, 231, 231))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelMetric6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelMetric8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGap(111, 111, 111)
                                .addComponent(labelPreview, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(panel1Layout.createSequentialGroup()
                                        .addComponent(btnRegistrar)
                                        .addGap(101, 101, 101)
                                        .addComponent(btnCancelar))
                                    .addComponent(txtImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(btnAbrirImagen)))
                        .addGap(100, 100, 100))))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelMetric7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelMetric2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(labelQR, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(labelMetric3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(dchFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(69, 69, 69)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelMetric4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtSerial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(labelMetric5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtImagen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelMetric8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAbrirImagen))
                .addGap(40, 40, 40)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPreview, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelMetric6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrar)
                    .addComponent(btnCancelar))
                .addGap(41, 41, 41))
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

    private void btnAbrirImagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbrirImagenActionPerformed

        /* Instanciamos un objeto FileChooser para que el usuario busque su imagen */
        final JFileChooser elegirImagen = new JFileChooser();

        /* Validamos que no nos seleccionen mas de 1 imagen */
        elegirImagen.setMultiSelectionEnabled(false);

        /* Guardamos en una vairable entera si seleccionaron o no una imagen */
        int o = elegirImagen.showOpenDialog(this);

        if (o == JFileChooser.APPROVE_OPTION) {

            ruta = elegirImagen.getSelectedFile().getAbsolutePath();
            String nombre = elegirImagen.getSelectedFile().getName();

            txtImagen.setText(ruta);

            Image preview = Toolkit.getDefaultToolkit().getImage(ruta);

            if (preview != null) {
                labelPreview.setText("");
                ImageIcon icon = new ImageIcon(preview.getScaledInstance(labelPreview.getWidth(), labelPreview.getHeight(), Image.SCALE_DEFAULT));
                labelPreview.setIcon(icon);
            }
        }
    }//GEN-LAST:event_btnAbrirImagenActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        Qr qr = new Qr();

        data = qr.codigoRamdon();

        String ruta_imagen = qr.generarQR(data.toString());

        Image preview = Toolkit.getDefaultToolkit().getImage(ruta_imagen);

        ImageIcon icon = new ImageIcon(preview.getScaledInstance(labelQR.getWidth(),
                labelQR.getHeight(), Image.SCALE_DEFAULT));

        labelQR.setIcon(icon);


    }//GEN-LAST:event_formWindowOpened

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed

        /* Instanciamos un objeto de la Clase Datos */
        Datos datos = new Datos();

        /* Validaciones */
        if (dchFecha.getDate() == null) {
            JOptionPane.showMessageDialog(rootPane, "Debe ingresar la fecha de carga");
            dchFecha.requestFocusInWindow();
            return;
        }

        if (dchFecha.getDate().after(new Date())) {
            JOptionPane.showMessageDialog(rootPane, "La fecha no puede ser mayor a la de hoy");
            dchFecha.requestFocusInWindow();
            return;
        }

        if (txtSerial.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Debe digitar el serial del equipo");
            txtSerial.requestFocusInWindow();
            return;
        }

        if (areaFalla.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Debe ingresar la falla");
            areaFalla.requestFocusInWindow();
            return;
        }

        File qr = new File(RUTA_QR);
        File equi = new File(ruta);

        Equipo equipo = new Equipo(
                data.toString(),
                qr,
                dchFecha.getDate(),
                areaFalla.getText(),
                equi);

        if (datos.agregarEquipo(equipo)) {

            JOptionPane.showMessageDialog(rootPane, "Equipo Agregado correctamente");

        } else {

            JOptionPane.showMessageDialog(rootPane, "No se pudo registar el equipo, "
                    + "por favor intentelo mas tarde");

        }

        /* Limpiamos los campos */
        labelQR.setText("Imagen Preview");
        labelQR.setIcon(null);
        dchFecha.setDate(null);
        txtSerial.setText("");
        areaFalla.setText("");
        txtImagen.setText("");
        labelPreview.setText("Imagen Preview");
        labelPreview.setIcon(null);

    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed

        dispose();
        
    }//GEN-LAST:event_btnCancelarActionPerformed

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
            java.util.logging.Logger.getLogger(frmEquipos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmEquipos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmEquipos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmEquipos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmEquipos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaFalla;
    private javax.swing.JButton btnAbrirImagen;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnRegistrar;
    private com.toedter.calendar.JDateChooser dchFecha;
    private javax.swing.JScrollPane jScrollPane1;
    private org.edisoncor.gui.label.LabelMetric labelMetric2;
    private org.edisoncor.gui.label.LabelMetric labelMetric3;
    private org.edisoncor.gui.label.LabelMetric labelMetric4;
    private org.edisoncor.gui.label.LabelMetric labelMetric5;
    private org.edisoncor.gui.label.LabelMetric labelMetric6;
    private org.edisoncor.gui.label.LabelMetric labelMetric7;
    private org.edisoncor.gui.label.LabelMetric labelMetric8;
    private javax.swing.JLabel labelPreview;
    private javax.swing.JLabel labelQR;
    private org.edisoncor.gui.panel.Panel panel1;
    private org.edisoncor.gui.textField.TextFieldRoundIcon txtImagen;
    private org.edisoncor.gui.textField.TextFieldRoundIcon txtSerial;
    // End of variables declaration//GEN-END:variables
}
