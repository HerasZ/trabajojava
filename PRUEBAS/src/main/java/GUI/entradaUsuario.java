/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Clases.Cliente;
import Clases.Contenido;
import java.awt.Color;
import Clases.UtilJavaflix;
import java.awt.GridLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Francisco
 */
public class entradaUsuario extends javax.swing.JFrame {

    private ventanaPrincipal padre;
    private Cliente clientelogeado;
    private ArrayList<Contenido> listacontenido = new ArrayList<>();

    public ventanaPrincipal getPadre() {
        return padre;
    }

    /**
     * Creates new form ventanaPrincipal
     */
    /*
    public void colocarPortadas(JPanel catalogo, ArrayList<Contenido> contenidos){
        int totalcontenidos = contenidos.size();
        if (totalcontenidos <= 3){
            catalogo.setPreferredSize(new java.awt.Dimension(900, 570));
            for ( int i = 0; i < contenidos.size(); i++){
                String titulo = contenidos.get(i).getTitulo();
                JLabel titulolabel = new JLabel(titulo);
                catalogo.add(titulolabel);
            }
        } else if (totalcontenidos <= 3){
            
        }
    }
     */
    public entradaUsuario(ventanaPrincipal main, Cliente clientelogeado) {
        padre = main;
        this.clientelogeado = clientelogeado;
        this.listacontenido.addAll(UtilJavaflix.getPeliculas());
        this.listacontenido.addAll(UtilJavaflix.getSeries());
        initComponents();
        this.setLocationRelativeTo(null);
        generarTarjetas();
        //crea jlabel para cada objeto de la clase
        /*
        for ( int i = 0; i < UtilJavaflix.getContenido().size(); i++) {
            String titulo = UtilJavaflix.getContenido().get(i).getTitulo();
            JLabel portada = new JLabel();
            //portada.setIcon(UtilJavaflix.getContenido().get(i).getPortada());
            jPanelTodo.add(portada);
            portada.setText(titulo);
        }
        for ( int i = 0; i < UtilJavaflix.getPeliculas().size(); i++) {
            String titulo = UtilJavaflix.getPeliculas().get(i).getTitulo();
            JLabel portada = new JLabel();
            jPanelPeliculas.add(portada);
            portada.setText(titulo);
        }
        for ( int i = 0; i < UtilJavaflix.getSeries().size(); i++) {
            String titulo = UtilJavaflix.getSeries().get(i).getTitulo();
            JLabel portada = new JLabel();
            jPanelSeries.add(portada);
            portada.setText(titulo);
        }
        /**
        for ( int i = 0; i < Cliente.getFavoritos().size(); i++) {
            String titulo = Cliente.getFavoritos().get(i).getTitulo();
            JLabel portada = new JLabel();
            jPanelTodo.add(portada);
            portada.setText(titulo);
        }
         */
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
        jPanelCerrarRegistro = new javax.swing.JPanel();
        jLabelCerrarRegistro = new javax.swing.JLabel();
        jPanelAtrasRegistro = new javax.swing.JPanel();
        jLabelAtrasRegistro = new javax.swing.JLabel();
        jPanelIntroDatosRegistro = new javax.swing.JPanel();
        jLabelJAVAFLIXRegistro = new javax.swing.JLabel();
        jLabelJAVAFLIXSombraRegistro = new javax.swing.JLabel();
        jLabelTODO = new javax.swing.JLabel();
        jLabelPELICULAS = new javax.swing.JLabel();
        jLabelSERIES = new javax.swing.JLabel();
        jLabelFAVORITOS = new javax.swing.JLabel();
        jPanelBusqueda = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldBuscar = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldActor = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jFormattedTextFieldAño = new javax.swing.JFormattedTextField();
        jComboBoxGenero = new javax.swing.JComboBox<>();
        jToggleButtonBuscar = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanelTarjetas = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1239, 725));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1239, 710));
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

        jPanelRegistro.add(jPanelOpcionesRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1240, -1));

        jPanelIntroDatosRegistro.setBackground(java.awt.Color.lightGray);
        jPanelIntroDatosRegistro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelJAVAFLIXRegistro.setFont(new java.awt.Font("Roboto Black", 0, 48)); // NOI18N
        jLabelJAVAFLIXRegistro.setForeground(new java.awt.Color(197, 49, 47));
        jLabelJAVAFLIXRegistro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelJAVAFLIXRegistro.setText("JAVAFLIX");
        jPanelIntroDatosRegistro.add(jLabelJAVAFLIXRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, 130));

        jLabelJAVAFLIXSombraRegistro.setFont(new java.awt.Font("Roboto Black", 0, 48)); // NOI18N
        jLabelJAVAFLIXSombraRegistro.setForeground(new java.awt.Color(112, 101, 101));
        jLabelJAVAFLIXSombraRegistro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelJAVAFLIXSombraRegistro.setText("JAVAFLIX");
        jPanelIntroDatosRegistro.add(jLabelJAVAFLIXSombraRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 150));

        jLabelTODO.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabelTODO.setForeground(new java.awt.Color(197, 49, 47));
        jLabelTODO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTODO.setText("TODO");
        jLabelTODO.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelIntroDatosRegistro.add(jLabelTODO, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 270, 40));

        jLabelPELICULAS.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabelPELICULAS.setForeground(new java.awt.Color(197, 49, 47));
        jLabelPELICULAS.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPELICULAS.setText("PELICULAS");
        jLabelPELICULAS.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelIntroDatosRegistro.add(jLabelPELICULAS, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 176, 270, 40));

        jLabelSERIES.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabelSERIES.setForeground(new java.awt.Color(197, 49, 47));
        jLabelSERIES.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelSERIES.setText("SERIES");
        jLabelSERIES.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelIntroDatosRegistro.add(jLabelSERIES, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 216, 270, 40));

        jLabelFAVORITOS.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabelFAVORITOS.setForeground(new java.awt.Color(197, 49, 47));
        jLabelFAVORITOS.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelFAVORITOS.setText("FAVORITOS");
        jLabelFAVORITOS.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelIntroDatosRegistro.add(jLabelFAVORITOS, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 256, 270, 40));

        jPanelRegistro.add(jPanelIntroDatosRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 270, 710));

        jPanelBusqueda.setToolTipText("Palabras clave");
        jPanelBusqueda.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 10, 45));

        jLabel1.setText("Palabras clave:");
        jPanelBusqueda.add(jLabel1);

        jTextFieldBuscar.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        jTextFieldBuscar.setForeground(java.awt.Color.gray);
        jTextFieldBuscar.setMinimumSize(new java.awt.Dimension(170, 30));
        jTextFieldBuscar.setPreferredSize(new java.awt.Dimension(170, 30));
        jPanelBusqueda.add(jTextFieldBuscar);

        jLabel2.setText("Actor:");
        jPanelBusqueda.add(jLabel2);

        jTextFieldActor.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        jTextFieldActor.setForeground(java.awt.Color.gray);
        jTextFieldActor.setToolTipText("Actores");
        jTextFieldActor.setMinimumSize(new java.awt.Dimension(170, 30));
        jTextFieldActor.setPreferredSize(new java.awt.Dimension(170, 30));
        jPanelBusqueda.add(jTextFieldActor);

        jLabel3.setText("Año:");
        jPanelBusqueda.add(jLabel3);

        jFormattedTextFieldAño.setForeground(java.awt.Color.gray);
        jFormattedTextFieldAño.setToolTipText("Año");
        jFormattedTextFieldAño.setMinimumSize(new java.awt.Dimension(170, 30));
        jFormattedTextFieldAño.setPreferredSize(new java.awt.Dimension(170, 30));
        jPanelBusqueda.add(jFormattedTextFieldAño);

        jComboBoxGenero.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        jComboBoxGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Genero", "Acccion", "Comedia", "Suspense", "Crimen", "Romance", "Aventura" }));
        jComboBoxGenero.setMinimumSize(new java.awt.Dimension(170, 30));
        jComboBoxGenero.setPreferredSize(new java.awt.Dimension(170, 30));
        jComboBoxGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxGeneroActionPerformed(evt);
            }
        });
        jPanelBusqueda.add(jComboBoxGenero);

        jPanelRegistro.add(jPanelBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, 970, 90));

        jToggleButtonBuscar.setText("BUSCAR");
        jPanelRegistro.add(jToggleButtonBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 120, 90, 30));

        jPanelTarjetas.setLayout(new java.awt.GridLayout(1, 1, 0, 10));
        jScrollPane1.setViewportView(jPanelTarjetas);

        jPanelRegistro.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 160, 970, 580));

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

    private void generarTarjetas() {
        jScrollPane1.setSize(968, 578);
        jPanelTarjetas.setSize(968, listacontenido.size() * 100);
        jPanelTarjetas.setLayout(new GridLayout(listacontenido.size(), 1));
        for (Contenido contenidoiterando : listacontenido) {
            jPanelTarjetas.add(new tarjetaContenido(contenidoiterando));
        }
    }

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

    private void jComboBoxGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxGeneroActionPerformed
        // TODO add your handling code here:
        if (jTextFieldActor.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Escriba el nombre de un actor para ver su contenido");
        }
    }//GEN-LAST:event_jComboBoxGeneroActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> jComboBoxGenero;
    private javax.swing.JFormattedTextField jFormattedTextFieldAño;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelAtrasRegistro;
    private javax.swing.JLabel jLabelCerrarRegistro;
    private javax.swing.JLabel jLabelFAVORITOS;
    private javax.swing.JLabel jLabelJAVAFLIXRegistro;
    private javax.swing.JLabel jLabelJAVAFLIXSombraRegistro;
    private javax.swing.JLabel jLabelPELICULAS;
    private javax.swing.JLabel jLabelSERIES;
    private javax.swing.JLabel jLabelTODO;
    private javax.swing.JPanel jPanelAtrasRegistro;
    private javax.swing.JPanel jPanelBusqueda;
    private javax.swing.JPanel jPanelCerrarRegistro;
    private javax.swing.JPanel jPanelIntroDatosRegistro;
    private javax.swing.JPanel jPanelOpcionesRegistro;
    private javax.swing.JPanel jPanelRegistro;
    private javax.swing.JPanel jPanelTarjetas;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextFieldActor;
    private javax.swing.JTextField jTextFieldBuscar;
    private javax.swing.JToggleButton jToggleButtonBuscar;
    // End of variables declaration//GEN-END:variables
}
