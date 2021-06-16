/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Clases.Cliente;
import Clases.Contenido;
import Clases.OrdenarContenido;
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

    public entradaUsuario(ventanaPrincipal main, Cliente clientelogeado) {
        padre = main;
        this.clientelogeado = clientelogeado;
        this.listacontenido.addAll(UtilJavaflix.getPeliculas());
        this.listacontenido.addAll(UtilJavaflix.getSeries());
        initComponents();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        generarTarjetas();
        OrdenarContenido.masRecienteMayorRating(listacontenido);

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
        jLabelCerrar = new javax.swing.JLabel();
        jPanelAtras = new javax.swing.JPanel();
        jLabelAtras = new javax.swing.JLabel();
        jPanelIntroDatos = new javax.swing.JPanel();
        jLabelJAVAFLIX = new javax.swing.JLabel();
        jLabelJAVAFLIXSombra = new javax.swing.JLabel();
        jSeparatorArribaTitulo = new javax.swing.JSeparator();
        jSeparatorArriba = new javax.swing.JSeparator();
        jSeparatorMedio = new javax.swing.JSeparator();
        jSeparatorAbajo = new javax.swing.JSeparator();
        jPanelTODO = new javax.swing.JPanel();
        jLabelTODO = new javax.swing.JLabel();
        jPanelPELICULAS = new javax.swing.JPanel();
        jLabelPELICULAS = new javax.swing.JLabel();
        jPanelSERIES = new javax.swing.JPanel();
        jLabelSERIES = new javax.swing.JLabel();
        jPanelFAVORITOS = new javax.swing.JPanel();
        jLabelFAVORITOS = new javax.swing.JLabel();
        jPanelBusqueda = new javax.swing.JPanel();
        jLabelPalabra = new javax.swing.JLabel();
        jTextFieldClave = new javax.swing.JTextField();
        jLabelActor = new javax.swing.JLabel();
        jTextFieldActor = new javax.swing.JTextField();
        jLabelAnno = new javax.swing.JLabel();
        jFormattedTextFieldAño = new javax.swing.JFormattedTextField();
        jLabelAnno1 = new javax.swing.JLabel();
        jTextFieldGenero = new javax.swing.JTextField();
        jToggleButtonBuscar = new javax.swing.JToggleButton();
        jScrollPaneTarjetas = new javax.swing.JScrollPane();
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

        jLabelCerrar.setBackground(new java.awt.Color(255, 255, 255));
        jLabelCerrar.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        jLabelCerrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCerrar.setText("X");
        jPanelCerrar.add(jLabelCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 30));

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

        jPanelventana.add(jPanelOpciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1240, -1));

        jPanelIntroDatos.setBackground(java.awt.Color.lightGray);
        jPanelIntroDatos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelJAVAFLIX.setFont(new java.awt.Font("Roboto Black", 0, 55)); // NOI18N
        jLabelJAVAFLIX.setForeground(new java.awt.Color(197, 49, 47));
        jLabelJAVAFLIX.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelJAVAFLIX.setText("JAVAFLIX");
        jPanelIntroDatos.add(jLabelJAVAFLIX, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, 130));

        jLabelJAVAFLIXSombra.setFont(new java.awt.Font("Roboto Black", 0, 55)); // NOI18N
        jLabelJAVAFLIXSombra.setForeground(new java.awt.Color(112, 101, 101));
        jLabelJAVAFLIXSombra.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelJAVAFLIXSombra.setText("JAVAFLIX");
        jPanelIntroDatos.add(jLabelJAVAFLIXSombra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 150));
        jPanelIntroDatos.add(jSeparatorArribaTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 128, 270, -1));
        jPanelIntroDatos.add(jSeparatorArriba, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 275, 270, -1));
        jPanelIntroDatos.add(jSeparatorMedio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 270, -1));
        jPanelIntroDatos.add(jSeparatorAbajo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 565, 270, -1));

        jPanelTODO.setBackground(new java.awt.Color(180, 45, 49));
        jPanelTODO.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabelTODO.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        jLabelTODO.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTODO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTODO.setText("TODO");
        jLabelTODO.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelTODO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelTODOMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelTODOMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelTODOMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelTODOMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabelTODOMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanelTODOLayout = new javax.swing.GroupLayout(jPanelTODO);
        jPanelTODO.setLayout(jPanelTODOLayout);
        jPanelTODOLayout.setHorizontalGroup(
            jPanelTODOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelTODO, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
        );
        jPanelTODOLayout.setVerticalGroup(
            jPanelTODOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelTODO, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
        );

        jPanelIntroDatos.add(jPanelTODO, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 270, 145));

        jPanelPELICULAS.setBackground(new java.awt.Color(180, 45, 49));
        jPanelPELICULAS.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabelPELICULAS.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        jLabelPELICULAS.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPELICULAS.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPELICULAS.setText("PELÍCULAS");
        jLabelPELICULAS.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelPELICULAS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelPELICULASMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelPELICULASMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelPELICULASMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelPELICULASMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabelPELICULASMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanelPELICULASLayout = new javax.swing.GroupLayout(jPanelPELICULAS);
        jPanelPELICULAS.setLayout(jPanelPELICULASLayout);
        jPanelPELICULASLayout.setHorizontalGroup(
            jPanelPELICULASLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelPELICULAS, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
        );
        jPanelPELICULASLayout.setVerticalGroup(
            jPanelPELICULASLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelPELICULAS, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
        );

        jPanelIntroDatos.add(jPanelPELICULAS, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 275, 270, 145));

        jPanelSERIES.setBackground(new java.awt.Color(180, 45, 49));
        jPanelSERIES.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabelSERIES.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        jLabelSERIES.setForeground(new java.awt.Color(255, 255, 255));
        jLabelSERIES.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelSERIES.setText("SERIES");
        jLabelSERIES.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelSERIES.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelSERIESMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelSERIESMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelSERIESMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelSERIESMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabelSERIESMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanelSERIESLayout = new javax.swing.GroupLayout(jPanelSERIES);
        jPanelSERIES.setLayout(jPanelSERIESLayout);
        jPanelSERIESLayout.setHorizontalGroup(
            jPanelSERIESLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelSERIES, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
        );
        jPanelSERIESLayout.setVerticalGroup(
            jPanelSERIESLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelSERIES, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
        );

        jPanelIntroDatos.add(jPanelSERIES, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 270, 145));

        jPanelFAVORITOS.setBackground(new java.awt.Color(180, 45, 49));
        jPanelFAVORITOS.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabelFAVORITOS.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        jLabelFAVORITOS.setForeground(new java.awt.Color(255, 255, 255));
        jLabelFAVORITOS.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelFAVORITOS.setText("FAVORITOS");
        jLabelFAVORITOS.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelFAVORITOS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelFAVORITOSMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelFAVORITOSMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelFAVORITOSMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelFAVORITOSMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabelFAVORITOSMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanelFAVORITOSLayout = new javax.swing.GroupLayout(jPanelFAVORITOS);
        jPanelFAVORITOS.setLayout(jPanelFAVORITOSLayout);
        jPanelFAVORITOSLayout.setHorizontalGroup(
            jPanelFAVORITOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelFAVORITOS, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
        );
        jPanelFAVORITOSLayout.setVerticalGroup(
            jPanelFAVORITOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelFAVORITOS, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
        );

        jPanelIntroDatos.add(jPanelFAVORITOS, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 565, 270, 145));

        jPanelventana.add(jPanelIntroDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 270, 710));

        jPanelBusqueda.setToolTipText("Palabras clave");
        jPanelBusqueda.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 10, 45));

        jLabelPalabra.setText("Palabras clave:");
        jPanelBusqueda.add(jLabelPalabra);

        jTextFieldClave.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        jTextFieldClave.setMinimumSize(new java.awt.Dimension(170, 30));
        jTextFieldClave.setPreferredSize(new java.awt.Dimension(170, 30));
        jPanelBusqueda.add(jTextFieldClave);

        jLabelActor.setText("Actor:");
        jPanelBusqueda.add(jLabelActor);

        jTextFieldActor.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        jTextFieldActor.setToolTipText("Actores");
        jTextFieldActor.setMinimumSize(new java.awt.Dimension(170, 30));
        jTextFieldActor.setPreferredSize(new java.awt.Dimension(170, 30));
        jPanelBusqueda.add(jTextFieldActor);

        jLabelAnno.setText("Año:");
        jPanelBusqueda.add(jLabelAnno);

        jFormattedTextFieldAño.setToolTipText("Año");
        jFormattedTextFieldAño.setMinimumSize(new java.awt.Dimension(170, 30));
        jFormattedTextFieldAño.setPreferredSize(new java.awt.Dimension(170, 30));
        jPanelBusqueda.add(jFormattedTextFieldAño);

        jLabelAnno1.setText("Genero:");
        jPanelBusqueda.add(jLabelAnno1);

        jTextFieldGenero.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        jTextFieldGenero.setForeground(java.awt.Color.gray);
        jTextFieldGenero.setToolTipText("Actores");
        jTextFieldGenero.setMinimumSize(new java.awt.Dimension(170, 30));
        jTextFieldGenero.setPreferredSize(new java.awt.Dimension(170, 30));
        jPanelBusqueda.add(jTextFieldGenero);

        jPanelventana.add(jPanelBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, 970, 90));

        jToggleButtonBuscar.setText("BUSCAR");
        jToggleButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonBuscarActionPerformed(evt);
            }
        });
        jPanelventana.add(jToggleButtonBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 120, 90, 30));

        jPanelTarjetas.setLayout(new java.awt.GridLayout(1, 1, 0, 10));
        jScrollPaneTarjetas.setViewportView(jPanelTarjetas);

        jPanelventana.add(jScrollPaneTarjetas, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 160, 970, 580));

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

    public ArrayList<Contenido> getListacontenido() {
        return listacontenido;
    }

    public void setListacontenido(ArrayList<Contenido> listacontenido) {
        this.listacontenido = listacontenido;
    }

    private void generarTarjetas() {
        jPanelTarjetas.removeAll();
        jScrollPaneTarjetas.setSize(968, 578);
        jPanelTarjetas.setSize(968, listacontenido.size() * 100);
        jPanelTarjetas.setLayout(new GridLayout(listacontenido.size(), 1));
        for (Contenido contenidoiterando : listacontenido) {
            jPanelTarjetas.add(new tarjetaContenido(this, contenidoiterando));
        }

    }

    public Cliente getClientelogeado() {
        return clientelogeado;
    }

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        UtilJavaflix.guardarDatos();
        this.padre.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_formWindowClosing

    private void jPanelCerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelCerrarMouseEntered
        // TODO add your handling code here:
        jPanelCerrar.setBackground(new Color(232, 17, 35));
        jLabelCerrar.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_jPanelCerrarMouseEntered

    private void jPanelCerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelCerrarMouseExited
        // TODO add your handling code here:
        jPanelCerrar.setBackground(new Color(255, 255, 255));
        jLabelCerrar.setForeground(new Color(0, 0, 0));
    }//GEN-LAST:event_jPanelCerrarMouseExited

    private void jPanelAtrasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelAtrasMouseEntered
        // TODO add your handling code here:
        jPanelAtras.setBackground(new Color(229, 229, 229));
    }//GEN-LAST:event_jPanelAtrasMouseEntered

    private void jPanelAtrasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelAtrasMouseExited
        // TODO add your handling code here:
        jPanelAtras.setBackground(new Color(255, 255, 255));
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

    private void jToggleButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonBuscarActionPerformed
        // TODO add your handling code here:
        String busquedapalabra = jTextFieldClave.getText();
        String busquedaactor = jTextFieldActor.getText();
        String busquedagenero = jTextFieldGenero.getText();
        if (!"".equals(busquedapalabra)) {
            listacontenido = OrdenarContenido.buscarPalabra(busquedapalabra, listacontenido);
        }
        if (!"".equals(busquedaactor)) {
            listacontenido = OrdenarContenido.buscarActor(busquedaactor, listacontenido);
        }
        if (!"".equals(busquedagenero)) {
            listacontenido = OrdenarContenido.buscarGenero(busquedagenero, listacontenido);
        }
        if (!jFormattedTextFieldAño.getText().equals("")) {
            listacontenido = OrdenarContenido.buscarAnno(Integer.parseInt(jFormattedTextFieldAño.getText()), listacontenido);
        }
        generarTarjetas();
    }//GEN-LAST:event_jToggleButtonBuscarActionPerformed

    private void jLabelTODOMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelTODOMouseClicked
        // TODO add your handling code here:
        this.listacontenido.clear();
        this.listacontenido.addAll(UtilJavaflix.getPeliculas());
        this.listacontenido.addAll(UtilJavaflix.getSeries());
        this.listacontenido = OrdenarContenido.masRecienteMayorRating(listacontenido);
        generarTarjetas();
    }//GEN-LAST:event_jLabelTODOMouseClicked

    private void jLabelTODOMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelTODOMouseEntered
        // TODO add your handling code here:
        jPanelTODO.setBackground(new Color(148, 13, 30));
    }//GEN-LAST:event_jLabelTODOMouseEntered

    private void jLabelTODOMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelTODOMouseExited
        // TODO add your handling code here:
        jPanelTODO.setBackground(new Color(180, 45, 49));
    }//GEN-LAST:event_jLabelTODOMouseExited

    private void jLabelTODOMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelTODOMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelTODOMousePressed

    private void jLabelTODOMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelTODOMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelTODOMouseReleased

    private void jLabelPELICULASMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelPELICULASMouseClicked
        // TODO add your handling code here:
        this.listacontenido.clear();
        for (Contenido contenido : UtilJavaflix.getPeliculas()) {
            this.listacontenido.add(contenido);
        }
        this.listacontenido = OrdenarContenido.masRecienteMayorRating(listacontenido);
        generarTarjetas();
    }//GEN-LAST:event_jLabelPELICULASMouseClicked

    private void jLabelPELICULASMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelPELICULASMouseEntered
        // TODO add your handling code here:
        jPanelPELICULAS.setBackground(new Color(148, 13, 30));
    }//GEN-LAST:event_jLabelPELICULASMouseEntered

    private void jLabelPELICULASMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelPELICULASMouseExited
        // TODO add your handling code here:
        jPanelPELICULAS.setBackground(new Color(180, 45, 49));
    }//GEN-LAST:event_jLabelPELICULASMouseExited

    private void jLabelPELICULASMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelPELICULASMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelPELICULASMousePressed

    private void jLabelPELICULASMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelPELICULASMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelPELICULASMouseReleased

    private void jLabelSERIESMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSERIESMouseClicked
        // TODO add your handling code here:
        this.listacontenido.clear();
        for (Contenido contenido : UtilJavaflix.getSeries()) {
            this.listacontenido.add(contenido);
        }
        this.listacontenido = OrdenarContenido.masRecienteMayorRating(listacontenido);
        generarTarjetas();
    }//GEN-LAST:event_jLabelSERIESMouseClicked

    private void jLabelSERIESMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSERIESMouseEntered
        // TODO add your handling code here:
        jPanelSERIES.setBackground(new Color(148, 13, 30));
    }//GEN-LAST:event_jLabelSERIESMouseEntered

    private void jLabelSERIESMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSERIESMouseExited
        // TODO add your handling code here:
        jPanelSERIES.setBackground(new Color(180, 45, 49));
    }//GEN-LAST:event_jLabelSERIESMouseExited

    private void jLabelSERIESMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSERIESMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelSERIESMousePressed

    private void jLabelSERIESMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSERIESMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelSERIESMouseReleased

    private void jLabelFAVORITOSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelFAVORITOSMouseClicked
        // TODO add your handling code here:
        this.listacontenido.clear();
        this.listacontenido.addAll(clientelogeado.getFavoritos());
        this.listacontenido = OrdenarContenido.masRecienteMayorRating(listacontenido);
        generarTarjetas();
    }//GEN-LAST:event_jLabelFAVORITOSMouseClicked

    private void jLabelFAVORITOSMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelFAVORITOSMouseEntered
        // TODO add your handling code here:
        jPanelFAVORITOS.setBackground(new Color(148, 13, 30));
    }//GEN-LAST:event_jLabelFAVORITOSMouseEntered

    private void jLabelFAVORITOSMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelFAVORITOSMouseExited
        // TODO add your handling code here:
        jPanelFAVORITOS.setBackground(new Color(180, 45, 49));
    }//GEN-LAST:event_jLabelFAVORITOSMouseExited

    private void jLabelFAVORITOSMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelFAVORITOSMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelFAVORITOSMousePressed

    private void jLabelFAVORITOSMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelFAVORITOSMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelFAVORITOSMouseReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JFormattedTextField jFormattedTextFieldAño;
    private javax.swing.JLabel jLabelActor;
    private javax.swing.JLabel jLabelAnno;
    private javax.swing.JLabel jLabelAnno1;
    private javax.swing.JLabel jLabelAtras;
    private javax.swing.JLabel jLabelCerrar;
    private javax.swing.JLabel jLabelFAVORITOS;
    private javax.swing.JLabel jLabelJAVAFLIX;
    private javax.swing.JLabel jLabelJAVAFLIXSombra;
    private javax.swing.JLabel jLabelPELICULAS;
    private javax.swing.JLabel jLabelPalabra;
    private javax.swing.JLabel jLabelSERIES;
    private javax.swing.JLabel jLabelTODO;
    private javax.swing.JPanel jPanelAtras;
    private javax.swing.JPanel jPanelBusqueda;
    private javax.swing.JPanel jPanelCerrar;
    private javax.swing.JPanel jPanelFAVORITOS;
    private javax.swing.JPanel jPanelIntroDatos;
    private javax.swing.JPanel jPanelOpciones;
    private javax.swing.JPanel jPanelPELICULAS;
    private javax.swing.JPanel jPanelSERIES;
    private javax.swing.JPanel jPanelTODO;
    private javax.swing.JPanel jPanelTarjetas;
    private javax.swing.JPanel jPanelventana;
    private javax.swing.JScrollPane jScrollPaneTarjetas;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparatorAbajo;
    private javax.swing.JSeparator jSeparatorArriba;
    private javax.swing.JSeparator jSeparatorArribaTitulo;
    private javax.swing.JSeparator jSeparatorMedio;
    private javax.swing.JTextField jTextFieldActor;
    private javax.swing.JTextField jTextFieldClave;
    private javax.swing.JTextField jTextFieldGenero;
    private javax.swing.JToggleButton jToggleButtonBuscar;
    // End of variables declaration//GEN-END:variables
}
