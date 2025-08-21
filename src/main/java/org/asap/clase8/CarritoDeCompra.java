package org.asap.clase8;

import java.util.List;

public class CarritoDeCompra {
    private String id;
    private List<Item> items;
    private MedioDePago medioDePago;
    private Fecha fechaCompra;


    public CarritoDeCompra(String id, List<Item> items, MedioDePago medioDePago, Fecha fecha) {
        this.id = id;
        this.items = items;
        this.medioDePago = medioDePago;
        this.fechaCompra = fecha;
    }

    public String getId() {
        return id;
    }

    public Fecha getFechaCompra(){
        return this.fechaCompra;
    }

    public MedioDePago getMedioDePago() {
        return medioDePago;
    }

    public double calcularPrecio() {
        double base = 0;
        int i = 0;
        while (i < items.size()) {
            base += items.get(i).calcularSubtotal();
            i++;
        }
        return this.medioDePago.ajustar(base, this);
    }
}