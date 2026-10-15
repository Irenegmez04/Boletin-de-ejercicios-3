
import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un número entero:");
        int numero = teclado.nextInt();

        long factorial = 1;

        for (int i = 1; i <= numero; i++) {
            factorial = factorial * i;
        }

        System.out.println("El factorial de " + numero + " es " + factorial);

        teclado.close();

    }
}
