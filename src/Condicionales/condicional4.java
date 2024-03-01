package taller;

import java.util.Scanner;

public class condicional4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Este programa muestra si una letra es mayuscula o miniscula");

        System.out.print("Ingresa una letra: ");
        String letra = teclado.nextLine();

        if (letra.length() == 1 && Character.isUpperCase(letra.charAt(0))) {
            System.out.println("La letra ingresada es una mayúscula.");
        } else {
            System.out.println("La letra ingresada es una minuscula.");
        }
    }
}

