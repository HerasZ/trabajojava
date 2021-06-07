/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 *
 * @author Daniel
 */
public class Pelicula extends Contenido implements Serializable {
    
    private String duracion;
    private String director;

    public Pelicula(String duracion, String director, String titulo, String sinopsis, String genero, int anno, ArrayList<String> actores,String portada) {
        super(titulo, sinopsis, genero, anno, actores,portada);
        this.duracion = duracion;
        this.director = director;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "duracion=" + duracion + ", director=" + director + '}';
    }
    
  
    
    
}
