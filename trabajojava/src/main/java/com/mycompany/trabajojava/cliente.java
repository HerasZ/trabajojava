package com.mycompany.trabajojava;

public class cliente {
        //atributos
    private String dni;
    private String nombre;
    private String correoelectronico;
    private String clave;
    private tarjetaCredito tarjetacredito;
    //constructor
    public cliente(String dni, String nombre, String correoelectronico, String clave, tarjetaCredito tarjetacredito) {
        this.dni = dni;
        this.nombre = nombre;
        this.correoelectronico = correoelectronico;
        this.clave = clave;
        this.tarjetacredito = tarjetacredito;
    }
    //getter
    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCorreoelectronico() {
        return correoelectronico;
    }

    public String getClave() {
        return clave;
    }

    public tarjetaCredito getTarjetacredito() {
        return tarjetacredito;
    }
    //setter
    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCorreoelectronico(String correoelectronico) {
        this.correoelectronico = correoelectronico;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public void setTarjetacredito(tarjetaCredito tarjetacredito) {
        this.tarjetacredito = tarjetacredito;
    }

    @Override
    public String toString() {
        return "Cliente{" + "dni=" + dni + ", nombre=" + nombre + ", correoelectronico=" + correoelectronico + ", clave=" + clave + ", tarjetacredito=" + tarjetacredito + '}';
    }
    
    
    
}
