package com.raquel.menulistas.beans;

import java.io.Serializable;

/**
 * Created by ALUMNOS on 03/03/2017.
 */

public class CamisaBean implements Serializable{
    private int foto;
    private String descripcion;
    private double precio;
    private int cantidad;

    public CamisaBean(int cantidad, String descripcion, int foto, double precio) {
        this.cantidad = cantidad;
        this.descripcion = descripcion;
        this.foto = foto;
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
