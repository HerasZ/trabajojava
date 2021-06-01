package Clases;

public class Cliente extends Usuario {

    //atributos
    private String dni;
    private String nombre;
    private TarjetaCredito tarjetacredito;

    //constructor
    public Cliente(String dni, String nombre, String correoelectronico, String clave, TarjetaCredito tarjetacredito) {
        super(clave, correoelectronico);
        this.dni = dni;
        this.nombre = nombre;
        this.tarjetacredito = tarjetacredito;
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

    @Override
    public String toString() {
        return "Cliente{" + "dni=" + dni + ", nombre=" + nombre + ", tarjetacredito=" + tarjetacredito + '}';
    }

}
