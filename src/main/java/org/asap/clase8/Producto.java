package org.asap.clase8;

public class Producto {
    private String id;
    private double precio;

    public Producto(String id, double precio) {
        this.id = id;
        this.precio = precio;
    }

    public double getPrecio() {
        return this.precio;
    }
}
