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


/**
 *
 * @author Francisco
 */
public class ventanaAdmin extends javax.swing.JFrame {

    private ventanaPrincipal padre;

    /**
     * Creates new form ventanaPrincipal
     */
    public ventanaAdmin(ventanaPrincipal main) {
        padre = main;
        initComponents();
        this.setLocationRelativeTo(null);
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
        jPanelventana = new javax.swing.JPanel();
        jPanelOpciones = new javax.swing.JPanel();
        jPanelCerrar = new javax.swing.JPanel();
        jLabelCerrarjFrame = new javax.swing.JLabel();
        jPanelAtras = new javax.swing.JPanel();
        jLabelAtras = new javax.swing.JLabel();
        jPanelAdministrador = new javax.swing.JPanel();
        jLabelPanel = new javax.swing.JLabel();
        jPanelUsuarios = new javax.swing.JPanel();
        jLabelUsuarios = new javax.swing.JLabel();
        jPanelContenidos = new javax.swing.JPanel();
        jLabelContenidos = new javax.swing.JLabel();
        jLabelJAVAFLIX = new javax.swing.JLabel();
        jLabelJAVAFLIXSombra = new javax.swing.JLabel();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1239, 725));
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanelventana.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelOpciones.setBackground(new java.awt.Color(255, 255, 255));
        jPanelOpciones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelCerrar.setBackground(new java.awt.Color(255, 255, 255));
        jPanelCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelCerrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelCerrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelCerrarMouseExited(evt);
            }
        });
        jPanelCerrar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelCerrarjFrame.setBackground(new java.awt.Color(255, 255, 255));
        jLabelCerrarjFrame.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        jLabelCerrarjFrame.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCerrarjFrame.setText("X");
        jPanelCerrar.add(jLabelCerrarjFrame, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 30));

        jPanelOpciones.add(jPanelCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 30));

        jPanelAtras.setBackground(new java.awt.Color(255, 255, 255));
        jPanelAtras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelAtrasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelAtrasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelAtrasMouseExited(evt);
            }
        });
        jPanelAtras.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelAtras.setBackground(new java.awt.Color(255, 255, 255));
        jLabelAtras.setFont(new java.awt.Font("Rockwell Condensed", 0, 24)); // NOI18N
        jLabelAtras.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelAtras.setText("< ");
        jPanelAtras.add(jLabelAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, -1));

        jPanelOpciones.add(jPanelAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 60, 30));

        jPanelventana.add(jPanelOpciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1250, -1));

        jPanelAdministrador.setBackground(new java.awt.Color(255, 255, 255));

        jLabelPanel.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabelPanel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPanel.setText("Panel de Administrador");

        jPanelUsuarios.setBackground(new java.awt.Color(180, 45, 49));

        jLabelUsuarios.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabelUsuarios.setForeground(new java.awt.Color(255, 255, 255));
        jLabelUsuarios.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelUsuarios.setText("Consulta de Usuarios");
        jLabelUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelUsuariosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelUsuariosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelUsuariosMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanelUsuariosLayout = new javax.swing.GroupLayout(jPanelUsuarios);
        jPanelUsuarios.setLayout(jPanelUsuariosLayout);
        jPanelUsuariosLayout.setHorizontalGroup(
            jPanelUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanelUsuariosLayout.setVerticalGroup(
            jPanelUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
        );

        jPanelContenidos.setBackground(new java.awt.Color(180, 45, 49));

        jLabelContenidos.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabelContenidos.setForeground(new java.awt.Color(255, 255, 255));
        jLabelContenidos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelContenidos.setText("Consulta de contenidos");
        jLabelContenidos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelContenidosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelContenidosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelContenidosMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanelContenidosLayout = new javax.swing.GroupLayout(jPanelContenidos);
        jPanelContenidos.setLayout(jPanelContenidosLayout);
        jPanelContenidosLayout.setHorizontalGroup(
            jPanelContenidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelContenidos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanelContenidosLayout.setVerticalGroup(
            jPanelContenidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelContenidos, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanelAdministradorLayout = new javax.swing.GroupLayout(jPanelAdministrador);
        jPanelAdministrador.setLayout(jPanelAdministradorLayout);
        jPanelAdministradorLayout.setHorizontalGroup(
            jPanelAdministradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAdministradorLayout.createSequentialGroup()
                .addContainerGap(127, Short.MAX_VALUE)
                .addGroup(jPanelAdministradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelContenidos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(123, 123, 123))
        );
        jPanelAdministradorLayout.setVerticalGroup(
            jPanelAdministradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAdministradorLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabelPanel)
                .addGap(41, 41, 41)
                .addComponent(jPanelUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addComponent(jPanelContenidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
        );

        jPanelventana.add(jPanelAdministrador, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 240, -1, -1));

        jLabelJAVAFLIX.setFont(new java.awt.Font("Roboto Black", 0, 100)); // NOI18N
        jLabelJAVAFLIX.setForeground(new java.awt.Color(255, 255, 255));
        jLabelJAVAFLIX.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelJAVAFLIX.setText("JAVAFLIX");
        jPanelventana.add(jLabelJAVAFLIX, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 830, 130));

        jLabelJAVAFLIXSombra.setFont(new java.awt.Font("Roboto Black", 0, 100)); // NOI18N
        jLabelJAVAFLIXSombra.setForeground(new java.awt.Color(112, 101, 101));
        jLabelJAVAFLIXSombra.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelJAVAFLIXSombra.setText("JAVAFLIX");
        jPanelventana.add(jLabelJAVAFLIXSombra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 810, 130));

        jLabelFondo.setBackground(new java.awt.Color(255, 255, 255));
        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/palomitasbienrojo.jpg"))); // NOI18N
        jLabelFondo.setText("jLabel2");
        jPanelventana.add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 1239, 700));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelventana, javax.swing.GroupLayout.PREFERRED_SIZE, 1239, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelventana, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        UtilJavaflix.guardarDatos();
        padre.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_formWindowClosing

    private void jPanelCerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelCerrarMouseEntered
        // TODO add your handling code here:
        jPanelCerrar.setBackground( new Color(232,17,35));
        jLabelCerrarjFrame.setForeground( new Color(255,255,255));
    }//GEN-LAST:event_jPanelCerrarMouseEntered

    private void jPanelCerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelCerrarMouseExited
        // TODO add your handling code here:
        jPanelCerrar.setBackground( new Color(255,255,255));
        jLabelCerrarjFrame.setForeground( new Color(0,0,0));
    }//GEN-LAST:event_jPanelCerrarMouseExited

    private void jPanelAtrasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelAtrasMouseEntered
        // TODO add your handling code here:
        jPanelAtras.setBackground( new Color(229,229,229));
    }//GEN-LAST:event_jPanelAtrasMouseEntered

    private void jPanelAtrasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelAtrasMouseExited
        // TODO add your handling code here:
        jPanelAtras.setBackground( new Color(255,255,255));
    }//GEN-LAST:event_jPanelAtrasMouseExited

    private void jPanelAtrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelAtrasMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        padre.setVisible(true);
    }//GEN-LAST:event_jPanelAtrasMouseClicked

    private void jPanelCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelCerrarMouseClicked
        // TODO add your handling code here:      
        UtilJavaflix.cerrarPrograma();
        
    }//GEN-LAST:event_jPanelCerrarMouseClicked

    private void jLabelUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelUsuariosMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        consultaUsuarios consultausuarios = new consultaUsuarios(this);
    }//GEN-LAST:event_jLabelUsuariosMouseClicked

    private void jLabelUsuariosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelUsuariosMouseEntered
        // TODO add your handling code here:
        jPanelUsuarios.setBackground(new Color(148, 13, 30));
    }//GEN-LAST:event_jLabelUsuariosMouseEntered

    private void jLabelUsuariosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelUsuariosMouseExited
        // TODO add your handling code here:
        jPanelUsuarios.setBackground(new Color(180, 45, 49));
    }//GEN-LAST:event_jLabelUsuariosMouseExited

    private void jLabelContenidosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelContenidosMouseEntered
        // TODO add your handling code here:
        jPanelContenidos.setBackground(new Color(148, 13, 30));
    }//GEN-LAST:event_jLabelContenidosMouseEntered

    private void jLabelContenidosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelContenidosMouseExited
        // TODO add your handling code here:
        jPanelContenidos.setBackground(new Color(180, 45, 49));
    }//GEN-LAST:event_jLabelContenidosMouseExited

    private void jLabelContenidosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelContenidosMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        adminContenidos gestioncontenido = new adminContenidos(this);
    }//GEN-LAST:event_jLabelContenidosMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabelAtras;
    private javax.swing.JLabel jLabelCerrarjFrame;
    private javax.swing.JLabel jLabelContenidos;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelJAVAFLIX;
    private javax.swing.JLabel jLabelJAVAFLIXSombra;
    private javax.swing.JLabel jLabelPanel;
    private javax.swing.JLabel jLabelUsuarios;
    private javax.swing.JPanel jPanelAdministrador;
    private javax.swing.JPanel jPanelAtras;
    private javax.swing.JPanel jPanelCerrar;
    private javax.swing.JPanel jPanelContenidos;
    private javax.swing.JPanel jPanelOpciones;
    private javax.swing.JPanel jPanelUsuarios;
    private javax.swing.JPanel jPanelventana;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
