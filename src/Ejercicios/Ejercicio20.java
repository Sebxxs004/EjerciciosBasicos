package Ejercicios;
import java.util.Scanner;
public class Ejercicio20 {
    Scanner i;
    int nMonedas;
    float cant;
    public void contar(){
        i = new Scanner(System.in);
        System.out.println("¿Cuantas monedas tiene?");
        nMonedas = i.nextInt();
        for(int i = 0; i < nMonedas; i++){
            cant += 0.5;
        }
        if(cant < 1){
            System.out.println("Usted tiene " + cant + "céntimos");
        } else {
            System.out.println("Usted tiene " + cant + "Euros");
        }
    }
    public static void main(String[] args){
        Ejercicios20 n = new Ejercicios20();
        n.contar();
    }
}