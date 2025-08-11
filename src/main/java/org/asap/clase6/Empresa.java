package org.asap.clase6;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private List<Empleado> empleados;

    public Empresa() {
        empleados = new ArrayList<>();
    }

    public void agregarEmpleado(Empleado e) {
        empleados.add(e);
    }

    public void mostrarSalarios() {
        for (Empleado e : empleados) {
            e.mostrarSalario();
        }
    }

    public EmpleadoAComision empleadoConMasClientes() {
        EmpleadoAComision maxEmpleado = null;
        int maxClientes = -1;

        for (Empleado e : empleados) {
            if (e instanceof EmpleadoAComision) {
                EmpleadoAComision ec = (EmpleadoAComision) e;
                if (ec.getClientesCaptados() > maxClientes) {
                    maxClientes = ec.getClientesCaptados();
                    maxEmpleado = ec;
                }
            }
        }
        return maxEmpleado;
    }
}