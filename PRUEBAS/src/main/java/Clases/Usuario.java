/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.io.Serializable;

/**
 *
 * @author Heras
 */
public abstract class Usuario implements Serializable {

    private String clave;
    private String correoelectronico;

    public Usuario(String clave, String correoelectronico) {
        this.clave = clave;
        this.correoelectronico = correoelectronico;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getCorreoelectronico() {
        return correoelectronico;
    }

    public void setCorreoelectronico(String correoelectronico) {
        this.correoelectronico = correoelectronico;
    }

    @Override
    public String toString() {
        return "Usuario{" + "clave=" + clave + ", correoelectronico=" + correoelectronico + '}';
    }

}
