package Bucles;

import java.util.Scanner;
public class Ejercicio11 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Ingrese el número de alumnos: ");
            int numeroAlumnos = scanner.nextInt();

            int costoPorAlumno;
            int costoTotalViaje;
            if (numeroAlumnos >= 100) {
                costoPorAlumno = 65;
                costoTotalViaje = numeroAlumnos * costoPorAlumno;
            } else if (numeroAlumnos >= 50 && numeroAlumnos <= 99) {
                costoPorAlumno = 70;
                costoTotalViaje = numeroAlumnos * costoPorAlumno;
            } else if (numeroAlumnos >= 30 && numeroAlumnos <= 49) {
                costoPorAlumno = 95;
                costoTotalViaje = numeroAlumnos * costoPorAlumno;
            } else {
                costoTotalViaje = 4000;
                costoPorAlumno = costoTotalViaje / numeroAlumnos;
            }

            System.out.println("El costo total del viaje es: " + costoTotalViaje + " euros");
            System.out.println("El costo por alumno es: " + costoPorAlumno + " euros");
        }

}
