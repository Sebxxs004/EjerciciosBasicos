/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;
import java.util.Scanner;
public class Ejercicios11 {
    Scanner i;
    float puntoA, puntoB, m;
    public void distancia(){
        i = new Scanner(System.in);
        System.out.println("Punto A");
        puntoA = i.nextFloat();
        System.out.println("Punto B");
        puntoB = i.nextFloat();
        if(puntoA>puntoB){
            m = puntoA - puntoB;
        } else {
            m = puntoB-puntoA;
        }
        System.out.println("La distancia es: " + m + " metros.");
    }
}
