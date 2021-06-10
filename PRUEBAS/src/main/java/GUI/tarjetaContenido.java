/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Clases.Contenido;
import Clases.Pelicula;
import Clases.Serie;

/**
 *
 * @author Heras
 */
public class tarjetaContenido extends javax.swing.JPanel {
    
    private Contenido contenidoheredado;

    /**
     * Creates new form tarjetaContenido
     */
    public tarjetaContenido(Contenido contenidoheredado) {
        this.contenidoheredado = contenidoheredado;
        initComponents();
        labeltitulo.setText(contenidoheredado.getTitulo());
        labelanno.setText(String.valueOf(contenidoheredado.getAnno()));
        labelgenero.setText(contenidoheredado.getGenero());
        labelnota.setText(String.valueOf(contenidoheredado.getCalificacionMedia()));
        if (contenidoheredado instanceof Serie) {
            labeltempdur.setText(((Serie) contenidoheredado).getTemporada().size() + " temporadas");
        } else if (contenidoheredado instanceof Pelicula) {
            labeltempdur.setText(((Pelicula) contenidoheredado).getDuracion());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labeltitulo = new javax.swing.JLabel();
        labelanno = new javax.swing.JLabel();
        labelnota = new javax.swing.JLabel();
        labeltempdur = new javax.swing.JLabel();
        labelgenero = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setMaximumSize(new java.awt.Dimension(968, 100));
        setMinimumSize(new java.awt.Dimension(968, 100));
        setPreferredSize(new java.awt.Dimension(968, 100));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labeltitulo.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        labeltitulo.setText("Titulo");
        add(labeltitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 270, 60));

        labelanno.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        labelanno.setText("Año");
        add(labelanno, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, -1, -1));

        labelnota.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        labelnota.setText("Nota Media");
        add(labelnota, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, -1, -1));

        labeltempdur.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        labeltempdur.setText("Temporadas / Duracion");
        add(labeltempdur, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 60, 140, -1));

        labelgenero.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        labelgenero.setText("Genero");
        add(labelgenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 30, 140, -1));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel labelanno;
    private javax.swing.JLabel labelgenero;
    private javax.swing.JLabel labelnota;
    private javax.swing.JLabel labeltempdur;
    private javax.swing.JLabel labeltitulo;
    // End of variables declaration//GEN-END:variables
}
