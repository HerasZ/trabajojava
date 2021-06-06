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
 * @author Heras
 */
public class Temporada implements Serializable {
    
    private ArrayList<Capitulo> capitulos = new ArrayList<Capitulo>();

    public Temporada(ArrayList<Capitulo> capitulos) {
        this.capitulos = capitulos;
    }

    public ArrayList<Capitulo> getCapitulos() {
        return capitulos;
    }

    public void setCapitulos(ArrayList<Capitulo> capitulos) {
        this.capitulos = capitulos;
    }

    
    
}
