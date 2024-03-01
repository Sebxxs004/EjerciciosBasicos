package Bucles;

import java.util.Scanner;
import java.util.Random;
public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        Random r = new Random();
        int numeroAdivinar = r.nextInt(100) + 1; // Genera un número aleatorio entre 1 y 100
        int intentos = 10;

        System.out.println("¡Bienvenido al juego de adivinar el número!");

        while (intentos > 0) {
            System.out.println("Introduce un número (te quedan " + intentos + " intentos):");
            int numeroIntroducido = a.nextInt();
            intentos--;

            if (numeroIntroducido == numeroAdivinar) {
                System.out.println("¡Felicidades! Has adivinado el número en " + (10 - intentos) + " intentos.");
                return;
            } else if (numeroIntroducido < numeroAdivinar) {
                System.out.println("El número a adivinar es mayor que " + numeroIntroducido);
            } else {
                System.out.println("El número a adivinar es menor que " + numeroIntroducido);
            }
        }

        System.out.println("¡Has agotado tus intentos! El número a adivinar era: " + numeroAdivinar);
    }
}
