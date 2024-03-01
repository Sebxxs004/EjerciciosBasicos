/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;
import java.util.Scanner;
public class Ejercicios10 {
    Scanner i;
    float nota1, nota2, nota3, notaF;
    public void Notas(){
        i = new Scanner(System.in);
        System.out.println("Nota 1");
        nota1 = (float) (i.nextFloat()*0.55);
        System.out.println("Nota 2");
        nota2 = (float) (i.nextFloat()*0.3);
        System.out.println("Nota 3");
        nota3 = (float) (i.nextFloat()*0.15);
        notaF = nota1+nota2+nota3;
        System.out.println("Su nota final es: " + notaF);
    }
    public static void main(String[] args){
        Ejercicios10 n = new Ejercicios10();
        n.Notas();
    }
}
