/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Clases.Cliente;
import Clases.TarjetaCredito;
import java.awt.Color;

import Clases.UtilJavaflix;

import java.awt.Color;

import Clases.UtilJavaflix;
import Excepciones.EmailNoValido;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import javax.swing.JOptionPane;

/**
 *
 * @author Francisco
 */
public class registroUsuario extends javax.swing.JFrame {

    private ventanaPrincipal padre;

    /**
     * Creates new form ventanaPrincipal
     */
    public registroUsuario(ventanaPrincipal main) {
        padre = main;
        initComponents();
        this.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jSeparator1 = new javax.swing.JSeparator();
        jPanelRegistro = new javax.swing.JPanel();
        jPanelOpcionesRegistro = new javax.swing.JPanel();
        jLabelSalirRegistro = new javax.swing.JLabel();
        jLabelCREATUCUENTARegistro = new javax.swing.JLabel();
        jLabelDEJAVAFLIXRegistro = new javax.swing.JLabel();
        jLabelDoblezRegistro = new javax.swing.JLabel();
        jLabelFondoEtiquetasRegistro = new javax.swing.JLabel();
        jLabelJAVAFLIXRegistro = new javax.swing.JLabel();
        jLabelJAVAFLIXSombraRegistro = new javax.swing.JLabel();
        jPanelRegistrarseRegistro = new javax.swing.JPanel();
        jLabelRegistrarsebuttomRegistro = new javax.swing.JLabel();
        jPanelIntroDatosRegistro = new javax.swing.JPanel();
        jLabelDNIRegistro = new javax.swing.JLabel();
        jTextFieldDNIRegistro = new javax.swing.JTextField();
        jSeparatorDNIRegistro = new javax.swing.JSeparator();
        jLabelNombreRegistro = new javax.swing.JLabel();
        jTextFieldNombreRegistro = new javax.swing.JTextField();
        jSeparatorNombreRegistro = new javax.swing.JSeparator();
        jLabelNumTarjetaRegistro = new javax.swing.JLabel();
        jTextFieldCERegistro = new javax.swing.JTextField();
        jSeparatorClaveRegistro = new javax.swing.JSeparator();
        jLabelCaducidadRegistro = new javax.swing.JLabel();
        jLabelSaldoRegistro = new javax.swing.JLabel();
        jLabelClaveRegistro = new javax.swing.JLabel();
        jTextFieldSaldoRegistro = new javax.swing.JTextField();
        jLabelDATOSBANCARIOS = new javax.swing.JLabel();
        jSeparatorNumTarjetaRegistro = new javax.swing.JSeparator();
        jSeparatorCaducidadRegistro = new javax.swing.JSeparator();
        jSeparatorSaldoRegistro = new javax.swing.JSeparator();
        jSeparatorCERegistro = new javax.swing.JSeparator();
        jLabelCERegistro = new javax.swing.JLabel();
        jPasswordFieldClaveRegistro = new javax.swing.JPasswordField();
        jFormattedTextFieldCaducidad = new javax.swing.JFormattedTextField();
        jFormattedTextFieldNumTarjetaRegistro = new javax.swing.JFormattedTextField();
        jLabelFondoRegistro = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1239, 725));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanelRegistro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelOpcionesRegistro.setBackground(new java.awt.Color(255, 255, 255));

        jLabelSalirRegistro.setBackground(new java.awt.Color(255, 255, 255));
        jLabelSalirRegistro.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        jLabelSalirRegistro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelSalirRegistro.setText("X");
        jLabelSalirRegistro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelSalirRegistroMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelSalirRegistroMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelSalirRegistroMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanelOpcionesRegistroLayout = new javax.swing.GroupLayout(jPanelOpcionesRegistro);
        jPanelOpcionesRegistro.setLayout(jPanelOpcionesRegistroLayout);
        jPanelOpcionesRegistroLayout.setHorizontalGroup(
            jPanelOpcionesRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelOpcionesRegistroLayout.createSequentialGroup()
                .addComponent(jLabelSalirRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 740, Short.MAX_VALUE))
        );
        jPanelOpcionesRegistroLayout.setVerticalGroup(
            jPanelOpcionesRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelSalirRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanelRegistro.add(jPanelOpcionesRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, -1));

        jLabelCREATUCUENTARegistro.setFont(new java.awt.Font("Roboto Light", 0, 36)); // NOI18N
        jLabelCREATUCUENTARegistro.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCREATUCUENTARegistro.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelCREATUCUENTARegistro.setText("CREA TU CUENTA");
        jPanelRegistro.add(jLabelCREATUCUENTARegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 0, 430, 70));

        jLabelDEJAVAFLIXRegistro.setFont(new java.awt.Font("Roboto Light", 0, 36)); // NOI18N
        jLabelDEJAVAFLIXRegistro.setForeground(new java.awt.Color(255, 255, 255));
        jLabelDEJAVAFLIXRegistro.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelDEJAVAFLIXRegistro.setText("DE JAVAFLIX");
        jPanelRegistro.add(jLabelDEJAVAFLIXRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 50, 410, 70));

        jLabelDoblezRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/doblez.jpg"))); // NOI18N
        jPanelRegistro.add(jLabelDoblezRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 120, 30, -1));

        jLabelFondoEtiquetasRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/fondoetiquetas.jpg"))); // NOI18N
        jLabelFondoEtiquetasRegistro.setText("jLabel7");
        jPanelRegistro.add(jLabelFondoEtiquetasRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 0, 440, 120));

        jLabelJAVAFLIXRegistro.setFont(new java.awt.Font("Roboto Black", 0, 100)); // NOI18N
        jLabelJAVAFLIXRegistro.setForeground(new java.awt.Color(255, 255, 255));
        jLabelJAVAFLIXRegistro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelJAVAFLIXRegistro.setText("JAVAFLIX");
        jPanelRegistro.add(jLabelJAVAFLIXRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 830, 130));

        jLabelJAVAFLIXSombraRegistro.setFont(new java.awt.Font("Roboto Black", 0, 100)); // NOI18N
        jLabelJAVAFLIXSombraRegistro.setForeground(new java.awt.Color(112, 101, 101));
        jLabelJAVAFLIXSombraRegistro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelJAVAFLIXSombraRegistro.setText("JAVAFLIX");
        jPanelRegistro.add(jLabelJAVAFLIXSombraRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 810, 130));

        jPanelRegistrarseRegistro.setBackground(new java.awt.Color(180, 45, 49));
        jPanelRegistrarseRegistro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanelRegistrarseRegistro.setPreferredSize(new java.awt.Dimension(170, 62));
        jPanelRegistrarseRegistro.setRequestFocusEnabled(false);
        jPanelRegistrarseRegistro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelRegistrarseRegistroMouseEntered(evt);
            }
        });

        jLabelRegistrarsebuttomRegistro.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabelRegistrarsebuttomRegistro.setForeground(new java.awt.Color(255, 255, 255));
        jLabelRegistrarsebuttomRegistro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelRegistrarsebuttomRegistro.setText("REGISTRARSE");
        jLabelRegistrarsebuttomRegistro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelRegistrarsebuttomRegistro.setFocusable(false);
        jLabelRegistrarsebuttomRegistro.setMaximumSize(new java.awt.Dimension(62, 17));
        jLabelRegistrarsebuttomRegistro.setMinimumSize(new java.awt.Dimension(62, 17));
        jLabelRegistrarsebuttomRegistro.setName(""); // NOI18N
        jLabelRegistrarsebuttomRegistro.setPreferredSize(new java.awt.Dimension(62, 17));
        jLabelRegistrarsebuttomRegistro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelRegistrarsebuttomRegistroMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelRegistrarsebuttomRegistroMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelRegistrarsebuttomRegistroMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanelRegistrarseRegistroLayout = new javax.swing.GroupLayout(jPanelRegistrarseRegistro);
        jPanelRegistrarseRegistro.setLayout(jPanelRegistrarseRegistroLayout);
        jPanelRegistrarseRegistroLayout.setHorizontalGroup(
            jPanelRegistrarseRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelRegistrarsebuttomRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
        );
        jPanelRegistrarseRegistroLayout.setVerticalGroup(
            jPanelRegistrarseRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelRegistrarsebuttomRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
        );

        jPanelRegistro.add(jPanelRegistrarseRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 510, 240, 90));

        jPanelIntroDatosRegistro.setBackground(new java.awt.Color(255, 255, 255));
        jPanelIntroDatosRegistro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelDNIRegistro.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jLabelDNIRegistro.setText("DNI");
        jPanelIntroDatosRegistro.add(jLabelDNIRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 300, -1));

        jTextFieldDNIRegistro.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        jTextFieldDNIRegistro.setForeground(java.awt.Color.gray);
        jTextFieldDNIRegistro.setText("Escriba su DNI");
        jTextFieldDNIRegistro.setToolTipText("");
        jTextFieldDNIRegistro.setBorder(null);
        jTextFieldDNIRegistro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTextFieldDNIRegistroMousePressed(evt);
            }
        });
        jTextFieldDNIRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDNIRegistroActionPerformed(evt);
            }
        });
        jPanelIntroDatosRegistro.add(jTextFieldDNIRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 300, -1));
        jPanelIntroDatosRegistro.add(jSeparatorDNIRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 310, 20));

        jLabelNombreRegistro.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jLabelNombreRegistro.setText("NOMBRE");
        jPanelIntroDatosRegistro.add(jLabelNombreRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 300, -1));

        jTextFieldNombreRegistro.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        jTextFieldNombreRegistro.setForeground(java.awt.Color.gray);
        jTextFieldNombreRegistro.setText("Escriba su nombre");
        jTextFieldNombreRegistro.setBorder(null);
        jTextFieldNombreRegistro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTextFieldNombreRegistroMousePressed(evt);
            }
        });
        jTextFieldNombreRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNombreRegistroActionPerformed(evt);
            }
        });
        jPanelIntroDatosRegistro.add(jTextFieldNombreRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 300, -1));
        jPanelIntroDatosRegistro.add(jSeparatorNombreRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 310, 20));

        jLabelNumTarjetaRegistro.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jLabelNumTarjetaRegistro.setText("Nº TARJETA");
        jPanelIntroDatosRegistro.add(jLabelNumTarjetaRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 470, 300, -1));

        jTextFieldCERegistro.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        jTextFieldCERegistro.setForeground(java.awt.Color.gray);
        jTextFieldCERegistro.setText("Escriba su correo electrónico");
        jTextFieldCERegistro.setBorder(null);
        jTextFieldCERegistro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTextFieldCERegistroMousePressed(evt);
            }
        });
        jPanelIntroDatosRegistro.add(jTextFieldCERegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 300, -1));
        jPanelIntroDatosRegistro.add(jSeparatorClaveRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, 310, 20));

        jLabelCaducidadRegistro.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jLabelCaducidadRegistro.setText("CADUCIDAD (YYYY-MM-DD)");
        jPanelIntroDatosRegistro.add(jLabelCaducidadRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 540, 300, -1));

        jLabelSaldoRegistro.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jLabelSaldoRegistro.setText("SALDO");
        jPanelIntroDatosRegistro.add(jLabelSaldoRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 610, 300, -1));

        jLabelClaveRegistro.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jLabelClaveRegistro.setText("CLAVE");
        jPanelIntroDatosRegistro.add(jLabelClaveRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, 300, 20));

        jTextFieldSaldoRegistro.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        jTextFieldSaldoRegistro.setForeground(java.awt.Color.gray);
        jTextFieldSaldoRegistro.setText("Escriba su saldo");
        jTextFieldSaldoRegistro.setBorder(null);
        jTextFieldSaldoRegistro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTextFieldSaldoRegistroMousePressed(evt);
            }
        });
        jPanelIntroDatosRegistro.add(jTextFieldSaldoRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 640, 300, -1));

        jLabelDATOSBANCARIOS.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabelDATOSBANCARIOS.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelDATOSBANCARIOS.setText("DATOS BANCARIOS");
        jPanelIntroDatosRegistro.add(jLabelDATOSBANCARIOS, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 410, -1));
        jPanelIntroDatosRegistro.add(jSeparatorNumTarjetaRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 520, 310, 20));
        jPanelIntroDatosRegistro.add(jSeparatorCaducidadRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 590, 310, 20));
        jPanelIntroDatosRegistro.add(jSeparatorSaldoRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 660, 310, 20));
        jPanelIntroDatosRegistro.add(jSeparatorCERegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 310, 20));

        jLabelCERegistro.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jLabelCERegistro.setText("CORREO ELECTRÓNICO");
        jPanelIntroDatosRegistro.add(jLabelCERegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, 300, 20));

        jPasswordFieldClaveRegistro.setForeground(java.awt.Color.gray);
        jPasswordFieldClaveRegistro.setText("**********");
        jPasswordFieldClaveRegistro.setBorder(null);
        jPasswordFieldClaveRegistro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPasswordFieldClaveRegistroMousePressed(evt);
            }
        });
        jPanelIntroDatosRegistro.add(jPasswordFieldClaveRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, 300, -1));

        jFormattedTextFieldCaducidad.setBorder(null);
        jFormattedTextFieldCaducidad.setColumns(16);
        jFormattedTextFieldCaducidad.setForeground(java.awt.Color.gray);
        jFormattedTextFieldCaducidad.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("yyyy-MM-dd"))));
        jFormattedTextFieldCaducidad.setText("0000 00 00\n");
        jFormattedTextFieldCaducidad.setToolTipText("");
        jFormattedTextFieldCaducidad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jFormattedTextFieldCaducidadMousePressed(evt);
            }
        });
        jPanelIntroDatosRegistro.add(jFormattedTextFieldCaducidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 570, 300, -1));

        jFormattedTextFieldNumTarjetaRegistro.setBorder(null);
        jFormattedTextFieldNumTarjetaRegistro.setColumns(16);
        jFormattedTextFieldNumTarjetaRegistro.setForeground(java.awt.Color.gray);
        try {
            jFormattedTextFieldNumTarjetaRegistro.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#### #### #### ####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldNumTarjetaRegistro.setText("0000 0000 0000 0000            ");
        jFormattedTextFieldNumTarjetaRegistro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jFormattedTextFieldNumTarjetaRegistroMousePressed(evt);
            }
        });
        jPanelIntroDatosRegistro.add(jFormattedTextFieldNumTarjetaRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 500, 300, -1));

        jPanelRegistro.add(jPanelIntroDatosRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 0, 410, 710));

        jLabelFondoRegistro.setBackground(new java.awt.Color(255, 255, 255));
        jLabelFondoRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/palomitasbienrojo.jpg"))); // NOI18N
        jLabelFondoRegistro.setText("jLabel2");
        jPanelRegistro.add(jLabelFondoRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 1239, 700));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 1239, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldDNIRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDNIRegistroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDNIRegistroActionPerformed

    private void jLabelRegistrarsebuttomRegistroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelRegistrarsebuttomRegistroMouseClicked
        try {
            // Hacemos esto para validar los dos campos 
            UtilJavaflix.validarEmail(jTextFieldCERegistro.getText());
            LocalDate fechacaducidad = LocalDate.parse(jFormattedTextFieldCaducidad.getText());

            TarjetaCredito nuevatarjeta = new TarjetaCredito(jFormattedTextFieldNumTarjetaRegistro.getText(), fechacaducidad,
                    Double.parseDouble(jTextFieldSaldoRegistro.getText()));
            Cliente nuevocliente = new Cliente(jTextFieldDNIRegistro.getText(), jTextFieldNombreRegistro.getText(),
                    jTextFieldCERegistro.getText(), String.valueOf(jPasswordFieldClaveRegistro.getPassword()), nuevatarjeta);
            UtilJavaflix.addUsuario(nuevocliente);
            UtilJavaflix.guardarDatos();
            JOptionPane.showMessageDialog(rootPane, "Usuario registrado correctamente", "Registro completado", JOptionPane.INFORMATION_MESSAGE);
            padre.setVisible(true);
            this.dispose();
        } catch (EmailNoValido ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } catch (DateTimeParseException ex) {
            JOptionPane.showMessageDialog(rootPane, "ERROR: Formato de fecha invalido (Usar dd-MM-yyyy)", "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            System.out.println(UtilJavaflix.getClientes());
        }
    }//GEN-LAST:event_jLabelRegistrarsebuttomRegistroMouseClicked

    private void jLabelRegistrarsebuttomRegistroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelRegistrarsebuttomRegistroMouseEntered
        // TODO add your handling code here:
        jPanelRegistrarseRegistro.setBackground(new Color(148, 13, 30));
    }//GEN-LAST:event_jLabelRegistrarsebuttomRegistroMouseEntered

    private void jLabelRegistrarsebuttomRegistroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelRegistrarsebuttomRegistroMouseExited
        // TODO add your handling code here:
        jPanelRegistrarseRegistro.setBackground(new Color(180, 45, 49));
    }//GEN-LAST:event_jLabelRegistrarsebuttomRegistroMouseExited

    private void jTextFieldDNIRegistroMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldDNIRegistroMousePressed
        // TODO add your handling code here:
        if (jTextFieldDNIRegistro.getText().equals("Escriba su DNI")) {
            jTextFieldDNIRegistro.setText("");
            jTextFieldDNIRegistro.setForeground(Color.black);
        }
        if (String.valueOf(jPasswordFieldClaveRegistro.getPassword()).isEmpty()) {
            jPasswordFieldClaveRegistro.setText("**********");
            jPasswordFieldClaveRegistro.setForeground(Color.gray);
        }
        if (jTextFieldNombreRegistro.getText().isEmpty()) {
            jTextFieldNombreRegistro.setText("Escriba su nombre");
            jTextFieldNombreRegistro.setForeground(Color.gray);
        }
        if (jTextFieldCERegistro.getText().isEmpty()) {
            jTextFieldCERegistro.setText("Escriba su correo electrónico");
            jTextFieldCERegistro.setForeground(Color.gray);
        }
    }//GEN-LAST:event_jTextFieldDNIRegistroMousePressed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        UtilJavaflix.guardarDatos();
        padre.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_formWindowClosing

    private void jTextFieldNombreRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNombreRegistroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNombreRegistroActionPerformed

    private void jPanelRegistrarseRegistroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelRegistrarseRegistroMouseEntered
        // TODO add your handling code here:
        jPanelRegistrarseRegistro.setOpaque(rootPaneCheckingEnabled);
    }//GEN-LAST:event_jPanelRegistrarseRegistroMouseEntered

    private void jTextFieldNombreRegistroMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldNombreRegistroMousePressed
        // TODO add your handling code here:
        if (jTextFieldNombreRegistro.getText().equals("Escriba su nombre")) {
            jTextFieldNombreRegistro.setText("");
            jTextFieldNombreRegistro.setForeground(Color.black);
        }
        if (jTextFieldDNIRegistro.getText().isEmpty()) {
            jTextFieldDNIRegistro.setText("Escriba su DNI");
            jTextFieldDNIRegistro.setForeground(Color.gray);
        }
        if (jTextFieldCERegistro.getText().isEmpty()) {
            jTextFieldCERegistro.setText("Escriba su correo electrónico");
            jTextFieldCERegistro.setForeground(Color.gray);
        }
        if (String.valueOf(jPasswordFieldClaveRegistro.getPassword()).isEmpty()) {
            jPasswordFieldClaveRegistro.setText("**********");
            jPasswordFieldClaveRegistro.setForeground(Color.gray);
        }
    }//GEN-LAST:event_jTextFieldNombreRegistroMousePressed

    private void jTextFieldCERegistroMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldCERegistroMousePressed
        // TODO add your handling code here:
        if (jTextFieldCERegistro.getText().equals("Escriba su correo electrónico")) {
            jTextFieldCERegistro.setText("");
            jTextFieldCERegistro.setForeground(Color.black);
        }
        if (jTextFieldDNIRegistro.getText().isEmpty()) {
            jTextFieldDNIRegistro.setText("Escriba su DNI");
            jTextFieldDNIRegistro.setForeground(Color.gray);
        }
        if (jTextFieldNombreRegistro.getText().isEmpty()) {
            jTextFieldNombreRegistro.setText("Escriba su nombre");
            jTextFieldNombreRegistro.setForeground(Color.gray);
        }
        if (String.valueOf(jPasswordFieldClaveRegistro.getPassword()).isEmpty()) {
            jPasswordFieldClaveRegistro.setText("**********");
            jPasswordFieldClaveRegistro.setForeground(Color.gray);
        }
    }//GEN-LAST:event_jTextFieldCERegistroMousePressed

    private void jPasswordFieldClaveRegistroMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPasswordFieldClaveRegistroMousePressed
        // TODO add your handling code here:
        if (String.valueOf(jPasswordFieldClaveRegistro.getPassword()).equals("**********")) {
            jPasswordFieldClaveRegistro.setText("");
            jPasswordFieldClaveRegistro.setForeground(Color.black);
        }
        if (jTextFieldDNIRegistro.getText().isEmpty()) {
            jTextFieldDNIRegistro.setText("Escriba su DNI");
            jTextFieldDNIRegistro.setForeground(Color.gray);
        }
        if (jTextFieldNombreRegistro.getText().isEmpty()) {
            jTextFieldNombreRegistro.setText("Escriba su nombre");
            jTextFieldNombreRegistro.setForeground(Color.gray);
        }
        if (jTextFieldCERegistro.getText().isEmpty()) {
            jTextFieldCERegistro.setText("Escriba su correo electrónico");
            jTextFieldCERegistro.setForeground(Color.gray);
        }
    }//GEN-LAST:event_jPasswordFieldClaveRegistroMousePressed

    private void jFormattedTextFieldCaducidadMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jFormattedTextFieldCaducidadMousePressed
        // TODO add your handling code here:
        if (String.valueOf(jFormattedTextFieldCaducidad.getText()).equals("")) {
            jFormattedTextFieldCaducidad.setText("");
            jFormattedTextFieldCaducidad.setForeground(Color.black);
        }
        if (jFormattedTextFieldNumTarjetaRegistro.getText().isEmpty()) {
            jFormattedTextFieldNumTarjetaRegistro.setText("0000 0000 0000 0000");
            jFormattedTextFieldNumTarjetaRegistro.setForeground(Color.gray);
        }
        if (jTextFieldSaldoRegistro.getText().isEmpty()) {
            jTextFieldSaldoRegistro.setText("Escriba su saldo");
            jTextFieldSaldoRegistro.setForeground(Color.gray);
        }
    }//GEN-LAST:event_jFormattedTextFieldCaducidadMousePressed

    private void jTextFieldSaldoRegistroMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldSaldoRegistroMousePressed
        // TODO add your handling code here:
        if (String.valueOf(jTextFieldSaldoRegistro.getText()).equals("Escriba su saldo")) {
            jTextFieldSaldoRegistro.setText("");
            jTextFieldSaldoRegistro.setForeground(Color.black);
        }
        if (jFormattedTextFieldNumTarjetaRegistro.getText().isEmpty()) {
            jFormattedTextFieldNumTarjetaRegistro.setText("0000 0000 0000 0000");
            jFormattedTextFieldNumTarjetaRegistro.setForeground(Color.gray);
        }
        if (jFormattedTextFieldCaducidad.getText().isEmpty()) {
            jFormattedTextFieldCaducidad.setText("");
            jFormattedTextFieldCaducidad.setForeground(Color.gray);
        }
    }//GEN-LAST:event_jTextFieldSaldoRegistroMousePressed

    private void jFormattedTextFieldNumTarjetaRegistroMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jFormattedTextFieldNumTarjetaRegistroMousePressed
        if (String.valueOf(jFormattedTextFieldNumTarjetaRegistro.getText()).equals("0000 0000 0000 0000")) {
            jFormattedTextFieldNumTarjetaRegistro.setText("");
            jFormattedTextFieldNumTarjetaRegistro.setForeground(Color.black);
        }
        if (jTextFieldSaldoRegistro.getText().isEmpty()) {
            jTextFieldSaldoRegistro.setText("Escriba su saldo");
            jTextFieldSaldoRegistro.setForeground(Color.gray);
        }
        if (jFormattedTextFieldCaducidad.getText().isEmpty()) {
            jFormattedTextFieldCaducidad.setText("");
            jFormattedTextFieldCaducidad.setForeground(Color.gray);
        }
    }//GEN-LAST:event_jFormattedTextFieldNumTarjetaRegistroMousePressed

    private void jLabelSalirRegistroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSalirRegistroMouseEntered
        // TODO add your handling code here:
        jLabelSalirRegistro.setBackground(new Color(232,17,35));
        jLabelSalirRegistro.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_jLabelSalirRegistroMouseEntered

    private void jLabelSalirRegistroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSalirRegistroMouseExited
        // TODO add your handling code here:
        jLabelSalirRegistro.setBackground(new Color(255,255,255));
        jLabelSalirRegistro.setForeground(new Color(0,0,0));
    }//GEN-LAST:event_jLabelSalirRegistroMouseExited

    private void jLabelSalirRegistroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSalirRegistroMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        padre.setVisible(true);
    }//GEN-LAST:event_jLabelSalirRegistroMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JFormattedTextField jFormattedTextFieldCaducidad;
    private javax.swing.JFormattedTextField jFormattedTextFieldNumTarjetaRegistro;
    private javax.swing.JLabel jLabelCERegistro;
    private javax.swing.JLabel jLabelCREATUCUENTARegistro;
    private javax.swing.JLabel jLabelCaducidadRegistro;
    private javax.swing.JLabel jLabelClaveRegistro;
    private javax.swing.JLabel jLabelDATOSBANCARIOS;
    private javax.swing.JLabel jLabelDEJAVAFLIXRegistro;
    private javax.swing.JLabel jLabelDNIRegistro;
    private javax.swing.JLabel jLabelDoblezRegistro;
    private javax.swing.JLabel jLabelFondoEtiquetasRegistro;
    private javax.swing.JLabel jLabelFondoRegistro;
    private javax.swing.JLabel jLabelJAVAFLIXRegistro;
    private javax.swing.JLabel jLabelJAVAFLIXSombraRegistro;
    private javax.swing.JLabel jLabelNombreRegistro;
    private javax.swing.JLabel jLabelNumTarjetaRegistro;
    private javax.swing.JLabel jLabelRegistrarsebuttomRegistro;
    private javax.swing.JLabel jLabelSaldoRegistro;
    private javax.swing.JLabel jLabelSalirRegistro;
    private javax.swing.JPanel jPanelIntroDatosRegistro;
    private javax.swing.JPanel jPanelOpcionesRegistro;
    private javax.swing.JPanel jPanelRegistrarseRegistro;
    private javax.swing.JPanel jPanelRegistro;
    private javax.swing.JPasswordField jPasswordFieldClaveRegistro;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparatorCERegistro;
    private javax.swing.JSeparator jSeparatorCaducidadRegistro;
    private javax.swing.JSeparator jSeparatorClaveRegistro;
    private javax.swing.JSeparator jSeparatorDNIRegistro;
    private javax.swing.JSeparator jSeparatorNombreRegistro;
    private javax.swing.JSeparator jSeparatorNumTarjetaRegistro;
    private javax.swing.JSeparator jSeparatorSaldoRegistro;
    private javax.swing.JTextField jTextFieldCERegistro;
    private javax.swing.JTextField jTextFieldDNIRegistro;
    private javax.swing.JTextField jTextFieldNombreRegistro;
    private javax.swing.JTextField jTextFieldSaldoRegistro;
    // End of variables declaration//GEN-END:variables
}
