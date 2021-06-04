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
    private ArrayList<Capitulo> capitulos = new ArrayList<Capitulo>();

    public Serie(int temporadas, ArrayList<Capitulo> capitulos, String titulo, String sinopsis, String genero, int anno, ArrayList<String> actores) {
        super(titulo, sinopsis, genero, anno, actores);
        this.temporadas = temporadas;
        this.capitulos = capitulos;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public ArrayList<Capitulo> getCapitulos() {
        return capitulos;
    }

    public void setCapitulos(ArrayList<Capitulo> capitulos) {
        this.capitulos = capitulos;
    }

    @Override
    public String toString() {
        return "Serie{" + "temporadas=" + temporadas + ", capitulos=" + capitulos + '}';
    }
    

    
}
