package EjerciciosBucles;
import java.util.Scanner;
public class Ejercicio23 {
    Scanner a;
    int meses, pago = 10, totalPago;
    public void pagos(){
        a = new Scanner(System.in);
        System.out.println("Escriba la cantidad de meses");
        meses = a.nextInt();
        for (int i = 1; i <= meses; i++) {
            System.out.println("Mes " + i + ": Pago mensual " + pago + " €");
            totalPago += pago;
            pago *= 2;
        }
        System.out.println("El total de lo que pagará después de " + meses + " meses es: " + totalPago + " €");
    }
}
