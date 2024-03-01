package EjerciciosBucles;

import java.util.Scanner;

public class Ejercicio27 {
    Scanner a;
    public void array1(){
        int[] numeros = new int[10];

        System.out.println("Ingrese 10 números:");

        for (int i = 0; i < 10; i++) {
            numeros[i] = a.nextInt();
        }

        System.out.println("Los números en orden inverso son:");

        for (int i = 9; i >= 0; i--) {
            System.out.println(numeros[i]);
        }
    }
    public static void main(String[] args){
        Ejercicio27 n = new Ejercicio27();
        n.array1();
    }
}
