package Formularios;

import Clases.Datos;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author vpino
 */
public class frmEquipo extends javax.swing.JFrame {

    private static String ruta;
    private static StringBuffer data;
    private static String RUTA_QR = System.getProperty("user.dir") + "/src/Imagenes/qr.gif";

    public frmEquipo() {
        initComponents();
    }

    public boolean validarEmail(String email) {

        String expresionRegular = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

        //Set the email pattern string
        Pattern p = Pattern.compile(expresionRegular);

        //Match the given string with the pattern
        Matcher m = p.matcher(email);

        //check whether match is found 
        boolean matchFound = m.matches();

        return matchFound;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new org.edisoncor.gui.panel.Panel();
        panelTop = new org.edisoncor.gui.tabbedPane.TabbedPaneHeader();
        panelCliente = new org.edisoncor.gui.panel.Panel();
        labelMetric1 = new org.edisoncor.gui.label.LabelMetric();
        labelMetric2 = new org.edisoncor.gui.label.LabelMetric();
        labelMetric3 = new org.edisoncor.gui.label.LabelMetric();
        labelMetric4 = new org.edisoncor.gui.label.LabelMetric();
        labelMetric5 = new org.edisoncor.gui.label.LabelMetric();
        labelMetric6 = new org.edisoncor.gui.label.LabelMetric();
        txtNombres = new org.edisoncor.gui.textField.TextFieldRoundIcon();
        txtApellidos = new org.edisoncor.gui.textField.TextFieldRoundIcon();
        txtCedula = new org.edisoncor.gui.textField.TextFieldRoundIcon();
        txtTelefono = new org.edisoncor.gui.textField.TextFieldRoundIcon();
        txtEmail = new org.edisoncor.gui.textField.TextFieldRoundIcon();
        btnCancelar = new org.edisoncor.gui.button.ButtonAction();
        btnSiguiente = new org.edisoncor.gui.button.ButtonAction();
        panelEquipo = new org.edisoncor.gui.panel.Panel();
        labelMetric7 = new org.edisoncor.gui.label.LabelMetric();
        labelQR = new javax.swing.JLabel();
        dchFecha = new com.toedter.calendar.JDateChooser();
        labelMetric8 = new org.edisoncor.gui.label.LabelMetric();
        labelMetric9 = new org.edisoncor.gui.label.LabelMetric();
        txtOutside = new org.edisoncor.gui.textField.TextFieldRoundIcon();
        btnAbrirOutside = new javax.swing.JButton();
        labelMetric10 = new org.edisoncor.gui.label.LabelMetric();
        labelOutside = new javax.swing.JLabel();
        labelMetric11 = new org.edisoncor.gui.label.LabelMetric();
        btnAbrirInside = new javax.swing.JButton();
        txtInside = new org.edisoncor.gui.textField.TextFieldRoundIcon();
        labelInside = new javax.swing.JLabel();
        labelMetric12 = new org.edisoncor.gui.label.LabelMetric();
        btnSiguienteEquipo = new org.edisoncor.gui.button.ButtonAction();
        btnAtras = new org.edisoncor.gui.button.ButtonAction();
        labelMetric13 = new org.edisoncor.gui.label.LabelMetric();
        panelDiagnostico = new org.edisoncor.gui.panel.Panel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        labelMetric1.setText("Registro del Cliente");
        labelMetric1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        labelMetric2.setText("Nombres:");

        labelMetric3.setText("Apellidos:");

        labelMetric4.setText("Cédula:");

        labelMetric5.setText("Telefono:");

        labelMetric6.setText("Email:");

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnSiguiente.setText("Siguiente");
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelClienteLayout = new javax.swing.GroupLayout(panelCliente);
        panelCliente.setLayout(panelClienteLayout);
        panelClienteLayout.setHorizontalGroup(
            panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelClienteLayout.createSequentialGroup()
                .addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelClienteLayout.createSequentialGroup()
                        .addGap(245, 245, 245)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(btnSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelClienteLayout.createSequentialGroup()
                        .addGap(199, 199, 199)
                        .addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelMetric4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelMetric2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelMetric3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelMetric5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelMetric6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNombres, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtApellidos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtCedula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(235, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelClienteLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(labelMetric1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(268, 268, 268))
        );
        panelClienteLayout.setVerticalGroup(
            panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelClienteLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(labelMetric1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelMetric2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelMetric3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67)
                .addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelMetric4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(72, 72, 72)
                .addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelMetric5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelMetric6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(89, 89, 89)
                .addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(101, Short.MAX_VALUE))
        );

        panelTop.addTab("Cliente", panelCliente);

        labelMetric7.setText("Codigo QR:");

        labelQR.setForeground(new java.awt.Color(255, 255, 255));
        labelQR.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelQR.setText("Codigo QR");

        labelMetric8.setText("Fecha:");

        labelMetric9.setText("Outside:");

        btnAbrirOutside.setText("Abrir");
        btnAbrirOutside.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbrirOutsideActionPerformed(evt);
            }
        });

        labelMetric10.setText("Imagen:");

        labelOutside.setForeground(new java.awt.Color(255, 255, 255));
        labelOutside.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelOutside.setText("Outside Preview");

        labelMetric11.setText("Inside:");

        btnAbrirInside.setText("Abrir");
        btnAbrirInside.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbrirInsideActionPerformed(evt);
            }
        });

        labelInside.setForeground(new java.awt.Color(255, 255, 255));
        labelInside.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelInside.setText("Inside Preview");

        labelMetric12.setText("Imagen:");

        btnSiguienteEquipo.setText("Siguiente");

        btnAtras.setText("Atras");

        labelMetric13.setText("Registro del Equipo");
        labelMetric13.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        javax.swing.GroupLayout panelEquipoLayout = new javax.swing.GroupLayout(panelEquipo);
        panelEquipo.setLayout(panelEquipoLayout);
        panelEquipoLayout.setHorizontalGroup(
            panelEquipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEquipoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(btnSiguienteEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(235, 235, 235))
            .addGroup(panelEquipoLayout.createSequentialGroup()
                .addGroup(panelEquipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelEquipoLayout.createSequentialGroup()
                        .addGroup(panelEquipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelEquipoLayout.createSequentialGroup()
                                .addGap(88, 88, 88)
                                .addComponent(labelMetric7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(labelQR, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelEquipoLayout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(panelEquipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(labelMetric9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelMetric10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(panelEquipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelOutside, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(panelEquipoLayout.createSequentialGroup()
                                        .addComponent(txtOutside, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnAbrirOutside)))))
                        .addGap(40, 40, 40)
                        .addGroup(panelEquipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelEquipoLayout.createSequentialGroup()
                                .addComponent(labelMetric8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(dchFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelEquipoLayout.createSequentialGroup()
                                .addComponent(labelMetric11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtInside, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnAbrirInside))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelEquipoLayout.createSequentialGroup()
                                .addComponent(labelMetric12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(labelInside, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(panelEquipoLayout.createSequentialGroup()
                        .addGap(286, 286, 286)
                        .addComponent(labelMetric13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        panelEquipoLayout.setVerticalGroup(
            panelEquipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEquipoLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(labelMetric13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addGroup(panelEquipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelEquipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(labelMetric8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(labelMetric7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(labelQR, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelEquipoLayout.createSequentialGroup()
                        .addComponent(dchFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(90, 90, 90)))
                .addGap(65, 65, 65)
                .addGroup(panelEquipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtOutside, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelMetric9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAbrirOutside)
                    .addComponent(txtInside, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelMetric11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAbrirInside))
                .addGap(98, 98, 98)
                .addGroup(panelEquipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelOutside, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelMetric10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelInside, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelMetric12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addGroup(panelEquipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSiguienteEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65))
        );

        panelTop.addTab("Equipo", panelEquipo);

        javax.swing.GroupLayout panelDiagnosticoLayout = new javax.swing.GroupLayout(panelDiagnostico);
        panelDiagnostico.setLayout(panelDiagnosticoLayout);
        panelDiagnosticoLayout.setHorizontalGroup(
            panelDiagnosticoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 773, Short.MAX_VALUE)
        );
        panelDiagnosticoLayout.setVerticalGroup(
            panelDiagnosticoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 706, Short.MAX_VALUE)
        );

        panelTop.addTab("Diagnostico", panelDiagnostico);

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelTop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelTop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened


    }//GEN-LAST:event_formWindowOpened

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed

        /* Instanciamos un objeto de la Clase Datos */
        Datos datos = new Datos();

        /* Validaciones */
        if (txtNombres.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Debe digitar un nombre");
            txtNombres.requestFocusInWindow();
            return;
        }

        if (txtApellidos.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Debe ingresar un apellido");
            txtApellidos.requestFocusInWindow();
            return;
        }

        if (txtCedula.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Debe ingresar una cedula");
            txtCedula.requestFocusInWindow();
            return;
        }

        if (!txtCedula.getText().equals("")) {

            if (datos.getCliente(txtCedula.getText())) {
                JOptionPane.showMessageDialog(this, "La cedula digitada ya  "
                        + "encuentra registrado. ");
                txtCedula.setText("");
                txtCedula.requestFocusInWindow();
                return;
            }

        }

        if (txtTelefono.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Debe ingresar un telefono de contacto");
            txtTelefono.requestFocusInWindow();
            return;
        }

        if (txtEmail.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Debe ingresar un correo electronico");
            txtEmail.requestFocusInWindow();
            return;
        }

        /* Llamamos a la funcion validar email  */
        if (!validarEmail(txtEmail.getText())) {
            JOptionPane.showMessageDialog(this, "Correo invalido");
            txtEmail.setText("");
            txtEmail.requestFocusInWindow();
            return;
        }

        panelTop.setSelectedComponent(panelEquipo);
        panelEquipo.setEnabled(true);


    }//GEN-LAST:event_btnSiguienteActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed

        this.dispose();

    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnAbrirOutsideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbrirOutsideActionPerformed

        /* Instanciamos un objeto FileChooser para que el usuario busque su imagen */
        final JFileChooser elegirImagen = new JFileChooser();

        /* Validamos que no nos seleccionen mas de 1 imagen */
        elegirImagen.setMultiSelectionEnabled(false);

        /* Guardamos en una vairable entera si seleccionaron o no una imagen */
        int o = elegirImagen.showOpenDialog(this);

        if (o == JFileChooser.APPROVE_OPTION) {

            ruta = elegirImagen.getSelectedFile().getAbsolutePath();
            String nombre = elegirImagen.getSelectedFile().getName();

            txtOutside.setText(ruta);

            Image outside = Toolkit.getDefaultToolkit().getImage(ruta);

            if (outside != null) {
                labelOutside.setText("");
                ImageIcon icon = new ImageIcon(outside.getScaledInstance(labelOutside.getWidth(),
                        labelOutside.getHeight(), Image.SCALE_DEFAULT));
                labelOutside.setIcon(icon);
            }
        }
    }//GEN-LAST:event_btnAbrirOutsideActionPerformed

    private void btnAbrirInsideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbrirInsideActionPerformed

        /* Instanciamos un objeto FileChooser para que el usuario busque su imagen */
        final JFileChooser elegirImagen = new JFileChooser();

        /* Validamos que no nos seleccionen mas de 1 imagen */
        elegirImagen.setMultiSelectionEnabled(false);

        /* Guardamos en una vairable entera si seleccionaron o no una imagen */
        int o = elegirImagen.showOpenDialog(this);

        if (o == JFileChooser.APPROVE_OPTION) {

            ruta = elegirImagen.getSelectedFile().getAbsolutePath();
            String nombre = elegirImagen.getSelectedFile().getName();

            txtInside.setText(ruta);

            Image outside = Toolkit.getDefaultToolkit().getImage(ruta);

            if (outside != null) {
                labelInside.setText("");
                ImageIcon icon = new ImageIcon(outside.getScaledInstance(labelInside.getWidth(),
                        labelInside.getHeight(), Image.SCALE_DEFAULT));
                labelInside.setIcon(icon);
            }
        }
        
    }//GEN-LAST:event_btnAbrirInsideActionPerformed

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
            java.util.logging.Logger.getLogger(frmEquipo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmEquipo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmEquipo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmEquipo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmEquipo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAbrirInside;
    private javax.swing.JButton btnAbrirOutside;
    private org.edisoncor.gui.button.ButtonAction btnAtras;
    private org.edisoncor.gui.button.ButtonAction btnCancelar;
    private org.edisoncor.gui.button.ButtonAction btnSiguiente;
    private org.edisoncor.gui.button.ButtonAction btnSiguienteEquipo;
    private com.toedter.calendar.JDateChooser dchFecha;
    private javax.swing.JLabel labelInside;
    private org.edisoncor.gui.label.LabelMetric labelMetric1;
    private org.edisoncor.gui.label.LabelMetric labelMetric10;
    private org.edisoncor.gui.label.LabelMetric labelMetric11;
    private org.edisoncor.gui.label.LabelMetric labelMetric12;
    private org.edisoncor.gui.label.LabelMetric labelMetric13;
    private org.edisoncor.gui.label.LabelMetric labelMetric2;
    private org.edisoncor.gui.label.LabelMetric labelMetric3;
    private org.edisoncor.gui.label.LabelMetric labelMetric4;
    private org.edisoncor.gui.label.LabelMetric labelMetric5;
    private org.edisoncor.gui.label.LabelMetric labelMetric6;
    private org.edisoncor.gui.label.LabelMetric labelMetric7;
    private org.edisoncor.gui.label.LabelMetric labelMetric8;
    private org.edisoncor.gui.label.LabelMetric labelMetric9;
    private javax.swing.JLabel labelOutside;
    private javax.swing.JLabel labelQR;
    private org.edisoncor.gui.panel.Panel panelCliente;
    private org.edisoncor.gui.panel.Panel panelDiagnostico;
    private org.edisoncor.gui.panel.Panel panelEquipo;
    private org.edisoncor.gui.panel.Panel panelPrincipal;
    private org.edisoncor.gui.tabbedPane.TabbedPaneHeader panelTop;
    private org.edisoncor.gui.textField.TextFieldRoundIcon txtApellidos;
    private org.edisoncor.gui.textField.TextFieldRoundIcon txtCedula;
    private org.edisoncor.gui.textField.TextFieldRoundIcon txtEmail;
    private org.edisoncor.gui.textField.TextFieldRoundIcon txtInside;
    private org.edisoncor.gui.textField.TextFieldRoundIcon txtNombres;
    private org.edisoncor.gui.textField.TextFieldRoundIcon txtOutside;
    private org.edisoncor.gui.textField.TextFieldRoundIcon txtTelefono;
    // End of variables declaration//GEN-END:variables
}
