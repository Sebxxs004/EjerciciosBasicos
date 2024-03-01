package EjerciciosBucles;

import java.util.Random;

public class Ejercicio30 {
    public void array4(){
        int[][] array = new int[4][5];
        Random rand = new Random();

        System.out.println("Números generados aleatoriamente:");

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                array[i][j] = rand.nextInt(900) + 100; // Genera números aleatorios entre 100 y 999
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }

        for (int i = 0; i < 4; i++) {
            int sumaFila = 0;
            for (int j = 0; j < 5; j++) {
                sumaFila += array[i][j];
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
    public static void main(String[] args){
        Ejercicio30 n = new Ejercicio30();
        n.array4();
    }
}
