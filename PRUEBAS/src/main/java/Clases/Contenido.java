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
public abstract class Contenido {
    private String titulo;
    private String sinopsis;
    private String genero;
    private int anno;
    private ArrayList<String> actores;
    //private IMAGEN?? portada;

    public Contenido(String titulo, String sinopsis, String genero, int anno, ArrayList<String> actores) {
        this.titulo = titulo;
        this.sinopsis = sinopsis;
        this.genero = genero;
        this.anno = anno;
        this.actores = actores;
    }
    
}
