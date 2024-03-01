package Basicos;

import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[]args){
        Scanner scanner = new
      Scanner(System.in);

        System.out.println("ESCRIBA EL PRIMER NUMERO:");
        double numero1 =
        scanner.nextDouble();

        System.out.println("ESCRIBA EL SEGUNDO NUMERO");
        double numero2 =
        scanner.nextDouble();

        double suma = numero1 + numero2;
        double resta = numero1 - numero2;
        double division = numero1 / numero2;
        double multiplicacion = numero1 * numero2;

        System.out.println(" la suma de los numeres es:" + suma);
        System.out.println("la resta de los numeros es:" + resta);
        System.out.println("la division de los numeros es:" + division);
        System.out.println("la multiplicacion de los numeros es:" + multiplicacion);

    }

}
