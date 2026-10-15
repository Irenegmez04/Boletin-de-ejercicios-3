
import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un número entero:");
        int numero = teclado.nextInt();

        double raiz = Math.sqrt(numero);

        if (raiz == (int) raiz) {
            System.out.println("El número se puede expresar como el cuadrado de un número entero");
        } else {
            System.out.println("El número no se puede expresar como el cuadrado de un número entero");
        }

        teclado.close();

    }
}
