package org.asap.clase3;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numeros = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            numeros[i] = input.nextInt();
        }

        int maximo = numeros[0];
        int minimo = numeros[0];

        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maximo) {
                maximo = numeros[i];
            }
            if (numeros[i] < minimo) {
                minimo = numeros[i];
            }
        }

        System.out.println("Máximo valor: " + maximo);
        System.out.print("Posiciones del máximo valor: ");
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == maximo) {
                System.out.print(i + " ");
            }
        }

        System.out.println("\nMínimo valor: " + minimo);
        System.out.print("Posiciones del mínimo valor: ");
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == minimo) {
                System.out.print(i + " ");
            }
        }
    }
}
