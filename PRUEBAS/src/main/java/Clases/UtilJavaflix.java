package Clases;

import Excepciones.CriterioNoValido;
import Excepciones.EmailNoEncontrado;
import Excepciones.EmailNoValido;
import Excepciones.PasswordIncorrecta;
import java.util.*;
import java.io.*;
import java.lang.reflect.Field;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Heras
 */
public class UtilJavaflix {

    //Array para guardar todas las series,peliculas y usuarios registrados.
    private static ArrayList<Serie> series = new ArrayList<Serie>();
    private static ArrayList<Pelicula> peliculas = new ArrayList<Pelicula>();
    private static ArrayList<Cliente> clientes = new ArrayList<Cliente>();
    private static final Administrador admin = new Administrador("admin@javaflix.com", "admin");

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

    public static void addCliente(Cliente cliente) {
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
                System.out.println("Error de Input/Output al crear archivo:" + e.getMessage());
            }
            if (!series.isEmpty() || !peliculas.isEmpty() || !clientes.isEmpty()) {
                try ( FileOutputStream ostreampro = new FileOutputStream(datosjavaflix);  ObjectOutputStream oospro = new ObjectOutputStream(ostreampro)) {
                    oospro.writeObject(series);
                    oospro.writeObject(peliculas);
                    oospro.writeObject(clientes);
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

    public static void validarEmail(String email) throws EmailNoValido {
        int atposition = 0, dotposition = 0, flag = 0, atcount = 0;
        for (int i = 0; i < email.length(); i++) {

            if (email.charAt(i) == '@') {
                atcount++;
                atposition = i;
                if (atcount >= 2) {
                    flag = 1;
                    break;
                }
            }
            if (email.charAt(i) == '.') {
                dotposition = i;
            }
        }
        if (atposition < 1 || dotposition < atposition + 2 || dotposition + 2 >= email.length() || flag == 1) {
            throw new EmailNoValido("Error en el formato del e-mail");
        }
    }

    public static boolean checkAdminlogin(String email_provided, String pass_provided) {
        return (email_provided.equals(UtilJavaflix.admin.getCorreoelectronico()) && pass_provided.equals(UtilJavaflix.admin.getClave()));
    }

    public static Cliente iniciarSesion(String email_provided, String pass_provided) throws EmailNoEncontrado, PasswordIncorrecta {
        for (Cliente cliente_actual : clientes) {
            if (cliente_actual.getCorreoelectronico().equals(email_provided)) {
                if (!cliente_actual.getClave().equals(pass_provided)) {
                    throw new PasswordIncorrecta("La contraseña no es correcta");
                } else {
                    return cliente_actual;
                }
            }
        }
        throw new EmailNoEncontrado("El email especificado no esta registrado");
    }

    public static ArrayList<Cliente> busquedaClientes(ArrayList<Cliente> clientes, String valorbuscado, String criterio) throws CriterioNoValido {
        if ("".equals(valorbuscado)) {
            return clientes;
        }
        ArrayList<Cliente> clientesbuscado = new ArrayList<>();
        String valoractual = null;
        for (Cliente cliente : clientes) {
            switch (criterio) {
                case "DNI":
                    valoractual = cliente.getDni();
                    break;
                case "Nombre":
                    valoractual = cliente.getNombre();
                    break;
                case "Correo electronico":
                    valoractual = cliente.getCorreoelectronico();
                    break;
                case "Clave":
                    valoractual = cliente.getClave();
                    break;
                default:
                    throw new CriterioNoValido("El criterio especificado no se puede encontrar");
            }
            if (valoractual.contains(valorbuscado)) {
                clientesbuscado.add(cliente);
            }
        }
        return clientesbuscado;
    }

    public static void cerrarPrograma() {
        UtilJavaflix.guardarDatos();
        System.exit(0);
    }
}
