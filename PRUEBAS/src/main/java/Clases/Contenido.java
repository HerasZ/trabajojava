/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.swing.ImageIcon;

/**
 *
 * @author Daniel
 */
public abstract class Contenido implements Serializable {

    private String titulo;
    private String sinopsis;
    private String genero;
    private int anno;
    private ArrayList<String> actores;
    private HashMap<Cliente, Integer> calificacion = new HashMap<Cliente, Integer>();
    private ImageIcon portada;

    public Contenido(String titulo, String sinopsis, String genero, int anno, ArrayList<String> actores, ImageIcon portada) {
        this.titulo = titulo;
        this.sinopsis = sinopsis;
        this.genero = genero;
        this.anno = anno;
        this.actores = actores;
        this.portada = portada;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getAnno() {
        return anno;
    }

    public void setAnno(int anno) {
        this.anno = anno;
    }

    public ArrayList<String> getActores() {
        return actores;
    }

    public void setActores(ArrayList<String> actores) {
        this.actores = actores;
    }

    public HashMap<Cliente, Integer> getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(HashMap<Cliente, Integer> calificacion) {
        this.calificacion = calificacion;
    }
    
    public void addCalificacion(HashMap<Cliente, Integer> calificacion, Cliente cliente, int rate){
        calificacion.put(cliente, rate);
    }

    public ImageIcon getPortada() {
        return portada;
    }

    public void setPortada(ImageIcon portada) {
        this.portada = portada;
    }
    
    public double getCalificacionMedia() {
        int sum = 0;
        int divisor = 0;
        for (Integer key : calificacion.values()) {
            sum += key;
            divisor++;
        }
        try {
            return (sum/divisor);
        } catch (ArithmeticException e) {
            return 0;
        }
        
    }

    @Override
    public String toString() {
        return "Contenido{" + "titulo=" + titulo + ", sinopsis=" + sinopsis + ", genero=" + genero + ", anno=" + anno + ", actores=" + actores + '}';
    }

}
