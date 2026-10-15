
import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un número del 1 al 7:");
        int numero = teclado.nextInt();

        if (numero == 1) {
            System.out.println("Lunes");
        } else if (numero == 2) {
            System.out.println("Martes");
        } else if (numero == 3) {
            System.out.println("Miércoles");
        } else if (numero == 4) {
            System.out.println("Jueves");
        } else if (numero == 5) {
            System.out.println("Viernes");
        } else if (numero == 6) {
            System.out.println("Sábado");
        } else if (numero == 7) {
            System.out.println("Domingo");
        } else {
            System.out.println("El número debe estar entre 1 y 7");
        }

        teclado.close();

    }
}
