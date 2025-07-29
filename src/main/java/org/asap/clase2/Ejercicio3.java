package org.asap.clase2;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero, suma = 0;

        System.out.println("Ingrese un número entero positivo");
        numero = input.nextInt();

        while (numero > 0) {
            int numAux = 0;

            numAux = numero % 10;
            numero = numero / 10;

            suma += numAux;


        }

        System.out.println("La suma de las cifras de ese número es: " + suma);


    }
}
