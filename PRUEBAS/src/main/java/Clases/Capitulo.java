/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.io.Serializable;

/**
 *
 * @author Daniel
 */
public class Capitulo implements Serializable{
    
    private String titulo;
    private String duracion;
    
    /**
     * Constructor
     * @param String titulo
     * @param String duracion
     **/
    public Capitulo(String titulo, String duracion) {
        this.titulo = titulo;
        this.duracion = duracion;
    }
    
    /**
     * Devuelve el titulo del capitulo
     *
     * @return String titulo
     */
    public String getTitulo() {
        return titulo;
    }
    
    /**
     * Establece el titulo del capitulo
     *
     * @param String titulo nuevo
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    /**
     * Devuelve la duracion del capitulo
     *
     * @return String duracion
     */
    public String getDuracion() {
        return duracion;
    }
    
    /**
     * Establece la duracion del capitulo
     *
     * @param String duracion nueva
     */
    public void setDuración(String duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return  titulo + " (Duracion: " + duracion +')';
    }
    
}
