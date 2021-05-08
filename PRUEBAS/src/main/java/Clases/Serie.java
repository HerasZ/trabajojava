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
public class Serie extends Contenido {
    private int temporadas;
    private Capitulo capitulos;

    public Serie(int temporadas, Capitulo capitulos, String titulo, String sinopsis, String genero, int anno, ArrayList<String> actores) {
        super(titulo, sinopsis, genero, anno, actores);
        this.temporadas = temporadas;
        this.capitulos = capitulos;
    }
    

    
}
