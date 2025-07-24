package org.asap.ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int dia, mes, anio, suma, nroSuerte;

        System.out.println("Ingrese el día de su nacimiento");
        dia = input.nextInt();

        System.out.println("Ingrese el mes de su nacimiento");
        mes = input.nextInt();

        System.out.println("Ingrese el año de su nacimiento");
        anio = input.nextInt();

        suma = dia + mes + anio;
        nroSuerte = calcularNroSuerte(suma);

        System.out.println("Su número de la suerte es " + nroSuerte);

        input.close();

    }

    private static int calcularNroSuerte(int suma) {
        int nroSuerte = 0;

        while (suma > 0) {
            nroSuerte += suma % 10;
            suma /= 10;
        }
        return nroSuerte;

    }
}
