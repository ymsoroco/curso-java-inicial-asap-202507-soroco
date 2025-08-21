package org.asap.clase8;

import java.util.ArrayList;
import java.util.List;

public class SitioWeb {
    private List<CarritoDeCompra> carritos;

    public SitioWeb() {
        this.carritos = new ArrayList<>();
    }

    public void agregarCarritoVendido(CarritoDeCompra c) {
        this.carritos.add(c);
    }

    public void mostrarPreciosDeCarritosVendidos() {
        int i = 0;
        while (i < carritos.size()) {
            CarritoDeCompra c = carritos.get(i);
            System.out.printf("\tCarrito %s: $%.1f\n", c.getId(), c.calcularPrecio());
            i++;
        }
    }

    public String idDelCarritoMasCaro() {
        String idMax = null;
        double precioMax = -1.0;
        int i = 0;

        while (i < carritos.size()) {
            CarritoDeCompra c = carritos.get(i);
            double precio = c.calcularPrecio();
            if (precio > precioMax) {
                precioMax = precio;
                idMax = c.getId();
            }
            i++;
        }
        return idMax;
    }

    public double nroCuotasPromedio() {
        double sumaCuotas = 0.0;
        int cantConTC = 0;
        int i = 0;

        while (i < carritos.size()) {
            CarritoDeCompra c = carritos.get(i);
            if (c.getMedioDePago() instanceof TarjetaDeCredito) {
                TarjetaDeCredito tc = (TarjetaDeCredito) c.getMedioDePago();
                sumaCuotas += tc.getCuotas();
                cantConTC++;
            }
            i++;
        }

        double promedio = 0.0;
        if (cantConTC > 0) {
            promedio = sumaCuotas / cantConTC;
        }
        return promedio;
    }
}