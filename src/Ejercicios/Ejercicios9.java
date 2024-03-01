/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

import java.util.Scanner;

public class Ejercicios9 {
    Scanner i;
    float pBase, descuento, vTotal;
    public void compra(){
        i = new Scanner(System.in);
        System.out.println("Ingrese el precio base");
        pBase = i.nextFloat();
        descuento = (float) (pBase*0.15);
        vTotal = pBase-descuento;
        System.out.println("El precio total es "+vTotal);
    }
    public static void main(String[] args){
        Ejercicios9 n = new Ejercicios9();
        n.compra();
    }
}
