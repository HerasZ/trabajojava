package Clases;

import java.time.LocalDate;

public class TarjetaCredito {
    //atributos
    private String numero;
    private LocalDate caducidad;
    private double saldo;

    public TarjetaCredito(String numero, LocalDate caducidad, double saldo) {
        this.numero = numero;
        this.caducidad = caducidad;
        this.saldo = saldo;
    }

    public String getNumero() {
        return numero;
    }

    public LocalDate getCaducidad() {
        return caducidad;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setCaducidad(LocalDate caducidad) {
        this.caducidad = caducidad;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "TarjetaCredito{" + "numero=" + numero + ", caducidad=" + caducidad + ", saldo=" + saldo + '}';
    }

    
    
   
    
}
