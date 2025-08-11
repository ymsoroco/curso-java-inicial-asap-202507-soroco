package org.asap.clase6;

public class EmpleadoSalarioFijo extends Empleado {
    private double sueldoBasico;

    public EmpleadoSalarioFijo(String dni, String nombre, String apellido, int anioIngreso, double sueldoBasico) {
        super(dni, nombre, apellido, anioIngreso);
        this.sueldoBasico = sueldoBasico;
    }

    @Override
    public double calcularSalario() {
        int aniosTrabajados = 2025 - getAnioIngreso();
        double porcentajeAdicional = 0;

        if (aniosTrabajados >= 2 && aniosTrabajados <= 5) {
            porcentajeAdicional = 0.05;
        } else if (aniosTrabajados >= 6 && aniosTrabajados <= 10) {
            porcentajeAdicional = 0.10;
        } else if (aniosTrabajados > 10) {
            porcentajeAdicional = 0.15;
        }

        return sueldoBasico * (1 + porcentajeAdicional);
    }
}
