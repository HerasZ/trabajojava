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

    public static ArrayList<Contenido> masReciente(ArrayList<Contenido> Contenido) {
        Contenido temp; // temporal para intercambio
        boolean estaOrdenado; // indica si esta ordenada
        for (int i = 0; i < Contenido.size() - 1; i++) {
            estaOrdenado = true;
            for (int j = 0; j < Contenido.size() - i - 1; j++) {
                if (Contenido.get(j).getAnno() > Contenido.get(j + 1).getAnno()) {
                    // Estan DESORDENADOS, intercambiar
                    temp = Contenido.get(j);
                    Contenido.set(j, Contenido.get(j + 1));
                    Contenido.set(j + 1, temp);
                    estaOrdenado = false;
                }
            }
            if (estaOrdenado) {
                // no encontramos nada para intercambiar.
                break; // hemos terminado
            }
        }
        for (int i = 0; i < Contenido.size() - 1; i++) {
            estaOrdenado = true;
            for (int j = 0; j < Contenido.size() - i - 1; j++) {
                if (Contenido.get(j).getCalificacionMedia() > Contenido.get(j + 1).getCalificacionMedia()
                        && Contenido.get(j).getAnno() == Contenido.get(j + 1).getAnno()) {
                    temp = Contenido.get(j);
                    Contenido.set(j, Contenido.get(j + 1));
                    Contenido.set(j + 1, temp);
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

    

    public static ArrayList<Contenido> buscaractor(String actor, ArrayList<Contenido> Contenido) {
        ArrayList<Contenido> listaactor = new ArrayList<Contenido>();
        for (int i = 0; i < Contenido.size(); i++) {
            for (int j = 0; j < Contenido.get(i).getActores().size(); j++) {
                if (Contenido.get(i).getActores().get(j).toLowerCase() == actor.toLowerCase()) {
                    listaactor.add(Contenido.get(j));
                }
            }
        }
        return listaactor;
    }

    public static ArrayList<Contenido> buscaranno(int anno, ArrayList<Contenido> Contenido) {
        ArrayList<Contenido> listaanno = new ArrayList<Contenido>();
        for (int i = 0; i < Contenido.size(); i++) {
            if (Contenido.get(i).getAnno() == anno) {
                listaanno.add(Contenido.get(i));
            }
        }
        return listaanno;
    }

    public static ArrayList<Contenido> buscargenero(String genero, ArrayList<Contenido> Contenido) {
        ArrayList<Contenido> listagenero = new ArrayList<Contenido>();
        for (int i = 0; i < Contenido.size(); i++) {
            if (Contenido.get(i).getGenero().toLowerCase() == genero.toLowerCase()) {
                listagenero.add(Contenido.get(i));
            }
        }
        return listagenero;
    }

}
