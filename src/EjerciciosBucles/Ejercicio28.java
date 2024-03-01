package EjerciciosBucles;

import java.util.Scanner;

public class Ejercicio28 {
    Scanner a;
    public void array2(){
        int[] numeros = new int[10];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        System.out.println("Ingrese 10 números:");

        for (int i = 0; i < 10; i++) {
            numeros[i] = a.nextInt();
            if (numeros[i] > max) {
                max = numeros[i];
            }
            if (numeros[i] < min) {
                min = numeros[i];
            }
        }

        System.out.println("Los números introducidos junto con máximo y mínimo son:");

        for (int i = 0; i < 10; i++) {
            System.out.print(numeros[i]);
            if (numeros[i] == max) {
                System.out.print(" máximo");
            }
            if (numeros[i] == min) {
                System.out.print(" mínimo");
            }
            System.out.println();
        }
    }
}
