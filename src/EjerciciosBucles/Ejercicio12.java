package Bucles;

import java.util.Scanner;
public class Ejercicio12 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Ingrese la duración de la llamada en minutos: ");
            int duracionLlamada = scanner.nextInt();

            System.out.print("Ingrese el día de la semana (1 para domingo, 2 para lunes, ..., 7 para sábado): ");
            int diaSemana = scanner.nextInt();

            System.out.print("Ingrese el turno del día (1 para mañana, 2 para tarde): ");
            int turnoDia = scanner.nextInt();

            double costoLlamada = 0;
            if (duracionLlamada <= 5) {
                costoLlamada = 1;
            } else if (duracionLlamada <= 8) {
                costoLlamada = 1 + 0.8 * (duracionLlamada - 5);
            } else if (duracionLlamada <= 10) {
                costoLlamada = 1 + 0.8 * 3 + 0.7 * (duracionLlamada - 8);
            } else {
                costoLlamada = 1 + 0.8 * 3 + 0.7 * 2 + 0.5 * (duracionLlamada - 10);
            }

            double impuesto = 0;
            if (diaSemana == 1) {
                impuesto = costoLlamada * 0.03;
            } else {
                if (turnoDia == 1) {
                    impuesto = costoLlamada * 0.15;
                } else {
                    impuesto = costoLlamada * 0.10;
                }
            }
            double costoTotal = costoLlamada + impuesto;

            System.out.println("El costo total de la llamada es: " + costoTotal + " euros");
            System.out.println("Costo base de la llamada: " + costoLlamada + " euros");
            System.out.println("Impuesto aplicado: " + impuesto + " euros");
        }
}
