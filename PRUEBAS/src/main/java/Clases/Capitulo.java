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

    public Capitulo(String titulo, String duracion) {
        this.titulo = titulo;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuración(String duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "Capitulo{" + "titulo=" + titulo + ", duracion=" + duracion + '}';
    }
    
}
