/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

import java.util.Scanner;

public class Ejercicios8 {
    Scanner i;
    int sueldo, nVentas, venta, comision, sueldoF;
    public void Sueldo(){
        i = new Scanner(System.in);
        System.out.println("Ingrese el sueldo base:");
        sueldo = i.nextInt();
        System.out.println("¿Cuantas ventas ha hecho?");
        nVentas = i.nextInt();
        System.out.println("Registre las ventas.");
        for(int a = 0; a < nVentas; a++){
            System.out.println("Venta N("+(a+1)+")");
            venta = i.nextInt();
            comision += venta*0.1;
        }
        sueldoF = sueldo+comision;
        System.out.println("El sueldo final es: "+sueldoF);
    }
    public static void main(String[] args){
        Ejercicios8 n = new Ejercicios8();
        n.Sueldo();
    }
    
}
