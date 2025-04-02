import java.util.Scanner;

public class EjercicioComparacion_2 {
    public static void main(String[] args) {

        final var scaner = new Scanner(System.in);
        final var a = ScannerManager.leerInt(scaner, "Ingres Primer Numero: ");

        final var b = ScannerManager.leerInt(scaner, "Ingres Segundo Numero: ");

        scaner.close();

        imprResulta(a, b, sonIguales(a, b));
    }

    static boolean sonIguales(int a, int b) {
        return a == b;
    }

    static void imprResulta(int a, int b, boolean sonIguales) {

        System.out.println("Numero %d es igual a %d? %b%n : " + "..." + a + "..." + b + "...." + sonIguales);
    }
}
