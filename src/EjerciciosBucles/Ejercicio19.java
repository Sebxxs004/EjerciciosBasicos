package Bucles;

import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);

        while (true) {
            System.out.println("Introduce un caracter (o un espacio para terminar):");
            char caracter = a.next().charAt(0);

            if (caracter == ' ') {
                break;
            } else if (esVocal(caracter)) {
                System.out.println("VOCAL");
            } else {
                System.out.println("NO VOCAL");
            }
        }
    }

    public static boolean esVocal(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';

    }
}
