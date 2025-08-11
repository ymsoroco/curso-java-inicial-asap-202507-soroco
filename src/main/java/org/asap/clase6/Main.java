package org.asap.clase6;

public class Main {
    public static void main(String[] args) {
        Empresa empresa = new Empresa();

        empresa.agregarEmpleado(new EmpleadoSalarioFijo("12345678", "Ana", "Perez", 2022, 50000));
        empresa.agregarEmpleado(new EmpleadoSalarioFijo("23456789", "Luis", "Gomez", 2015, 60000));

        empresa.agregarEmpleado(new EmpleadoAComision("34567890", "Carla", "Lopez", 2020, 15, 1200));
        empresa.agregarEmpleado(new EmpleadoAComision("45678901", "Jorge", "Ramirez", 2018, 25, 900));
        empresa.agregarEmpleado(new EmpleadoAComision("56789012", "Marta", "Diaz", 2023, 10, 2500));

        empresa.mostrarSalarios();

        EmpleadoAComision mejorEmpleado = empresa.empleadoConMasClientes();
        if (mejorEmpleado != null) {
            System.out.println("Empleado con más clientes: " + mejorEmpleado.getNombreCompleto() +
                    " con " + mejorEmpleado.getClientesCaptados() + " clientes.");
        } else {
            System.out.println("No hay empleados a comisión.");
        }
    }
}
