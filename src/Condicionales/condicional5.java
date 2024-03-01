package taller;

import java.util.Scanner;

public class condicional5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Este programa calcula la potencia de un numero");

        System.out.print("Ingrese el número base: ");
        double base = teclado.nextDouble();

        System.out.print("Ingrese el exponente: ");
        int exponente = teclado.nextInt();

        double resultado;

        if (exponente > 0) {
            resultado = Math.pow(base, exponente);
        } else if (exponente == 0) {
            resultado = 1;
        } else {
            resultado = 1 / Math.pow(base, -exponente);
        }

        System.out.println("El resultado es: " + resultado);
    }
}