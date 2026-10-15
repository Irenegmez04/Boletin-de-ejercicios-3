
import java.util.Scanner;

public class Ejercico2 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce tu edad:");
        int edad = teclado.nextInt();

        if (edad >= 18) {
            System.out.println("Eres mayor de edad");
        } else {
            System.out.println("Eres menor de edad");
        }

        teclado.close();

    }
}
