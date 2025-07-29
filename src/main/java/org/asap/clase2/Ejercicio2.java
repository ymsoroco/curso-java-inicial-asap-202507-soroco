package org.asap.clase2;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2;

        System.out.println("Ingrese el primer número");
        num1 = input.nextInt();

        System.out.println("Ingrese el segundo número");
        num2 = input.nextInt();

        if (sumaDivisores(num1) == num2 && sumaDivisores(num2) == num1) {
            System.out.println("Los números son amigos");

        } else {
            System.out.println("Los números no son amigos");
        }
    }

    private static int sumaDivisores(int num) {
        int suma = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                suma += i;
            }
        }
        return suma;
    }
}
