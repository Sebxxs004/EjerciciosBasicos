package Basicos;

import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[]args){
        Scanner scanner = new
       Scanner(System.in);

        System.out.println("ESCRIBA LA BASE DEL RECTANGULO:");
        double base =
        scanner.nextDouble();

        System.out.println("ESCRIBA LA ALTURA DEL RECTANGULO");
        double altura =
        scanner.nextDouble();

        double perimetro = 2 * (base + altura);
        double area = base * altura;

        System.out.println("EL PERIMETRO DEL RECTANGULO ES:" + perimetro);
        System.out.println("EL AREA DEL RECTANGULO ES:" + area);




    }
}
