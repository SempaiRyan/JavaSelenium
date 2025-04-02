import java.util.Random;

public class Ejercicio_Bucle_For_25 {
    public static void main(String[] args) {

        // Generamos un número aleatorio entre 5 y 20
        final var n = RandomUtilities_16.generarRandomInt(5, 20, new Random());
        mostrarNumeros1(n);
        mostrarNumeros2(n);
        mostrarNumeros3(n);
    }

    // Secuencia 1, 2, 3, ..., n - 1
    static void mostrarNumeros1(int n) {
        for (var i = 1; i < n; i++) {
            System.out.printf("%d ", i); // Formato corregido
        }
        System.out.println(); // Salto de línea al final
    }

    // Secuencia 1, 2, 3, ..., n
    static void mostrarNumeros2(int n) {
        for (var i = 1; i <= n; i++) {
            System.out.printf("%d ", i); // Formato correcto
        }
        System.out.println(); // Salto de línea al final
    }

    // Secuencia n, n - 1, n - 2, ..., 1
    static void mostrarNumeros3(int n) {
        for (var i = n; i >= 1; i--) {
            System.out.printf("%d ", i); // Formato correcto
        }
        System.out.println(); // Salto de línea al final
    }
}
