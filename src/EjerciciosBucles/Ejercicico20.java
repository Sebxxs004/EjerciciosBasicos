package Bucles;

import java.util.Scanner;

public class Ejercicico20 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);

        System.out.println("Introduce el primer número:");
        int numero1 = a.nextInt();

        System.out.println("Introduce el segundo número:");
        int numero2 = a.nextInt();

        System.out.println("Números pares entre " + numero1 + " y " + numero2 + ":");

        for (int i = numero1; i <= numero2; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
