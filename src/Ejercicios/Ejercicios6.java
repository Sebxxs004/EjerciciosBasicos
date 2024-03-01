package Ejercicios;

import java.util.Scanner;
public class Ejercicios6 {
    Scanner i;
    int num1, num2, num3, suma;
    int sueldo, nVentas, venta, comision;
    public void sumar(){
        i = new Scanner(System.in);
        System.out.println("Número 1");
        num1 = i.nextInt();
        System.out.println("Número 2");
        num2 = i.nextInt();
        System.out.println("Número 3");
        num3 = i.nextInt();
        suma = num1+num2+num3;
        System.out.println("La suma de los 3 números es: " + suma);
    }
}
