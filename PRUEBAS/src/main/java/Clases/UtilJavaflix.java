package Clases;

import java.io.*;
import java.util.ArrayList;

/**
 *
 * @author Heras
 */
public class UtilJavaflix {

    //Array para guardar todas las series,peliculas y usuarios registrados.
    private static ArrayList<Serie> series = new ArrayList<Serie>();
    private static ArrayList<Pelicula> peliculas = new ArrayList<Pelicula>();
    private static ArrayList<Usuario> usuarios = new ArrayList<Usuario>();

    public static void setSeries(ArrayList<Serie> series) {
        UtilJavaflix.series = series;
    }

    public static void setPeliculas(ArrayList<Pelicula> peliculas) {
        UtilJavaflix.peliculas = peliculas;
    }

    public static void setUsuarios(ArrayList<Usuario> usuarios) {
        UtilJavaflix.usuarios = usuarios;
    }

    public static void addSerie(Serie serie) {
        UtilJavaflix.series.add(serie);
    }

    public static void addPelicula(Pelicula pelicula) {
        UtilJavaflix.peliculas.add(pelicula);
    }

    public static void addUsuario(Usuario usuario) {
        UtilJavaflix.usuarios.add(usuario);
    }

    public static void guardarDatos() {
        try {
            if (!series.isEmpty() || !peliculas.isEmpty() || !usuarios.isEmpty()) {
                try ( FileOutputStream ostreampro = new FileOutputStream("datosjavaflix.dat");  ObjectOutputStream oospro = new ObjectOutputStream(ostreampro)) {
                    oospro.writeObject(series);
                    oospro.writeObject(peliculas);
                    oospro.writeObject(usuarios);
                }
            } else {
                System.out.println("Error: No hay datos para guardar");
            }

        } catch (IOException ioe) {
            System.out.println("Error de Input/Output: " + ioe.getMessage());
        } finally {

        }
    }

    public static void cargarDatos() {
        try {
            try ( FileInputStream istreampro = new FileInputStream("datosjavaflix.dat");  ObjectInputStream oispro = new ObjectInputStream(istreampro)) {
                series = (ArrayList) oispro.readObject();
                peliculas = (ArrayList) oispro.readObject();
                usuarios = (ArrayList) oispro.readObject();
            }
        } catch (IOException ioe) {
            System.out.println("Error de Input/Output: " + ioe.getMessage());
        } catch (ClassNotFoundException cnfe) {
            System.out.println("Error de clase no encontrada: " + cnfe.getMessage());
        }
    }
}
