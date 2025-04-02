import java.util.Random;

public class Ejercicio_2_Bucle_For_25 {
    public static void main(String[] args) {
        final var n = RandomUtilities_16.generarRandomInt(5, 20, new Random());

        final var contador1 = contarValores1(n);
        final var contador2 = contarValores2(n);
        final var contador3 = contarValores3(n);

        // Corregido: Se añade el formato para imprimir los valores de contador
        System.out.printf("Contador 1: %d%n", contador1);
        System.out.printf("Contador 2: %d%n", contador2);
        System.out.printf("Contador 3: %d%n", contador3);
    }

    // Secuencia 1, 2, 3, ..., n - 1
    // Filtro Pares-Impares
    static int contarValores1(int n) {
        var contador = 0;
        for (var i = 1; i < n; i++) {
            if (i % 2 == 0) { // Verifica si es par
                contador++;
            }
        }
        return contador;
    }

    // Secuencia 1, 2, 3, ..., n
    // Filtro: Múltiplos de 3
    static int contarValores2(int n) {
        var contador = 0;
        for (var i = 1; i <= n; i++) {
            if (i % 3 == 0) { // Verifica si es múltiplo de 3
                contador++;
            }
        }
        return contador;
    }

    // Secuencia n, n - 1, n - 2, ..., 1
    static int contarValores3(int n) {
        var contador = 0;
        for (var i = 1; i <= n; i++) {
            if (i % 10 == 0) { // Filtro: múltiplos de 10
                contador++;
            }
        }
        return contador;
    }
}
