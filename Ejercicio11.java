
import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int numero;
        int suma = 0;
        int contador = 0;

        System.out.println("Introduce un número:");
        numero = teclado.nextInt();

        while (numero >= 0) {
            suma = suma + numero;
            contador++;

            System.out.println("Introduce un número:");
            numero = teclado.nextInt();
        }

        if (contador > 0) {
            double media = (double) suma / contador;
            System.out.println("La media es: " + media);
        } else {
            System.out.println("No se han introducido números");
        }

        teclado.close();

    }
}
