package EjerciciosBucles;

import java.util.Scanner;

public class Ejercicio26 {
    Scanner a;
    public void piramide(){
        System.out.print("Ingrese un número para la pirámide: ");
        int n = a.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int k = i - 1; k >= 1; k--) {
                System.out.print(k);
            }
            System.out.println();
        }
    }
}
