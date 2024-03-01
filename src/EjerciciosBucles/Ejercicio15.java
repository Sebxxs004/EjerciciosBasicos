package Bucles;

import java.util.Scanner;
public class Ejercicio15 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Ingrese un número entre 1 y 12: ");
            int numeroMes = scanner.nextInt();

            if (numeroMes >= 1 && numeroMes <= 12) {

                int diasMes;
                switch (numeroMes) {
                    case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                        diasMes = 31;
                        break;
                    case 4: case 6: case 9: case 11:
                        diasMes = 30;
                        break;
                    case 2:
                        diasMes = 28;
                        break;
                    default:
                        diasMes = -1;
                        break;
                }

                System.out.println("El mes " + numeroMes + " tiene " + diasMes + " días.");
            } else {

                System.out.println("ERROR: Número fuera de rango. Debe ser entre 1 y 12.");
            }
        }
    }
