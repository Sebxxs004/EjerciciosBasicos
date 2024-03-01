package taller;

import java.util.Scanner;

public class condicional7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Este programa clasifica dos circunferencias");

        System.out.println("Ingrese las coordenadas del centro de la primera circunferencia (x1 y1):");
        double x1 = teclado.nextDouble();
        double y1 = teclado.nextDouble();

        System.out.println("Ingrese el radio de la primera circunferencia (r1):");
        double r1 = teclado.nextDouble();

        System.out.println("Ingrese las coordenadas del centro de la segunda circunferencia (x2 y2):");
        double x2 = teclado.nextDouble();
        double y2 = teclado.nextDouble();

        System.out.println("Ingrese el radio de la segunda circunferencia (r2):");
        double r2 = teclado.nextDouble();

        double distanciaCentros = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        if (distanciaCentros > r1 + r2) {
            System.out.println("Las circunferencias son exteriores.");
        } else if (distanciaCentros == r1 + r2) {
            System.out.println("Las circunferencias son tangentes exteriores.");
        } else if (distanciaCentros < Math.abs(r1 - r2)) {
            System.out.println("Las circunferencias son interiores.");
        } else if (distanciaCentros == Math.abs(r1 - r2)) {
            System.out.println("Las circunferencias son tangentes interiores.");
        } else {
            System.out.println("Las circunferencias son secantes.");
        }
    }
}
