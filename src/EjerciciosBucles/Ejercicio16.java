package Bucles;

import java.util.Scanner;
public class Ejercicio16 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Ingrese el peso del paquete en kilogramos: ");
            double pesoPaquete = scanner.nextDouble();

            if (pesoPaquete <= 5) {

                System.out.println("Seleccione la zona de destino:");
                System.out.println("1. América del Norte");
                System.out.println("2. América Central");
                System.out.println("3. América del Sur");
                System.out.println("4. Europa");
                System.out.println("5. Asia");
                System.out.print("Ingrese el número correspondiente a la zona de destino: ");
                int zonaDestino = scanner.nextInt();

                double costoPorKilogramo = 0;
                switch (zonaDestino) {
                    case 1:
                        costoPorKilogramo = 24.00;
                        break;
                    case 2:
                        costoPorKilogramo = 20.00;
                        break;
                    case 3:
                        costoPorKilogramo = 21.00;
                        break;
                    case 4:
                        costoPorKilogramo = 10.00;
                        break;
                    case 5:
                        costoPorKilogramo = 18.00;
                        break;
                    default:
                        System.out.println("Zona de destino inválida.");
                        return;
                }

                double costoEnvio = pesoPaquete * costoPorKilogramo;
                System.out.println("El costo total del envío es: " + costoEnvio + " euros.");
            } else {

                System.out.println("El paquete excede el peso máximo permitido. No puede ser transportado.");
            }

        }
    }
