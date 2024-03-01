/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

import java.util.Scanner;

public class Ejercicios7 {
    Scanner i;
    int minutos, horas, minutosR;
    public void Hora(){
        i = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de minutos: ");
        minutos = i.nextInt();
        horas = minutos/60;
        minutosR = minutos%60;
        System.out.println("Hay: "+horas+" hrs y " +minutosR+" minuto restantes.");
    }
}
