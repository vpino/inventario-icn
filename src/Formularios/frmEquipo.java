package Formularios;

import Clases.Cliente;
import Clases.Datos;
import Clases.DetailEquipo;
import Clases.Equipo;
import Clases.Qr;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
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
        labelMetric14 = new org.edisoncor.gui.label.LabelMetric();
        labelMetric15 = new org.edisoncor.gui.label.LabelMetric();
        labelMetric16 = new org.edisoncor.gui.label.LabelMetric();
        txtPlacaBase = new org.edisoncor.gui.textField.TextFieldRoundIcon();
        txtProcesador = new org.edisoncor.gui.textField.TextFieldRoundIcon();
        txtFuente = new org.edisoncor.gui.textField.TextFieldRoundIcon();
        txtMemoria = new org.edisoncor.gui.textField.TextFieldRoundIcon();
        labelMetric17 = new org.edisoncor.gui.label.LabelMetric();
        labelMetric18 = new org.edisoncor.gui.label.LabelMetric();
        txtDisco = new org.edisoncor.gui.textField.TextFieldRoundIcon();
        labelMetric19 = new org.edisoncor.gui.label.LabelMetric();
        labelMetric20 = new org.edisoncor.gui.label.LabelMetric();
        cmbRespaldo = new org.edisoncor.gui.comboBox.ComboBoxRound();
        labelMetric21 = new org.edisoncor.gui.label.LabelMetric();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaFalla = new javax.swing.JTextArea();
        btnAtrasDetalle = new org.edisoncor.gui.button.ButtonAction();
        btnAgregarDetalle = new org.edisoncor.gui.button.ButtonAction();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registro de Equipo");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        panelTop.setEnabled(false);

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

        panelEquipo.setEnabled(false);

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
        btnSiguienteEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteEquipoActionPerformed(evt);
            }
        });

        btnAtras.setText("Atras");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });

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
                                .addComponent(labelMetric9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtOutside, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnAbrirOutside))
                            .addGroup(panelEquipoLayout.createSequentialGroup()
                                .addGap(99, 99, 99)
                                .addComponent(labelMetric10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(labelOutside, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(panelEquipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelEquipoLayout.createSequentialGroup()
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
                                        .addComponent(btnAbrirInside))))
                            .addGroup(panelEquipoLayout.createSequentialGroup()
                                .addGap(91, 91, 91)
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

        panelDiagnostico.setEnabled(false);

        labelMetric14.setText("Detalles del Equipo");
        labelMetric14.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        labelMetric15.setText("Placa Base:");

        labelMetric16.setText("Procesador:");

        labelMetric17.setText("Fuente:");

        labelMetric18.setText("Memoria:");

        labelMetric19.setText("Disco Duro:");

        labelMetric20.setText("Respaldo:");

        cmbRespaldo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Si", "No" }));

        labelMetric21.setText("Falla:");

        areaFalla.setColumns(20);
        areaFalla.setRows(5);
        jScrollPane1.setViewportView(areaFalla);

        btnAtrasDetalle.setText("Atras");
        btnAtrasDetalle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasDetalleActionPerformed(evt);
            }
        });

        btnAgregarDetalle.setText("Agregar");
        btnAgregarDetalle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarDetalleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelDiagnosticoLayout = new javax.swing.GroupLayout(panelDiagnostico);
        panelDiagnostico.setLayout(panelDiagnosticoLayout);
        panelDiagnosticoLayout.setHorizontalGroup(
            panelDiagnosticoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDiagnosticoLayout.createSequentialGroup()
                .addGroup(panelDiagnosticoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDiagnosticoLayout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(labelMetric21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 511, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelDiagnosticoLayout.createSequentialGroup()
                        .addGap(264, 264, 264)
                        .addComponent(btnAtrasDetalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(btnAgregarDetalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelDiagnosticoLayout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addGroup(panelDiagnosticoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelDiagnosticoLayout.createSequentialGroup()
                                .addComponent(labelMetric19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDisco, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelDiagnosticoLayout.createSequentialGroup()
                                .addGroup(panelDiagnosticoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(panelDiagnosticoLayout.createSequentialGroup()
                                        .addGroup(panelDiagnosticoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(panelDiagnosticoLayout.createSequentialGroup()
                                                .addComponent(labelMetric18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtMemoria, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(panelDiagnosticoLayout.createSequentialGroup()
                                                .addComponent(labelMetric15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtPlacaBase, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(panelDiagnosticoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(labelMetric20, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(labelMetric17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(labelMetric16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(labelMetric14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelDiagnosticoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelDiagnosticoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtProcesador, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                                        .addComponent(txtFuente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDiagnosticoLayout.createSequentialGroup()
                                        .addComponent(cmbRespaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(146, 146, 146)))))))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        panelDiagnosticoLayout.setVerticalGroup(
            panelDiagnosticoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDiagnosticoLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(labelMetric14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addGroup(panelDiagnosticoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelMetric16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelMetric15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPlacaBase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtProcesador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65)
                .addGroup(panelDiagnosticoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelMetric17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelMetric18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMemoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFuente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65)
                .addGroup(panelDiagnosticoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelMetric20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelMetric19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDisco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbRespaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addGroup(panelDiagnosticoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelMetric21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(panelDiagnosticoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAtrasDetalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregarDetalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
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

        Qr qr = new Qr();

        data = qr.codigoRamdon();

        String ruta_imagen = qr.generarQR(data.toString());

        Image preview = Toolkit.getDefaultToolkit().getImage(ruta_imagen);

        ImageIcon icon = new ImageIcon(preview.getScaledInstance(labelQR.getWidth(),
                labelQR.getHeight(), Image.SCALE_DEFAULT));

        labelQR.setIcon(icon);

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
        panelCliente.setEnabled(false);
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

    private void btnSiguienteEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteEquipoActionPerformed

        /* Validaciones */
        if (labelQR.getIcon() == null) {
            JOptionPane.showMessageDialog(rootPane, "Debe ingresar el codigo QR");
            labelQR.requestFocusInWindow();
            return;
        }

        if (dchFecha.getDate() == null) {
            JOptionPane.showMessageDialog(rootPane, "Debe ingresar la fecha");
            dchFecha.requestFocusInWindow();
            return;
        }

        if (labelOutside.getIcon() == null) {
            JOptionPane.showMessageDialog(rootPane, "Debe ingresar la imagen del equipo");
            labelOutside.requestFocusInWindow();
            return;
        }

        if (labelInside.getIcon() == null) {
            JOptionPane.showMessageDialog(rootPane, "Debe ingresar la imagen del hardware del equipo");
            labelInside.requestFocusInWindow();
            return;
        }

        panelTop.setSelectedComponent(panelDiagnostico);
        panelEquipo.setEnabled(false);
        panelDiagnostico.setEnabled(true);


    }//GEN-LAST:event_btnSiguienteEquipoActionPerformed

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed

        panelTop.setSelectedComponent(panelCliente);
        panelEquipo.setEnabled(false);
        panelCliente.setEnabled(true);

    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnAtrasDetalleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasDetalleActionPerformed

        panelTop.setSelectedComponent(panelEquipo);
        panelDiagnostico.setEnabled(false);
        panelEquipo.setEnabled(true);

    }//GEN-LAST:event_btnAtrasDetalleActionPerformed

    private void btnAgregarDetalleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarDetalleActionPerformed

        try {
            /* Instanciamos un objeto de la Clase Datos */
            Datos datos = new Datos();

            /* Validaciones */
            if (txtPlacaBase.getText().equals("")) {
                JOptionPane.showMessageDialog(rootPane, "Debe digitar un el nombre de la tarjeta madre");
                txtPlacaBase.requestFocusInWindow();
                return;
            }

            if (txtProcesador.getText().equals("")) {
                JOptionPane.showMessageDialog(rootPane, "Debe ingresar el nombre del procesador");
                txtProcesador.requestFocusInWindow();
                return;
            }

            if (txtMemoria.getText().equals("")) {
                JOptionPane.showMessageDialog(rootPane, "Debe ingresar las memorias que posee el equipo");
                txtMemoria.requestFocusInWindow();
                return;
            }

            if (txtFuente.getText().equals("")) {
                JOptionPane.showMessageDialog(rootPane, "Debe ingresar la fuente de poder que posee el equipo");
                txtFuente.requestFocusInWindow();
                return;
            }

            if (txtDisco.getText().equals("")) {
                JOptionPane.showMessageDialog(rootPane, "Debe ingresar el disco duro que posee el equipo");
                txtDisco.requestFocusInWindow();
                return;
            }

            /* Llenamos el objeto cliente */
            Cliente cliente = new Cliente(
                    txtNombres.getText(),
                    txtApellidos.getText(),
                    txtCedula.getText(),
                    txtTelefono.getText(),
                    txtEmail.getText());

            /* Llenamos el objeto equipo */
            File qr = new File(RUTA_QR);
            File pic_out = new File(txtOutside.getText());
            File pic_inside = new File(txtInside.getText());

            Equipo equipo = new Equipo(
                    data.toString(),
                    qr,
                    dchFecha.getDate(),
                    pic_out,
                    pic_inside);

            /* Llenamos el objeto Detalle */
            DetailEquipo detalle = new DetailEquipo(
                    data.toString(),
                    txtCedula.getText(),
                    txtPlacaBase.getText(),
                    txtProcesador.getText(),
                    txtMemoria.getText(),
                    txtDisco.getText(),
                    txtFuente.getText(),
                    cmbRespaldo.getSelectedItem().toString(),
                    areaFalla.getText());

            datos.con.setAutoCommit(false);

            if (datos.agregarCliente(cliente)) {

                if (datos.agregarEquipo(equipo)) {

                    if (datos.agregarDetalle(detalle)) {
                        
                        JOptionPane.showMessageDialog(rootPane, "Equipo registrado correctamente ");
                        datos.con.commit();

                    } else {
                        JOptionPane.showMessageDialog(rootPane, "No se pudo registrar el equipo "
                                + "por favor intentelo mas tarde ");
                    }

                } else {
                    JOptionPane.showMessageDialog(rootPane, "No se pudo registrar el equipo "
                            + "por favor intentelo mas tarde ");
                }
                
            } else {
                JOptionPane.showMessageDialog(rootPane, "No se pudo registrar el equipo "
                        + "por favor intentelo mas tarde ");
            }

        } catch (SQLException ex) {
            Logger.getLogger(frmEquipo.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_btnAgregarDetalleActionPerformed

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
    private javax.swing.JTextArea areaFalla;
    private javax.swing.JButton btnAbrirInside;
    private javax.swing.JButton btnAbrirOutside;
    private org.edisoncor.gui.button.ButtonAction btnAgregarDetalle;
    private org.edisoncor.gui.button.ButtonAction btnAtras;
    private org.edisoncor.gui.button.ButtonAction btnAtrasDetalle;
    private org.edisoncor.gui.button.ButtonAction btnCancelar;
    private org.edisoncor.gui.button.ButtonAction btnSiguiente;
    private org.edisoncor.gui.button.ButtonAction btnSiguienteEquipo;
    private org.edisoncor.gui.comboBox.ComboBoxRound cmbRespaldo;
    private com.toedter.calendar.JDateChooser dchFecha;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelInside;
    private org.edisoncor.gui.label.LabelMetric labelMetric1;
    private org.edisoncor.gui.label.LabelMetric labelMetric10;
    private org.edisoncor.gui.label.LabelMetric labelMetric11;
    private org.edisoncor.gui.label.LabelMetric labelMetric12;
    private org.edisoncor.gui.label.LabelMetric labelMetric13;
    private org.edisoncor.gui.label.LabelMetric labelMetric14;
    private org.edisoncor.gui.label.LabelMetric labelMetric15;
    private org.edisoncor.gui.label.LabelMetric labelMetric16;
    private org.edisoncor.gui.label.LabelMetric labelMetric17;
    private org.edisoncor.gui.label.LabelMetric labelMetric18;
    private org.edisoncor.gui.label.LabelMetric labelMetric19;
    private org.edisoncor.gui.label.LabelMetric labelMetric2;
    private org.edisoncor.gui.label.LabelMetric labelMetric20;
    private org.edisoncor.gui.label.LabelMetric labelMetric21;
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
    private org.edisoncor.gui.textField.TextFieldRoundIcon txtDisco;
    private org.edisoncor.gui.textField.TextFieldRoundIcon txtEmail;
    private org.edisoncor.gui.textField.TextFieldRoundIcon txtFuente;
    private org.edisoncor.gui.textField.TextFieldRoundIcon txtInside;
    private org.edisoncor.gui.textField.TextFieldRoundIcon txtMemoria;
    private org.edisoncor.gui.textField.TextFieldRoundIcon txtNombres;
    private org.edisoncor.gui.textField.TextFieldRoundIcon txtOutside;
    private org.edisoncor.gui.textField.TextFieldRoundIcon txtPlacaBase;
    private org.edisoncor.gui.textField.TextFieldRoundIcon txtProcesador;
    private org.edisoncor.gui.textField.TextFieldRoundIcon txtTelefono;
    // End of variables declaration//GEN-END:variables
}
