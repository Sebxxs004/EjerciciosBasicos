package taller;

import java.util.Scanner;

public class condicional2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Este programa muestra si un numero es par o impar");

        System.out.println("Digite un numero");
        int num = teclado.nextInt();

        if (num %2 == 0){
            System.out.println("El numero es par");
        }else{
            System.out.println("El numero es impar");
        }
    }
}
