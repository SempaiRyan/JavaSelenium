import java.util.Random;

public class Ejercicio_4_Bucle_For_25 {
    public static void main(String[] args) {

        final var n = RandomUtilities_16.generarRandomInt(5, 20, new Random());

        imprimirResultado(n, calcularpromedioSimple(n));
    }

    /*
    Secuencua : 1,2,3..... N-1
    Filtros: Ninguno
    accion : sumar
     */

    static int calcularpromedioSimple(int n) {

        var suma = 0;
        for (var i = 1; i <= n; i++) { // Secuencia -> n incluida
            suma += i; // Corrige el error sumando correctamente los valores de la secuencia
        }
        return suma / n; // Retorna el promedio correctamente
    }

    static void imprimirResultado(int n, int promedio) {

        System.out.printf("Promedio simple %d: %d", n, promedio); // Ajuste menor en los argumentos de impresión
    }
}
