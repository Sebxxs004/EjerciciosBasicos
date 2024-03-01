package EjerciciosBucles;
import java.util.Scanner;
public class Ejercicio22 {
    Scanner i;
    int base, exponente, resultado;
    public void exponentes(){
        i = new Scanner(System.in);
        System.out.println("Ingrese la base:");
        base = i.nextInt();
        System.out.println("Ingrese el exponente: ");
        exponente = i.nextInt();
        for (int f = 1 ; f<=exponente ;f++ ){
            resultado *= base;
        }
        System.out.printf("El resultado es: "+resultado);

    }
}
