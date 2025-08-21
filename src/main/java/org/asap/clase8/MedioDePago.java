package org.asap.clase8;

public abstract class MedioDePago {
    private Fecha fechaPago;

    protected MedioDePago(Fecha fechaPago) {
        this.fechaPago = fechaPago;
    }

    public Fecha getFechaPago() {
        return fechaPago;
    }

    public abstract double ajustar(double precioBase, CarritoDeCompra carrito);
}


