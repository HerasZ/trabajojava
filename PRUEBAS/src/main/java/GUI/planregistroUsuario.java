/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Clases.Cliente;
import Clases.PlanSuscripcion;
import Clases.TarjetaCredito;
import java.awt.Color;

import Clases.UtilJavaflix;

import java.awt.Color;

import Clases.UtilJavaflix;
import Excepciones.EmailNoValido;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import javax.swing.JOptionPane;

/**
 *
 * @author Francisco
 */
public class planregistroUsuario extends javax.swing.JFrame {

    private registroUsuario padre;
    private String dni;
    private String nombre;
    private String email;
    private String pass;
    private TarjetaCredito tarjeta;

    /**
     * Creates new form ventanaPrincipal
     */
    public planregistroUsuario(registroUsuario main, String dni, String nombre, String email, String pass, TarjetaCredito tarjeta) {
        padre = main;
        initComponents();
        this.setLocationRelativeTo(null);
        this.setVisible(true);

        this.dni = dni;
        this.nombre = nombre;
        this.email = email;
        this.pass = pass;
        this.tarjeta = tarjeta;
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
        jPanelCerrarRegistro = new javax.swing.JPanel();
        jLabelCerrarRegistro = new javax.swing.JLabel();
        jPanelAtrasRegistro = new javax.swing.JPanel();
        jLabelAtrasRegistro = new javax.swing.JLabel();
        jLabelCREATUCUENTARegistro = new javax.swing.JLabel();
        jLabelDoblezRegistro = new javax.swing.JLabel();
        jLabelFondoEtiquetasRegistro = new javax.swing.JLabel();
        jLabelJAVAFLIXRegistro = new javax.swing.JLabel();
        jLabelJAVAFLIXSombraRegistro = new javax.swing.JLabel();
        jPanelIntroDatosRegistro = new javax.swing.JPanel();
        jLabelJavaFlixBasico = new javax.swing.JLabel();
        jPanelJavaFlixBasicoPrecio = new javax.swing.JPanel();
        jLabelJavaFlixBasicoPrecio = new javax.swing.JLabel();
        jLabelJavaFlixEstandar = new javax.swing.JLabel();
        jPanelJavaFlixEstandarPrecio = new javax.swing.JPanel();
        jLabelJavaFlixEstandarPrecio = new javax.swing.JLabel();
        jLabelJavaFlixPremium = new javax.swing.JLabel();
        jPanelJavaFlixPremiumPrecio = new javax.swing.JPanel();
        jLabelJavaFlixPremiumPrecio = new javax.swing.JLabel();
        jLabelFondoRegistro = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1239, 725));
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanelRegistro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelOpcionesRegistro.setBackground(new java.awt.Color(255, 255, 255));
        jPanelOpcionesRegistro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelCerrarRegistro.setBackground(new java.awt.Color(255, 255, 255));
        jPanelCerrarRegistro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelCerrarRegistroMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelCerrarRegistroMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelCerrarRegistroMouseExited(evt);
            }
        });
        jPanelCerrarRegistro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelCerrarRegistro.setBackground(new java.awt.Color(255, 255, 255));
        jLabelCerrarRegistro.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        jLabelCerrarRegistro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCerrarRegistro.setText("X");
        jPanelCerrarRegistro.add(jLabelCerrarRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 30));

        jPanelOpcionesRegistro.add(jPanelCerrarRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 30));

        jPanelAtrasRegistro.setBackground(new java.awt.Color(255, 255, 255));
        jPanelAtrasRegistro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelAtrasRegistroMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelAtrasRegistroMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelAtrasRegistroMouseExited(evt);
            }
        });
        jPanelAtrasRegistro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelAtrasRegistro.setBackground(new java.awt.Color(255, 255, 255));
        jLabelAtrasRegistro.setFont(new java.awt.Font("Rockwell Condensed", 0, 24)); // NOI18N
        jLabelAtrasRegistro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelAtrasRegistro.setText("< ");
        jPanelAtrasRegistro.add(jLabelAtrasRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, -1));

        jPanelOpcionesRegistro.add(jPanelAtrasRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 60, 30));

        jPanelRegistro.add(jPanelOpcionesRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, -1));

        jLabelCREATUCUENTARegistro.setFont(new java.awt.Font("Roboto Light", 0, 36)); // NOI18N
        jLabelCREATUCUENTARegistro.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCREATUCUENTARegistro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCREATUCUENTARegistro.setText("ELIGE TU PLAN");
        jPanelRegistro.add(jLabelCREATUCUENTARegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 0, 440, 120));

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

        jPanelIntroDatosRegistro.setBackground(new java.awt.Color(255, 255, 255));
        jPanelIntroDatosRegistro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelJavaFlixBasico.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabelJavaFlixBasico.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelJavaFlixBasico.setText("JavaFlix Básico");
        jPanelIntroDatosRegistro.add(jLabelJavaFlixBasico, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 410, -1));

        jPanelJavaFlixBasicoPrecio.setBackground(new java.awt.Color(180, 45, 49));
        jPanelJavaFlixBasicoPrecio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanelJavaFlixBasicoPrecio.setPreferredSize(new java.awt.Dimension(170, 62));
        jPanelJavaFlixBasicoPrecio.setRequestFocusEnabled(false);
        jPanelJavaFlixBasicoPrecio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelJavaFlixBasicoPrecioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelJavaFlixBasicoPrecioMouseExited(evt);
            }
        });

        jLabelJavaFlixBasicoPrecio.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabelJavaFlixBasicoPrecio.setForeground(new java.awt.Color(255, 255, 255));
        jLabelJavaFlixBasicoPrecio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelJavaFlixBasicoPrecio.setText("8,99€ ");
        jLabelJavaFlixBasicoPrecio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelJavaFlixBasicoPrecioMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelJavaFlixBasicoPrecioLayout = new javax.swing.GroupLayout(jPanelJavaFlixBasicoPrecio);
        jPanelJavaFlixBasicoPrecio.setLayout(jPanelJavaFlixBasicoPrecioLayout);
        jPanelJavaFlixBasicoPrecioLayout.setHorizontalGroup(
            jPanelJavaFlixBasicoPrecioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelJavaFlixBasicoPrecio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
        );
        jPanelJavaFlixBasicoPrecioLayout.setVerticalGroup(
            jPanelJavaFlixBasicoPrecioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelJavaFlixBasicoPrecioLayout.createSequentialGroup()
                .addComponent(jLabelJavaFlixBasicoPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanelIntroDatosRegistro.add(jPanelJavaFlixBasicoPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, 130, 60));

        jLabelJavaFlixEstandar.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabelJavaFlixEstandar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelJavaFlixEstandar.setText("JavaFlix Estándar\n");
        jPanelIntroDatosRegistro.add(jLabelJavaFlixEstandar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 410, -1));

        jPanelJavaFlixEstandarPrecio.setBackground(new java.awt.Color(180, 45, 49));
        jPanelJavaFlixEstandarPrecio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanelJavaFlixEstandarPrecio.setPreferredSize(new java.awt.Dimension(170, 62));
        jPanelJavaFlixEstandarPrecio.setRequestFocusEnabled(false);
        jPanelJavaFlixEstandarPrecio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelJavaFlixEstandarPrecioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelJavaFlixEstandarPrecioMouseExited(evt);
            }
        });

        jLabelJavaFlixEstandarPrecio.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabelJavaFlixEstandarPrecio.setForeground(new java.awt.Color(255, 255, 255));
        jLabelJavaFlixEstandarPrecio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelJavaFlixEstandarPrecio.setText("11,99€");
        jLabelJavaFlixEstandarPrecio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelJavaFlixEstandarPrecioMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelJavaFlixEstandarPrecioLayout = new javax.swing.GroupLayout(jPanelJavaFlixEstandarPrecio);
        jPanelJavaFlixEstandarPrecio.setLayout(jPanelJavaFlixEstandarPrecioLayout);
        jPanelJavaFlixEstandarPrecioLayout.setHorizontalGroup(
            jPanelJavaFlixEstandarPrecioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelJavaFlixEstandarPrecioLayout.createSequentialGroup()
                .addComponent(jLabelJavaFlixEstandarPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanelJavaFlixEstandarPrecioLayout.setVerticalGroup(
            jPanelJavaFlixEstandarPrecioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelJavaFlixEstandarPrecio, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        jPanelIntroDatosRegistro.add(jPanelJavaFlixEstandarPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 370, 130, 60));

        jLabelJavaFlixPremium.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabelJavaFlixPremium.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelJavaFlixPremium.setText("JavaFlix Premium\n");
        jPanelIntroDatosRegistro.add(jLabelJavaFlixPremium, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 490, 410, -1));

        jPanelJavaFlixPremiumPrecio.setBackground(new java.awt.Color(180, 45, 49));
        jPanelJavaFlixPremiumPrecio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanelJavaFlixPremiumPrecio.setPreferredSize(new java.awt.Dimension(170, 62));
        jPanelJavaFlixPremiumPrecio.setRequestFocusEnabled(false);
        jPanelJavaFlixPremiumPrecio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelJavaFlixPremiumPrecioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelJavaFlixPremiumPrecioMouseExited(evt);
            }
        });

        jLabelJavaFlixPremiumPrecio.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabelJavaFlixPremiumPrecio.setForeground(new java.awt.Color(255, 255, 255));
        jLabelJavaFlixPremiumPrecio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelJavaFlixPremiumPrecio.setText("15,99€\n");
        jLabelJavaFlixPremiumPrecio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelJavaFlixPremiumPrecioMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelJavaFlixPremiumPrecioLayout = new javax.swing.GroupLayout(jPanelJavaFlixPremiumPrecio);
        jPanelJavaFlixPremiumPrecio.setLayout(jPanelJavaFlixPremiumPrecioLayout);
        jPanelJavaFlixPremiumPrecioLayout.setHorizontalGroup(
            jPanelJavaFlixPremiumPrecioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelJavaFlixPremiumPrecioLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabelJavaFlixPremiumPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanelJavaFlixPremiumPrecioLayout.setVerticalGroup(
            jPanelJavaFlixPremiumPrecioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelJavaFlixPremiumPrecio, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        jPanelIntroDatosRegistro.add(jPanelJavaFlixPremiumPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 530, 130, 60));

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

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        UtilJavaflix.guardarDatos();
        this.padre.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_formWindowClosing

    private void jPanelCerrarRegistroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelCerrarRegistroMouseEntered
        // TODO add your handling code here:
        jPanelCerrarRegistro.setBackground(new Color(232, 17, 35));
        jLabelCerrarRegistro.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_jPanelCerrarRegistroMouseEntered

    private void jPanelCerrarRegistroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelCerrarRegistroMouseExited
        // TODO add your handling code here:
        jPanelCerrarRegistro.setBackground(new Color(255, 255, 255));
        jLabelCerrarRegistro.setForeground(new Color(0, 0, 0));
    }//GEN-LAST:event_jPanelCerrarRegistroMouseExited

    private void jPanelAtrasRegistroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelAtrasRegistroMouseEntered
        // TODO add your handling code here:
        jPanelAtrasRegistro.setBackground(new Color(229, 229, 229));
    }//GEN-LAST:event_jPanelAtrasRegistroMouseEntered

    private void jPanelAtrasRegistroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelAtrasRegistroMouseExited
        // TODO add your handling code here:
        jPanelAtrasRegistro.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_jPanelAtrasRegistroMouseExited

    private void jPanelAtrasRegistroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelAtrasRegistroMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        padre.setVisible(true);
    }//GEN-LAST:event_jPanelAtrasRegistroMouseClicked

    private void jPanelCerrarRegistroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelCerrarRegistroMouseClicked
        // TODO add your handling code here:      
        UtilJavaflix.cerrarPrograma();

    }//GEN-LAST:event_jPanelCerrarRegistroMouseClicked

    private void jPanelJavaFlixBasicoPrecioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelJavaFlixBasicoPrecioMouseEntered
        // TODO add your handling code here:
        jPanelJavaFlixBasicoPrecio.setBackground(new Color(126, 16, 27));
    }//GEN-LAST:event_jPanelJavaFlixBasicoPrecioMouseEntered

    private void jPanelJavaFlixEstandarPrecioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelJavaFlixEstandarPrecioMouseEntered
        // TODO add your handling code here:
        jPanelJavaFlixEstandarPrecio.setBackground(new Color(126, 16, 27));
    }//GEN-LAST:event_jPanelJavaFlixEstandarPrecioMouseEntered

    private void jPanelJavaFlixPremiumPrecioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelJavaFlixPremiumPrecioMouseEntered
        // TODO add your handling code here:
        jPanelJavaFlixBasicoPrecio.setBackground(new Color(180, 45, 49));
    }//GEN-LAST:event_jPanelJavaFlixPremiumPrecioMouseEntered

    private void jPanelJavaFlixBasicoPrecioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelJavaFlixBasicoPrecioMouseExited
        // TODO add your handling code here:
        jPanelJavaFlixBasicoPrecio.setBackground(new Color(180, 45, 49));
    }//GEN-LAST:event_jPanelJavaFlixBasicoPrecioMouseExited

    private void jPanelJavaFlixEstandarPrecioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelJavaFlixEstandarPrecioMouseExited
        // TODO add your handling code here:
        jPanelJavaFlixEstandarPrecio.setBackground(new Color(180, 45, 49));
    }//GEN-LAST:event_jPanelJavaFlixEstandarPrecioMouseExited

    private void jPanelJavaFlixPremiumPrecioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelJavaFlixPremiumPrecioMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanelJavaFlixPremiumPrecioMouseExited

    private void jLabelJavaFlixBasicoPrecioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelJavaFlixBasicoPrecioMouseClicked
        // TODO add your handling code here:
        PlanSuscripcion plannuevo = new PlanSuscripcion("Basico", LocalDate.now());
        Cliente nuevocliente = new Cliente(this.dni, this.nombre, this.email, this.pass, this.tarjeta, plannuevo);
        plannuevo.setCliente(nuevocliente);
        JOptionPane.showMessageDialog(rootPane, "Usuario registrado correctamente", "Registro completado", JOptionPane.INFORMATION_MESSAGE);
        UtilJavaflix.addCliente(nuevocliente);
        try {
            File suscripcion = new File(nuevocliente.getDni());
            suscripcion.createNewFile();   
        } catch (IOException e) {
            System.out.println("Error de Input/Output al crear archivo:" + e.getMessage());
        }
        try ( FileOutputStream ostreampro = new FileOutputStream(nuevocliente.getDni());  ObjectOutputStream oospro = new ObjectOutputStream(ostreampro)) {
            oospro.writeObject(plannuevo.getCliente());
            oospro.writeObject(plannuevo.getFecha());
            oospro.writeObject(plannuevo.getTipo());
        } catch (IOException ioe) {
            System.out.println("Error de Input/Output: " + ioe.getMessage());
        } finally {

        }
        UtilJavaflix.guardarDatos();
        this.dispose();
        this.padre.getPadre().setVisible(true);
    }//GEN-LAST:event_jLabelJavaFlixBasicoPrecioMouseClicked

    private void jLabelJavaFlixEstandarPrecioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelJavaFlixEstandarPrecioMouseClicked
        // TODO add your handling code here:
        PlanSuscripcion plannuevo = new PlanSuscripcion("Estandar", LocalDate.now());
        Cliente nuevocliente = new Cliente(this.dni, this.nombre, this.email, this.pass, this.tarjeta, plannuevo);
        plannuevo.setCliente(nuevocliente);
        JOptionPane.showMessageDialog(rootPane, "Usuario registrado correctamente", "Registro completado", JOptionPane.INFORMATION_MESSAGE);
        UtilJavaflix.addCliente(nuevocliente);
        try {
            File suscripcion = new File(nuevocliente.getDni());
            suscripcion.createNewFile();   
        } catch (IOException e) {
            System.out.println("Error de Input/Output al crear archivo:" + e.getMessage());
        }
        try ( FileOutputStream ostreampro = new FileOutputStream(nuevocliente.getDni());  ObjectOutputStream oospro = new ObjectOutputStream(ostreampro)) {
            oospro.writeObject(plannuevo.getCliente());
            oospro.writeObject(plannuevo.getFecha());
            oospro.writeObject(plannuevo.getTipo());
        } catch (IOException ioe) {
            System.out.println("Error de Input/Output: " + ioe.getMessage());
        } finally {

        }
        UtilJavaflix.guardarDatos();
        this.dispose();
        this.padre.getPadre().setVisible(true);
    }//GEN-LAST:event_jLabelJavaFlixEstandarPrecioMouseClicked

    private void jLabelJavaFlixPremiumPrecioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelJavaFlixPremiumPrecioMouseClicked
        // TODO add your handling code here:
        // TODO add your handling code here:
        PlanSuscripcion plannuevo = new PlanSuscripcion("Premium", LocalDate.now());
        Cliente nuevocliente = new Cliente(this.dni, this.nombre, this.email, this.pass, this.tarjeta, plannuevo);
        plannuevo.setCliente(nuevocliente);
        JOptionPane.showMessageDialog(rootPane, "Usuario registrado correctamente", "Registro completado", JOptionPane.INFORMATION_MESSAGE);
        UtilJavaflix.addCliente(nuevocliente);
        try {
            File suscripcion = new File(nuevocliente.getDni());
            suscripcion.createNewFile();   
        } catch (IOException e) {
            System.out.println("Error de Input/Output al crear archivo:" + e.getMessage());
        }
        try ( FileOutputStream ostreampro = new FileOutputStream(nuevocliente.getDni());  ObjectOutputStream oospro = new ObjectOutputStream(ostreampro)) {
            oospro.writeObject(plannuevo.getCliente());
            oospro.writeObject(plannuevo.getFecha());
            oospro.writeObject(plannuevo.getTipo());
        } catch (IOException ioe) {
            System.out.println("Error de Input/Output: " + ioe.getMessage());
        } finally {

        }
        UtilJavaflix.guardarDatos();
        this.dispose();
        this.padre.getPadre().setVisible(true);
    }//GEN-LAST:event_jLabelJavaFlixPremiumPrecioMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabelAtrasRegistro;
    private javax.swing.JLabel jLabelCREATUCUENTARegistro;
    private javax.swing.JLabel jLabelCerrarRegistro;
    private javax.swing.JLabel jLabelDoblezRegistro;
    private javax.swing.JLabel jLabelFondoEtiquetasRegistro;
    private javax.swing.JLabel jLabelFondoRegistro;
    private javax.swing.JLabel jLabelJAVAFLIXRegistro;
    private javax.swing.JLabel jLabelJAVAFLIXSombraRegistro;
    private javax.swing.JLabel jLabelJavaFlixBasico;
    private javax.swing.JLabel jLabelJavaFlixBasicoPrecio;
    private javax.swing.JLabel jLabelJavaFlixEstandar;
    private javax.swing.JLabel jLabelJavaFlixEstandarPrecio;
    private javax.swing.JLabel jLabelJavaFlixPremium;
    private javax.swing.JLabel jLabelJavaFlixPremiumPrecio;
    private javax.swing.JPanel jPanelAtrasRegistro;
    private javax.swing.JPanel jPanelCerrarRegistro;
    private javax.swing.JPanel jPanelIntroDatosRegistro;
    private javax.swing.JPanel jPanelJavaFlixBasicoPrecio;
    private javax.swing.JPanel jPanelJavaFlixEstandarPrecio;
    private javax.swing.JPanel jPanelJavaFlixPremiumPrecio;
    private javax.swing.JPanel jPanelOpcionesRegistro;
    private javax.swing.JPanel jPanelRegistro;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
