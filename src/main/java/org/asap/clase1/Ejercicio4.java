package org.asap.clase1;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int anio;

        System.out.println("Ingrese un año sin puntos ni espacios");
        anio = input.nextInt();

        if (anio % 4 == 0 && anio % 100 != 0 || anio % 400 == 0) {
            System.out.println("El año es bisiesto");
        } else {
            System.out.println("El año no es bisiesto");
        }


    }
}
