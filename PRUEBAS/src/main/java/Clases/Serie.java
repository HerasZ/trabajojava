/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Daniel
 */
public class Serie extends Contenido implements Serializable {
    
    private ArrayList<Temporada> temporada;

    public Serie(ArrayList<Temporada> temporada, String titulo, String sinopsis, String genero, int anno, ArrayList<String> actores,String portada) {
        super(titulo, sinopsis, genero, anno, actores,portada);
        this.temporada = temporada;
    }

    public ArrayList<Temporada> getTemporada() {
        return temporada;
    }

    public void setTemporada(ArrayList<Temporada> temporada) {
        this.temporada = temporada;
    }

    }
    

    

