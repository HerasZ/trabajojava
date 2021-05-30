
package Clases;

import java.util.ArrayList;

/**
 *
 * @author Heras
 */
public class UtilContenido {
    //Array para guardar todas las series y peliculas en la aplicacion
    private static ArrayList<Serie> series = new ArrayList<Serie>();
    private static ArrayList<Pelicula> peliculas = new ArrayList<Pelicula>();

    public static void setSeries(ArrayList<Serie> series) {
        UtilContenido.series = series;
    }

    public static void setPeliculas(ArrayList<Pelicula> peliculas) {
        UtilContenido.peliculas = peliculas;
    }
    
    
}
