/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;


import Clases.Contenido;
import Clases.Pelicula;
import java.awt.Color;
import Clases.UtilJavaflix;
import static java.awt.Color.black;



/**
 *
 * @author Francisco
 */
public class verPelicula extends javax.swing.JFrame {

    private entradaUsuario padre;
    private Pelicula pelicularecibida;
    
    public verPelicula(entradaUsuario main, Pelicula pelicularecibida) {
        padre = main;
        this.pelicularecibida = pelicularecibida;
        initComponents();
        jLabelCorazon.setVisible(false);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        jLabelTitulo.setText("Titulo: "+pelicularecibida.getTitulo());
        jLabelActores.setText("Actores: "+String.join(",", pelicularecibida.getActores()));
        jLabelDirector.setText("Director: "+pelicularecibida.getDirector());
        jLabelDuracion.setText("Duracion: "+pelicularecibida.getDuracion());
        jTextAreaSinopsis.setText("Sinopsis: "+pelicularecibida.getSinopsis());
        jLabelPortada.setIcon(pelicularecibida.getPortada());
        jLabelGenero.setText(pelicularecibida.getGenero());
        jLabelAnno.setText(String.valueOf(pelicularecibida.getAnno()));
        jLabelRate.setText(String.valueOf(pelicularecibida.getCalificacionMedia())+"/10");
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
        jPanelverPelicula = new javax.swing.JPanel();
        jPanelOpcionesverPelicula = new javax.swing.JPanel();
        jPanelCerrarRegistro = new javax.swing.JPanel();
        jLabelCerrarRegistro = new javax.swing.JLabel();
        jPanelAtrasRegistro = new javax.swing.JPanel();
        jLabelAtrasRegistro = new javax.swing.JLabel();
        jPanelIntroDatosverPelicula = new javax.swing.JPanel();
        jLabelJAVAFLIXRegistro = new javax.swing.JLabel();
        jLabelJAVAFLIXSombraRegistro = new javax.swing.JLabel();
        jPanelPelicula = new javax.swing.JPanel();
        jLabelPortada = new javax.swing.JLabel();
        jLabelDirector = new javax.swing.JLabel();
        jLabelActores = new javax.swing.JLabel();
        jLabelTitulo = new javax.swing.JLabel();
        jLabelGenero = new javax.swing.JLabel();
        jLabelAnno = new javax.swing.JLabel();
        jLabelDuracion = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaSinopsis = new javax.swing.JTextArea();
        jLabelCorazon = new javax.swing.JLabel();
        jTextFieldRate = new javax.swing.JTextField();
        jLabelRate = new javax.swing.JLabel();
        jLabelCorazonVacio = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1239, 725));
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanelverPelicula.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelOpcionesverPelicula.setBackground(new java.awt.Color(255, 255, 255));
        jPanelOpcionesverPelicula.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jPanelOpcionesverPelicula.add(jPanelCerrarRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 30));

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

        jPanelOpcionesverPelicula.add(jPanelAtrasRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 60, 30));

        jPanelverPelicula.add(jPanelOpcionesverPelicula, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1240, -1));

        jPanelIntroDatosverPelicula.setBackground(java.awt.Color.lightGray);
        jPanelIntroDatosverPelicula.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelJAVAFLIXRegistro.setFont(new java.awt.Font("Roboto Black", 0, 48)); // NOI18N
        jLabelJAVAFLIXRegistro.setForeground(new java.awt.Color(197, 49, 47));
        jLabelJAVAFLIXRegistro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelJAVAFLIXRegistro.setText("JAVAFLIX");
        jPanelIntroDatosverPelicula.add(jLabelJAVAFLIXRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1240, 100));

        jLabelJAVAFLIXSombraRegistro.setFont(new java.awt.Font("Roboto Black", 0, 48)); // NOI18N
        jLabelJAVAFLIXSombraRegistro.setForeground(new java.awt.Color(112, 101, 101));
        jLabelJAVAFLIXSombraRegistro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelJAVAFLIXSombraRegistro.setText("JAVAFLIX");
        jPanelIntroDatosverPelicula.add(jLabelJAVAFLIXSombraRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1250, 110));

        jPanelverPelicula.add(jPanelIntroDatosverPelicula, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 1240, 100));

        jPanelPelicula.setBackground(java.awt.Color.lightGray);
        jPanelPelicula.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelPortada.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanelPelicula.add(jLabelPortada, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 490, 250));

        jLabelDirector.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        jLabelDirector.setText("DIRECTOR:");
        jPanelPelicula.add(jLabelDirector, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 140, 640, 60));

        jLabelActores.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        jLabelActores.setText("ACTORES:");
        jPanelPelicula.add(jLabelActores, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 80, 640, 60));

        jLabelTitulo.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        jLabelTitulo.setText("TITULO: ");
        jPanelPelicula.add(jLabelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 20, 300, 60));

        jLabelGenero.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        jLabelGenero.setText("GÉNERO:");
        jPanelPelicula.add(jLabelGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 20, 190, 60));

        jLabelAnno.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        jLabelAnno.setText("AÑO:");
        jPanelPelicula.add(jLabelAnno, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 20, 190, 60));

        jLabelDuracion.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        jLabelDuracion.setText("DURACION:");
        jPanelPelicula.add(jLabelDuracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 200, 640, 60));

        jTextAreaSinopsis.setBackground(java.awt.Color.lightGray);
        jTextAreaSinopsis.setColumns(20);
        jTextAreaSinopsis.setRows(5);
        jTextAreaSinopsis.setText("SINOPSIS:");
        jTextAreaSinopsis.setBorder(null);
        jScrollPane1.setViewportView(jTextAreaSinopsis);

        jPanelPelicula.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 280, 640, 100));

        jLabelCorazon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Corazon.png"))); // NOI18N
        jLabelCorazon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCorazonMouseClicked(evt);
            }
        });
        jPanelPelicula.add(jLabelCorazon, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 70, 60));

        jTextFieldRate.setBackground(java.awt.Color.lightGray);
        jTextFieldRate.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jTextFieldRate.setForeground(java.awt.Color.gray);
        jTextFieldRate.setText("RATE...");
        jTextFieldRate.setBorder(null);
        jTextFieldRate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextFieldRateMouseClicked(evt);
            }
        });
        jPanelPelicula.add(jTextFieldRate, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 290, 60, 40));

        jLabelRate.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabelRate.setText("X/10");
        jPanelPelicula.add(jLabelRate, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 290, 60, 40));

        jLabelCorazonVacio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/CorazonVacio.png"))); // NOI18N
        jLabelCorazonVacio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCorazonVacioMouseClicked(evt);
            }
        });
        jPanelPelicula.add(jLabelCorazonVacio, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 70, 60));

        jPanelverPelicula.add(jPanelPelicula, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 1240, 610));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelverPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, 1239, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelverPelicula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void jTextFieldRateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldRateMouseClicked
        // TODO add your handling code here:
        if (jTextFieldRate.getText().isEmpty())
            jTextFieldRate.setText("");
            jTextFieldRate.setForeground(black);
    }//GEN-LAST:event_jTextFieldRateMouseClicked

    private void jLabelCorazonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCorazonMouseClicked
        // TODO add your handling code here:
        padre.getClientelogeado().removeFavoritos(pelicularecibida);
        jLabelCorazonVacio.setVisible(true);
        jLabelCorazonVacio.setFocusable(true);
        jLabelCorazon.setVisible(false);
        jLabelCorazon.setFocusable(false);
    }//GEN-LAST:event_jLabelCorazonMouseClicked

    private void jLabelCorazonVacioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCorazonVacioMouseClicked
        // TODO add your handling code here:
        padre.getClientelogeado().addFavoritos(pelicularecibida);
        jLabelCorazonVacio.setVisible(false);
        jLabelCorazonVacio.setFocusable(false);
        jLabelCorazon.setVisible(true);
        jLabelCorazon.setFocusable(true);
    }//GEN-LAST:event_jLabelCorazonVacioMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabelActores;
    private javax.swing.JLabel jLabelAnno;
    private javax.swing.JLabel jLabelAtrasRegistro;
    private javax.swing.JLabel jLabelCerrarRegistro;
    private javax.swing.JLabel jLabelCorazon;
    private javax.swing.JLabel jLabelCorazonVacio;
    private javax.swing.JLabel jLabelDirector;
    private javax.swing.JLabel jLabelDuracion;
    private javax.swing.JLabel jLabelGenero;
    private javax.swing.JLabel jLabelJAVAFLIXRegistro;
    private javax.swing.JLabel jLabelJAVAFLIXSombraRegistro;
    private javax.swing.JLabel jLabelPortada;
    private javax.swing.JLabel jLabelRate;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanelAtrasRegistro;
    private javax.swing.JPanel jPanelCerrarRegistro;
    private javax.swing.JPanel jPanelIntroDatosverPelicula;
    private javax.swing.JPanel jPanelOpcionesverPelicula;
    private javax.swing.JPanel jPanelPelicula;
    private javax.swing.JPanel jPanelverPelicula;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTextAreaSinopsis;
    private javax.swing.JTextField jTextFieldRate;
    // End of variables declaration//GEN-END:variables
}
