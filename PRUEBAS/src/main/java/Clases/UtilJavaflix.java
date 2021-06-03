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
    private static ArrayList<Cliente> clientes = new ArrayList<Cliente>();

    public static void setSeries(ArrayList<Serie> series) {
        UtilJavaflix.series = series;
    }

    public static void setPeliculas(ArrayList<Pelicula> peliculas) {
        UtilJavaflix.peliculas = peliculas;
    }

    public static void setClientes(ArrayList<Cliente> clientes) {
        UtilJavaflix.clientes = clientes;
    }

    public static void addSerie(Serie serie) {
        UtilJavaflix.series.add(serie);
    }

    public static void addPelicula(Pelicula pelicula) {
        UtilJavaflix.peliculas.add(pelicula);
    }

    public static ArrayList<Serie> getSeries() {
        return series;
    }

    public static ArrayList<Pelicula> getPeliculas() {
        return peliculas;
    }

    public static ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public static void addUsuario(Cliente cliente) {
        UtilJavaflix.clientes.add(cliente);
    }

    public static void guardarDatos() {
        try {
            File datosjavaflix = new File("datosjavaflix.dat");
            try {
                if (datosjavaflix.length() == 0) {
                    datosjavaflix.createNewFile();
                }
            } catch (IOException e) {
                System.out.println("Error de Input/Output al crear archivo:"+ e.getMessage());
            }
            if (!series.isEmpty() || !peliculas.isEmpty() || !clientes.isEmpty()) {
                try ( FileOutputStream ostreampro = new FileOutputStream(datosjavaflix);  ObjectOutputStream oospro = new ObjectOutputStream(ostreampro)) {
                    oospro.writeObject(series);
                    oospro.writeObject(peliculas);
                    oospro.writeObject(clientes);
                    System.out.println(clientes);
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
                clientes = (ArrayList) oispro.readObject();
            }
        } catch (IOException ioe) {
            System.out.println("Error de Input/Output: " + ioe.getMessage());
        } catch (ClassNotFoundException cnfe) {
            System.out.println("Error de clase no encontrada: " + cnfe.getMessage());
        }
    }
}
