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
public class ejercicio18 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner (System.in);
    
    String nombre;
    String apellido1;
    String apellido2;
    char inicialNombre;
    char inicialApellido1;
    char inicialApellido2;
    
    System.out.println("Este programa pide nombre nompleto y muestra las iniciales");
    System.out.print("Introduzaca su nombre: ");
    nombre = teclado.nextLine();
    
    System.out.print("Introduzaca su primer apellido: ");
    apellido1 = teclado.nextLine();
    
    System.out.print("Introduzaca su segundo apellido: ");
    apellido2 = teclado.nextLine();
    
    inicialNombre=nombre.charAt(0);
    inicialApellido1=apellido1.charAt(0);
    inicialApellido2=apellido2.charAt(0);
    
      System.out.println("Las Iniciales son: " + inicialNombre + "," + inicialApellido1 + "," + inicialApellido2);
      
    }
}
