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
public class ejercicio14 {
    public static void main (String[] args){
    
        Scanner teclado = new Scanner(System.in);
        
        int numero;
        int num1;
        int num2;
        int inverso;
        
        System.out.println("Este programa toma un numero de dos cifras y muestra el nuvero invertido");
        System.out.print("Introduce un numero de dos cifras: ");
        numero = teclado.nextInt();
        
        num1 = numero / 10;
        num2 = numero % 10;
        inverso = num2 * 10 + num1;
        
        System.out.println("El numero invertido es " + inverso);
    
    }
    
}
