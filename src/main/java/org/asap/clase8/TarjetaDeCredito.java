package org.asap.clase8;

public class TarjetaDeCredito extends MedioDePago {
    private final static double AUMENTO_POR_CUOTAS = 0.15;
    private int cuotas;

    public TarjetaDeCredito(Fecha fechaPago, int cuotas) {
        super(fechaPago);
        this.cuotas = cuotas;
    }

    public int getCuotas() {
        return this.cuotas;
    }

    @Override
    public double ajustar(double precioBase, CarritoDeCompra carrito) {
        double recargo = this.calcularRecargoPorCuotas();
        return precioBase * (1 + recargo);
    }

    private double calcularRecargoPorCuotas() {
        return AUMENTO_POR_CUOTAS * this.cuotas;
    }
}
