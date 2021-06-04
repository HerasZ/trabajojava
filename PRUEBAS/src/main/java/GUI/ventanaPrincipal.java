/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Clases.Cliente;
import java.awt.Color;

import Clases.UtilJavaflix;

import java.awt.Color;

import Clases.UtilJavaflix;
import Excepciones.EmailNoEncontrado;
import Excepciones.EmailNoValido;
import Excepciones.PasswordIncorrecta;
import javax.swing.JOptionPane;

/**
 *
 * @author Francisco
 */
public class ventanaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form ventanaPrincipal
     */
    public ventanaPrincipal() {
        UtilJavaflix.cargarDatos();
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabelJAVAFLIXAcceso = new javax.swing.JLabel();
        jLabelJAVAFLIXSombraAcceso = new javax.swing.JLabel();
        jLabelINICIARSESION = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabelCEAcceso = new javax.swing.JLabel();
        jTextFieldCEAcceso = new javax.swing.JTextField();
        jSeparatorCEAcceso = new javax.swing.JSeparator();
        jLabelClaveAcceso = new javax.swing.JLabel();
        jPasswordFieldClaveAcceso = new javax.swing.JPasswordField();
        jSeparatorClaveAcceso = new javax.swing.JSeparator();
        jPanelAcceder = new javax.swing.JPanel();
        jLabelAccederbuttom = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanelRegistrarse = new javax.swing.JPanel();
        jLabelRegistrarsebuttom = new javax.swing.JLabel();
        jLabelImagenPalomitas = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelJAVAFLIXAcceso.setFont(new java.awt.Font("Roboto Black", 0, 100)); // NOI18N
        jLabelJAVAFLIXAcceso.setForeground(new java.awt.Color(255, 255, 255));
        jLabelJAVAFLIXAcceso.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelJAVAFLIXAcceso.setText("JAVAFLIX");
        jPanel1.add(jLabelJAVAFLIXAcceso, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 540, 130));

        jLabelJAVAFLIXSombraAcceso.setFont(new java.awt.Font("Roboto Black", 0, 100)); // NOI18N
        jLabelJAVAFLIXSombraAcceso.setForeground(new java.awt.Color(112, 101, 101));
        jLabelJAVAFLIXSombraAcceso.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelJAVAFLIXSombraAcceso.setText("JAVAFLIX");
        jPanel1.add(jLabelJAVAFLIXSombraAcceso, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 540, 130));

        jLabelINICIARSESION.setFont(new java.awt.Font("Roboto Light", 0, 36)); // NOI18N
        jLabelINICIARSESION.setForeground(new java.awt.Color(255, 255, 255));
        jLabelINICIARSESION.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelINICIARSESION.setText("INICIAR SESIÓN");
        jPanel1.add(jLabelINICIARSESION, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 0, 440, 120));

        jLabel7.setText("jLabel7");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 0, 440, 120));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 120, 30, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setMinimumSize(new java.awt.Dimension(360, 520));
        jPanel2.setName(""); // NOI18N
        jPanel2.setPreferredSize(new java.awt.Dimension(360, 582));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelCEAcceso.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jLabelCEAcceso.setText("CORREO ELECTRÓNICO");
        jPanel2.add(jLabelCEAcceso, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, -1, -1));

        jTextFieldCEAcceso.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        jTextFieldCEAcceso.setForeground(new java.awt.Color(204, 204, 204));
        jTextFieldCEAcceso.setText("Escriba su correo electrónico");
        jTextFieldCEAcceso.setToolTipText("");
        jTextFieldCEAcceso.setBorder(null);
        jTextFieldCEAcceso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTextFieldCEAccesoMousePressed(evt);
            }
        });
        jTextFieldCEAcceso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCEAccesoActionPerformed(evt);
            }
        });
        jPanel2.add(jTextFieldCEAcceso, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 300, -1));
        jPanel2.add(jSeparatorCEAcceso, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 310, 18));

        jLabelClaveAcceso.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jLabelClaveAcceso.setText("CLAVE");
        jPanel2.add(jLabelClaveAcceso, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, -1, -1));

        jPasswordFieldClaveAcceso.setForeground(new java.awt.Color(204, 204, 204));
        jPasswordFieldClaveAcceso.setText("**********");
        jPasswordFieldClaveAcceso.setToolTipText("");
        jPasswordFieldClaveAcceso.setBorder(null);
        jPasswordFieldClaveAcceso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPasswordFieldClaveAccesoMousePressed(evt);
            }
        });
        jPanel2.add(jPasswordFieldClaveAcceso, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 290, -1));
        jPanel2.add(jSeparatorClaveAcceso, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 310, 20));

        jPanelAcceder.setBackground(new java.awt.Color(180, 45, 49));
        jPanelAcceder.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabelAccederbuttom.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabelAccederbuttom.setForeground(new java.awt.Color(255, 255, 255));
        jLabelAccederbuttom.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelAccederbuttom.setText("ACCEDER");
        jLabelAccederbuttom.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelAccederbuttom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelAccederbuttomMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelAccederbuttomMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelAccederbuttomMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelAccederbuttomMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabelAccederbuttomMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanelAccederLayout = new javax.swing.GroupLayout(jPanelAcceder);
        jPanelAcceder.setLayout(jPanelAccederLayout);
        jPanelAccederLayout.setHorizontalGroup(
            jPanelAccederLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelAccederbuttom, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
        );
        jPanelAccederLayout.setVerticalGroup(
            jPanelAccederLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelAccederbuttom, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
        );

        jPanel2.add(jPanelAcceder, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 340, 170, -1));

        jLabel8.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("¿No tienes cuenta? Registrate");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 490, 410, -1));

        jPanelRegistrarse.setBackground(new java.awt.Color(180, 45, 49));
        jPanelRegistrarse.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanelRegistrarse.setPreferredSize(new java.awt.Dimension(170, 62));
        jPanelRegistrarse.setRequestFocusEnabled(false);

        jLabelRegistrarsebuttom.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabelRegistrarsebuttom.setForeground(new java.awt.Color(255, 255, 255));
        jLabelRegistrarsebuttom.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelRegistrarsebuttom.setText("REGISTRASRE");
        jLabelRegistrarsebuttom.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelRegistrarsebuttom.setMaximumSize(new java.awt.Dimension(62, 17));
        jLabelRegistrarsebuttom.setMinimumSize(new java.awt.Dimension(62, 17));
        jLabelRegistrarsebuttom.setName(""); // NOI18N
        jLabelRegistrarsebuttom.setPreferredSize(new java.awt.Dimension(62, 17));
        jLabelRegistrarsebuttom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelRegistrarsebuttomMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelRegistrarsebuttomMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelRegistrarsebuttomMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanelRegistrarseLayout = new javax.swing.GroupLayout(jPanelRegistrarse);
        jPanelRegistrarse.setLayout(jPanelRegistrarseLayout);
        jPanelRegistrarseLayout.setHorizontalGroup(
            jPanelRegistrarseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelRegistrarsebuttom, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
        );
        jPanelRegistrarseLayout.setVerticalGroup(
            jPanelRegistrarseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelRegistrarsebuttom, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
        );

        jPanel2.add(jPanelRegistrarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 530, 170, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 0, 410, 640));

        jLabelImagenPalomitas.setBackground(new java.awt.Color(255, 255, 255));
        jLabelImagenPalomitas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/palomitasbienrojo.jpg"))); // NOI18N
        jLabelImagenPalomitas.setText("jLabel2");
        jPanel1.add(jLabelImagenPalomitas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 1239, 700));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1239, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelAccederbuttomMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelAccederbuttomMouseClicked
        // TODO add your handling code here:
        try {
            UtilJavaflix.validarEmail(jTextFieldCEAcceso.getText());
            Cliente cliente_logeado = UtilJavaflix.iniciarSesion(jTextFieldCEAcceso.getText(),String.valueOf(jPasswordFieldClaveAcceso.getPassword()));
            JOptionPane.showMessageDialog(rootPane, "Bienvenido,"+cliente_logeado.getNombre() , "Inicio de sesion correcto", JOptionPane.INFORMATION_MESSAGE);
        } catch (EmailNoValido | EmailNoEncontrado | PasswordIncorrecta ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jLabelAccederbuttomMouseClicked

    private void jTextFieldCEAccesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCEAccesoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCEAccesoActionPerformed

    private void jLabelRegistrarsebuttomMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelRegistrarsebuttomMouseClicked
        this.setVisible(false);
        registroUsuario registro = new registroUsuario(this);
        registro.setVisible(true);
    }//GEN-LAST:event_jLabelRegistrarsebuttomMouseClicked

    private void jLabelAccederbuttomMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelAccederbuttomMouseEntered
        // TODO add your handling code here:   
        jPanelAcceder.setBackground(new Color(148, 13, 30));
    }//GEN-LAST:event_jLabelAccederbuttomMouseEntered

    private void jLabelAccederbuttomMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelAccederbuttomMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelAccederbuttomMouseReleased

    private void jLabelAccederbuttomMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelAccederbuttomMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelAccederbuttomMousePressed

    private void jLabelAccederbuttomMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelAccederbuttomMouseExited
        // TODO add your handling code here:
        jPanelAcceder.setBackground(new Color(180, 45, 49));
    }//GEN-LAST:event_jLabelAccederbuttomMouseExited

    private void jLabelRegistrarsebuttomMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelRegistrarsebuttomMouseEntered
        // TODO add your handling code here:
        jPanelRegistrarse.setBackground(new Color(148, 13, 30));
    }//GEN-LAST:event_jLabelRegistrarsebuttomMouseEntered

    private void jLabelRegistrarsebuttomMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelRegistrarsebuttomMouseExited
        // TODO add your handling code here:
        jPanelRegistrarse.setBackground(new Color(180, 45, 49));
    }//GEN-LAST:event_jLabelRegistrarsebuttomMouseExited

    private void jTextFieldCEAccesoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldCEAccesoMousePressed
        // TODO add your handling code here:
        if (jTextFieldCEAcceso.getText().equals("Escriba su correo electrónico")) {
            jTextFieldCEAcceso.setText("");
            jTextFieldCEAcceso.setForeground(Color.black);
        }
        if (String.valueOf(jPasswordFieldClaveAcceso.getPassword()).isEmpty()) {
            jPasswordFieldClaveAcceso.setText("**********");
            jPasswordFieldClaveAcceso.setForeground(Color.gray);
        }
    }//GEN-LAST:event_jTextFieldCEAccesoMousePressed

    private void jPasswordFieldClaveAccesoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPasswordFieldClaveAccesoMousePressed
        // TODO add your handling code here:
        if (String.valueOf(jPasswordFieldClaveAcceso.getPassword()).equals("**********")) {
            jPasswordFieldClaveAcceso.setText("");
            jPasswordFieldClaveAcceso.setForeground(Color.black);
        }
        if (jTextFieldCEAcceso.getText().isEmpty()) {
            jTextFieldCEAcceso.setText("Escriba su correo electrónico");
            jTextFieldCEAcceso.setForeground(Color.gray);
        }
    }//GEN-LAST:event_jPasswordFieldClaveAccesoMousePressed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing

    }//GEN-LAST:event_formWindowClosing

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
            java.util.logging.Logger.getLogger(ventanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and djLabelINICIARSESIONthe form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelAccederbuttom;
    private javax.swing.JLabel jLabelCEAcceso;
    private javax.swing.JLabel jLabelClaveAcceso;
    private javax.swing.JLabel jLabelINICIARSESION;
    private javax.swing.JLabel jLabelImagenPalomitas;
    private javax.swing.JLabel jLabelJAVAFLIXAcceso;
    private javax.swing.JLabel jLabelJAVAFLIXSombraAcceso;
    private javax.swing.JLabel jLabelRegistrarsebuttom;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelAcceder;
    private javax.swing.JPanel jPanelRegistrarse;
    private javax.swing.JPasswordField jPasswordFieldClaveAcceso;
    private javax.swing.JSeparator jSeparatorCEAcceso;
    private javax.swing.JSeparator jSeparatorClaveAcceso;
    private javax.swing.JTextField jTextFieldCEAcceso;
    // End of variables declaration//GEN-END:variables
}
