package taller;

import java.util.Scanner;

public class condicional6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Este programa examina la aceptacion de una solicitud");

        System.out.print("Ingrese la nota: ");
        int nota = teclado.nextInt();

        System.out.print("Ingrese la edad: ");
        int edad = teclado.nextInt();

        System.out.print("Ingrese el sexo (M/F): ");
        char sexo = teclado.next().charAt(0);

        if (nota >= 5 && edad >= 18) {
            if (sexo == 'M'|| sexo == 'm') {
                System.out.println("POSIBLE");
            } else if (sexo == 'F' || sexo == 'f') {
                System.out.println("ACEPTADA");
            } else {
                System.out.println("NO ACEPTADA");
            }
        } else {
            System.out.println("NO ACEPTADA");
        }
    }
}
