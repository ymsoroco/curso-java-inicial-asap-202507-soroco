package org.asap.clase8;

public class Efectivo extends MedioDePago {
    private static final double NO_ES_CONSUMIDOR_FINAL = 0.10;
    private static final double ES_CONSUMIDOR_FINAL = 0.15;

    private boolean esConsumidorFinal;

    public Efectivo(Fecha fechaPago, boolean esConsumidorFinal) {
        super(fechaPago);
        this.esConsumidorFinal = esConsumidorFinal;
    }

    @Override
    public double ajustar(double precioBase, CarritoDeCompra carrito) {
        double descuento = this.esConsumidorFinal ? ES_CONSUMIDOR_FINAL : NO_ES_CONSUMIDOR_FINAL;
        return precioBase * (1 - descuento);
    }
}
