package Ejercicios;
import java.util.Scanner;
import java.math.*;
public class Ejercicios12 {
    Scanner i;
    int puntoX1, puntoY1, puntoX2, puntoY2;
    float distancia;
    public void Distancia(){
        i = new Scanner(System.in);
        System.out.println("Escriba X1");
        puntoX1 = i.nextInt();
        System.out.println("Escriba Y1");
        puntoY1 = i.nextInt();
        System.out.println("Escriba X2");
        puntoX2 = i.nextInt();
        System.out.println("Escriba Y2");
        puntoY2 = i.nextInt();
        int resta1 = puntoX1 - puntoX2;
        int resta2 = puntoY2 - puntoX2;
        distancia = (float) Math.sqrt(Math.pow(resta1, 2) + Math.pow(resta2, 2));
        System.out.println("La distancia entre los puntos es: " + distancia);

    }
}
