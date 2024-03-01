/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJERCICIOS_BASICOS;

import java.util.Scanner;

/**
 *
 * @author LabSispc20
 */

/*Paula*/
public class ejercicio17 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner (System.in);
    
    System.out.println("Este programa calcula la hora de llegada de un ciclista a una cuidad conociendo la hora de salida y el tiempo de viaje en segundos");
    
    int hora;
    int minuto;
    int segundo;
    int tiempo;
    int totalSegundos;
    int segundosRestantes;
    
    System.out.print("Introduce la hora de salida: ");
    hora = teclado.nextInt();
    
    System.out.print("Introduce los minutos de salida: ");
    minuto = teclado.nextInt();
    
    System.out.print ("Introduce los segundos de salida: ");
    segundo = teclado.nextInt();
    
    System.out.print ("Duracion del viaje en segundos: ");
    tiempo = teclado.nextInt();
    
    totalSegundos = hora *3600 + minuto *60 + segundo + tiempo;
    hora = totalSegundos / 3600;
    segundosRestantes = totalSegundos % 3600;
    minuto = segundosRestantes / 60;
    segundo = segundosRestantes % 60;
    
     System.out.println("La hora de llegada a la ciudad sera: " + hora + ":" + minuto + ":" + segundo);
    
    }
    
}
