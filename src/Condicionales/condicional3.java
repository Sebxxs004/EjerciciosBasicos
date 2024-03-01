package taller;

import java.util.Scanner;

public class condicional3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Este programa divide dos numeros");

        System.out.println("Digite el primer numero: ");
        float num1 = teclado.nextFloat();

        System.out.println("Digite el segundo numero: ");
        float num2 = teclado.nextFloat();

        if (num2 == 0){
            System.out.println("Error, no se puede dividir por 0");
        }else{
            float num3 = num1/num2;
            System.out.println("El resultado de la division es; "+num3);
        }
    }
}
