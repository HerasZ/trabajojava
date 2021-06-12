/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Clases.Pelicula;
import java.awt.Color;
import Clases.UtilJavaflix;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Francisco
 */
public class modificarPelicula extends javax.swing.JFrame {

    private consultaContenido padre;
    private String nombreImagen, rutaImagen, extension = "jpg";
    private File file;
    private BufferedImage bimage;
    private Pelicula pelimodificar;
    private ImageIcon portadamodificar;

    public ImageIcon cargarFoto() {
        JFileChooser filechooser = new JFileChooser();
        filechooser.addChoosableFileFilter(new ImageFilter());
        filechooser.setAcceptAllFileFilterUsed(false);

        int option = filechooser.showOpenDialog(this);
        if (option == JFileChooser.APPROVE_OPTION) {
            file = filechooser.getSelectedFile();
            rutaImagen = file.getAbsolutePath();
            nombreImagen = file.getName();
        } else {
            JOptionPane.showMessageDialog(this, "Ningún fichero seleccionado", "Mensaje", JOptionPane.ERROR_MESSAGE);
        }
        ImageIcon portada = new ImageIcon(rutaImagen);
        return portada;
    }

    public ArrayList<String> parseActores(String actores) {
        ArrayList<String> arrayactores = new ArrayList<>();
        String actorbuilder = "";
        for (int i = 0; i < actores.length(); i++) {
            char c = actores.charAt(i);
            if (c == ',') {
                arrayactores.add(actorbuilder);
                actorbuilder = "";
            } else {
                actorbuilder += c;
            }
        }
        return arrayactores;
    }

    /**
     * Creates new form ventanaPrincipal
     */
    public modificarPelicula(consultaContenido main, Pelicula pelimodificar) {
        padre = main;
        this.pelimodificar = pelimodificar;
        this.portadamodificar = pelimodificar.getPortada();
        initComponents();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        fieldTitulo.setText(pelimodificar.getTitulo());
        fieldGeneroP.setText(pelimodificar.getTitulo());
        fieldAnnoP.setText(String.valueOf(pelimodificar.getAnno()));
        fieldDirector.setText(pelimodificar.getDirector());
        fieldDuracion.setText(pelimodificar.getDuracion());
        fieldActoresP.setText(String.join(",", pelimodificar.getActores()));
        fieldSinopsis.setText(pelimodificar.getSinopsis());
        ImageIcon portadaredimen = new ImageIcon(pelimodificar.getPortada().getImage().getScaledInstance(jLabelportadapelicula.getWidth(), jLabelportadapelicula.getHeight(), 1));
        jLabelportadapelicula.setIcon(portadaredimen);

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
        jPanelModificar = new javax.swing.JPanel();
        jPanelPeliculas = new javax.swing.JPanel();
        fieldTitulo = new javax.swing.JTextField();
        jLabelTitulo = new javax.swing.JLabel();
        jLabelGenero = new javax.swing.JLabel();
        fieldGeneroP = new javax.swing.JTextField();
        jLabelSinopsis = new javax.swing.JLabel();
        jScrollPaneSinopsis = new javax.swing.JScrollPane();
        fieldSinopsis = new javax.swing.JTextArea();
        fieldAnnoP = new javax.swing.JTextField();
        jLabelAnno = new javax.swing.JLabel();
        jLabelDirector = new javax.swing.JLabel();
        fieldDirector = new javax.swing.JTextField();
        jLabelDuracion = new javax.swing.JLabel();
        fieldDuracion = new javax.swing.JFormattedTextField();
        jButtonFoto = new javax.swing.JButton();
        jPanelFoto = new javax.swing.JPanel();
        jLabelportadapelicula = new javax.swing.JLabel();
        jPanelActualizar = new javax.swing.JPanel();
        actualizarpelicula = new javax.swing.JLabel();
        jLabelActores = new javax.swing.JLabel();
        fieldActoresP = new javax.swing.JTextField();
        jPanelEliminar = new javax.swing.JPanel();
        jLabelEliminar = new javax.swing.JLabel();
        jLabelJAVAFLIX = new javax.swing.JLabel();
        jLabelJAVAFLIXSombra = new javax.swing.JLabel();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1239, 725));
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
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

        jPanelventana.add(jPanelOpciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1250, -1));

        jPanelModificar.setBackground(new java.awt.Color(255, 255, 255));

        jPanelPeliculas.setBackground(new java.awt.Color(255, 255, 255));
        jPanelPeliculas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanelPeliculas.add(fieldTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 105, -1));

        jLabelTitulo.setText("Título:");
        jPanelPeliculas.add(jLabelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, 20));

        jLabelGenero.setText("Genero:");
        jPanelPeliculas.add(jLabelGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, 20));
        jPanelPeliculas.add(fieldGeneroP, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 105, -1));

        jLabelSinopsis.setText("Sinopsis:");
        jPanelPeliculas.add(jLabelSinopsis, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, -1, -1));

        fieldSinopsis.setColumns(20);
        fieldSinopsis.setRows(5);
        jScrollPaneSinopsis.setViewportView(fieldSinopsis);

        jPanelPeliculas.add(jScrollPaneSinopsis, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, 180, 90));
        jPanelPeliculas.add(fieldAnnoP, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 105, -1));

        jLabelAnno.setText("Año:");
        jPanelPeliculas.add(jLabelAnno, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, 20));

        jLabelDirector.setText("Director:");
        jPanelPeliculas.add(jLabelDirector, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 58, 20));
        jPanelPeliculas.add(fieldDirector, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 110, -1));

        jLabelDuracion.setText("Duracion(HH:MM:SS)");
        jPanelPeliculas.add(jLabelDuracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, 20));
        jPanelPeliculas.add(fieldDuracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 110, -1));

        jButtonFoto.setText("Subir Foto");
        jButtonFoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFotoActionPerformed(evt);
            }
        });
        jPanelPeliculas.add(jButtonFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 200, 89, -1));

        jPanelFoto.setBackground(new java.awt.Color(130, 130, 130));

        javax.swing.GroupLayout jPanelFotoLayout = new javax.swing.GroupLayout(jPanelFoto);
        jPanelFoto.setLayout(jPanelFotoLayout);
        jPanelFotoLayout.setHorizontalGroup(
            jPanelFotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelportadapelicula, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
        );
        jPanelFotoLayout.setVerticalGroup(
            jPanelFotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelportadapelicula, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
        );

        jPanelPeliculas.add(jPanelFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 120, -1, -1));

        jPanelActualizar.setBackground(new java.awt.Color(180, 45, 49));

        actualizarpelicula.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        actualizarpelicula.setForeground(new java.awt.Color(255, 255, 255));
        actualizarpelicula.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        actualizarpelicula.setText("ACTUALIZAR PELICULA");
        actualizarpelicula.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                actualizarpeliculaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelActualizarLayout = new javax.swing.GroupLayout(jPanelActualizar);
        jPanelActualizar.setLayout(jPanelActualizarLayout);
        jPanelActualizarLayout.setHorizontalGroup(
            jPanelActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(actualizarpelicula, javax.swing.GroupLayout.DEFAULT_SIZE, 670, Short.MAX_VALUE)
        );
        jPanelActualizarLayout.setVerticalGroup(
            jPanelActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(actualizarpelicula, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );

        jPanelPeliculas.add(jPanelActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 670, -1));

        jLabelActores.setText("Actores(separados por ,):");
        jPanelPeliculas.add(jLabelActores, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, 20));
        jPanelPeliculas.add(fieldActoresP, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, 150, -1));

        javax.swing.GroupLayout jPanelModificarLayout = new javax.swing.GroupLayout(jPanelModificar);
        jPanelModificar.setLayout(jPanelModificarLayout);
        jPanelModificarLayout.setHorizontalGroup(
            jPanelModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelModificarLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jPanelPeliculas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(758, 758, 758))
        );
        jPanelModificarLayout.setVerticalGroup(
            jPanelModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelModificarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelPeliculas, javax.swing.GroupLayout.DEFAULT_SIZE, 458, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanelventana.add(jPanelModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 770, 480));

        jPanelEliminar.setBackground(new java.awt.Color(255, 255, 255));

        jLabelEliminar.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabelEliminar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelEliminar.setText("ELIMINAR PELICULA");
        jLabelEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelEliminarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelEliminarLayout = new javax.swing.GroupLayout(jPanelEliminar);
        jPanelEliminar.setLayout(jPanelEliminarLayout);
        jPanelEliminarLayout.setHorizontalGroup(
            jPanelEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
        );
        jPanelEliminarLayout.setVerticalGroup(
            jPanelEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        jPanelventana.add(jPanelEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 70, 260, -1));

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
        this.dispose();
        padre.setEnabled(true);
        padre.setVisible(true);
    }//GEN-LAST:event_jPanelAtrasMouseClicked

    private void jPanelCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelCerrarMouseClicked
        // TODO add your handling code here:      
        UtilJavaflix.cerrarPrograma();

    }//GEN-LAST:event_jPanelCerrarMouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code h
    }//GEN-LAST:event_formWindowActivated

    private void jButtonFotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFotoActionPerformed
        // TODO add your handling code here:
        this.portadamodificar = cargarFoto();
        ImageIcon imgRedimensionada = new ImageIcon(portadamodificar.getImage().getScaledInstance(jLabelportadapelicula.getWidth(), jLabelportadapelicula.getHeight(), 1));
        jLabelportadapelicula.setIcon(imgRedimensionada);
    }//GEN-LAST:event_jButtonFotoActionPerformed

    private void actualizarpeliculaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_actualizarpeliculaMouseClicked
        try {
            ArrayList<Pelicula> listacompleta = UtilJavaflix.getPeliculas();
            Pelicula peliculareemplazar = new Pelicula(fieldDuracion.getText(), fieldDirector.getText(), fieldTitulo.getText(), fieldSinopsis.getText(), fieldGeneroP.getText(),
                    Integer.parseInt(fieldAnnoP.getText()), parseActores(fieldActoresP.getText()), portadamodificar);
            int indexparainsertar = listacompleta.indexOf(pelimodificar);
            System.out.println(indexparainsertar);
            listacompleta.set(indexparainsertar, peliculareemplazar);
            UtilJavaflix.setPeliculas(listacompleta);
            UtilJavaflix.guardarDatos();
            JOptionPane.showMessageDialog(rootPane, "Actualizacion completada");
            padre.setEnabled(true);
            padre.setVisible(true);
            this.dispose();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_actualizarpeliculaMouseClicked

    private void jLabelEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelEliminarMouseClicked
        // TODO add your handling code here:
        ArrayList<Pelicula> listacompleta = UtilJavaflix.getPeliculas();
        try {
            listacompleta.remove(pelimodificar);
            JOptionPane.showMessageDialog(this, "Serie eliminada correctamente");
            UtilJavaflix.setPeliculas(listacompleta);
            this.dispose();
            padre.setEnabled(true);
            padre.setVisible(true);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error al borrar la serie");
        }

    }//GEN-LAST:event_jLabelEliminarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel actualizarpelicula;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField fieldActoresP;
    private javax.swing.JTextField fieldAnnoP;
    private javax.swing.JTextField fieldDirector;
    private javax.swing.JFormattedTextField fieldDuracion;
    private javax.swing.JTextField fieldGeneroP;
    private javax.swing.JTextArea fieldSinopsis;
    private javax.swing.JTextField fieldTitulo;
    private javax.swing.JButton jButtonFoto;
    private javax.swing.JLabel jLabelActores;
    private javax.swing.JLabel jLabelAnno;
    private javax.swing.JLabel jLabelAtras;
    private javax.swing.JLabel jLabelCerrar;
    private javax.swing.JLabel jLabelDirector;
    private javax.swing.JLabel jLabelDuracion;
    private javax.swing.JLabel jLabelEliminar;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelGenero;
    private javax.swing.JLabel jLabelJAVAFLIX;
    private javax.swing.JLabel jLabelJAVAFLIXSombra;
    private javax.swing.JLabel jLabelSinopsis;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JLabel jLabelportadapelicula;
    private javax.swing.JPanel jPanelActualizar;
    private javax.swing.JPanel jPanelAtras;
    private javax.swing.JPanel jPanelCerrar;
    private javax.swing.JPanel jPanelEliminar;
    private javax.swing.JPanel jPanelFoto;
    private javax.swing.JPanel jPanelModificar;
    private javax.swing.JPanel jPanelOpciones;
    private javax.swing.JPanel jPanelPeliculas;
    private javax.swing.JPanel jPanelventana;
    private javax.swing.JScrollPane jScrollPaneSinopsis;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
