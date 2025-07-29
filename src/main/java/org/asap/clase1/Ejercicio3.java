package org.asap.clase1;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nota;

        System.out.println("Ingrese su calificación como número entero entre 0 y 10");
        nota = input.nextInt();

        if (nota < 0 || nota > 10) {
            System.out.println("El número debe estar entre 0 y 10");

        } else if (nota < 5) {
            System.out.println("Insuficiente");

        } else if (nota < 6) {
            System.out.println("Suficiente");

        } else if (nota < 7) {
            System.out.println("Bien");

        } else if (nota < 9) {
            System.out.println("Notable");

        } else {
            System.out.println("Sobresaliente");

        }

        input.close();

    }

}
