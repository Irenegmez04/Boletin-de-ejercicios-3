
import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce el primer número:");
        int numero1 = teclado.nextInt();

        System.out.println("Introduce el segundo número:");
        int numero2 = teclado.nextInt();

        System.out.println("Introduce el tercer número:");
        int numero3 = teclado.nextInt();

        if (numero1 > numero2 && numero1 > numero3) {
            System.out.println("El mayor es " + numero1);
        } else if (numero2 > numero1 && numero2 > numero3) {
            System.out.println("El mayor es " + numero2);
        } else {
            System.out.println("El mayor es " + numero3);
        }

        teclado.close();

    }
}
