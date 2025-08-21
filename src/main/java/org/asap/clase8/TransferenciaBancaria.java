package org.asap.clase8;

public class TransferenciaBancaria extends MedioDePago {

    private static final double RECARGO = 0.05;
    private static final int DIAS_LIMITE = 10;
    private String cbu;

    public TransferenciaBancaria(Fecha fechaPago, String cbu){
        super(fechaPago);
        this.cbu = cbu;
    }

    @Override
    public double ajustar(double precioBase, CarritoDeCompra carrito){
        double recargo = this.calcularRecargo(carrito);
        return precioBase * (1 + recargo);
    }

    private double calcularRecargo(CarritoDeCompra carrito){
        double recargo = RECARGO;
        int dias = Fecha.diasTranscurridosEntreFechas(carrito.getFechaCompra(), getFechaPago());
        if (dias > DIAS_LIMITE) {
            recargo += RECARGO;
        }
        return recargo;
    }
}
