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
public class ejercicio16 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        
        double velocidad1;
        double velocidad2;
        double distancia;
        double diferenciaVelocidad;
        double tiempo;

        System.out.println("Este programa calcula el tiempo que tardan en encontrarse dos vehiculos que circulan a distinta velocidad y tienen una distancia entre ellos");
        System.out.print("Introduce la distancia hay entre ambos vehiculos: ");
        distancia = teclado.nextDouble();
        
        System.out.print("Velocidad en Km/h del vehiculo que va mas lento: ");
        velocidad1 = teclado.nextDouble();
        
        System.out.print("Velocidad en Km/h del vehiculo que va mas rapido: ");
        velocidad2 = teclado.nextDouble();   
    
        diferenciaVelocidad = velocidad2 - velocidad1;
        tiempo = distancia / (diferenciaVelocidad); 
        tiempo = tiempo * 60;

        System.out.println("Ambos vehiculos se encontraran a los " + (int)tiempo + " minutos");
        
    }
    
}
