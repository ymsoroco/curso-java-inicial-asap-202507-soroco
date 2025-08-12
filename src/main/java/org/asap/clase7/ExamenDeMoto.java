package org.asap.clase7;

import java.util.ArrayList;
import java.util.List;

public class ExamenDeMoto extends Examen {

    private static final int LIMITE_CILINDRADA = 150;
    private static final int LIMITE_SEGUNDOS = 120;

    private Moto moto;
    private List<Circuito> circuitos;

    public ExamenDeMoto(String fecha, Persona persona, Moto moto) {
        super(fecha, persona);
        this.moto = moto;
        this.circuitos = new ArrayList<>();
    }

    public void agregarCircuito(Circuito circuito) {
        this.circuitos.add(circuito);
    }

    @Override
    public boolean aprobo() {
        boolean aprueba;

        if (this.moto.getCilindrada() > LIMITE_CILINDRADA) {
            aprueba = cantCircuitosAprobados() == this.circuitos.size();

        } else {
            aprueba = apruebaMotoMenorCC();
        }
        return aprueba;
    }

    private boolean apruebaMotoMenorCC() {
        return cantCircuitosAprobados() >= circuitos.size() - 1 && cumpleTiempoTotal();
    }

    private int cantCircuitosAprobados() {
        int aprobados = 0;
        int i = 0;
        while (i < circuitos.size()) {
            if (circuitos.get(i).aprobo()) {
                aprobados++;
            }
            i++;
        }
        return aprobados;
    }

    private boolean cumpleTiempoTotal() {
        int i = 0;
        int tiempoTotal = 0;
        while (i < circuitos.size() && tiempoTotal <= LIMITE_SEGUNDOS) {
            tiempoTotal += circuitos.get(i).getTiempoSegundos();
            i++;
        }
        return tiempoTotal <= LIMITE_SEGUNDOS;
    }
}

