package Ejercicios;
import java.util.Scanner;
public Ejercicio19{
    Scanner i;
    int pBuenas, pMalas, noR, notaF;
    public void notas(){
        System.out.println("Preguntas buenas");
        pBuenas = i.nextInt()*5;
        System.out.println("Preguntas malas");
        pMalas = i.nextInt();
        System.out.println("Preguntas no contestadas");
        noR = i.nextInt();
        notaF = pBuenas - pMalas;
    }
}