package EjerciciosBucles;
import java.util.Scanner;
public class Ejercicio24 {
    Scanner a;
    int horas, minutos, segundos, horasL, minutosL, segundosL;
    public void cronometro(){
        a = new Scanner(System.in);
        System.out.println("Horas que desea: ");
        horasL = a.nextInt();
        System.out.println("Minutos que desea: ");
        minutosL = a.nextInt();
        System.out.println("Segundos que desea: ");
        segundosL = a.nextInt();
        while (true) {
            System.out.println(String.format("%02d:%02d:%02d", horas, minutos, segundos));

            try {
                Thread.sleep(1000); // Esperar 1 segundo
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            segundos++;
            if (segundos == 60) {
                segundos = 0;
                minutos++;
                if (minutos == 60) {
                    minutos = 0;
                    horas++;
                    if (horas == 24) {
                        horas = 0;
                    }
                }
            }

            if (horas == horasL && minutos == minutosL && segundos == segundosL) {
                System.out.println("Cronómetro detenido en " + String.format("%02d:%02d:%02d", horas, minutos, segundos));
                break;
            }
        }
    }
}
