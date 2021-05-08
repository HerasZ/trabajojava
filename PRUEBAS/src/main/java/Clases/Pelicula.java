/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.ArrayList;

/**
 *
 * @author Daniel
 */
public class Pelicula extends Contenido {
    
    private int duracion;
    private String director;

    public Pelicula(int duracion, String director, String titulo, String sinopsis, String genero, int anno, ArrayList<String> actores) {
        super(titulo, sinopsis, genero, anno, actores);
        this.duracion = duracion;
        this.director = director;
    }
    
  
    
    
}
