
import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce la temperatura del día:");
        double temperatura = teclado.nextDouble();

        if (temperatura <= 10) {
            System.out.println("Frío");
        } else if (temperatura <= 20) {
            System.out.println("Templado");
        } else if (temperatura <= 30) {
            System.out.println("Caluroso");
        } else {
            System.out.println("Tropical");
        }

        teclado.close();

    }
}
