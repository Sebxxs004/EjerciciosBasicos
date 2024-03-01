package EjerciciosBucles;

import java.util.Scanner;

public class Ejercicio29 {
    Scanner a;
    public void array3(){
        int[][] array = new int[4][5];

        System.out.println("Introduce 20 números enteros:");

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                array[i][j] = a.nextInt();
            }
        }

        for (int i = 0; i < 4; i++) {
            int sumaFila = 0;
            for (int j = 0; j < 5; j++) {
                sumaFila += array[i][j];
                System.out.print(array[i][j] + "\t");
            }
            System.out.println("Suma fila " + (i+1) + ": " + sumaFila);
        }

        for (int j = 0; j < 5; j++) {
            int sumaColumna = 0;
            for (int i = 0; i < 4; i++) {
                sumaColumna += array[i][j];
            }
            System.out.print("Suma col " + (j+1) + ": " + sumaColumna + "\t");
        }

        int sumaTotal = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                sumaTotal += array[i][j];
            }
        }
        System.out.println("\nSuma total: " + sumaTotal);
    }
}
