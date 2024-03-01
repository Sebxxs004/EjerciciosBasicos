package taller;

import java.util.Scanner;

public class condicional9 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Este programa muestra si un año es bisiesto");

        System.out.print("Ingrese un año: ");
        int anio = teclado.nextInt();

        boolean bisiesto = (anio % 100 == 0 && anio % 400 != 0) || (anio % 4 != 0);

        if (bisiesto) {
            System.out.println(anio + " es un año bisiesto.");
        } else {
            System.out.println(anio + " no es un año bisiesto.");
        }
    }
}
