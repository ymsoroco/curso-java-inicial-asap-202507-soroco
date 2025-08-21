package org.asap.clase7;

import java.util.ArrayList;
import java.util.List;

public class SedeDeLicencias {

    private final List<Examen> examenes;

    public SedeDeLicencias() {
        this.examenes = new ArrayList<>();
    }

    public void agregarExamen(Examen examen) {
        this.examenes.add(examen);
    }

    private double porcentajeDeReprobados() {
        int total = this.examenes.size();
        int reprobados = 0;

        for (Examen examen : this.examenes) {
            if (!examen.aprobo()) {
                reprobados++;
            }
        }

        return total > 0 ? (reprobados * 100.0) / total : 0.0;
    }

    private double promTiempoAutosAprobados() {
        double sumaTiempo = 0.0;
        int cantidad = 0;

        for (Examen examen : this.examenes) {
            if (examen instanceof ExamenDeAuto) {
                ExamenDeAuto examenAuto = (ExamenDeAuto) examen;
                if (examenAuto.aprobo()) {
                    sumaTiempo += examenAuto.getTiempoCircuito();
                    cantidad++;
                }
            }
        }
        return cantidad > 0 ? sumaTiempo / cantidad : 0.0;
    }

    public Informe obtenerInforme() {
        double porc = this.porcentajeDeReprobados();
        double prom = this.promTiempoAutosAprobados();
        return new Informe(porc, prom);
    }
}