/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.ArrayList;

/**
 *
 * @author Francisco
 */
public class OrdenarContenido {
    public static ArrayList<Contenido> masReciente(ArrayList<Contenido> Contenido){
    Contenido temp; // temporal para intercambio
    boolean estaOrdenado; // indica si esta ordenada
    for (int i = 0; i < Contenido.size()-1; i++) {
        estaOrdenado = true;
        for (int j = 0; j < Contenido.size()-i-1; j++) {
            System.out.println("se compara "+Contenido.get(j).getAnno()+" y "+Contenido.get(j+1).getAnno());
            System.out.println("se compara"+Contenido.get(j)+" y "+Contenido.get(j+1));
            if (Contenido.get(j).getAnno() > Contenido.get(j+1).getAnno()) {
            // Estan DESORDENADOS, intercambiar
                temp = Contenido.get(j);
                Contenido.set(j,Contenido.get(j+1));
                Contenido.set(j+1,temp);
                estaOrdenado = false;
            }
        }
        if (estaOrdenado) {
        // no encontramos nada para intercambiar.
        break; // hemos terminado
        }
    }
    return Contenido;

    }
    
}
