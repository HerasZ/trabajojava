/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Clases.Pelicula;
import Clases.Serie;
import Clases.Temporada;
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
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Francisco
 */
public class modificarSeries extends javax.swing.JFrame {

    private consultaContenido padre;
    private ArrayList<Temporada> temporadas = new ArrayList<Temporada>();
    private String nombreImagen, rutaImagen, extension = "jpg";
    private File file;
    private BufferedImage bimage;
    private Serie seriemodificar;

    public ArrayList<Temporada> getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(ArrayList<Temporada> temporadas) {
        this.temporadas = temporadas;
    }

    public void addTemporadas(Temporada temporada) {
        this.temporadas.add(temporada);
    }

    private void showTabla(ArrayList<Temporada> Temporadas) {
        int contador = 0;
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        for (Temporada temporadaactual : Temporadas) {
            model.addRow(new Object[]{null, null});
            jTable1.setValueAt(Temporadas.indexOf(temporadaactual) + 1, contador, 0);
            jTable1.setValueAt(temporadaactual.getCapitulos().size(), contador, 1);
            contador++;
        }
    }

    private void limpiarTabla() {
        DefaultTableModel dm = (DefaultTableModel) jTable1.getModel();
        int rowCount = dm.getRowCount();
        //Remove rows one by one from the end of the table
        for (int i = rowCount - 1; i >= 0; i--) {
            dm.removeRow(i);
        }
    }

    public ImageIcon cargarFoto() {
        JFileChooser filechooser = new JFileChooser();
        filechooser.addChoosableFileFilter(new ImageFilter());
        filechooser.setAcceptAllFileFilterUsed(false);

        int option = filechooser.showOpenDialog(this);
        if (option == JFileChooser.APPROVE_OPTION) {
            try {
                File borrar = new File(rutaImagen);
                borrar.delete();
            } catch (Exception ex) {
                System.out.println("La portada anterior no existe en el directorio");
            }
            file = filechooser.getSelectedFile();
            rutaImagen = file.getAbsolutePath();
            nombreImagen = file.getName();
        } else {
            JOptionPane.showMessageDialog(this, "Ningún fichero seleccionado", "Mensaje", JOptionPane.ERROR_MESSAGE);
        }
        ImageIcon portada = new ImageIcon(rutaImagen);
        return portada;
    }

    public String guardarFoto() {
        try {
            bimage = ImageIO.read(file);
            File fout = new File("./portadas/" + nombreImagen);
            ImageIO.write(bimage, extension, fout);
            String savedimagepath = fout.getPath();
            ImageIcon savedimage = new ImageIcon(savedimagepath);
            //Devolvemos el path para guardarlo en el archivo de datos
            return savedimagepath;
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error al guardar imagen");
        }
        return null;
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
    public modificarSeries(consultaContenido main, Serie seriemodificar) {
        padre = main;
        this.seriemodificar = seriemodificar;
        this.temporadas = seriemodificar.getTemporada();
        initComponents();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        rutaImagen = seriemodificar.getPortada();
        fieldNombreS.setText(seriemodificar.getTitulo());
        fieldGeneroS.setText(seriemodificar.getGenero());
        fieldAnnoS.setText(String.valueOf(seriemodificar.getAnno()));
        fieldActoresS.setText(String.join(",", seriemodificar.getActores()));
        fieldSinopsisS.setText(seriemodificar.getSinopsis());
        ImageIcon portadaanterior = new ImageIcon(rutaImagen);
        ImageIcon portadaredimen = new ImageIcon(portadaanterior.getImage().getScaledInstance(jLabelportadaserie.getWidth(), jLabelportadaserie.getHeight(), 1));
        jLabelportadaserie.setIcon(portadaredimen);
        showTabla(seriemodificar.getTemporada());
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
        jPanel1 = new javax.swing.JPanel();
        jPanelSeries = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        fieldNombreS = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        fieldGeneroS = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        fieldAnnoS = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        fieldActoresS = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        fieldSinopsisS = new javax.swing.JTextArea();
        jPanel10 = new javax.swing.JPanel();
        crearserie = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabelportadaserie = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabelJAVAFLIXRegistro = new javax.swing.JLabel();
        jLabelJAVAFLIXSombraRegistro = new javax.swing.JLabel();
        jLabelFondoRegistro = new javax.swing.JLabel();

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

        jPanelRegistro.add(jPanelOpcionesRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1250, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanelSeries.setBackground(new java.awt.Color(255, 255, 255));
        jPanelSeries.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Nombre:");
        jPanelSeries.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, 20));
        jPanelSeries.add(fieldNombreS, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 105, -1));

        jLabel2.setText("Sinopsis:");
        jPanelSeries.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 50, -1, 20));

        jLabel3.setText("Genero:");
        jPanelSeries.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, -1, 20));
        jPanelSeries.add(fieldGeneroS, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 105, -1));

        jLabel6.setText("Año:");
        jPanelSeries.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, 20));
        jPanelSeries.add(fieldAnnoS, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 105, -1));

        jLabel7.setText("Actores(separados por ,):");
        jPanelSeries.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, 20));
        jPanelSeries.add(fieldActoresS, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 320, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Temporada", "Capitulos"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanelSeries.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 180, 220, 144));

        fieldSinopsisS.setColumns(20);
        fieldSinopsisS.setRows(5);
        jScrollPane2.setViewportView(fieldSinopsisS);

        jPanelSeries.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 20, 210, 90));

        jPanel10.setBackground(new java.awt.Color(180, 45, 49));

        crearserie.setBackground(new java.awt.Color(255, 255, 255));
        crearserie.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        crearserie.setForeground(new java.awt.Color(255, 255, 255));
        crearserie.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        crearserie.setText("ACTUALIZAR SERIE");
        crearserie.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                crearserieMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(crearserie, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(crearserie, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );

        jPanelSeries.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 360, 720, 80));

        jPanel3.setBackground(new java.awt.Color(130, 130, 130));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelportadaserie, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelportadaserie, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
        );

        jPanelSeries.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 130, -1, -1));

        jButton2.setText("Subir Foto");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanelSeries.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 210, 89, -1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelSeries, javax.swing.GroupLayout.DEFAULT_SIZE, 880, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelSeries, javax.swing.GroupLayout.DEFAULT_SIZE, 458, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanelRegistro.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 900, 480));

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
        padre.setVisible(true);
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
        this.dispose();
        padre.setEnabled(true);
        padre.setVisible(true);
    }//GEN-LAST:event_jPanelAtrasRegistroMouseClicked

    private void jPanelCerrarRegistroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelCerrarRegistroMouseClicked
        // TODO add your handling code here:      
        UtilJavaflix.cerrarPrograma();

    }//GEN-LAST:event_jPanelCerrarRegistroMouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        if (this.temporadas.size() > 0) {
            limpiarTabla();
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.addRow(new Object[]{null, null});
            showTabla(temporadas);
        }
    }//GEN-LAST:event_formWindowActivated

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        ImageIcon portadaSerie = cargarFoto();
        ImageIcon imgRedimensionada = new ImageIcon(portadaSerie.getImage().getScaledInstance(jLabelportadaserie.getWidth(), jLabelportadaserie.getHeight(), 1));
        jLabelportadaserie.setIcon(imgRedimensionada);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void crearserieMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crearserieMouseClicked
        // TODO add your handling code here:
        String imagenfinalpath;
        try {
            imagenfinalpath = guardarFoto();
        } catch (IllegalArgumentException ex) {
            imagenfinalpath = rutaImagen;
        }
        try {
            Serie serieasustituir = new Serie(temporadas, fieldNombreS.getText(), fieldSinopsisS.getText(), fieldGeneroS.getText(), Integer.parseInt(fieldAnnoS.getText()),
                    parseActores(fieldActoresS.getText()), imagenfinalpath);
            ArrayList<Serie> listacompleta = UtilJavaflix.getSeries();
            int indexasustituir = listacompleta.indexOf(seriemodificar);
            listacompleta.set(indexasustituir, serieasustituir);
            UtilJavaflix.setSeries(listacompleta);
            UtilJavaflix.guardarDatos();
            JOptionPane.showMessageDialog(this, "Serie actualizada correctamente");
            this.dispose();
            padre.setVisible(true);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, "Error al crear la serie");
        }

    }//GEN-LAST:event_crearserieMouseClicked

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        try {
            Temporada temporadaselect = seriemodificar.getTemporada().get(jTable1.getSelectedRow());
            modificarCapitulo modcapitulo = new modificarCapitulo(this, temporadaselect);
        } catch (IndexOutOfBoundsException ex) {
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_jTable1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel crearserie;
    private javax.swing.JTextField fieldActoresS;
    private javax.swing.JTextField fieldAnnoS;
    private javax.swing.JTextField fieldGeneroS;
    private javax.swing.JTextField fieldNombreS;
    private javax.swing.JTextArea fieldSinopsisS;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelAtrasRegistro;
    private javax.swing.JLabel jLabelCerrarRegistro;
    private javax.swing.JLabel jLabelFondoRegistro;
    private javax.swing.JLabel jLabelJAVAFLIXRegistro;
    private javax.swing.JLabel jLabelJAVAFLIXSombraRegistro;
    private javax.swing.JLabel jLabelportadaserie;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanelAtrasRegistro;
    private javax.swing.JPanel jPanelCerrarRegistro;
    private javax.swing.JPanel jPanelOpcionesRegistro;
    private javax.swing.JPanel jPanelRegistro;
    private javax.swing.JPanel jPanelSeries;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}