package EjerciciosBucles;
import java.util.Scanner;
public class Ejercicio21 {
    Scanner i;
    int inf, sup, dat, sum, fuera;
    boolean mayor = false;
    boolean contiene = false;
    public void intervalos(){
        i = new Scanner(System.in);
        System.out.println("Digite el limite superior");
        sup = i.nextInt();
        while (mayor != true) {
            System.out.println("Digite el limite inferior");
            inf = i.nextInt();
            if (inf > sup){
                System.out.println("El limite inferior no puede ser mayor.");
            } else {
                mayor = true;
            }
        }
        System.out.println("Digite los datos, para salir digite el 0");
        while (dat != 0){
            dat = i.nextInt();
            if (dat > inf && dat < sup+1){
                sum += dat;
            } else {
                fuera++;
            }
            if (dat == sup || dat == inf){
                contiene = true;
            }
        }
        System.out.println("La suma de los numeros dentro de el intervalo es: "+ sum);
        System.out.println("La cantidad de numeros que estan afuera son: " + fuera);
        if (contiene == true){
            System.out.println("Si contiene un numero de los límites.");
        } else {
            System.out.println("No contiene un numero de los límites.");
        }

    }
}
