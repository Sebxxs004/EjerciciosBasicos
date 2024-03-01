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
public class ejercicio15 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in);
        
        int valor1;
        int valor2;
        int valor3;
        
        System.out.println("Este programa intercambia el valor de dos variables");
        System.out.print("Introduzca el primer valor: ");
        valor1=teclado.nextInt();
        System.out.print("Introduzca el segundo valor: ");
        valor2=teclado.nextInt();
        
        valor3 = valor1;
        valor1 = valor2;
        valor2 = valor3;
    
        System.out.println("Tras el cambio, el primer valor es: " + valor1 + " y el segundo valor es: " + valor2);
        
    }
   
}
