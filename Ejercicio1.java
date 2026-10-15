
import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce tu edad:");
        int edad = teclado.nextInt();

        if (edad >= 18) {
            System.out.println("Eres mayor de edad");
        }

        teclado.close();

    }
}
