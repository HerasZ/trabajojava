package Clases;

import java.util.ArrayList;

public class Cliente extends Usuario {

    //atributos
    private String dni;
    private String nombre;
    private TarjetaCredito tarjetacredito;
    private PlanSuscripcion plan;
    private ArrayList<Contenido> favoritos = new ArrayList<Contenido>();

    //constructor

    public Cliente(String dni, String nombre, TarjetaCredito tarjetacredito, PlanSuscripcion plan, String clave, String correoelectronico) {
        super(clave, correoelectronico);
        this.dni = dni;
        this.nombre = nombre;
        this.tarjetacredito = tarjetacredito;
        this.plan = plan;
    }
    

    public PlanSuscripcion getPlan() {
        return plan;
    }

    public void setPlan(PlanSuscripcion plan) {
        this.plan = plan;
    }

    //getter
    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public TarjetaCredito getTarjetacredito() {
        return tarjetacredito;
    }

    //setter
    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTarjetacredito(TarjetaCredito tarjetacredito) {
        this.tarjetacredito = tarjetacredito;
    }

    public ArrayList<Contenido> getFavoritos() {
        return favoritos;
    }

    public void setFavoritos(ArrayList<Contenido> favoritos) {
        this.favoritos = favoritos;
    }
    
    public void addFavoritos(Contenido contenido) {
        favoritos.add(contenido);
    }
    
    @Override
    public String toString() {
        return "Cliente{" + "dni=" + dni + ", nombre=" + nombre + ", tarjetacredito=" + tarjetacredito + '}';
    }

}
