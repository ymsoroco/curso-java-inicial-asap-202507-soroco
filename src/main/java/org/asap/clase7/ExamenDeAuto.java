package org.asap.clase7;

public class ExamenDeAuto extends Examen {

    private static final int LIMITE_SEGUNDOS = 90;
    private final Circuito circuito;
    private final Auto auto;

    public ExamenDeAuto(String fecha, Persona persona, Circuito circuito, Auto auto) {
        super(fecha, persona);
        this.circuito = circuito;
        this.auto = auto;
    }

    @Override
    public boolean aprobo() {
        return this.circuito.aprobo() && this.circuito.getTiempoSegundos() <= LIMITE_SEGUNDOS;
    }

    public int getTiempoCircuito() {
        return this.circuito.getTiempoSegundos();
    }

}
