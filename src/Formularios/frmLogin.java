/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import Clases.Datos;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.io.ByteArrayInputStream;
import java.sql.Blob;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author victor
 */
public class frmLogin extends javax.swing.JFrame {

    private Image img;
    private BufferedImage bi;

    public frmLogin() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new org.edisoncor.gui.panel.Panel();
        labelMetric2 = new org.edisoncor.gui.label.LabelMetric();
        txtUsuario = new org.edisoncor.gui.textField.TextFieldRoundIcon();
        labelMetric3 = new org.edisoncor.gui.label.LabelMetric();
        txtClave = new org.edisoncor.gui.passwordField.PasswordFieldRoundIcon();
        btnIngresar = new javax.swing.JButton();
        imagen_user1 = new javax.swing.JLabel();
        imagen_user2 = new javax.swing.JLabel();
        imagen_user3 = new javax.swing.JLabel();
        lb_tipo1 = new org.edisoncor.gui.label.LabelMetric();
        lbUser1 = new org.edisoncor.gui.label.LabelMetric();
        lb_tipo2 = new org.edisoncor.gui.label.LabelMetric();
        lbUser2 = new org.edisoncor.gui.label.LabelMetric();
        lb_tipo3 = new org.edisoncor.gui.label.LabelMetric();
        lbUser3 = new org.edisoncor.gui.label.LabelMetric();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Internet Colonial");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        panel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo-Login5.jpg"))); // NOI18N

        labelMetric2.setText("Clave:");
        labelMetric2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        labelMetric3.setText("Usuario:");
        labelMetric3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        btnIngresar.setText("*");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });

        imagen_user1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/100px-Icon-user.png"))); // NOI18N
        imagen_user1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imagen_user1MouseClicked(evt);
            }
        });

        imagen_user2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/100px-Icon-user.png"))); // NOI18N
        imagen_user2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imagen_user2MouseClicked(evt);
            }
        });

        imagen_user3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/100px-Icon-user.png"))); // NOI18N
        imagen_user3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imagen_user3MouseClicked(evt);
            }
        });

        lb_tipo1.setText("Tipo de Usuario:");
        lb_tipo1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        lbUser1.setText("Usuario:");
        lbUser1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        lb_tipo2.setText("Tipo de Usuario:");
        lb_tipo2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        lbUser2.setText("Usuario:");
        lbUser2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        lb_tipo3.setText("Tipo de Usuario:");
        lb_tipo3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        lbUser3.setText("Usuario:");
        lbUser3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(imagen_user2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb_tipo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(lbUser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(6, 6, 6))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(imagen_user3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb_tipo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(lbUser3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(imagen_user1)
                        .addGap(18, 18, 18)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb_tipo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(lbUser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelMetric3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelMetric2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
                    .addComponent(txtClave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(141, 141, 141))
        );

        panel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtClave, txtUsuario});

        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(imagen_user1)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                                .addComponent(lb_tipo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(lbUser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(17, 17, 17)))
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(imagen_user2))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                                .addComponent(lb_tipo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(lbUser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21)))
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(imagen_user3))
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(lb_tipo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(lbUser3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(labelMetric3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(labelMetric2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(171, Short.MAX_VALUE))
        );

        panel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtClave, txtUsuario});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed

        try {
            Datos misDatos = new Datos();

            String clave = new String(txtClave.getPassword());
            ResultSet rs = misDatos.validarUsuario(txtUsuario.getText(), clave);
            if (rs.next() == false) {
                JOptionPane.showMessageDialog(rootPane, "Usuario o Clave incorrectos");
                txtUsuario.setText("");
                txtClave.setText("");
                txtUsuario.requestFocusInWindow();
                return;
            }

            frmPrincipal miPrincipal = new frmPrincipal();
            setVisible(false);
            miPrincipal.setExtendedState(JFrame.MAXIMIZED_BOTH);
            miPrincipal.setLocationRelativeTo(null);
            miPrincipal.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(frmLogin.class.getName()).log(Level.SEVERE, null, ex);
        }

        imagen_user2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/100px-Icon-user.png")));
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        try {
            Datos datos = new Datos();

            int i = 0;

            ArrayList<Image> lista = new ArrayList();

            String user[] = new String[4];

            ImageIcon icon = new ImageIcon();
            ImageIcon icon2 = new ImageIcon();

            ResultSet rs = datos.getUsuarios();

            while (rs.next()) {

                user[i] = rs.getString("nom_usuario");

                /* Me traigo el binario tipo blob*/
                Blob blob = rs.getBlob("imagen");

                /* Lo guardo en un array de tipo byte para poderlo convertir a imagen*/
                byte[] data = blob.getBytes(1, (int) blob.length());
                BufferedImage img = null;

                /* Con ImageIO.read lee los binario y me retorna la imagen o un
                BufferedImage */
                img = ImageIO.read(new ByteArrayInputStream(data));

                /* Agrego la iamgen a la lista */
                lista.add(i, img);

                /* JOptionPane.showMessageDialog(rootPane, "aloha");
                    Image image = ImageIO.read(getClass().getResource("/Imagenes/100px-Icon-user.png"));
                    lista.add(image); */
                i++;

            }
            
            /* Seteo la imagen del usuario */
            icon = new ImageIcon(lista.get(0).getScaledInstance(imagen_user1.getWidth(),
                    imagen_user1.getHeight(), Image.SCALE_DEFAULT));
            imagen_user1.setIcon(icon);

            icon = new ImageIcon(lista.get(1).getScaledInstance(imagen_user2.getWidth(),
                    imagen_user2.getHeight(), Image.SCALE_DEFAULT));
            imagen_user2.setIcon(icon);

            icon = new ImageIcon(lista.get(2).getScaledInstance(imagen_user3.getWidth(),
                    imagen_user3.getHeight(), Image.SCALE_DEFAULT));
            imagen_user3.setIcon(icon);
            
             /* Seteo el nombre de usuario */
            lbUser1.setText(user[0]);
            lbUser2.setText(user[1]);
            lbUser3.setText(user[2]);


            /* Seteo el tipo de usuario */
            lb_tipo1.setText("Administrador");
            lb_tipo2.setText("Administrador");
            lb_tipo3.setText("Administrador");

           

        } catch (Exception ex) {
            Logger.getLogger(frmLogin.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_formWindowOpened

    private void imagen_user1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imagen_user1MouseClicked

        txtUsuario.setText(lbUser1.getText());

    }//GEN-LAST:event_imagen_user1MouseClicked

    private void imagen_user2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imagen_user2MouseClicked

        txtUsuario.setText(lbUser2.getText());

    }//GEN-LAST:event_imagen_user2MouseClicked

    private void imagen_user3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imagen_user3MouseClicked

        txtUsuario.setText(lbUser3.getText());

    }//GEN-LAST:event_imagen_user3MouseClicked

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
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIngresar;
    private javax.swing.JLabel imagen_user1;
    private javax.swing.JLabel imagen_user2;
    private javax.swing.JLabel imagen_user3;
    private org.edisoncor.gui.label.LabelMetric labelMetric2;
    private org.edisoncor.gui.label.LabelMetric labelMetric3;
    private org.edisoncor.gui.label.LabelMetric lbUser1;
    private org.edisoncor.gui.label.LabelMetric lbUser2;
    private org.edisoncor.gui.label.LabelMetric lbUser3;
    private org.edisoncor.gui.label.LabelMetric lb_tipo1;
    private org.edisoncor.gui.label.LabelMetric lb_tipo2;
    private org.edisoncor.gui.label.LabelMetric lb_tipo3;
    private org.edisoncor.gui.panel.Panel panel1;
    private org.edisoncor.gui.passwordField.PasswordFieldRoundIcon txtClave;
    private org.edisoncor.gui.textField.TextFieldRoundIcon txtUsuario;
    // End of variables declaration//GEN-END:variables
}
