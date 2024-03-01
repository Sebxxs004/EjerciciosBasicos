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
public class ejercicio13 {
    public static void main(String[] args) {
    
    Scanner teclado = new Scanner (System.in);
    
    double numero;
    double raizcuadrada;
    double raizcubica;
    
    System.out.println("Este programa calcula la raiz cuadrada y la raiz cubica de un numero");
    System.out.print("Introduce el numero al que le deseas calcular las raices: ");
    numero = teclado.nextDouble();
    
    raizcuadrada = Math.sqrt (numero);
    raizcubica = Math.pow (numero,1.0/3.0);
    
    System.out.println("La raiz cuadrada de "+ numero + " es " + raizcuadrada);
    System.out.println("La raiz cúbica de "+ numero + " es " + raizcubica);
        
    }
    
}
