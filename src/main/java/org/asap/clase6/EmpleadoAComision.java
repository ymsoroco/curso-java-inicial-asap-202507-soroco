package org.asap.clase6;

public class EmpleadoAComision extends Empleado {
    private static final double SALARIO_MINIMO = 20000;
    private int clientesCaptados;
    private double montoPorCliente;

    public EmpleadoAComision(String dni, String nombre, String apellido, int anioIngreso,
                             int clientesCaptados, double montoPorCliente) {
        super(dni, nombre, apellido, anioIngreso);
        this.clientesCaptados = clientesCaptados;
        this.montoPorCliente = montoPorCliente;
    }

    public int getClientesCaptados() {
        return clientesCaptados;
    }

    @Override
    public double calcularSalario() {
        double salario = clientesCaptados * montoPorCliente;
        return salario < SALARIO_MINIMO ? SALARIO_MINIMO : salario;
    }
}
