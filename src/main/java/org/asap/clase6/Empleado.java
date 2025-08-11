package org.asap.clase6;

abstract class Empleado {
    private String dni;
    private String nombre;
    private String apellido;
    private int anioIngreso;

    public Empleado(String dni, String nombre, String apellido, int anioIngreso) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.anioIngreso = anioIngreso;
    }

    public String getNombreCompleto() {
        return nombre + " " + apellido;
    }

    public int getAnioIngreso() {
        return anioIngreso;
    }

    public abstract double calcularSalario();

    public void mostrarSalario() {
        System.out.println(getNombreCompleto() + ": $" + calcularSalario());
    }
}
