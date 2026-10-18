import java.util.Scanner;

// Irene Gómez García - 18/10/2026

public class Ejercicio_16 {

    public static void main(String[] args) {


        Scanner teclado = new Scanner(System.in);

        double precioBase = 0;
        double precioFinal = 0;
        double descuentoEdad = 0;
        double ajusteDia = 0;
        double descuentoFamilia = 0;

        String nombrePase = "";
        String categoriaEdad = "";
        String nombreDia = "";
        String ajusteCalendario = "Sin variación";
        String familiaNumerosa = "No";

        // Muestra el menú de entradas
        System.out.println("MEDAC PARK");
        System.out.println("1. Pase Estándar - 40.00 €");
        System.out.println("2. Pase Acuático - 55.00 €");
        System.out.println("3. Pase Total VIP - 80.00 €");
        System.out.print("Elige tu pase: ");

        // Comprueba que la opción sea un número entero
        if (!teclado.hasNextInt()) {
            System.out.println("Error: Opción de pase no válida. Fin del programa.");
            return;
        }

        int opcion = teclado.nextInt();

        // Guarda el nombre y el precio del pase elegido
        switch (opcion) {
            case 1:
                nombrePase = "Pase Estándar";
                precioBase = 40.00;
                break;
            case 2:
                nombrePase = "Pase Acuático";
                precioBase = 55.00;
                break;
            case 3:
                nombrePase = "Pase Total VIP";
                precioBase = 80.00;
                break;
            default:
                System.out.println("Error: Opción de pase no válida. Fin del programa.");
                return;
        }

        // Solicita y valida la edad
        System.out.print("Introduce tu edad: ");

        if (!teclado.hasNextInt()) {
            System.out.println("Error: Edad no válida.");
            return;
        }

        int edad = teclado.nextInt();

        if (edad < 0 || edad > 120) {
            System.out.println("Error: Edad no válida.");
            return;
        } else if (edad < 4) {

            // Los menores de 4 años entran gratis
            System.out.println("TICKET MEDAC PARK");
            System.out.println("Pase: " + nombrePase);
            System.out.printf("Precio base: %.2f €%n", precioBase);
            System.out.println("Categoría: Bebé");
            System.out.println("Entrada gratuita");
            System.out.printf("IMPORTE FINAL: %.2f €%n", 0.0);
            return;

        } else if (edad <= 12) {

            // Aplica un descuento del 25%
            categoriaEdad = "Infantil";
            descuentoEdad = precioBase * 0.25;

        } else if (edad <= 64) {

            // Los adultos pagan el precio normal
            categoriaEdad = "Adulto";

        } else {

            // Aplica un descuento del 30%
            categoriaEdad = "Senior";
            descuentoEdad = precioBase * 0.30;
        }

        // Calcula el precio con el descuento por edad
        precioFinal = precioBase - descuentoEdad;

        // Muestra los días de la semana
        System.out.println("Día de la visita:");
        System.out.println("1. Lunes");
        System.out.println("2. Martes");
        System.out.println("3. Miércoles");
        System.out.println("4. Jueves");
        System.out.println("5. Viernes");
        System.out.println("6. Sábado");
        System.out.println("7. Domingo");
        System.out.print("Elige el día: ");

        if (!teclado.hasNextInt()) {
            System.out.println("Error: Día no válido.");
            return;
        }

        int dia = teclado.nextInt();

        // Comprueba que el día esté entre 1 y 7
        if (dia < 1 || dia > 7) {
            System.out.println("Error: Día no válido.");
            return;
        }

        // Aplica el descuento o recargo según el día
        switch (dia) {
            case 1:
                nombreDia = "Lunes";
                break;
            case 2:
                nombreDia = "Martes";
                break;
            case 3:
                nombreDia = "Miércoles";
                ajusteDia = -5.00;
                ajusteCalendario = "Descuento de 5.00 €";
                break;
            case 4:
                nombreDia = "Jueves";
                break;
            case 5:
                nombreDia = "Viernes";
                break;
            case 6:
                nombreDia = "Sábado";
                ajusteDia = precioBase * 0.10;
                ajusteCalendario = "Recargo del 10%";
                break;
            case 7:
                nombreDia = "Domingo";
                ajusteDia = precioBase * 0.10;
                ajusteCalendario = "Recargo del 10%";
                break;
        }

        // Añade el ajuste del día
        precioFinal = precioFinal + ajusteDia;

        if (precioFinal < 0) {
            precioFinal = 0;
        }

        // Pregunta si tiene familia numerosa
        System.out.print("¿Tienes carné de Familia Numerosa? (1 = Sí, 0 = No): ");

        if (!teclado.hasNextInt()) {
            System.out.println("Error: Respuesta no válida.");
            return;
        }

        int respuestaFamilia = teclado.nextInt();

        // Comprueba que la respuesta sea 0 o 1
        if (respuestaFamilia != 0 && respuestaFamilia != 1) {
            System.out.println("Error: Respuesta no válida.");
            return;
        }

        // Aplica el descuento de familia numerosa
        if (respuestaFamilia == 1) {
            familiaNumerosa = "Sí";
            descuentoFamilia = precioFinal * 0.15;
            precioFinal = precioFinal - descuentoFamilia;
        }

        // Muestra el ticket final
        System.out.println("TICKET MEDAC PARK");
        System.out.println("Pase: " + nombrePase);
        System.out.printf("Precio base: %.2f €%n", precioBase);
        System.out.println("Categoría: " + categoriaEdad);
        System.out.printf("Descuento por edad: -%.2f €%n", descuentoEdad);
        System.out.println("Día de visita: " + nombreDia);
        System.out.println("Ajuste del día: " + ajusteCalendario);
        System.out.printf("Importe ajuste día: %.2f €%n", ajusteDia);
        System.out.println("Familia numerosa: " + familiaNumerosa);
        System.out.printf("Descuento familia: -%.2f €%n", descuentoFamilia);
        System.out.printf("IMPORTE FINAL: %.2f €%n", precioFinal);

        teclado.close();
    }
}