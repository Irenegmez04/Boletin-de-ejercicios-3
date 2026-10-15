
import java.util.Scanner;

public class Ej3 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce el primer número:");
        int numero1 = teclado.nextInt();

        System.out.println("Introduce el segundo número:");
        int numero2 = teclado.nextInt();

        if (numero1 > numero2) {
            System.out.println("El mayor es " + numero1);
        } else if (numero2 > numero1) {
            System.out.println("El mayor es " + numero2);
        } else {
            System.out.println("Los dos números son iguales");
        }

        teclado.close();

    }
}
