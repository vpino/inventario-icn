package Formularios;

import Clases.Datos;
import Clases.Usuario;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author victor
 */
public class frmUsuarios extends javax.swing.JFrame {

    public frmUsuarios() {
        initComponents();
    }

    private static String ruta;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new org.edisoncor.gui.panel.Panel();
        labelMetric1 = new org.edisoncor.gui.label.LabelMetric();
        labelMetric2 = new org.edisoncor.gui.label.LabelMetric();
        txtImagen = new org.edisoncor.gui.textField.TextFieldRoundIcon();
        btnAbrirImagen = new javax.swing.JButton();
        labelPreview = new javax.swing.JLabel();
        labelMetric3 = new org.edisoncor.gui.label.LabelMetric();
        labelMetric4 = new org.edisoncor.gui.label.LabelMetric();
        labelMetric5 = new org.edisoncor.gui.label.LabelMetric();
        labelMetric6 = new org.edisoncor.gui.label.LabelMetric();
        txtClave = new org.edisoncor.gui.passwordField.PasswordFieldRoundIcon();
        txtConfirmarClave = new org.edisoncor.gui.passwordField.PasswordFieldRoundIcon();
        txtUsuario = new org.edisoncor.gui.textField.TextFieldRoundIcon();
        btnCancelar = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registro de Usuarios");

        labelMetric1.setText("Registro de Usuarios");
        labelMetric1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        labelMetric2.setText("Imagen:");

        btnAbrirImagen.setText("Abrir");
        btnAbrirImagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbrirImagenActionPerformed(evt);
            }
        });

        labelPreview.setForeground(new java.awt.Color(255, 255, 255));
        labelPreview.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelPreview.setText("Imagen Preview");

        labelMetric3.setText("Preview:");

        labelMetric4.setText("Usuario:");

        labelMetric5.setText("Clave:");

        labelMetric6.setText("Confirmar:");

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addContainerGap(146, Short.MAX_VALUE)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                        .addComponent(labelMetric1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(163, 163, 163))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                        .addComponent(btnRegistrar)
                        .addGap(55, 55, 55)
                        .addComponent(btnCancelar)
                        .addGap(119, 119, 119))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelMetric6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelMetric5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelMetric4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelMetric3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelMetric2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnAbrirImagen))
                            .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(panel1Layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtConfirmarClave, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtClave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGap(106, 106, 106)
                                .addComponent(labelPreview, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(113, 113, 113))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(labelMetric1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtImagen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelMetric2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAbrirImagen))
                .addGap(37, 37, 37)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPreview, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelMetric3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelMetric4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelMetric5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelMetric6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtConfirmarClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(btnRegistrar))
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed

        /* Instanciamos un objeto de la Clase Datos */
        Datos datos = new Datos();

        /* Validaciones */
        if (txtUsuario.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Debe digitar el nombre de usuario");
            txtUsuario.requestFocusInWindow();
            return;
        }

        /* Como el cambo passwordfield nos devuelve un array, hay que transformarlo
         a String para validarlo y luego compararlo con la confirmacion */
        String clave = new String(txtClave.getPassword());

        if (clave.equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Debe ingresar la clave del usuario");
            txtClave.requestFocusInWindow();
            return;
        }

        String confirmar = new String(txtConfirmarClave.getPassword());

        if (confirmar.equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Debe confirmar la clave ");
            txtConfirmarClave.requestFocusInWindow();
            return;
        }

        if (!clave.equals(confirmar)) {
            JOptionPane.showMessageDialog(rootPane, "Las claves no coinciden, "
                    + "por favor vuelva a ingresarlas");
            txtClave.setText("");
            txtConfirmarClave.setText("");
            txtClave.requestFocusInWindow();
            return;
        }

        File imagen = new File(ruta);

        Usuario usuario = new Usuario(
                txtUsuario.getText(),
                clave,
                imagen);

        if (datos.agregarUsuario(usuario)) {

            JOptionPane.showMessageDialog(rootPane, "Usuario Agregado correctamente");

        } else {

            JOptionPane.showMessageDialog(rootPane, "No se pudo registar el usuario, "
                    + "por favor intentelo mas tarde");

        }

        /* Limpiamos los campos */
        txtImagen.setText("");
        txtUsuario.setText("");
        txtClave.setText("");
        txtConfirmarClave.setText("");
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
            java.util.logging.Logger.getLogger(frmUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmUsuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAbrirImagen;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnRegistrar;
    private org.edisoncor.gui.label.LabelMetric labelMetric1;
    private org.edisoncor.gui.label.LabelMetric labelMetric2;
    private org.edisoncor.gui.label.LabelMetric labelMetric3;
    private org.edisoncor.gui.label.LabelMetric labelMetric4;
    private org.edisoncor.gui.label.LabelMetric labelMetric5;
    private org.edisoncor.gui.label.LabelMetric labelMetric6;
    private javax.swing.JLabel labelPreview;
    private org.edisoncor.gui.panel.Panel panel1;
    private org.edisoncor.gui.passwordField.PasswordFieldRoundIcon txtClave;
    private org.edisoncor.gui.passwordField.PasswordFieldRoundIcon txtConfirmarClave;
    private org.edisoncor.gui.textField.TextFieldRoundIcon txtImagen;
    private org.edisoncor.gui.textField.TextFieldRoundIcon txtUsuario;
    // End of variables declaration//GEN-END:variables
}
