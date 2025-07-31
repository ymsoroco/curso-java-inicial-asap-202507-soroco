package org.asap.clase3;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numeros = new int[5];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            numeros[i] = input.nextInt();
        }

        boolean esCapicua = true;
        int i = 0;
        while (i < numeros.length / 2 && esCapicua) {
            if (numeros[i] != numeros[numeros.length - 1 - i]) {
                esCapicua = false;
            }
            i++;
        }

        if (esCapicua) {
            System.out.println("El array es capicúa");
        } else {
            System.out.println("El array no es capicúa");
        }
    }
}
