package org.asap.clase3;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int cantPersonas;

        do {
            System.out.print("Ingrese cuántas personas se van a analizar (entero positivo): ");
            cantPersonas = input.nextInt();
        } while (cantPersonas <= 0);

        int[] alturas = new int[cantPersonas];

        for (int i = 0; i < alturas.length; i++) {
            System.out.print("Ingrese la altura en cm de la persona " + (i + 1) + ": ");
            alturas[i] = input.nextInt();
        }

        double promedio = calcularPromedio(alturas);
        int superiores = 0;
        int inferiores = 0;

        for (int altura : alturas) {
            if (altura > promedio) {
                superiores++;
            } else if (altura < promedio) {
                inferiores++;
            }
        }

        System.out.println("Altura promedio: " + promedio + " cm");
        System.out.println("Cantidad de personas con altura superior a la media: " + superiores);
        System.out.println("Cantidad de personas con altura inferior a la media: " + inferiores);
    }

    private static double calcularPromedio(int[] alturas) {
        double suma = 0;
        for (int altura : alturas) {
            suma += altura;
        }
        return suma / alturas.length;
    }
}
