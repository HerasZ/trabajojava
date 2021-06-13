package Clases;

import java.util.ArrayList;

public class Cliente extends Usuario {

    //atributos
    private String dni;
    private String nombre;
    private TarjetaCredito tarjetacredito;
    private PlanSuscripcion plan;
    private ArrayList<Contenido> favoritos = new ArrayList<Contenido>();

    /**
     * Constructor
     * @param dni
     * @param nombre
     * @param tarjetacredito
     * @param plan
     * @param clave
     * @param correoelectronico
     **/   
    public Cliente(String dni, String nombre, TarjetaCredito tarjetacredito, PlanSuscripcion plan, String clave, String correoelectronico) {
        super(clave, correoelectronico);
        this.dni = dni;
        this.nombre = nombre;
        this.tarjetacredito = tarjetacredito;
        this.plan = plan;
    }
    
    /**
     * Devuelve el tipo de plan del cliente
     *
     * @return PlanSuscripcion tipo de plan
     */
    public PlanSuscripcion getPlan() {
        return plan;
    }
    
    /**
     * Establece el tipo de plan del cliente
     *
     * @param plan nuevo
     */
    public void setPlan(PlanSuscripcion plan) {
        this.plan = plan;
    }

    /**
     * Devuelve el dni del cliente
     *
     * @return String dni
     */
    public String getDni() {
        return dni;
    }
    
    /**
     * Devuelve el nombre del cliente
     *
     * @return String nombre
     */
    public String getNombre() {
        return nombre;
    }
    
    /**
     * Devuelve la tarjeta de credito del cliente
     *
     * @return TarjetaCredito tarjeta de credito
     */
    public TarjetaCredito getTarjetacredito() {
        return tarjetacredito;
    }

    /**
    * Establece el dni del cliente
    *
    * @param dni nuevo
    */
    public void setDni(String dni) {
        this.dni = dni;
    }
    
    /**
    * Establece el nombre del cliente
    *
    * @param nombre nuevo
    */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /**
    * Establece la tarjeta de credito del cliente
    *
    * @param tarjetacredito tarjeta de credito nueva
    */
    public void setTarjetacredito(TarjetaCredito tarjetacredito) {
        this.tarjetacredito = tarjetacredito;
    }
    
    /**
     * Devuelve la lista con los contenidos favoritos del cliente
     *
     * @return ArrayList de contenidos
     */
    public ArrayList<Contenido> getFavoritos() {
        return favoritos;
    }
    
    /**
    * Establece la lista de contenidos favoritos del cliente
    *
    * @param favoritos lista a establecer
    */
    public void setFavoritos(ArrayList<Contenido> favoritos) {
        this.favoritos = favoritos;
    }
    
    /**
    * Añade el contenido a la lista de favoritos del cliente
    *
    * @param contenido a añadir
    */
    public void addFavoritos(Contenido contenido) {
        favoritos.add(contenido);
    }
    
    /**
    * Elimina el contenido de la lista de favoritos del cliente
    *
    * @param contenido a eliminar
    */    
    public void removeFavoritos(Contenido contenido){
        favoritos.remove(contenido);
    }
    
    @Override
    public String toString() {
        return "Cliente{" + "dni=" + dni + ", nombre=" + nombre + ", tarjetacredito=" + tarjetacredito + '}';
    }

}
