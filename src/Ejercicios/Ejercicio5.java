package Basicos;

import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[]args){
        Scanner scanner = new
        Scanner(System.in);

        System.out.println(" INGRESE LA TEMERATURA EN GRADOS FAHRENHEIT:");
        float fahrenheit =
        scanner.nextFloat();

        float celsius = (fahrenheit - 32) * 5 / 9;

        System.out.println("LA TEMPERATURA EN GRADOS CELSIUS ES:" + celsius);
        
    }
}
