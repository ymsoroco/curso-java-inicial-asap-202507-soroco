package org.asap.clase2;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int numLimite, num1 = 0, num2 = 1;

        System.out.println("Ingrese un número entero");
        numLimite = input.nextInt();

        for (int i = 0; i < numLimite; i++) {
            System.out.print(num1 + " ");
            int suma = num1 + num2;
            num1 = num2;
            num2 = suma;


        }


    }
}
