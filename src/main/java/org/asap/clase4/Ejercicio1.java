package org.asap.clase4;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese un número");
        int numero = input.nextInt();

        if (esPrimo(numero)) {
            System.out.println(numero + " es primo.");
        } else {
            System.out.println(numero + " no es primo.");
        }
    }

    private static boolean esPrimo(int numero) {
        boolean resultado;

        if (numero <= 1) {
            resultado = false;
        } else {
            int i = 2;
            boolean tieneDivisor = false;

            while (i < numero && !tieneDivisor) {
                if (numero % i == 0) {
                    tieneDivisor = true;
                }
                i++;
            }
            resultado = !tieneDivisor;
        }
        return resultado;
    }
}