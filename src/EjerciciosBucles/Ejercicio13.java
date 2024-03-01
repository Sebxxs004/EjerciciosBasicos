package Bucles;

import java.util.Scanner;
public class Ejercicio13{
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Ingrese el resultado obtenido al lanzar el dado (1-6): ");
            int resultadoDado = scanner.nextInt();

            if (resultadoDado >= 1 && resultadoDado <= 6) {

                int caraOpuesta;
                switch (resultadoDado) {
                    case 1:
                        caraOpuesta = 6;
                        break;
                    case 2:
                        caraOpuesta = 5;
                        break;
                    case 3:
                        caraOpuesta = 4;
                        break;
                    case 4:
                        caraOpuesta = 3;
                        break;
                    case 5:
                        caraOpuesta = 2;
                        break;
                    default:
                        caraOpuesta = 1;
                        break;
                }

                System.out.println("La cara opuesta al resultado obtenido es: " + caraOpuesta);
            } else {
                System.out.println("ERROR: número incorrecto. El número debe estar entre 1 y 6.");
        }
    }
}
