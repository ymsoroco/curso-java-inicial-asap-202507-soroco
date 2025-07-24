package org.asap.ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;

        System.out.println("Ingrese un número entero");
        num = input.nextInt();

        if (num % 2 == 0 && num % 3 == 0) {
            System.out.println("El número es divisible por 2 y por 3");
        } else if (num % 2 == 0) {
            System.out.println("El número es divisible por 2");
        } else if (num % 3 == 0) {
            System.out.println("El número es divisible por 3");
        } else {
            System.out.println("El número no es divisible ni por 2 ni por 3");
        }

        input.close();


    }

}
