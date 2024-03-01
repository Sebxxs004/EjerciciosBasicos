package taller;

import java.util.Scanner;

public class condicional1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Este programa compara dos numeros");

        System.out.println("Digite el primer numero: ");
        int num1 = teclado.nextInt();

        System.out.println("Digite el segundo numero: ");
        int num2 = teclado.nextInt();

        if (num1 < num2){
            System.out.println("El primer numero "+num1+" es menor que el segundo numero "+num2);
        }else if (num1 > num2){
            System.out.println("El primer numero "+num1+" es mayor que el segundo numero "+num2);
        }else{
            System.out.println("Los numero son iguales");
        }
    }
}