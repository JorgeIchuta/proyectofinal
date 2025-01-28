/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaz;

import Interfaz.Lote;

/**
 *
 * @author rapto
 */
abstract class Producto {
    protected String nombre;
    protected double precio;

    public Producto(String nombre,double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public abstract String getMarca();
    public abstract String getSistemaOperativo();
    public abstract String getMaterial();
    
    public abstract void mostrar();
    public abstract void agregarLote(Lote lote);
    public abstract Lote[] getLotes();
    
    public abstract String getTalla();
    public abstract String getColor();
    public abstract String getTipo();
    
}
