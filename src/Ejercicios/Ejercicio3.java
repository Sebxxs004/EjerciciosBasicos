package Basicos;

import java.util.Scanner;
public class Ejercicio3 {
    public static void main (String[]args){
        Scanner scanner = new
        Scanner(System.in);

        System.out.println(" INGRESE LA LONGITUD DEL PRIMER CATETO");
              float cateto1 =
              scanner.nextFloat();

        System.out.println(" INGRESE LA LONGITUD DEL SEGUNDO CATETO");
        float cateto2 =
        scanner.nextFloat();

        float hipotenusa =
                (float) Math.sqrt(cateto1 * cateto1 + cateto2 * cateto2);
        System.out.println(" LA HIPOTENUSA DEL TRIANGULO RECTANGULO ES:" + hipotenusa);

    }

}
