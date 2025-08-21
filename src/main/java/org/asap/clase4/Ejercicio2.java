package org.asap.clase4;

import java.util.Random;

public class Ejercicio2 {

    public static void main(String[] args) {
        int[] numeros = new int[8];
        generarNumerosAleatorios(numeros);

        System.out.println("Array original:");
        mostrarArray(numeros);

        ordenarBurbuja(numeros);

        System.out.println("\nArray ordenado:");
        mostrarArray(numeros);
    }

    private static void generarNumerosAleatorios(int[] arr) {
        Random random = new Random();
        int i = 0;
        while (i < arr.length) {
            arr[i] = random.nextInt(10) + 1;
            i++;
        }
    }

    private static void ordenarBurbuja(int[] arr) {
        int n = arr.length;
        boolean huboIntercambio = true;
        while (huboIntercambio) {
            huboIntercambio = false;
            int i = 0;
            while (i < n - 1) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    huboIntercambio = true;
                }
                i++;
            }
            n--;
        }
    }

    private static void mostrarArray(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            System.out.print(arr[i] + " ");
            i++;
        }
        System.out.println();
    }
}
