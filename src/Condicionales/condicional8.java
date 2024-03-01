package taller;

import java.util.Scanner;

public class condicional8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Este programa clasifica un triangulo");

        System.out.println("Ingrese la longitud del lado 1:");
        double lado1 = teclado.nextDouble();

        System.out.println("Ingrese la longitud del lado 2:");
        double lado2 = teclado.nextDouble();

        System.out.println("Ingrese la longitud del lado 3:");
        double lado3 = teclado.nextDouble();

        if ((lado1 + lado2 > lado3) && (lado1 + lado3 > lado2) && (lado2 + lado3 > lado1)) {
            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("El triángulo es equilátero.");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("El triángulo es isósceles.");
            } else if ((Math.pow(lado1, 2) + Math.pow(lado2, 2) == Math.pow(lado3, 2))
                    || (Math.pow(lado1, 2) + Math.pow(lado3, 2) == Math.pow(lado2, 2))
                    || (Math.pow(lado2, 2) + Math.pow(lado3, 2) == Math.pow(lado1, 2))) {
                System.out.println("El triángulo es rectángulo.");
            } else {
                System.out.println("El triángulo es escaleno.");
            }
        } else {
            System.out.println("Los lados proporcionados no forman un triángulo válido.");
        }
    }
}
