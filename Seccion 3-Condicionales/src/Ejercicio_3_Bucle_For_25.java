import java.util.Random;

public class Ejercicio_3_Bucle_For_25 {
    public static void main(String[] args) {
        final var n = RandomUtilities_16.generarRandomInt(15, 100, new Random());
        final var suma1 = calcularSuma1(n);
        final var suma2 = calcularSuma2(n);
        final var suma3 = calcularSuma3(n); // Falta el punto y coma corregido

        System.out.println("Suma 1: " + suma1);
        System.out.println("Suma 2: " + suma2);
        System.out.println("Suma 3: " + suma3);
    }

    // Secuencia 1,2,3.....N
    // No hay filtros, solo sumar
    static int calcularSuma1(int n) {
        var suma = 0;
        for (var i = 1; i <= n; i++) {
            suma += i; // Corregido: Se debe sumar 'i' en lugar de '1'
        }
        return suma;
    }

    // Secuencia 1,2,3.....N-1
    // No hay filtros
    // Acción: Sumar solo los números pares
    static int calcularSuma2(int n) {
        var suma = 0;
        for (var i = 0; i < n; i++) {
            if (i % 2 == 0) { // Filtro: Pares
                suma += i; // Suma los pares
            }
        }
        return suma;
    }

    // Secuencia n, n - 1, n - 2, ..., 1
    // Filtro: Múltiplos de 5
    // Acción: Sumar
    static int calcularSuma3(int n) {
        var suma = 0;
        for (var i = n; i > 0; i--) { // Corregido: La secuencia debe ser descendente
            if (i % 5 == 0) {
                suma += i;
            }
        }
        return suma;
    }
}
