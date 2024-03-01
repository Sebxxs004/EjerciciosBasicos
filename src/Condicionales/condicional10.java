package taller;

import java.util.Scanner;

public class condicional10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Este programa calcula la utilizadad para un productor de uva");

        System.out.print("Ingrese el tipo de uva (A o B): ");
        char tipoUva = teclado.next().charAt(0);

        System.out.print("Ingrese el tamaño de uva (1 o 2): ");
        int tamanoUva = teclado.nextInt();

        System.out.print("Ingrese el precio inicial por kilo: ");
        double precioInicial = teclado.nextDouble();

        double precioFinal = precioInicial;

        if (tipoUva == 'A' || tipoUva == 'a') {
            if (tamanoUva == 1) {
                precioFinal += 0.20;
            } else if (tamanoUva == 2) {
                precioFinal += 0.30;
            }
        } else if (tipoUva == 'B' || tipoUva == 'b') {
            if (tamanoUva == 1) {
                precioFinal -= 0.30;
            } else if (tamanoUva == 2) {
                precioFinal -= 0.50;
            }
        }

        System.out.println("El precio final por kilo de uva es: " + precioFinal + " euros.");
    }
}
