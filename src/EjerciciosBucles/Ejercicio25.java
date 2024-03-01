package EjerciciosBucles;
import java.util.Scanner;
public class Ejercicio25 {
    Scanner a;
    public void primos(){
        a = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de números primos que desea mostrar: ");
        int cantidadPrimos = a.nextInt();

        int numero = 2;
        int contador = 0;

        while (contador < cantidadPrimos) {
            if (esPrimo(numero)) {
                System.out.println(numero);
                contador++;
            }
            numero++;
        }
    }

    public static boolean esPrimo(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Ejercicio25 n = new Ejercicio25();
        n.primos();
    }
}

