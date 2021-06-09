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
public class addContenido extends javax.swing.JFrame {

    private adminContenidos padre;
    private ArrayList<Temporada> temporadas = new ArrayList<Temporada>();
    private String nombreImagen, rutaImagen, extension = "jpg";
    private File file;
    private BufferedImage bimage;

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
        for (Temporada temporadaactual : Temporadas) {
            jTable1.setValueAt(Temporadas.indexOf(temporadaactual) + 1, contador, 0);
            jTable1.setValueAt(temporadaactual.getCapitulos().size(), contador, 1);
            contador++;
        }
    }

    private void limpiarTabla() {
        for (int i = 0; i < jTable1.getRowCount(); i++) {
            for (int j = 0; j < jTable1.getColumnCount(); j++) {
                jTable1.setValueAt(null, i, j);
            }
        }
    }

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
    public addContenido(adminContenidos main) {
        padre = main;
        initComponents();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        jPanelPeliculas.setVisible(false);
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
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        fieldSinopsisS = new javax.swing.JTextArea();
        jPanel10 = new javax.swing.JPanel();
        crearserie = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabelportadaserie = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jPanelPeliculas = new javax.swing.JPanel();
        fieldTitulo = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        fieldGeneroP = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        fieldSinopsis = new javax.swing.JTextArea();
        fieldAnnoP = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        fieldDirector = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        fieldDuracion = new javax.swing.JFormattedTextField();
        jButton5 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jLabelportadapelicula = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        crearpelicula = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        fieldActoresP = new javax.swing.JTextField();
        paneladdserie = new javax.swing.JPanel();
        addserielabel = new javax.swing.JLabel();
        paneladdpelicula = new javax.swing.JPanel();
        addpeliculalabel = new javax.swing.JLabel();
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
        jPanelSeries.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 50, -1, 20));

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
        jScrollPane1.setViewportView(jTable1);

        jPanelSeries.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 178, 220, 144));

        jButton1.setText("Añadir Temporada");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanelSeries.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 330, 133, -1));

        fieldSinopsisS.setColumns(20);
        fieldSinopsisS.setRows(5);
        jScrollPane2.setViewportView(fieldSinopsisS);

        jPanelSeries.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, 210, 90));

        jPanel10.setBackground(new java.awt.Color(180, 45, 49));

        crearserie.setBackground(new java.awt.Color(255, 255, 255));
        crearserie.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        crearserie.setForeground(new java.awt.Color(255, 255, 255));
        crearserie.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        crearserie.setText("CREAR SERIE");
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

        jPanelSeries.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 720, 80));

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

        jPanelSeries.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 170, -1, -1));

        jButton2.setText("Subir Foto");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanelSeries.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 250, 89, -1));

        jPanelPeliculas.setBackground(new java.awt.Color(255, 255, 255));
        jPanelPeliculas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanelPeliculas.add(fieldTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 105, -1));

        jLabel18.setText("Título:");
        jPanelPeliculas.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, 20));

        jLabel19.setText("Genero:");
        jPanelPeliculas.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, 20));
        jPanelPeliculas.add(fieldGeneroP, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 105, -1));

        jLabel20.setText("Sinopsis:");
        jPanelPeliculas.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, -1, -1));

        fieldSinopsis.setColumns(20);
        fieldSinopsis.setRows(5);
        jScrollPane7.setViewportView(fieldSinopsis);

        jPanelPeliculas.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, -1, 90));
        jPanelPeliculas.add(fieldAnnoP, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 105, -1));

        jLabel21.setText("Año:");
        jPanelPeliculas.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, 20));

        jLabel22.setText("Director:");
        jPanelPeliculas.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 58, 20));
        jPanelPeliculas.add(fieldDirector, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 110, -1));

        jLabel23.setText("Duracion(HH:MM:SS)");
        jPanelPeliculas.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, 20));
        jPanelPeliculas.add(fieldDuracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 110, -1));

        jButton5.setText("Subir Foto");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanelPeliculas.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 200, 89, -1));

        jPanel9.setBackground(new java.awt.Color(130, 130, 130));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelportadapelicula, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelportadapelicula, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
        );

        jPanelPeliculas.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 120, -1, -1));

        jPanel11.setBackground(new java.awt.Color(180, 45, 49));

        crearpelicula.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        crearpelicula.setForeground(new java.awt.Color(255, 255, 255));
        crearpelicula.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        crearpelicula.setText("CREAR PELICULA");
        crearpelicula.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                crearpeliculaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(crearpelicula, javax.swing.GroupLayout.DEFAULT_SIZE, 670, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(crearpelicula, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );

        jPanelPeliculas.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 670, -1));

        jLabel26.setText("Actores(separados por ,):");
        jPanelPeliculas.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, 20));
        jPanelPeliculas.add(fieldActoresP, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, 150, -1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelSeries, javax.swing.GroupLayout.PREFERRED_SIZE, 756, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelPeliculas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelSeries, javax.swing.GroupLayout.DEFAULT_SIZE, 458, Short.MAX_VALUE)
                    .addComponent(jPanelPeliculas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanelRegistro.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 900, 480));

        paneladdserie.setBackground(new java.awt.Color(148, 13, 30));

        addserielabel.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        addserielabel.setForeground(new java.awt.Color(255, 255, 255));
        addserielabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addserielabel.setText("Añadir Serie");
        addserielabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addserielabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addserielabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addserielabelMouseExited(evt);
            }
        });

        javax.swing.GroupLayout paneladdserieLayout = new javax.swing.GroupLayout(paneladdserie);
        paneladdserie.setLayout(paneladdserieLayout);
        paneladdserieLayout.setHorizontalGroup(
            paneladdserieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(addserielabel, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
        );
        paneladdserieLayout.setVerticalGroup(
            paneladdserieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(addserielabel, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        jPanelRegistro.add(paneladdserie, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 70, 170, -1));

        paneladdpelicula.setBackground(new java.awt.Color(255, 255, 255));

        addpeliculalabel.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        addpeliculalabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addpeliculalabel.setText("Añadir Pelicula");
        addpeliculalabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addpeliculalabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addpeliculalabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addpeliculalabelMouseExited(evt);
            }
        });

        javax.swing.GroupLayout paneladdpeliculaLayout = new javax.swing.GroupLayout(paneladdpelicula);
        paneladdpelicula.setLayout(paneladdpeliculaLayout);
        paneladdpeliculaLayout.setHorizontalGroup(
            paneladdpeliculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(addpeliculalabel, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
        );
        paneladdpeliculaLayout.setVerticalGroup(
            paneladdpeliculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(addpeliculalabel, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        jPanelRegistro.add(paneladdpelicula, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 70, -1, -1));

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
        this.setVisible(false);
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

    private void addserielabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addserielabelMouseEntered
        // TODO add your handling code here:
        if (!paneladdserie.getBackground().equals(new Color(148, 13, 30))) {
            paneladdserie.setBackground(new Color(180, 45, 49));
            addserielabel.setForeground(new Color(255, 255, 255));
        }
    }//GEN-LAST:event_addserielabelMouseEntered

    private void addserielabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addserielabelMouseExited
        // TODO add your handling code here:
        if (!paneladdserie.getBackground().equals(new Color(148, 13, 30))) {
            paneladdserie.setBackground(new Color(255, 255, 255));
            addserielabel.setForeground(new Color(0, 0, 0));
        }
    }//GEN-LAST:event_addserielabelMouseExited

    private void addpeliculalabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addpeliculalabelMouseEntered
        // TODO add your handling code here:
        if (!paneladdpelicula.getBackground().equals(new Color(148, 13, 30))) {
            paneladdpelicula.setBackground(new Color(180, 45, 49));
            addpeliculalabel.setForeground(new Color(255, 255, 255));
        }
    }//GEN-LAST:event_addpeliculalabelMouseEntered

    private void addpeliculalabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addpeliculalabelMouseExited
        // TODO add your handling code here:
        if (!paneladdpelicula.getBackground().equals(new Color(148, 13, 30))) {
            paneladdpelicula.setBackground(new Color(255, 255, 255));
            addpeliculalabel.setForeground(new Color(0, 0, 0));
        }
    }//GEN-LAST:event_addpeliculalabelMouseExited

    private void addserielabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addserielabelMouseClicked
        // TODO add your handling code here:
        paneladdserie.setBackground(new Color(148, 13, 30));
        paneladdpelicula.setBackground(new Color(255, 255, 255));
        addpeliculalabel.setForeground(new Color(0, 0, 0));
        jPanelSeries.setVisible(true);
        jPanelPeliculas.setVisible(false);
    }//GEN-LAST:event_addserielabelMouseClicked

    private void addpeliculalabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addpeliculalabelMouseClicked
        // TODO add your handling code here:
        paneladdserie.setBackground(new Color(255, 255, 255));
        paneladdpelicula.setBackground(new Color(148, 13, 30));
        addserielabel.setForeground(new Color(0, 0, 0));
        jPanelSeries.setVisible(false);
        jPanelPeliculas.setVisible(true);
    }//GEN-LAST:event_addpeliculalabelMouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        ImageIcon portadaPelicula = cargarFoto();
        ImageIcon imgRedimensionada = new ImageIcon(portadaPelicula.getImage().getScaledInstance(jLabelportadapelicula.getWidth(), jLabelportadapelicula.getHeight(), 1));
        jLabelportadapelicula.setIcon(imgRedimensionada);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        ImageIcon portadaSerie = cargarFoto();
        ImageIcon imgRedimensionada = new ImageIcon(portadaSerie.getImage().getScaledInstance(jLabelportadaserie.getWidth(), jLabelportadaserie.getHeight(), 1));
        jLabelportadaserie.setIcon(imgRedimensionada);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        addCapitulo nuevatemporada = new addCapitulo(this);
        this.setEnabled(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void crearpeliculaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crearpeliculaMouseClicked
        // TODO add your handling code here:
        String imagenfinalpath = guardarFoto();
        try {
            Pelicula nuevapelicula = new Pelicula(fieldDuracion.getText(), fieldDirector.getText(), fieldTitulo.getText(),
                    fieldSinopsis.getText(), fieldGeneroP.getText(), Integer.parseInt(fieldAnnoP.getText()),
                    parseActores(fieldActoresP.getText()), imagenfinalpath);
            UtilJavaflix.addPelicula(nuevapelicula);
            UtilJavaflix.guardarDatos();
            JOptionPane.showMessageDialog(this, "Pelicula creada correctamente\nPortada guardada en ./portadas");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, "Error al crear la pelicula");
        }

    }//GEN-LAST:event_crearpeliculaMouseClicked

    private void crearserieMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crearserieMouseClicked
        // TODO add your handling code here:
        String imagenfinalpath = guardarFoto();
        try {
            Serie nuevaserie = new Serie(temporadas, fieldNombreS.getText(), fieldSinopsisS.getText(), fieldGeneroS.getText(), Integer.parseInt(fieldAnnoS.getText()),
                    parseActores(fieldActoresS.getText()), imagenfinalpath);
            UtilJavaflix.addSerie(nuevaserie);
            UtilJavaflix.guardarDatos();
            JOptionPane.showMessageDialog(this, "Serie creada correctamente\nPortada guardada en ./portadas");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, "Error al crear la serie");
        }

    }//GEN-LAST:event_crearserieMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addpeliculalabel;
    private javax.swing.JLabel addserielabel;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel crearpelicula;
    private javax.swing.JLabel crearserie;
    private javax.swing.JTextField fieldActoresP;
    private javax.swing.JTextField fieldActoresS;
    private javax.swing.JTextField fieldAnnoP;
    private javax.swing.JTextField fieldAnnoS;
    private javax.swing.JTextField fieldDirector;
    private javax.swing.JFormattedTextField fieldDuracion;
    private javax.swing.JTextField fieldGeneroP;
    private javax.swing.JTextField fieldGeneroS;
    private javax.swing.JTextField fieldNombreS;
    private javax.swing.JTextArea fieldSinopsis;
    private javax.swing.JTextArea fieldSinopsisS;
    private javax.swing.JTextField fieldTitulo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelAtrasRegistro;
    private javax.swing.JLabel jLabelCerrarRegistro;
    private javax.swing.JLabel jLabelFondoRegistro;
    private javax.swing.JLabel jLabelJAVAFLIXRegistro;
    private javax.swing.JLabel jLabelJAVAFLIXSombraRegistro;
    private javax.swing.JLabel jLabelportadapelicula;
    private javax.swing.JLabel jLabelportadaserie;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel jPanelAtrasRegistro;
    private javax.swing.JPanel jPanelCerrarRegistro;
    private javax.swing.JPanel jPanelOpcionesRegistro;
    private javax.swing.JPanel jPanelPeliculas;
    private javax.swing.JPanel jPanelRegistro;
    private javax.swing.JPanel jPanelSeries;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel paneladdpelicula;
    private javax.swing.JPanel paneladdserie;
    // End of variables declaration//GEN-END:variables
}
