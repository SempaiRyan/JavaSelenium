import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);
        final var n = ScannerManager.leerInt(scanner, "Ingrese Cantidad Numero Fibonacci");

        scanner.close();
        mostrarSerieFibonacci(n);
    }

    static void mostrarSerieFibonacci(int n) {
        // Declarando los primeros números
        var anterior = 0;
        var actual = 1;

        // Mostrando la serie Fibonacci
        System.out.print("Serie Fibonacci: ");
        System.out.print(anterior + " " + actual);

        for (var i = 0; i < n - 2; i++) {
            var temp = anterior + actual;
            anterior = actual;
            actual = temp;
            System.out.print(" " + actual); // Imprimir en la misma línea con un espacio
        }
        System.out.println(); // Saltar a la siguiente línea al finalizar
    }
}
