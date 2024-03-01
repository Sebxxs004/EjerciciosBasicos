package Bucles;

import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);

        System.out.println("Introduce la cantidad de números a introducir:");
        int cantidadNumeros = a.nextInt();

        int mayoresQueCero = 0;
        int menoresQueCero = 0;
        int igualesACero = 0;

        for (int i = 0; i < cantidadNumeros; i++) {
            System.out.println("Introduce el número " + (i + 1) + ":");
            int numero = a.nextInt();

            if (numero > 0) {
                mayoresQueCero++;
            } else if (numero < 0) {
                menoresQueCero++;
            } else {
                igualesACero++;
            }
        }

        System.out.println("Cantidad de números mayores que 0: " + mayoresQueCero);
        System.out.println("Cantidad de números menores que 0: " + menoresQueCero);
        System.out.println("Cantidad de números iguales a 0: " + igualesACero);
    }
}
